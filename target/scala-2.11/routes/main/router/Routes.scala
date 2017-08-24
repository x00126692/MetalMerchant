
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/MetalMerchant/conf/routes
// @DATE:Thu Aug 24 17:21:52 IST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  ProductCtrl_0: controllers.ProductCtrl,
  // @LINE:16
  LoginCtrl_3: controllers.security.LoginCtrl,
  // @LINE:28
  ShoppingCtrl_1: controllers.ShoppingCtrl,
  // @LINE:39
  AdminProductCtrl_2: controllers.AdminProductCtrl,
  // @LINE:77
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    ProductCtrl_0: controllers.ProductCtrl,
    // @LINE:16
    LoginCtrl_3: controllers.security.LoginCtrl,
    // @LINE:28
    ShoppingCtrl_1: controllers.ShoppingCtrl,
    // @LINE:39
    AdminProductCtrl_2: controllers.AdminProductCtrl,
    // @LINE:77
    Assets_4: controllers.Assets
  ) = this(errorHandler, ProductCtrl_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, ProductCtrl_0, LoginCtrl_3, ShoppingCtrl_1, AdminProductCtrl_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.ProductCtrl.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listProducts""", """controllers.ProductCtrl.listProducts(cat:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """listArticles""", """controllers.ProductCtrl.listArticles(gen:Long ?= 0, filter:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.security.LoginCtrl.loginSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.security.LoginCtrl.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcustomer""", """controllers.ProductCtrl.addCustomer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomerSubmit""", """controllers.ProductCtrl.addCustomerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProductCtrl.profile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin""", """controllers.AdminProductCtrl.about()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProducts""", """controllers.AdminProductCtrl.listProducts(cat:Long = 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listProducts/""" + "$" + """cat<[^/]+>""", """controllers.AdminProductCtrl.listProducts(cat:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProduct""", """controllers.AdminProductCtrl.addProduct()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addProductSubmit""", """controllers.AdminProductCtrl.addProductSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProduct(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateProductSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/delProduct/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteProduct(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listCUsers""", """controllers.AdminProductCtrl.listUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listArticles""", """controllers.AdminProductCtrl.listArticles(gen:Long = 0)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/listArticles/""" + "$" + """gen<[^/]+>""", """controllers.AdminProductCtrl.listArticles(gen:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addArticle""", """controllers.AdminProductCtrl.addArticle()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/addArticleSubmit""", """controllers.AdminProductCtrl.addArticleSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateArticle/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateArticle(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/updateArticleSubmit/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.updateArticleSubmit(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin/delArticle/""" + "$" + """id<[^/]+>""", """controllers.AdminProductCtrl.deleteArticle(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_ProductCtrl_about0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_ProductCtrl_about0_invoker = createInvoker(
    ProductCtrl_0.about(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "about",
      Nil,
      "GET",
      """ https://www.playframework.com/documentation/2.5.1/JavaRouting
 Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProductCtrl_listProducts1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listProducts")))
  )
  private[this] lazy val controllers_ProductCtrl_listProducts1_invoker = createInvoker(
    ProductCtrl_0.listProducts(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listProducts",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """ Show a list of products - note optional parameter""",
      this.prefix + """listProducts"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_ProductCtrl_listArticles2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("listArticles")))
  )
  private[this] lazy val controllers_ProductCtrl_listArticles2_invoker = createInvoker(
    ProductCtrl_0.listArticles(fakeValue[Long], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "listArticles",
      Seq(classOf[Long], classOf[String]),
      "GET",
      """""",
      this.prefix + """listArticles"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_security_LoginCtrl_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_login3_invoker = createInvoker(
    LoginCtrl_3.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "login",
      Nil,
      "GET",
      """ Login form""",
      this.prefix + """login"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_security_LoginCtrl_loginSubmit4_invoker = createInvoker(
    LoginCtrl_3.loginSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_security_LoginCtrl_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_security_LoginCtrl_logout5_invoker = createInvoker(
    LoginCtrl_3.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.security.LoginCtrl",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ProductCtrl_addCustomer6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcustomer")))
  )
  private[this] lazy val controllers_ProductCtrl_addCustomer6_invoker = createInvoker(
    ProductCtrl_0.addCustomer,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "addCustomer",
      Nil,
      "GET",
      """""",
      this.prefix + """addcustomer"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ProductCtrl_addCustomerSubmit7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomerSubmit")))
  )
  private[this] lazy val controllers_ProductCtrl_addCustomerSubmit7_invoker = createInvoker(
    ProductCtrl_0.addCustomerSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "addCustomerSubmit",
      Nil,
      "POST",
      """ Data submitted by the form""",
      this.prefix + """addCustomerSubmit"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket8_invoker = createInvoker(
    ShoppingCtrl_1.showBasket(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      """ Shopping""",
      this.prefix + """showBasket"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket9_invoker = createInvoker(
    ShoppingCtrl_1.addToBasket(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_ShoppingCtrl_addOne10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne10_invoker = createInvoker(
    ShoppingCtrl_1.addOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne11_invoker = createInvoker(
    ShoppingCtrl_1.removeOne(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket12_invoker = createInvoker(
    ShoppingCtrl_1.emptyBasket(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      """""",
      this.prefix + """emptyBasket"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder13_invoker = createInvoker(
    ShoppingCtrl_1.placeOrder(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      """""",
      this.prefix + """placeOrder"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_ShoppingCtrl_viewOrder14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder14_invoker = createInvoker(
    ShoppingCtrl_1.viewOrder(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_ProductCtrl_profile15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProductCtrl_profile15_invoker = createInvoker(
    ProductCtrl_0.profile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProductCtrl",
      "profile",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AdminProductCtrl_about16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin")))
  )
  private[this] lazy val controllers_AdminProductCtrl_about16_invoker = createInvoker(
    AdminProductCtrl_2.about(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "about",
      Nil,
      "GET",
      """ Product Administration""",
      this.prefix + """Admin"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_AdminProductCtrl_listProducts17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProducts")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts17_invoker = createInvoker(
    AdminProductCtrl_2.listProducts(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/listProducts"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_AdminProductCtrl_listProducts18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listProducts/"), DynamicPart("cat", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_listProducts18_invoker = createInvoker(
    AdminProductCtrl_2.listProducts(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listProducts",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/listProducts/""" + "$" + """cat<[^/]+>"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_AdminProductCtrl_addProduct19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProduct")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProduct19_invoker = createInvoker(
    AdminProductCtrl_2.addProduct(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProduct",
      Nil,
      "GET",
      """""",
      this.prefix + """Admin/addProduct"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addProductSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addProductSubmit20_invoker = createInvoker(
    AdminProductCtrl_2.addProductSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addProductSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """Admin/addProductSubmit"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_AdminProductCtrl_updateProduct21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProduct21_invoker = createInvoker(
    AdminProductCtrl_2.updateProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/updateProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateProductSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateProductSubmit22_invoker = createInvoker(
    AdminProductCtrl_2.updateProductSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateProductSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """Admin/updateProductSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/delProduct/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteProduct23_invoker = createInvoker(
    AdminProductCtrl_2.deleteProduct(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteProduct",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/delProduct/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_AdminProductCtrl_listUsers24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listCUsers")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listUsers24_invoker = createInvoker(
    AdminProductCtrl_2.listUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """Admin/listCUsers"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_AdminProductCtrl_listArticles25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listArticles")))
  )
  private[this] lazy val controllers_AdminProductCtrl_listArticles25_invoker = createInvoker(
    AdminProductCtrl_2.listArticles(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listArticles",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/listArticles"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_AdminProductCtrl_listArticles26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/listArticles/"), DynamicPart("gen", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_listArticles26_invoker = createInvoker(
    AdminProductCtrl_2.listArticles(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "listArticles",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/listArticles/""" + "$" + """gen<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_AdminProductCtrl_addArticle27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addArticle")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addArticle27_invoker = createInvoker(
    AdminProductCtrl_2.addArticle(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addArticle",
      Nil,
      "GET",
      """""",
      this.prefix + """Admin/addArticle"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_AdminProductCtrl_addArticleSubmit28_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/addArticleSubmit")))
  )
  private[this] lazy val controllers_AdminProductCtrl_addArticleSubmit28_invoker = createInvoker(
    AdminProductCtrl_2.addArticleSubmit(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "addArticleSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """Admin/addArticleSubmit"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_AdminProductCtrl_updateArticle29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateArticle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateArticle29_invoker = createInvoker(
    AdminProductCtrl_2.updateArticle(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateArticle",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/updateArticle/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_AdminProductCtrl_updateArticleSubmit30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/updateArticleSubmit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_updateArticleSubmit30_invoker = createInvoker(
    AdminProductCtrl_2.updateArticleSubmit(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "updateArticleSubmit",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """Admin/updateArticleSubmit/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_AdminProductCtrl_deleteArticle31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin/delArticle/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AdminProductCtrl_deleteArticle31_invoker = createInvoker(
    AdminProductCtrl_2.deleteArticle(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminProductCtrl",
      "deleteArticle",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Admin/delArticle/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:77
  private[this] lazy val controllers_Assets_versioned32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned32_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_ProductCtrl_about0_route(params) =>
      call { 
        controllers_ProductCtrl_about0_invoker.call(ProductCtrl_0.about())
      }
  
    // @LINE:10
    case controllers_ProductCtrl_listProducts1_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0)), params.fromQuery[String]("filter", Some(""))) { (cat, filter) =>
        controllers_ProductCtrl_listProducts1_invoker.call(ProductCtrl_0.listProducts(cat, filter))
      }
  
    // @LINE:12
    case controllers_ProductCtrl_listArticles2_route(params) =>
      call(params.fromQuery[Long]("gen", Some(0)), params.fromQuery[String]("filter", Some(""))) { (gen, filter) =>
        controllers_ProductCtrl_listArticles2_invoker.call(ProductCtrl_0.listArticles(gen, filter))
      }
  
    // @LINE:16
    case controllers_security_LoginCtrl_login3_route(params) =>
      call { 
        controllers_security_LoginCtrl_login3_invoker.call(LoginCtrl_3.login())
      }
  
    // @LINE:17
    case controllers_security_LoginCtrl_loginSubmit4_route(params) =>
      call { 
        controllers_security_LoginCtrl_loginSubmit4_invoker.call(LoginCtrl_3.loginSubmit())
      }
  
    // @LINE:18
    case controllers_security_LoginCtrl_logout5_route(params) =>
      call { 
        controllers_security_LoginCtrl_logout5_invoker.call(LoginCtrl_3.logout())
      }
  
    // @LINE:21
    case controllers_ProductCtrl_addCustomer6_route(params) =>
      call { 
        controllers_ProductCtrl_addCustomer6_invoker.call(ProductCtrl_0.addCustomer)
      }
  
    // @LINE:24
    case controllers_ProductCtrl_addCustomerSubmit7_route(params) =>
      call { 
        controllers_ProductCtrl_addCustomerSubmit7_invoker.call(ProductCtrl_0.addCustomerSubmit)
      }
  
    // @LINE:28
    case controllers_ShoppingCtrl_showBasket8_route(params) =>
      call { 
        controllers_ShoppingCtrl_showBasket8_invoker.call(ShoppingCtrl_1.showBasket())
      }
  
    // @LINE:29
    case controllers_ShoppingCtrl_addToBasket9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket9_invoker.call(ShoppingCtrl_1.addToBasket(id))
      }
  
    // @LINE:30
    case controllers_ShoppingCtrl_addOne10_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne10_invoker.call(ShoppingCtrl_1.addOne(itemId))
      }
  
    // @LINE:31
    case controllers_ShoppingCtrl_removeOne11_route(params) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne11_invoker.call(ShoppingCtrl_1.removeOne(itemId))
      }
  
    // @LINE:32
    case controllers_ShoppingCtrl_emptyBasket12_route(params) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket12_invoker.call(ShoppingCtrl_1.emptyBasket())
      }
  
    // @LINE:33
    case controllers_ShoppingCtrl_placeOrder13_route(params) =>
      call { 
        controllers_ShoppingCtrl_placeOrder13_invoker.call(ShoppingCtrl_1.placeOrder())
      }
  
    // @LINE:34
    case controllers_ShoppingCtrl_viewOrder14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder14_invoker.call(ShoppingCtrl_1.viewOrder(id))
      }
  
    // @LINE:36
    case controllers_ProductCtrl_profile15_route(params) =>
      call { 
        controllers_ProductCtrl_profile15_invoker.call(ProductCtrl_0.profile())
      }
  
    // @LINE:39
    case controllers_AdminProductCtrl_about16_route(params) =>
      call { 
        controllers_AdminProductCtrl_about16_invoker.call(AdminProductCtrl_2.about())
      }
  
    // @LINE:41
    case controllers_AdminProductCtrl_listProducts17_route(params) =>
      call(Param[Long]("cat", Right(0))) { (cat) =>
        controllers_AdminProductCtrl_listProducts17_invoker.call(AdminProductCtrl_2.listProducts(cat))
      }
  
    // @LINE:42
    case controllers_AdminProductCtrl_listProducts18_route(params) =>
      call(params.fromPath[Long]("cat", None)) { (cat) =>
        controllers_AdminProductCtrl_listProducts18_invoker.call(AdminProductCtrl_2.listProducts(cat))
      }
  
    // @LINE:44
    case controllers_AdminProductCtrl_addProduct19_route(params) =>
      call { 
        controllers_AdminProductCtrl_addProduct19_invoker.call(AdminProductCtrl_2.addProduct())
      }
  
    // @LINE:45
    case controllers_AdminProductCtrl_addProductSubmit20_route(params) =>
      call { 
        controllers_AdminProductCtrl_addProductSubmit20_invoker.call(AdminProductCtrl_2.addProductSubmit())
      }
  
    // @LINE:47
    case controllers_AdminProductCtrl_updateProduct21_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProduct21_invoker.call(AdminProductCtrl_2.updateProduct(id))
      }
  
    // @LINE:48
    case controllers_AdminProductCtrl_updateProductSubmit22_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateProductSubmit22_invoker.call(AdminProductCtrl_2.updateProductSubmit(id))
      }
  
    // @LINE:50
    case controllers_AdminProductCtrl_deleteProduct23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteProduct23_invoker.call(AdminProductCtrl_2.deleteProduct(id))
      }
  
    // @LINE:52
    case controllers_AdminProductCtrl_listUsers24_route(params) =>
      call { 
        controllers_AdminProductCtrl_listUsers24_invoker.call(AdminProductCtrl_2.listUsers)
      }
  
    // @LINE:58
    case controllers_AdminProductCtrl_listArticles25_route(params) =>
      call(Param[Long]("gen", Right(0))) { (gen) =>
        controllers_AdminProductCtrl_listArticles25_invoker.call(AdminProductCtrl_2.listArticles(gen))
      }
  
    // @LINE:59
    case controllers_AdminProductCtrl_listArticles26_route(params) =>
      call(params.fromPath[Long]("gen", None)) { (gen) =>
        controllers_AdminProductCtrl_listArticles26_invoker.call(AdminProductCtrl_2.listArticles(gen))
      }
  
    // @LINE:61
    case controllers_AdminProductCtrl_addArticle27_route(params) =>
      call { 
        controllers_AdminProductCtrl_addArticle27_invoker.call(AdminProductCtrl_2.addArticle())
      }
  
    // @LINE:62
    case controllers_AdminProductCtrl_addArticleSubmit28_route(params) =>
      call { 
        controllers_AdminProductCtrl_addArticleSubmit28_invoker.call(AdminProductCtrl_2.addArticleSubmit())
      }
  
    // @LINE:64
    case controllers_AdminProductCtrl_updateArticle29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateArticle29_invoker.call(AdminProductCtrl_2.updateArticle(id))
      }
  
    // @LINE:65
    case controllers_AdminProductCtrl_updateArticleSubmit30_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_updateArticleSubmit30_invoker.call(AdminProductCtrl_2.updateArticleSubmit(id))
      }
  
    // @LINE:67
    case controllers_AdminProductCtrl_deleteArticle31_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_AdminProductCtrl_deleteArticle31_invoker.call(AdminProductCtrl_2.deleteArticle(id))
      }
  
    // @LINE:77
    case controllers_Assets_versioned32_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned32_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
