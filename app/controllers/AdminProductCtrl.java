package controllers;

import controllers.security.*;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import play.mvc.Http.*;
import play.mvc.Http.MultipartFormData.FilePart;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import play.Logger;

import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;


import models.users.*;
import models.products.*;

import views.html.productAdmin.*;




@Security.Authenticated(Secured.class)

@With(CheckIfAdmin.class)

public class AdminProductCtrl extends Controller {

  
    private FormFactory formFactory;


    private Environment env;

    @Inject
    public AdminProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }


	private User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}
    
    public Result about() {
        return redirect(controllers.routes.AdminProductCtrl.about());
    }

	
    @Transactional
    public Result listProducts(Long cat) {
        
        List<Category> categories = Category.find.where().orderBy("name asc").findList();
        			
        List<Product> products = new ArrayList<Product>();

         if (cat == 0) {
           
            products = Product.findAll("");
        }
        else {
            
            products = Product.findFilter(cat, "");
        }

        return ok(listProducts.render(env, categories, products, getCurrentUser()));
    }
    
    
    @Transactional
    public Result addProduct() {   
        
        Form<Product> addProductForm = formFactory.form(Product.class);
        
        return ok(addProduct.render(addProductForm, getCurrentUser()));
    }

   
    @Transactional
    public Result addProductSubmit() {

        String saveImageMsg;

     
        Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest();
	
        if(newProductForm.hasErrors()) {
           
            return badRequest(addProduct.render(newProductForm, getCurrentUser()));
        }
     
        Product newProduct = newProductForm.get();
        
        
        newProduct.save();
        
        
        for (Long cat : newProduct.getCatSelect()) {
            newProduct.getCategories().add(Category.find.byId(cat));
        }

        newProduct.update();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        
        saveImageMsg = saveFile(newProduct.getId(), image);

        flash("success", "Product " + newProduct.getName() + " has been created" + " " + saveImageMsg);
            
        return redirect(controllers.routes.AdminProductCtrl.listProducts(0));
    }
        
    @Transactional
    public Result updateProduct(Long id) {

        Product p = Product.find.byId(id);

        Form<Product> productForm = Form.form(Product.class).fill(p);

        return ok(updateProduct.render(id, productForm, User.getLoggedIn(session().get("email"))));		
    }

    @Transactional
    public Result updateProductSubmit(Long id) {

        String saveImageMsg;


        Form<Product> updateProductForm = formFactory.form(Product.class).bindFromRequest();
	
        if(updateProductForm.hasErrors()) {

            return badRequest(updateProduct.render(id, updateProductForm, getCurrentUser()));
        }
        
        Product p = updateProductForm.get();
        p.setId(id);
        

        List<Category> newCats = new ArrayList<Category>();
        for (Long cat : p.getCatSelect()) {
            newCats.add(Category.find.byId(cat));
        }
        p.setCategories(newCats);
                  
        p.update();


        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveFile(p.getId(), image);

        flash("success", "Product " + updateProductForm.get().getName() + " has been updates" + " " + saveImageMsg);
            
        return redirect(controllers.routes.AdminProductCtrl.listProducts(0));
    }


    @Transactional
    public Result deleteProduct(Long id) {

        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.AdminProductCtrl.listProducts(0));
    }
    
    public String saveFile(Long id, FilePart<File> image) {
        if (image != null) {
          
            String mimeType = image.getContentType();
            
            if (mimeType.startsWith("image/")) {
                
                File file = image.getFile();
                
                ConvertCmd cmd = new ConvertCmd();
                
                IMOperation op = new IMOperation();
             
                op.addImage(file.getAbsolutePath());
              
                op.resize(600,400);
               
                op.addImage("public/images/productImages/" + id + ".jpg");
             
                IMOperation thumb = new IMOperation();
                
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(350);
               
                thumb.addImage("public/images/productImages/thumbnails/" + id + ".jpg");
              
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }				
                return " and image saved";
            }
        }
        return "image file missing";	
    } 
















@Transactional
    public Result listArticles(Long gen) {
        
        List<Genre> genres = Genre.find.where().orderBy("name asc").findList();
        			
        List<Article> articles = new ArrayList<Article>();

         if (gen == 0) {
            
            articles = Article.findAll("");
        }
        else {
            
            articles = Article.findFilter(gen, "");
        }

        return ok(listArticles.render(env, genres, articles, getCurrentUser()));
    }
    
    
    @Transactional
    public Result addArticle() {   
        
        Form<Article> addArticleForm = formFactory.form(Article.class);
        
        return ok(addArticle.render(addArticleForm, getCurrentUser()));
    }

    @Transactional
    public Result addArticleSubmit() {

        String saveImageMsg;

        Form<Article> newArticleForm = formFactory.form(Article.class).bindFromRequest();
	
        if(newArticleForm.hasErrors()) {

            return badRequest(addArticle.render(newArticleForm, getCurrentUser()));
        }
     
        Article newArticle = newArticleForm.get();
        
        newArticle.save();
        
        for (Long gen : newArticle.getGenSelect()) {
            newArticle.getGenres().add(Genre.find.byId(gen));
        }

        newArticle.update();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");
        
        saveImageMsg = saveArticleFile(newArticle.getId(), image);

        flash("success", "Article " + newArticle.getName() + " has been created" + " " + saveImageMsg);
            
        
        return redirect(controllers.routes.AdminProductCtrl.listArticles(0));
    }
        

    @Transactional
    public Result updateArticle(Long id) {
        
        Article a = Article.find.byId(id);
       
        Form<Article> articleForm = Form.form(Article.class).fill(a);
       
        return ok(updateArticle.render(id, articleForm, User.getLoggedIn(session().get("email"))));		
    }


  
    @Transactional
    public Result updateArticleSubmit(Long id) {

        String saveImageMsg;

        Form<Article> updateArticleForm = formFactory.form(Article.class).bindFromRequest();
	
        if(updateArticleForm.hasErrors()) {
            
            return badRequest(updateArticle.render(id, updateArticleForm, getCurrentUser()));
        }
        
        Article a = updateArticleForm.get();
        a.setId(id);
        
        List<Genre> newGens = new ArrayList<Genre>();
        for (Long gen : a.getGenSelect()) {
            newGens.add(Genre.find.byId(gen));
        }
        a.setGenres(newGens);
        
               
        a.update();

        MultipartFormData data = request().body().asMultipartFormData();
        FilePart image = data.getFile("upload");

        saveImageMsg = saveArticleFile(a.getId(), image);

        flash("success", "Article " + updateArticleForm.get().getName() + " has been updates" + " " + saveImageMsg);
            
        return redirect(controllers.routes.AdminProductCtrl.listArticles(0));
    }


    
    @Transactional
    public Result deleteArticle(Long id) {

        Article.find.ref(id).delete();

        flash("success", "Article has been deleted");
        
        return redirect(routes.AdminProductCtrl.listArticles(0));
    }
    
    public String saveArticleFile(Long id, FilePart<File> image) {
        if (image != null) {
          
            String mimeType = image.getContentType();
            
            if (mimeType.startsWith("image/")) {
               
                File file = image.getFile();
               
                ConvertCmd cmd = new ConvertCmd();
                
                IMOperation op = new IMOperation();
               
                op.addImage(file.getAbsolutePath());
                
                op.resize(600,400);
               
                op.addImage("public/images/articleImages/" + id + ".jpg");
                
                IMOperation thumb = new IMOperation();
                
                thumb.addImage(file.getAbsolutePath());
                thumb.thumbnail(350);
                
                thumb.addImage("public/images/articleImages/thumbnails/" + id + ".jpg");
               
                try{
                    cmd.run(op);
                    cmd.run(thumb);
                }
                catch(Exception e){
                    e.printStackTrace();
                }				
                return " and image saved";
            }
        }
        return "image file missing";	
    } 







    public Result listUsers() {

        List<User> usersList = User.findAll();



	return ok(listUsers.render(usersList,getCurrentUser()));

}


 
    
}
