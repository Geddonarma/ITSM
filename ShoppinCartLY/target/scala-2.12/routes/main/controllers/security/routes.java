
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/ITSM/ShoppinCartLY/conf/routes
// @DATE:Mon Mar 25 10:17:42 GMT 2019

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginCtrl LoginCtrl = new controllers.security.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginCtrl LoginCtrl = new controllers.security.javascript.ReverseLoginCtrl(RoutesPrefix.byNamePrefix());
  }

}
