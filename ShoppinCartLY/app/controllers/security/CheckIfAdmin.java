package controllers.security;

import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

import models.users.*;

public class CheckIfAdmin extends Action.Simple {
    
    public CompletionStage<Result> call(Http.Context ctx) {
        
        // Check if current user (in session) is an admin
        String id = ctx.session().get("email");
        if (id != null) {
            User u = User.getLoggedIn(id);
            if ("admin".equals(u.getRole())) {
                
                // User admin sp continue with the http request
                return delegate.call(ctx);
            }    
        }

        ctx.flash().put("error", "Admin Login Required.");
        return CompletableFuture.completedFuture(redirect(routes.LoginCtrl.login()));
    }
}