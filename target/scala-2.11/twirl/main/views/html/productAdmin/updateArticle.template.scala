
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object updateArticle_Scope0 {
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

class updateArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Long,Form[models.products.Article],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: Long, updateArticleForm: Form[models.products.Article], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.products._
import helper._

Seq[Any](format.raw/*1.87*/("""

 """),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/productAdmin/*7.14*/.main("Update Article", user)/*7.43*/ {_display_(Seq[Any](format.raw/*7.45*/("""

	"""),format.raw/*9.2*/("""<h3>Update Article</h3>
	
	"""),_display_(/*11.3*/form(action = routes.AdminProductCtrl.updateArticleSubmit(id), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*11.144*/ {_display_(Seq[Any](format.raw/*11.146*/("""
		
		"""),_display_(/*13.4*/inputText(updateArticleForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*13.84*/("""
		"""),_display_(/*14.4*/inputText(updateArticleForm("story"), '_label -> "Story",'class -> "form-control")),format.raw/*14.86*/("""

        """),_display_(/*16.10*/for((value, name) <- Genre.options) yield /*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
            """),format.raw/*17.13*/("""<input type="checkbox" name="genSelect[]" value=""""),_display_(/*17.63*/value),format.raw/*17.68*/(""""
            """),_display_(/*18.14*/if(Genre.inGenre(value.toLong, id))/*18.49*/ {_display_(Seq[Any](format.raw/*18.51*/("""
                """),format.raw/*19.17*/("""checked
            """)))}),format.raw/*20.14*/("""
            """),format.raw/*21.13*/("""/>"""),_display_(/*21.16*/name),format.raw/*21.20*/("""<br>        
        """)))}),format.raw/*22.10*/("""	

		"""),format.raw/*24.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*31.14*/routes/*31.20*/.AdminProductCtrl.listArticles(0)),format.raw/*31.53*/(""""
				<button class="btn btn-warning" role="button">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*35.3*/(""" 

""")))}),format.raw/*37.2*/(""" 


"""))
      }
    }
  }

  def render(id:Long,updateArticleForm:Form[models.products.Article],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(id,updateArticleForm,user)

  def f:((Long,Form[models.products.Article],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (id,updateArticleForm,user) => apply(id,updateArticleForm,user)

  def ref: this.type = this

}


}

/**/
object updateArticle extends updateArticle_Scope0.updateArticle
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:03 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/updateArticle.scala.html
                  HASH: 06bcf5eb53607322fb86edbc4b5a72dfc49c8181
                  MATRIX: 820->1|1040->86|1069->115|1096->133|1123->135|1143->147|1180->176|1219->178|1248->181|1302->209|1453->350|1494->352|1527->359|1628->439|1658->443|1761->525|1799->536|1850->571|1890->573|1931->586|2008->636|2034->641|2076->656|2120->691|2160->693|2205->710|2257->731|2298->744|2328->747|2353->751|2406->773|2438->778|2667->980|2682->986|2736->1019|2853->1106|2887->1110
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|43->13|44->14|44->14|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|51->21|51->21|51->21|52->22|54->24|61->31|61->31|61->31|65->35|67->37
                  -- GENERATED --
              */
          