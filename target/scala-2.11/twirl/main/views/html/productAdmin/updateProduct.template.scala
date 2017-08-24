
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateProduct_Scope0 {
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

class updateProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateProductForm: Form[models.products.Product], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.products._
import helper._

Seq[Any](format.raw/*1.87*/("""

 """),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/productAdmin/*7.14*/.main("Update Product", user)/*7.43*/ {_display_(Seq[Any](format.raw/*7.45*/("""

	"""),format.raw/*9.2*/("""<h3>Update Product</h3>

	"""),_display_(/*11.3*/form(action = routes.AdminProductCtrl.updateProductSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*11.144*/ {_display_(Seq[Any](format.raw/*11.146*/("""
		
		"""),_display_(/*13.4*/inputText(updateProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*13.84*/("""
		"""),_display_(/*14.4*/inputText(updateProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*14.98*/("""

        """),_display_(/*16.10*/for((value, name) <- Category.options) yield /*16.48*/ {_display_(Seq[Any](format.raw/*16.50*/("""
            """),format.raw/*17.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*17.63*/value),format.raw/*17.68*/(""""
            """),_display_(/*18.14*/if(Category.inCategory(value.toLong, id))/*18.55*/ {_display_(Seq[Any](format.raw/*18.57*/("""
                """),format.raw/*19.17*/("""checked
            """)))}),format.raw/*20.14*/("""
            """),format.raw/*21.13*/("""/>"""),_display_(/*21.16*/name),format.raw/*21.20*/("""<br>        
        """)))}),format.raw/*22.10*/("""

		"""),_display_(/*24.4*/inputText(updateProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*24.86*/("""
		"""),_display_(/*25.4*/inputText(updateProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*25.86*/("""

		"""),format.raw/*27.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*34.14*/routes/*34.20*/.AdminProductCtrl.listProducts(0)),format.raw/*34.53*/(""""
				<button class="btn btn-warning" role="button">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*38.3*/(""" 

""")))}),format.raw/*40.2*/(""" 


"""))
      }
    }
  }

  def render(id:Long,updateProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateProductForm,user)

  def f:((Long,Form[models.products.Product],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateProductForm,user) => apply(id,updateProductForm,user)

  def ref: this.type = this

}


}

/**/
object updateProduct extends updateProduct_Scope0.updateProduct
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:01 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/updateProduct.scala.html
                  HASH: e17754c6d95602814ee6a6cc1f433f38505dd362
                  MATRIX: 820->1|1040->86|1069->115|1096->133|1123->135|1143->147|1180->176|1219->178|1248->181|1301->208|1452->349|1493->351|1526->358|1627->438|1657->442|1772->536|1810->547|1864->585|1904->587|1945->600|2022->650|2048->655|2090->670|2140->711|2180->713|2225->730|2277->751|2318->764|2348->767|2373->771|2426->793|2457->798|2560->880|2590->884|2693->966|2724->970|2953->1172|2968->1178|3022->1211|3139->1298|3173->1302
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|43->13|44->14|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|51->21|51->21|52->22|54->24|54->24|55->25|55->25|57->27|64->34|64->34|64->34|68->38|70->40
                  -- GENERATED --
              */
          