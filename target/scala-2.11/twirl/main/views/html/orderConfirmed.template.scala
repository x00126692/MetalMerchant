
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderConfirmed_Scope0 {
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

class orderConfirmed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current
import models.shopping._
import models.products._

Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Order Confirmation", customer)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
"""),format.raw/*9.1*/("""<aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
<br>
<h3 >Order Confirmation</h3>
<br>
<h4 align="left"><strong><u>Delivery Details</u></strong></h4>

<p align="left"><strong>Name:</strong> """),_display_(/*17.41*/customer/*17.49*/.getName),format.raw/*17.57*/("""</p></li>
<p align="left"><strong>Email:</strong> """),_display_(/*18.42*/customer/*18.50*/.getEmail),format.raw/*18.59*/("""</p></li>
<br>
<p align="left"><strong>Address:</strong></p>
<h5 align="left">"""),_display_(/*21.19*/customer/*21.27*/.getStreet1),format.raw/*21.38*/("""</h5>
<h5 align="left">"""),_display_(/*22.19*/customer/*22.27*/.getStreet2),format.raw/*22.38*/("""</h5>
<h5 align="left">"""),_display_(/*23.19*/customer/*23.27*/.getTown),format.raw/*23.35*/("""</h5>
<h5 align="left">"""),_display_(/*24.19*/customer/*24.27*/.getPostCode),format.raw/*24.39*/("""</h5>

<br>
<p align="left"><strong>Credit Card Number:</strong> """),_display_(/*27.55*/customer/*27.63*/.getCreditCard),format.raw/*27.77*/("""</p>
</ul>
<br>

<h4 align="left"><strong><u>Items</u></strong></h4>
<div class="row">

	<div class="col-md-10">
		"""),_display_(/*35.4*/if(flash.containsKey("success"))/*35.36*/ {_display_(Seq[Any](format.raw/*35.38*/("""
			  """),format.raw/*36.6*/("""<div class="alert alert-success">
			      """),_display_(/*37.11*/flash/*37.16*/.get("success")),format.raw/*37.31*/("""
			  """),format.raw/*38.6*/("""</div>
		""")))}),format.raw/*39.4*/(""" 

		"""),format.raw/*41.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*53.18*/if(order != null)/*53.35*/ {_display_(Seq[Any](format.raw/*53.37*/("""
                   
                    """),_display_(/*55.22*/for(i <- order.getItems) yield /*55.46*/ {_display_(Seq[Any](format.raw/*55.48*/("""
                    """),format.raw/*56.21*/("""<tr>
                        <td>"""),_display_(/*57.30*/i/*57.31*/.getProduct.getName),format.raw/*57.50*/("""</td>
                        <td>"""),_display_(/*58.30*/i/*58.31*/.getProduct.getDescription),format.raw/*58.57*/("""</td>
                        <td>&euro; """),_display_(/*59.37*/("%.2f".format(i.getPrice))),format.raw/*59.64*/("""</td>
                        <td>"""),_display_(/*60.30*/i/*60.31*/.getQuantity()),format.raw/*60.45*/("""</td>
                        <td>&euro; """),_display_(/*61.37*/("%.2f".format(i.getItemTotal))),format.raw/*61.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*63.22*/("""
              """)))}),format.raw/*64.16*/("""
			"""),format.raw/*65.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*69.68*/("%.2f".format(order.getOrderTotal))),format.raw/*69.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
</aside>
</div>
</div>
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


}

/**/
object orderConfirmed extends orderConfirmed_Scope0.orderConfirmed
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:59 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/orderConfirmed.scala.html
                  HASH: a819e9d630433cd7f94aed8b8b6964efb7951bd7
                  MATRIX: 804->1|1074->68|1102->183|1129->185|1173->221|1212->223|1239->224|1518->476|1535->484|1564->492|1642->543|1659->551|1689->560|1795->639|1812->647|1844->658|1895->682|1912->690|1944->701|1995->725|2012->733|2041->741|2092->765|2109->773|2142->785|2235->851|2252->859|2287->873|2429->989|2470->1021|2510->1023|2543->1029|2614->1073|2628->1078|2664->1093|2697->1099|2737->1109|2769->1114|3053->1371|3079->1388|3119->1390|3188->1432|3228->1456|3268->1458|3317->1479|3378->1513|3388->1514|3428->1533|3490->1568|3500->1569|3547->1595|3616->1637|3664->1664|3726->1699|3736->1700|3771->1714|3840->1756|3892->1787|3976->1840|4023->1856|4054->1860|4230->2009|4288->2045|4414->2141
                  LINES: 27->1|35->1|37->7|38->8|38->8|38->8|39->9|47->17|47->17|47->17|48->18|48->18|48->18|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|54->24|54->24|54->24|57->27|57->27|57->27|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|69->39|71->41|83->53|83->53|83->53|85->55|85->55|85->55|86->56|87->57|87->57|87->57|88->58|88->58|88->58|89->59|89->59|90->60|90->60|90->60|91->61|91->61|93->63|94->64|95->65|99->69|99->69|107->77
                  -- GENERATED --
              */
          