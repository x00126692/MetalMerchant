
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">

<head>

    <title>Product Catalogue - """),_display_(/*8.33*/title),format.raw/*8.38*/("""</title>
    
<link rel="stylesheet" media="screen" href=""""),_display_(/*10.46*/routes/*10.52*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*10.102*/("""" >

    <!-- Custom Fonts -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*13.50*/routes/*13.56*/.Assets.versioned("stylesheets/font-awesome.min.css")),format.raw/*13.109*/("""">
    <link rel="stylesheet" href='https://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800'>
    <link rel="stylesheet" href='https://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic'>

    <!-- Plugin CSS -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*18.50*/routes/*18.56*/.Assets.versioned("stylesheets/magnific-popup.css")),format.raw/*18.107*/("""">

    <!-- Theme CSS -->
    <link rel="stylesheet" media="screen" href=""""),_display_(/*21.50*/routes/*21.56*/.Assets.versioned("stylesheets/creative.css")),format.raw/*21.101*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*22.50*/routes/*22.56*/.Assets.versioned("stylesheets/shop-homepage.css")),format.raw/*22.106*/(""""> 



</head>

<body>
    <!-- Site header and navigation -->
    <header class="top" role="header">

<nav id="mainNav" class="navbar navbar-default navbar-fixed-top">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span> Menu <i class="fa fa-bars"></i>
                </button>
                <li """),_display_(/*39.22*/if(title == "index")/*39.42*/{_display_(Seq[Any](format.raw/*39.43*/("""class="active"""")))}),format.raw/*39.58*/(""">
                <a class="navbar-brand page-scroll" href="">HEAVY METAL MERCHANT</a>
                </li>
            </div>


            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav navbar-right">
                     
                    
                    
                    
                    <li """),_display_(/*52.26*/if(title == "Products")/*52.49*/{_display_(Seq[Any](format.raw/*52.50*/("""class="active"""")))}),format.raw/*52.65*/("""><a class="navbar-brand" href=""""),_display_(/*52.97*/routes/*52.103*/.AdminProductCtrl.listProducts(0)),format.raw/*52.136*/("""">Store</a></li> 
                    <li """),_display_(/*53.26*/if(title == "Articles")/*53.49*/{_display_(Seq[Any](format.raw/*53.50*/("""class="active"""")))}),format.raw/*53.65*/("""><a class="navbar-brand" href=""""),_display_(/*53.97*/routes/*53.103*/.AdminProductCtrl.listArticles(0)),format.raw/*53.136*/("""">News</a></li> 
                    <li ><a></a></li>
                    <li ><a></a></li> 

                    

                    <li ><a></a></li> 
                    <li ><a></a></li>                
                    
			"""),_display_(/*62.5*/if(user != null)/*62.21*/ {_display_(Seq[Any](format.raw/*62.23*/("""
                                 """),format.raw/*63.34*/("""<li """),_display_(/*63.39*/if(title == "profile")/*63.61*/{_display_(Seq[Any](format.raw/*63.62*/("""class="active"""")))}),format.raw/*63.77*/("""><a href=""""),_display_(/*63.88*/routes/*63.94*/.AdminProductCtrl.listUsers()),format.raw/*63.123*/("""">Accounts</a>
				<li """),_display_(/*64.10*/if(title == "Login")/*64.30*/{_display_(Seq[Any](format.raw/*64.31*/("""class="active"""")))}),format.raw/*64.46*/("""><a href="""),_display_(/*64.56*/controllers/*64.67*/.security.routes.LoginCtrl.logout()),format.raw/*64.102*/(""">Logout """),_display_(/*64.111*/user/*64.115*/.getName()),format.raw/*64.125*/("""</a>
<li """),_display_(/*65.6*/if(title == "showBasket")/*65.31*/{_display_(Seq[Any](format.raw/*65.32*/("""class="active"""")))}),format.raw/*65.47*/("""><a href=""""),_display_(/*65.58*/routes/*65.64*/.ShoppingCtrl.showBasket()),format.raw/*65.90*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
            """)))}/*66.14*/else/*66.19*/{_display_(Seq[Any](format.raw/*66.20*/("""
"""),format.raw/*67.1*/("""<li """),_display_(/*67.6*/if(title == "Login")/*67.26*/{_display_(Seq[Any](format.raw/*67.27*/("""class="active"""")))}),format.raw/*67.42*/("""><a href=""""),_display_(/*67.53*/routes/*67.59*/.ProductCtrl.addCustomer()),format.raw/*67.85*/("""">Register</a>
<li """),_display_(/*68.6*/if(title == "Login")/*68.26*/{_display_(Seq[Any](format.raw/*68.27*/("""class="active"""")))}),format.raw/*68.42*/("""><a href=""></a>
                <li """),_display_(/*69.22*/if(title == "Login")/*69.42*/{_display_(Seq[Any](format.raw/*69.43*/("""class="active"""")))}),format.raw/*69.58*/("""><a href="""),_display_(/*69.68*/controllers/*69.79*/.security.routes.LoginCtrl.login()),format.raw/*69.113*/(""">Login</a>
		""")))}),format.raw/*70.4*/("""
		"""),format.raw/*71.3*/("""</li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>






    </header>

    <!-- Page Content -->
    <div class="middle">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <p class="lead">"""),_display_(/*91.38*/title),format.raw/*91.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*96.14*/content),format.raw/*96.21*/("""
            """),format.raw/*97.13*/("""<!-- End Content -->

        </div>
        <!-- /.container -->
    </div>

    

    

  

    <!-- jQuery -->
    <script src=""""),_display_(/*110.19*/routes/*110.25*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*110.73*/("""" type="text/javascript"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*113.19*/routes/*113.25*/.Assets.versioned("vendor/bootstrap/js/bootstrap.min.js")),format.raw/*113.82*/("""" type="text/javascript"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src=""""),_display_(/*117.19*/routes/*117.25*/.Assets.versioned("vendor/scrollreveal/scrollreveal.min.js")),format.raw/*117.85*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*118.19*/routes/*118.25*/.Assets.versioned("vendor/magnific-popup/jquery.magnific-popup.min.js")),format.raw/*118.96*/("""" type="text/javascript"></script>

    <!-- Theme JavaScript -->
    <script src=""""),_display_(/*121.19*/routes/*121.25*/.Assets.versioned("js/creative.min.js")),format.raw/*121.64*/("""" type="text/javascript"></script>
</body>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:04 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/main.scala.html
                  HASH: 5eb8b5bd43a566be8779eb6917240fad76453e73
                  MATRIX: 779->1|929->56|957->58|1057->132|1082->137|1168->196|1183->202|1255->252|1362->332|1377->338|1452->391|1855->767|1870->773|1943->824|2046->900|2061->906|2128->951|2207->1003|2222->1009|2294->1059|2928->1666|2957->1686|2996->1687|3042->1702|3533->2166|3565->2189|3604->2190|3650->2205|3709->2237|3725->2243|3780->2276|3850->2319|3882->2342|3921->2343|3967->2358|4026->2390|4042->2396|4097->2429|4358->2664|4383->2680|4423->2682|4485->2716|4517->2721|4548->2743|4587->2744|4633->2759|4671->2770|4686->2776|4737->2805|4788->2829|4817->2849|4856->2850|4902->2865|4939->2875|4959->2886|5016->2921|5053->2930|5067->2934|5099->2944|5135->2954|5169->2979|5208->2980|5254->2995|5292->3006|5307->3012|5354->3038|5448->3113|5461->3118|5500->3119|5528->3120|5559->3125|5588->3145|5627->3146|5673->3161|5711->3172|5726->3178|5773->3204|5819->3224|5848->3244|5887->3245|5933->3260|5998->3298|6027->3318|6066->3319|6112->3334|6149->3344|6169->3355|6225->3389|6269->3403|6299->3406|6684->3764|6710->3769|6832->3864|6860->3871|6901->3884|7061->4016|7077->4022|7147->4070|7268->4163|7284->4169|7363->4226|7582->4417|7598->4423|7680->4483|7761->4536|7777->4542|7870->4613|7982->4697|7998->4703|8059->4742
                  LINES: 27->1|32->1|34->3|39->8|39->8|41->10|41->10|41->10|44->13|44->13|44->13|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|70->39|70->39|70->39|70->39|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|101->70|102->71|122->91|122->91|127->96|127->96|128->97|141->110|141->110|141->110|144->113|144->113|144->113|148->117|148->117|148->117|149->118|149->118|149->118|152->121|152->121|152->121
                  -- GENERATED --
              */
          