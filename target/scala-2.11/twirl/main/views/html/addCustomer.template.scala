
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addCustomer_Scope0 {
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

class addCustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addCustomerForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import models.products._

Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/(addCustomerForm: Form[models.users.Customer])),format.raw/*7.48*/("""

"""),_display_(/*9.2*/main("Add Customer",user)/*9.27*/{_display_(Seq[Any](format.raw/*9.28*/("""
"""),format.raw/*10.1*/("""<h3><strong><u>Registration Form</u></strong></h3>


	"""),_display_(/*13.3*/form(action = controllers.routes.ProductCtrl.addCustomerSubmit(), 'class -> "form-hotizontal", 'role->"form", 'enctype -> "multipart/form-data")/*13.147*/ {_display_(Seq[Any](format.raw/*13.149*/("""
"""),_display_(/*14.2*/inputText(addCustomerForm("name"), '_label -> "Name", 'class -> "form-control input-xs")),format.raw/*14.90*/("""
"""),_display_(/*15.2*/inputText(addCustomerForm("email"), '_label -> "Email", 'class -> "form-control input-xs")),format.raw/*15.92*/("""
"""),_display_(/*16.2*/inputText(addCustomerForm("password"), '_label -> "Password", 'class -> "form-control input-xs")),format.raw/*16.98*/("""

"""),_display_(/*18.2*/inputText(addCustomerForm("street1"), '_label -> "Street 1", 'class -> "form-control input-xs")),format.raw/*18.97*/("""
"""),_display_(/*19.2*/inputText(addCustomerForm("street2"), '_label -> "Street 2", 'class -> "form-control input-xs")),format.raw/*19.97*/("""
"""),_display_(/*20.2*/inputText(addCustomerForm("town"), '_label -> "Town", 'class -> "form-control input-xs")),format.raw/*20.90*/("""
"""),_display_(/*21.2*/inputText(addCustomerForm("postCode"), '_label -> "Post Code", 'class -> "form-control input-xs")),format.raw/*21.99*/("""
"""),_display_(/*22.2*/inputText(addCustomerForm("creditCard"), '_label -> "Credit Card Number", 'class -> "form-control input-xs")),format.raw/*22.110*/("""


"""),format.raw/*25.1*/("""<div class="actions">
<input type="submit" value="Register" class="btn btn-primary">
<a href=""""),_display_(/*27.11*/controllers/*27.22*/.routes.ProductCtrl.listProducts(0)),format.raw/*27.57*/(""""
<button class ="btn btn-warning">Cancel</button>
</a>
</div>
""")))}),format.raw/*31.2*/("""
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(addCustomerForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addCustomerForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addCustomerForm,user) => apply(addCustomerForm,user)

  def ref: this.type = this

}


}

/**/
object addCustomer extends addCustomer_Scope0.addCustomer
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:57 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/addCustomer.scala.html
                  HASH: 3b9fc65c479d765dcaeda1de0d06da1264854757
                  MATRIX: 796->1|1001->71|1029->90|1056->117|1083->119|1149->165|1177->168|1210->193|1248->194|1276->195|1357->250|1511->394|1552->396|1580->398|1689->486|1717->488|1828->578|1856->580|1973->676|2002->679|2118->774|2146->776|2262->871|2290->873|2399->961|2427->963|2545->1060|2573->1062|2703->1170|2733->1173|2855->1268|2875->1279|2931->1314|3025->1378|3057->1380
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|39->9|39->9|39->9|40->10|43->13|43->13|43->13|44->14|44->14|45->15|45->15|46->16|46->16|48->18|48->18|49->19|49->19|50->20|50->20|51->21|51->21|52->22|52->22|55->25|57->27|57->27|57->27|61->31|62->32
                  -- GENERATED --
              */
          