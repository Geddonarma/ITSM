
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/ITSM/ShoppinCartLY/conf/routes
// @DATE:Thu Mar 14 11:45:46 GMT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:23
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:24
    def addToBasket(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:30
    def viewOrders(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "viewOrders")
    }
  
    // @LINE:29
    def cancelOrder(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cancelOrder" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:25
    def addOne(itemId:Long, pid:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("pid", pid)))))
    }
  
    // @LINE:28
    def placeOrder(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:26
    def removeOne(itemId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("itemId", itemId)))
    }
  
    // @LINE:23
    def showBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:27
    def emptyBasket(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:34
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def addProductSubmit(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:36
    def listProducts(cat:Long): Call = {
    
      (cat: @unchecked) match {
      
        // @LINE:36
        case (cat)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts" + play.core.routing.queryString(List(if(cat == 0L) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)))))
      
      }
    
    }
  
    // @LINE:45
    def deleteProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/deleteProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:42
    def updateProduct(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:39
    def addProduct(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:43
    def updateProductSubmit(id:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:34
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Admin")
    }
  
  }

  // @LINE:47
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:6
  class ReverseProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:11
    def productDetails(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "productDetails/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:15
    def contact(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:10
    def listProducts(cat:Long = 0, filter:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "listProducts" + play.core.routing.queryString(List(if(cat == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }


}
