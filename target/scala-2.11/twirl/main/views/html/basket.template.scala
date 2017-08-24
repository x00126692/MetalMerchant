
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models.products._

Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Shopping Basket", customer)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""

"""),format.raw/*10.1*/("""<br>
<h3><strong>"""),_display_(/*11.14*/customer/*11.22*/.getName()),format.raw/*11.32*/("""'s Basket</strong></h3>
<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
		
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(customer.getBasket() != null)/*35.50*/ {_display_(Seq[Any](format.raw/*35.52*/("""
                    
                    """),_display_(/*37.22*/for(i <- customer.getBasket().getBasketItems()) yield /*37.69*/ {_display_(Seq[Any](format.raw/*37.71*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getName),format.raw/*39.50*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getDescription()),format.raw/*40.59*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getPrice))),format.raw/*41.64*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getItemTotal))),format.raw/*42.68*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*44.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*45.39*/routes/*45.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*45.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*47.22*/("""
              """)))}),format.raw/*48.16*/("""
			"""),format.raw/*49.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*53.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*53.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-4">
                <p class="text-right">
                    <a href=""""),_display_(/*59.31*/routes/*59.37*/.ShoppingCtrl.emptyBasket()),format.raw/*59.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div> 
            <div class="col-md-4">
                <p class="text-right">
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.ProductCtrl.listProducts()),format.raw/*65.64*/("""" class="btn btn-success btn-sm" onclick="return confirmDel();">
                    </span> Continue Shopping</a>
                </p>
            </div> 
            <div class="col-md-4">
                <p class="text-right">
                    <a href=""""),_display_(/*71.31*/routes/*71.37*/.ShoppingCtrl.placeOrder()),format.raw/*71.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	
	function confirmDel() """),format.raw/*81.24*/("""{"""),format.raw/*81.25*/("""
		"""),format.raw/*82.3*/("""return confirm('Are you sure?');
	"""),format.raw/*83.2*/("""}"""),format.raw/*83.3*/("""
"""),format.raw/*84.1*/("""</script>
""")))}),format.raw/*85.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:58 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/basket.scala.html
                  HASH: e8ae973c6abe2680fc9014068306237edaef612d
                  MATRIX: 762->1|998->34|1026->149|1053->151|1094->184|1133->186|1162->188|1207->206|1224->214|1255->224|1352->295|1393->327|1433->329|1466->335|1537->379|1551->384|1587->399|1620->405|1660->415|1692->420|2023->724|2064->756|2104->758|2174->801|2237->848|2277->850|2326->871|2387->905|2397->906|2437->925|2499->960|2509->961|2558->989|2627->1031|2675->1058|2744->1100|2796->1131|2858->1166|2868->1167|2903->1181|2974->1225|2989->1231|3042->1263|3171->1365|3186->1371|3236->1400|3377->1510|3424->1526|3455->1530|3632->1680|3704->1730|3911->1910|3926->1916|3974->1943|4295->2237|4310->2243|4358->2270|4645->2530|4660->2536|4707->2562|4962->2789|4991->2790|5021->2793|5082->2827|5110->2828|5138->2829|5179->2840
                  LINES: 27->1|35->1|37->7|38->8|38->8|38->8|40->10|41->11|41->11|41->11|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|65->35|65->35|65->35|67->37|67->37|67->37|68->38|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|77->47|78->48|79->49|83->53|83->53|89->59|89->59|89->59|95->65|95->65|95->65|101->71|101->71|101->71|111->81|111->81|112->82|113->83|113->83|114->84|115->85
                  -- GENERATED --
              */
          