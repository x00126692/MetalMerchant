
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listProducts_Scope0 {
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

     object listProducts_Scope1 {
import models.products.Category
import models.products.Product
import models.users.User

class listProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Category],List[Product],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], catId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.123*/("""

"""),_display_(/*6.2*/main("Products Page", user)/*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""

	"""),format.raw/*8.2*/("""<br>

     <div class="row">
        <div class="col-sm-2">
	   <div class="list-group">
			
			<a href=""""),_display_(/*14.14*/routes/*14.20*/.ProductCtrl.listProducts(0, filter)),format.raw/*14.56*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*15.5*/for(c <- categories) yield /*15.25*/ {_display_(Seq[Any](format.raw/*15.27*/("""
		"""),format.raw/*16.3*/("""<a href=""""),_display_(/*16.13*/routes/*16.19*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*16.61*/("""" class="list-group-item">"""),_display_(/*16.88*/c/*16.89*/.getName),format.raw/*16.97*/("""</a>
			""")))}),format.raw/*17.5*/("""
	"""),format.raw/*18.2*/("""</div>
	  </div>

		
			"""),_display_(/*22.5*/if(flash.containsKey("success"))/*22.37*/ {_display_(Seq[Any](format.raw/*22.39*/("""
				  """),format.raw/*23.7*/("""<div class="alert alert-success">
					  """),_display_(/*24.9*/flash/*24.14*/.get("success")),format.raw/*24.29*/("""
				  """),format.raw/*25.7*/("""</div>
			""")))}),format.raw/*26.5*/("""

			"""),format.raw/*28.4*/("""<div id="actions">
			 <form action=""""),_display_(/*29.20*/routes/*29.26*/.ProductCtrl.listProducts(catId)),format.raw/*29.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*30.63*/filter),format.raw/*30.69*/("""" placeholder="Filter by product name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
   
			</div>
           
                        <br>
        


                    <div class="col-sm-10">
"""),_display_(/*41.2*/for(p <- products) yield /*41.20*/ {_display_(Seq[Any](format.raw/*41.22*/("""
                        
"""),format.raw/*43.1*/("""<aside class="bg-dark">
            <div class="container text-center">
                <div class="call-to-action">
                        <div class="row">
                            <div class="col-md-5">
          
            <a href="#">
         
			        
                  """),_display_(/*52.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*52.108*/ {_display_(Seq[Any](format.raw/*52.110*/("""
                       """),format.raw/*53.24*/("""<img src="/assets/images/productImages/thumbnails/"""),_display_(/*53.75*/(p.getId + ".jpg")),format.raw/*53.93*/(""""/>
                   """)))}/*54.22*/else/*54.27*/{_display_(Seq[Any](format.raw/*54.28*/("""
                       """),format.raw/*55.24*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/>
             
                   """)))}),format.raw/*57.21*/("""
                  """),format.raw/*58.19*/("""</a>
                  </div>
                  <div class="col-md-3">
                  <h2><u>"""),_display_(/*61.27*/p/*61.28*/.getName),format.raw/*61.36*/("""</u></h2>
                  <p>"""),_display_(/*62.23*/p/*62.24*/.getDescription),format.raw/*62.39*/("""</p>
                  <p>Stock: """),_display_(/*63.30*/p/*63.31*/.getStock),format.raw/*63.40*/("""</p>
                  <p> Price: 
                  &euro; """),_display_(/*65.27*/("%.2f".format(p.getPrice))),format.raw/*65.54*/("""
                  """),format.raw/*66.19*/("""</p>
                  <table>
                        <th>Options</th>
                        <tr>
                        <td>
                  <a href=""""),_display_(/*71.29*/routes/*71.35*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*71.69*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a>
                      
                  </td>
				    </tr>
					

        </table>
        


        </div>
        </div>
                        </div>
                    </div>
                        
        </aside>
        <br>
        <br>
         """)))}),format.raw/*89.11*/("""
        
  """),format.raw/*91.3*/("""</div>
  </div>


			
""")))}),format.raw/*96.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],catId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,catId,filter,user)

  def f:((play.api.Environment,List[Category],List[Product],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,catId,filter,user) => apply(env,categories,products,catId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object listProducts extends listProducts_Scope0.listProducts_Scope1.listProducts
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:59 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/listProducts.scala.html
                  HASH: afb0c0ac5b2ff42288c411d1799d470164e0df33
                  MATRIX: 942->92|1159->213|1187->216|1222->243|1261->245|1290->248|1423->354|1438->360|1495->396|1570->445|1606->465|1646->467|1676->470|1713->480|1728->486|1791->528|1845->555|1855->556|1884->564|1923->573|1952->575|2003->600|2044->632|2084->634|2118->641|2186->683|2200->688|2236->703|2270->710|2311->721|2343->726|2408->764|2423->770|2476->802|2581->880|2608->886|2894->1146|2928->1164|2968->1166|3021->1192|3335->1479|3433->1567|3474->1569|3526->1593|3604->1644|3643->1662|3686->1687|3699->1692|3738->1693|3790->1717|3924->1820|3971->1839|4095->1936|4105->1937|4134->1945|4193->1977|4203->1978|4239->1993|4300->2027|4310->2028|4340->2037|4428->2098|4476->2125|4523->2144|4708->2302|4723->2308|4778->2342|5165->2698|5204->2710|5257->2733
                  LINES: 32->4|37->4|39->6|39->6|39->6|41->8|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|49->16|49->16|49->16|49->16|50->17|51->18|55->22|55->22|55->22|56->23|57->24|57->24|57->24|58->25|59->26|61->28|62->29|62->29|62->29|63->30|63->30|74->41|74->41|74->41|76->43|85->52|85->52|85->52|86->53|86->53|86->53|87->54|87->54|87->54|88->55|90->57|91->58|94->61|94->61|94->61|95->62|95->62|95->62|96->63|96->63|96->63|98->65|98->65|99->66|104->71|104->71|104->71|122->89|124->91|129->96
                  -- GENERATED --
              */
          