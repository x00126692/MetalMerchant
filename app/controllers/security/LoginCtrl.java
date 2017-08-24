package controllers.security;

import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import javax.inject.Inject;


import models.users.*;
import views.html.*;

public class LoginCtrl extends Controller {

    private FormFactory formFactory;

    @Inject
    public LoginCtrl(FormFactory f) {
        this.formFactory = f;
    }

    @Transactional
    public Result login() {
	  
	   return ok(login.render(formFactory.form(Login.class), User.getLoggedIn(session().get("email"))));
    }

    @Transactional
    public Result loginSubmit() {
       
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
          
            return badRequest(login.render(loginForm, User.getLoggedIn(session().get("email"))));
        } 
        else {
          
            session().clear();
       
            session("email", loginForm.get().getEmail());
            
            User u = User.getLoggedIn(loginForm.get().getEmail());

            if (u != null && "admin".equals(u.getRole())) {
                return redirect(controllers.routes.AdminProductCtrl.listProducts(0));
            }
            
           
            return redirect(controllers.routes.ProductCtrl.about());
        }
    }	
    @Transactional
    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(routes.LoginCtrl.login());
    }
}
