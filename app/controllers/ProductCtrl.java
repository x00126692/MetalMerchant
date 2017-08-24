package controllers;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;
import models.products.*;


public class ProductCtrl extends Controller {


    private FormFactory formFactory;

    private play.api.Environment env;

    @Inject
    public ProductCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

   
    @Transactional
	public User getCurrentUser() {
		User u = User.getLoggedIn(session().get("email"));
		return u;
	}

    public Result index() {
		return redirect(routes.ProductCtrl.listProducts(0, ""));
    }

	
    @Transactional
    public Result listProducts(Long cat, String filter) {
      
        List<Category> categories = Category.findAll();
        			
        List<Product> products = new ArrayList<Product>();
    
        if (cat == 0) {
          
            products = Product.findAll(filter);
        }
        else {
            
            products = Product.findFilter(cat, filter);
        }
        
        return ok(listProducts.render(env, categories, products, cat, filter, getCurrentUser()));
    }

    public Result about() {

	return ok(about.render(getCurrentUser()));

    }


@Transactional
    public Result listArticles(Long gen, String filter) {
        
        List<Genre> genres = Genre.findAll();
        			
        List<Article> articles = new ArrayList<Article>();
    
        if (gen == 0) {
           
            articles = Article.findAll(filter);
        }
        else {
           
            articles = Article.findFilter(gen, filter);
        }
      
        return ok(listArticles.render(env, genres, articles, gen, filter, getCurrentUser()));
    }

    


    public Result addCustomer() {

        Form<Customer> addCustomerForm = formFactory.form(Customer.class);

        return ok(addCustomer.render(addCustomerForm, getCurrentUser()));
    }

    @Transactional
    public Result addCustomerSubmit() {

        


        Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest();


        if(newCustomerForm.hasErrors()) {
 
            return badRequest(addCustomer.render(newCustomerForm, getCurrentUser()));
        }

        Customer c = newCustomerForm.get();


        if (c.getEmail() == null) {
            c.save();
        } 

        else if (c.getEmail() != null) {
            c.save();

         }

        
        
 
        
     
        flash("success", "Customer " + c.getName() + " is now registered ");

      
        return redirect(routes.ProductCtrl.about());
    }


    public Result profile() {
            Customer customer = (Customer)User.getLoggedIn(session().get("email"));
    
       return ok(profile.render(customer));
    }
    


}
