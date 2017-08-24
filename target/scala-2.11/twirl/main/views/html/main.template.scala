
package views.html

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
                     
                    
                    
                    
                    <li """),_display_(/*52.26*/if(title == "Products")/*52.49*/{_display_(Seq[Any](format.raw/*52.50*/("""class="active"""")))}),format.raw/*52.65*/("""><a class="navbar-brand" href=""""),_display_(/*52.97*/routes/*52.103*/.ProductCtrl.listProducts(0)),format.raw/*52.131*/("""">Store</a></li> 
                    <li """),_display_(/*53.26*/if(title == "Articles")/*53.49*/{_display_(Seq[Any](format.raw/*53.50*/("""class="active"""")))}),format.raw/*53.65*/("""><a class="navbar-brand" href=""""),_display_(/*53.97*/routes/*53.103*/.ProductCtrl.listArticles(0)),format.raw/*53.131*/("""">News</a></li> 
                    <li ><a></a></li>
                    <li ><a></a></li> 

                    

                    <li ><a></a></li> 
                    <li ><a></a></li>                
                        

			"""),_display_(/*63.5*/if(user != null)/*63.21*/ {_display_(Seq[Any](format.raw/*63.23*/("""
                                """),format.raw/*64.33*/("""<li """),_display_(/*64.38*/if(title == "profile")/*64.60*/{_display_(Seq[Any](format.raw/*64.61*/("""class="active"""")))}),format.raw/*64.76*/("""><a href=""""),_display_(/*64.87*/routes/*64.93*/.ProductCtrl.profile()),format.raw/*64.115*/("""">Profile</a>
				<li """),_display_(/*65.10*/if(title == "Login")/*65.30*/{_display_(Seq[Any](format.raw/*65.31*/("""class="active"""")))}),format.raw/*65.46*/("""><a href="""),_display_(/*65.56*/controllers/*65.67*/.security.routes.LoginCtrl.logout()),format.raw/*65.102*/(""">Logout """),_display_(/*65.111*/user/*65.115*/.getName()),format.raw/*65.125*/("""</a>

<li """),_display_(/*67.6*/if(title == "showBasket")/*67.31*/{_display_(Seq[Any](format.raw/*67.32*/("""class="active"""")))}),format.raw/*67.47*/("""><a href=""""),_display_(/*67.58*/routes/*67.64*/.ShoppingCtrl.showBasket()),format.raw/*67.90*/(""""><span class="glyphicon glyphicon-shopping-cart"></span></a>
            """)))}/*68.14*/else/*68.19*/{_display_(Seq[Any](format.raw/*68.20*/("""
"""),format.raw/*69.1*/("""<li """),_display_(/*69.6*/if(title == "Login")/*69.26*/{_display_(Seq[Any](format.raw/*69.27*/("""class="active"""")))}),format.raw/*69.42*/("""><a href=""""),_display_(/*69.53*/routes/*69.59*/.ProductCtrl.addCustomer()),format.raw/*69.85*/("""">Register</a>
<li """),_display_(/*70.6*/if(title == "Login")/*70.26*/{_display_(Seq[Any](format.raw/*70.27*/("""class="active"""")))}),format.raw/*70.42*/("""><a href=""></a>
                <li """),_display_(/*71.22*/if(title == "Login")/*71.42*/{_display_(Seq[Any](format.raw/*71.43*/("""class="active"""")))}),format.raw/*71.58*/("""><a href="""),_display_(/*71.68*/controllers/*71.79*/.security.routes.LoginCtrl.login()),format.raw/*71.113*/(""">Login</a>
		""")))}),format.raw/*72.4*/("""
		"""),format.raw/*73.3*/("""</li>
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
                    <p class="lead">"""),_display_(/*93.38*/title),format.raw/*93.43*/("""</p>
                <div>
            </div>

            <!-- Start Content -->
            """),_display_(/*98.14*/content),format.raw/*98.21*/("""
            """),format.raw/*99.13*/("""<!-- End Content -->

        </div>
        <!-- /.container -->
    </div>

    

    

  

    <!-- jQuery -->
    <script src=""""),_display_(/*112.19*/routes/*112.25*/.Assets.versioned("vendor/jquery/jquery.min.js")),format.raw/*112.73*/("""" type="text/javascript"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src=""""),_display_(/*115.19*/routes/*115.25*/.Assets.versioned("vendor/bootstrap/js/bootstrap.min.js")),format.raw/*115.82*/("""" type="text/javascript"></script>

    <!-- Plugin JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js"></script>
    <script src=""""),_display_(/*119.19*/routes/*119.25*/.Assets.versioned("vendor/scrollreveal/scrollreveal.min.js")),format.raw/*119.85*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*120.19*/routes/*120.25*/.Assets.versioned("vendor/magnific-popup/jquery.magnific-popup.min.js")),format.raw/*120.96*/("""" type="text/javascript"></script>

    <!-- Theme JavaScript -->
    <script src=""""),_display_(/*123.19*/routes/*123.25*/.Assets.versioned("js/creative.min.js")),format.raw/*123.64*/("""" type="text/javascript"></script>
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
                  DATE: Thu Aug 24 17:22:01 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/main.scala.html
                  HASH: fefecfacb5307bcc37cc079b9efc2fe1aed9821c
                  MATRIX: 766->1|916->56|944->58|1044->132|1069->137|1155->196|1170->202|1242->252|1349->332|1364->338|1439->391|1842->767|1857->773|1930->824|2033->900|2048->906|2115->951|2194->1003|2209->1009|2281->1059|2915->1666|2944->1686|2983->1687|3029->1702|3520->2166|3552->2189|3591->2190|3637->2205|3696->2237|3712->2243|3762->2271|3832->2314|3864->2337|3903->2338|3949->2353|4008->2385|4024->2391|4074->2419|4340->2659|4365->2675|4405->2677|4466->2710|4498->2715|4529->2737|4568->2738|4614->2753|4652->2764|4667->2770|4711->2792|4761->2815|4790->2835|4829->2836|4875->2851|4912->2861|4932->2872|4989->2907|5026->2916|5040->2920|5072->2930|5109->2941|5143->2966|5182->2967|5228->2982|5266->2993|5281->2999|5328->3025|5422->3100|5435->3105|5474->3106|5502->3107|5533->3112|5562->3132|5601->3133|5647->3148|5685->3159|5700->3165|5747->3191|5793->3211|5822->3231|5861->3232|5907->3247|5972->3285|6001->3305|6040->3306|6086->3321|6123->3331|6143->3342|6199->3376|6243->3390|6273->3393|6658->3751|6684->3756|6806->3851|6834->3858|6875->3871|7035->4003|7051->4009|7121->4057|7242->4150|7258->4156|7337->4213|7556->4404|7572->4410|7654->4470|7735->4523|7751->4529|7844->4600|7956->4684|7972->4690|8033->4729
                  LINES: 27->1|32->1|34->3|39->8|39->8|41->10|41->10|41->10|44->13|44->13|44->13|49->18|49->18|49->18|52->21|52->21|52->21|53->22|53->22|53->22|70->39|70->39|70->39|70->39|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|98->67|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|102->71|102->71|103->72|104->73|124->93|124->93|129->98|129->98|130->99|143->112|143->112|143->112|146->115|146->115|146->115|150->119|150->119|150->119|151->120|151->120|151->120|154->123|154->123|154->123
                  -- GENERATED --
              */
          