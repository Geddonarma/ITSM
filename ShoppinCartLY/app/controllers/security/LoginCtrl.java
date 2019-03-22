package controllers.security;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;
import models.users.*;

public class LoginCtrl extends Controller {
    private FormFactory formFactory;
    private Environment env;

    @Inject
    public LoginCtrl(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Result login() {
        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm, User.getLoggedIn(session().get("email"))));
    }

    public Result loginSubmit() {
          
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();

        if (loginForm.hasErrors()) {
            
            return badRequest(login.render(loginForm, User.getLoggedIn(session().get("email"))));
        } 
        else {
          
            session().clear();
            session("email", loginForm.get().getEmail());
        
            User u = User.getLoggedIn(loginForm.get().getEmail());
            // If admin - go to admin section
            if (u != null && "admin".equals(u.getRole())) {
                return redirect(controllers.routes.AdminProductCtrl.index());
            }
            
            // Return to home page
            return redirect(controllers.routes.ProductCtrl.index());
        }
    }

    public Result logout() {
        session().clear();
        flash("success", "You've been logged out");
        return redirect(controllers.security.routes.LoginCtrl.login());
    }



    public Result signup() {
        Form<User> signupForm = formFactory.form(User.class);
        return ok(signup.render(signupForm,User.getLoggedIn(session().get("email"))));
    }
    
    public Result signupSubmit() {
    
        Form<User> signupForm = formFactory.form(User.class).bindFromRequest();
    
        if (signupForm.hasErrors()) {
    
            return badRequest(signup.render(signupForm,User.getLoggedIn(session().get("email"))));
        } else {
    
            User  signup = signupForm.get();
             
        
            if(User.getLoggedIn(signup.getEmail())==null){
                signup.save();
            }else{
                signup.update();
            }
    
        flash("success", "User " + signup.getName() + " was registered.");
    
        return redirect(routes.LoginCtrl.login()); 
        }
    }
    
    
    
    }
        
    
