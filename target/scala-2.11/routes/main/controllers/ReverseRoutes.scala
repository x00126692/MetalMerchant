
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/MetalMerchant/conf/routes
// @DATE:Thu Aug 24 17:21:52 IST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:28
  class ReverseShoppingCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId))
    }
  
    // @LINE:29
    def addToBasket(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addToBasket/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:34
    def viewOrder(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "viewOrder/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:33
    def placeOrder(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "placeOrder")
    }
  
    // @LINE:31
    def removeOne(itemId:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "removeOne/" + implicitly[PathBindable[Long]].unbind("itemId", itemId))
    }
  
    // @LINE:28
    def showBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "showBasket")
    }
  
    // @LINE:32
    def emptyBasket(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "emptyBasket")
    }
  
  }

  // @LINE:39
  class ReverseAdminProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def listArticles(gen:Long): Call = {
    
      (gen: @unchecked) match {
      
        // @LINE:58
        case (gen) if gen == 0 =>
          implicit val _rrc = new ReverseRouteContext(Map(("gen", 0)))
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listArticles")
      
        // @LINE:59
        case (gen)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listArticles/" + implicitly[PathBindable[Long]].unbind("gen", gen))
      
      }
    
    }
  
    // @LINE:45
    def addProductSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addProductSubmit")
    }
  
    // @LINE:41
    def listProducts(cat:Long): Call = {
    
      (cat: @unchecked) match {
      
        // @LINE:41
        case (cat) if cat == 0 =>
          implicit val _rrc = new ReverseRouteContext(Map(("cat", 0)))
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts")
      
        // @LINE:42
        case (cat)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "Admin/listProducts/" + implicitly[PathBindable[Long]].unbind("cat", cat))
      
      }
    
    }
  
    // @LINE:65
    def updateArticleSubmit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateArticleSubmit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:67
    def deleteArticle(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/delArticle/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:62
    def addArticleSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "Admin/addArticleSubmit")
    }
  
    // @LINE:50
    def deleteProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/delProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:39
    def about(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin")
    }
  
    // @LINE:47
    def updateProduct(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateProduct/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:64
    def updateArticle(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/updateArticle/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:52
    def listUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/listCUsers")
    }
  
    // @LINE:61
    def addArticle(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addArticle")
    }
  
    // @LINE:44
    def addProduct(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Admin/addProduct")
    }
  
    // @LINE:48
    def updateProductSubmit(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "Admin/updateProductSubmit/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:77
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseProductCtrl(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def addCustomer(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addcustomer")
    }
  
    // @LINE:24
    def addCustomerSubmit(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addCustomerSubmit")
    }
  
    // @LINE:36
    def profile(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile")
    }
  
    // @LINE:12
    def listArticles(gen:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listArticles" + queryString(List(if(gen == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("gen", gen)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
    // @LINE:7
    def about(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def listProducts(cat:Long = 0, filter:String = ""): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "listProducts" + queryString(List(if(cat == 0) None else Some(implicitly[QueryStringBindable[Long]].unbind("cat", cat)), if(filter == "") None else Some(implicitly[QueryStringBindable[String]].unbind("filter", filter)))))
    }
  
  }


}
