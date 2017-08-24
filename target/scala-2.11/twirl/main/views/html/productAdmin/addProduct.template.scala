
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.products._
import helper._

Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/productAdmin/*7.14*/.main("New Product", user)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""

	"""),format.raw/*9.2*/("""<h3>Add a new Product</h3>
	
	"""),_display_(/*11.3*/form(action = routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*11.139*/ {_display_(Seq[Any](format.raw/*11.141*/("""
		
		"""),_display_(/*13.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*13.81*/("""
		"""),_display_(/*14.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*14.95*/("""

        """),_display_(/*16.10*/for((value, name) <- Category.options) yield /*16.48*/ {_display_(Seq[Any](format.raw/*16.50*/("""
            """),format.raw/*17.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*17.63*/value),format.raw/*17.68*/("""" />"""),_display_(/*17.73*/name),format.raw/*17.77*/("""<br>        
        """)))}),format.raw/*18.10*/("""

		"""),_display_(/*20.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*20.83*/("""
		"""),_display_(/*21.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*21.83*/("""

		"""),format.raw/*23.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*30.14*/routes/*30.20*/.AdminProductCtrl.listProducts(0)),format.raw/*30.53*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*34.3*/(""" 

""")))}),format.raw/*36.2*/(""" 


"""))
      }
    }
  }

  def render(addProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((Form[models.products.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}

/**/
object addProduct extends addProduct_Scope0.addProduct
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:03 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/addProduct.scala.html
                  HASH: 98cf56b7eb2dcb54774fa209f0d2c6b8c5f52d37
                  MATRIX: 809->1|1016->73|1044->101|1071->119|1098->121|1118->133|1152->159|1191->161|1220->164|1277->195|1423->331|1464->333|1497->340|1595->417|1625->421|1737->512|1775->523|1829->561|1869->563|1910->576|1987->626|2013->631|2045->636|2070->640|2123->662|2154->667|2254->746|2284->750|2384->829|2415->833|2651->1042|2666->1048|2720->1081|2823->1154|2857->1158
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|43->13|44->14|44->14|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|48->18|50->20|50->20|51->21|51->21|53->23|60->30|60->30|60->30|64->34|66->36
                  -- GENERATED --
              */
          