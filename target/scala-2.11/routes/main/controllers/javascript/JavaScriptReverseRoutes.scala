
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/MetalMerchant/conf/routes
// @DATE:Thu Aug 24 17:21:52 IST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:28
  class ReverseShoppingCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def addOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0)})
        }
      """
    )
  
    // @LINE:29
    def addToBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.addToBasket",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addToBasket/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:34
    def viewOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.viewOrder",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "viewOrder/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:33
    def placeOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.placeOrder",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "placeOrder"})
        }
      """
    )
  
    // @LINE:31
    def removeOne: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.removeOne",
      """
        function(itemId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removeOne/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("itemId", itemId0)})
        }
      """
    )
  
    // @LINE:28
    def showBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.showBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showBasket"})
        }
      """
    )
  
    // @LINE:32
    def emptyBasket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ShoppingCtrl.emptyBasket",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "emptyBasket"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseAdminProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def listArticles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.listArticles",
      """
        function(gen0) {
        
          if (gen0 == """ + implicitly[JavascriptLiteral[Long]].to(0) + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listArticles"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listArticles/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("gen", gen0)})
          }
        
        }
      """
    )
  
    // @LINE:45
    def addProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProductSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProductSubmit"})
        }
      """
    )
  
    // @LINE:41
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.listProducts",
      """
        function(cat0) {
        
          if (cat0 == """ + implicitly[JavascriptLiteral[Long]].to(0) + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listProducts"})
          }
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listProducts/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("cat", cat0)})
          }
        
        }
      """
    )
  
    // @LINE:65
    def updateArticleSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateArticleSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateArticleSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:67
    def deleteArticle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.deleteArticle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/delArticle/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:62
    def addArticleSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addArticleSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addArticleSubmit"})
        }
      """
    )
  
    // @LINE:50
    def deleteProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.deleteProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/delProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:39
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin"})
        }
      """
    )
  
    // @LINE:47
    def updateProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProduct",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProduct/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:64
    def updateArticle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateArticle",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateArticle/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:52
    def listUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.listUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/listCUsers"})
        }
      """
    )
  
    // @LINE:61
    def addArticle: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addArticle",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addArticle"})
        }
      """
    )
  
    // @LINE:44
    def addProduct: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.addProduct",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/addProduct"})
        }
      """
    )
  
    // @LINE:48
    def updateProductSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminProductCtrl.updateProductSubmit",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin/updateProductSubmit/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:77
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:77
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseProductCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def addCustomer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.addCustomer",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcustomer"})
        }
      """
    )
  
    // @LINE:24
    def addCustomerSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.addCustomerSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addCustomerSubmit"})
        }
      """
    )
  
    // @LINE:36
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:12
    def listArticles: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.listArticles",
      """
        function(gen0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listArticles" + _qS([(gen0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("gen", gen0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
    // @LINE:7
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def listProducts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProductCtrl.listProducts",
      """
        function(cat0,filter1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "listProducts" + _qS([(cat0 == null ? null : (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("cat", cat0)), (filter1 == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("filter", filter1))])})
        }
      """
    )
  
  }


}
