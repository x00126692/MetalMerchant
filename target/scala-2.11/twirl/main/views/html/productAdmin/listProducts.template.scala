
package views.html.productAdmin

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

class listProducts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Category],List[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, categories: List[Category], products: List[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.94*/("""

"""),_display_(/*6.2*/productAdmin/*6.14*/.main("Products Page", user)/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""

"""),format.raw/*8.1*/("""<br>

     <div class="row">
        <div class="col-sm-2">
	   <div class="list-group">
			
			<a href=""""),_display_(/*14.14*/routes/*14.20*/.AdminProductCtrl.listProducts(0)),format.raw/*14.53*/("""" class="list-group-item">All categories</a>
			"""),_display_(/*15.5*/for(c <- categories) yield /*15.25*/ {_display_(Seq[Any](format.raw/*15.27*/("""
		"""),format.raw/*16.3*/("""<a href=""""),_display_(/*16.13*/routes/*16.19*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*16.58*/("""" class="list-group-item">"""),_display_(/*16.85*/c/*16.86*/.getName),format.raw/*16.94*/("""</a>
			""")))}),format.raw/*17.5*/("""
	"""),format.raw/*18.2*/("""</div>
	  </div>


			
           
                        <br>
         


                    <div class="col-sm-10">
                        """),_display_(/*29.26*/if(flash.containsKey("success"))/*29.58*/ {_display_(Seq[Any](format.raw/*29.60*/("""
				  """),format.raw/*30.7*/("""<div class="alert alert-success">
					  """),_display_(/*31.9*/flash/*31.14*/.get("success")),format.raw/*31.29*/("""
				  """),format.raw/*32.7*/("""</div>
			""")))}),format.raw/*33.5*/("""
                        

                    """),_display_(/*36.22*/for(p <- products) yield /*36.40*/ {_display_(Seq[Any](format.raw/*36.42*/("""
"""),format.raw/*37.1*/("""<aside class="bg-dark">
            <div class="container text-center">
                <div class="call-to-action">
                        <div class="row">
                            <div class="col-md-5">
          
            <a href="#">
         
			        
                  """),_display_(/*46.20*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*46.108*/ {_display_(Seq[Any](format.raw/*46.110*/("""
                       """),format.raw/*47.24*/("""<img src="/assets/images/productImages/thumbnails/"""),_display_(/*47.75*/(p.getId + ".jpg")),format.raw/*47.93*/(""""/>
                   """)))}/*48.22*/else/*48.27*/{_display_(Seq[Any](format.raw/*48.28*/("""
                       """),format.raw/*49.24*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.png"/>
             
                   """)))}),format.raw/*51.21*/("""
                  """),format.raw/*52.19*/("""</a>
                  </div>
                  <div class="col-md-3">
                  <h2><u>"""),_display_(/*55.27*/p/*55.28*/.getName),format.raw/*55.36*/("""</u></h2>
                  <p>"""),_display_(/*56.23*/p/*56.24*/.getDescription),format.raw/*56.39*/("""</p>
                  <p>Stock: """),_display_(/*57.30*/p/*57.31*/.getStock),format.raw/*57.40*/("""</p>
                  <p> Price: 
                  &euro; """),_display_(/*59.27*/("%.2f".format(p.getPrice))),format.raw/*59.54*/("""
                  """),format.raw/*60.19*/("""</p>
                  <table>
                        <th>Options</th>
                        <tr>
                        <td>
                  <a href=""""),_display_(/*65.29*/routes/*65.35*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*65.75*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                      
                  </td>
                  <td>
                  <a href=""""),_display_(/*70.29*/routes/*70.35*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*70.75*/(""""  class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                      
                  </td>
				    </tr>
					 
          </tbody>
        </table>
                  
        </div>
        </div>
                       </div>
                    </div>
                        
        </aside>
        <br>
        <br>
         """)))}),format.raw/*89.11*/("""
       """),format.raw/*90.8*/("""</div>
            <div class="add">
                    <p>
          <a href=""""),_display_(/*93.21*/routes/*93.27*/.AdminProductCtrl.addProduct()),format.raw/*93.57*/("""">
            <button class="btn btn-primary">Add Product</button>
          </a>
        </p>
        </div>
    </div>
    </div>
      <script>
    function confirmDel() """),format.raw/*101.27*/("""{"""),format.raw/*101.28*/("""
        """),format.raw/*102.9*/("""return confirm('Are you sure?');
    """),format.raw/*103.5*/("""}"""),format.raw/*103.6*/("""
  """),format.raw/*104.3*/("""</script>
			
""")))}),format.raw/*106.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,categories:List[Category],products:List[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,categories,products,user)

  def f:((play.api.Environment,List[Category],List[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (env,categories,products,user) => apply(env,categories,products,user)

  def ref: this.type = this

}


}
}

/**/
object listProducts extends listProducts_Scope0.listProducts_Scope1.listProducts
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:02 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/listProducts.scala.html
                  HASH: 4e6baf717d0376270e4c081f545a96d49d73122d
                  MATRIX: 943->92|1130->184|1158->187|1178->199|1214->227|1253->229|1281->231|1414->337|1429->343|1483->376|1558->425|1594->445|1634->447|1664->450|1701->460|1716->466|1776->505|1830->532|1840->533|1869->541|1908->550|1937->552|2109->697|2150->729|2190->731|2224->738|2292->780|2306->785|2342->800|2376->807|2417->818|2492->866|2526->884|2566->886|2594->887|2908->1174|3006->1262|3047->1264|3099->1288|3177->1339|3216->1357|3259->1382|3272->1387|3311->1388|3363->1412|3497->1515|3544->1534|3668->1631|3678->1632|3707->1640|3766->1672|3776->1673|3812->1688|3873->1722|3883->1723|3913->1732|4001->1793|4049->1820|4096->1839|4281->1997|4296->2003|4357->2043|4586->2245|4601->2251|4662->2291|5165->2763|5200->2771|5308->2852|5323->2858|5374->2888|5577->3062|5607->3063|5644->3072|5709->3109|5738->3110|5769->3113|5815->3128
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|41->8|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|49->16|49->16|49->16|49->16|50->17|51->18|62->29|62->29|62->29|63->30|64->31|64->31|64->31|65->32|66->33|69->36|69->36|69->36|70->37|79->46|79->46|79->46|80->47|80->47|80->47|81->48|81->48|81->48|82->49|84->51|85->52|88->55|88->55|88->55|89->56|89->56|89->56|90->57|90->57|90->57|92->59|92->59|93->60|98->65|98->65|98->65|103->70|103->70|103->70|122->89|123->90|126->93|126->93|126->93|134->101|134->101|135->102|136->103|136->103|137->104|139->106
                  -- GENERATED --
              */
          