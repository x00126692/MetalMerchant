
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addArticle_Scope0 {
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

class addArticle extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.products.Article],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(addArticleForm: Form[models.products.Article], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import models.products._
import helper._

Seq[Any](format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/productAdmin/*7.14*/.main("New Article", user)/*7.40*/ {_display_(Seq[Any](format.raw/*7.42*/("""

	"""),format.raw/*9.2*/("""<h3>Add a new Article</h3>
	
	"""),_display_(/*11.3*/form(action = routes.AdminProductCtrl.addArticleSubmit(), 'class -> "form-horizontal", 'role->"form", 'enctype -> "multipart/form-data")/*11.139*/ {_display_(Seq[Any](format.raw/*11.141*/("""

		"""),_display_(/*13.4*/inputText(addArticleForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*13.81*/("""
		"""),_display_(/*14.4*/inputText(addArticleForm("story"), '_label -> "Story",'class -> "form-control")),format.raw/*14.83*/("""

        """),_display_(/*16.10*/for((value, name) <- Genre.options) yield /*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
            """),format.raw/*17.13*/("""<input type="checkbox" name="genSelect[]" value=""""),_display_(/*17.63*/value),format.raw/*17.68*/("""" />"""),_display_(/*17.73*/name),format.raw/*17.77*/("""<br>        
        """)))}),format.raw/*18.10*/("""


		"""),format.raw/*21.3*/("""<label>Image</label>
    <input class="btn-sm btn-default" type="file" name="upload">
	
		<br><br>

  <div class="actions">
      <input type="submit" value="Add Article" class="btn btn-primary">
			<a href=""""),_display_(/*28.14*/routes/*28.20*/.AdminProductCtrl.listArticles(0)),format.raw/*28.53*/(""""
				<button class="btn btn-warning">Cancel</button>
			</a>
  </div>
	""")))}),format.raw/*32.3*/(""" 

""")))}),format.raw/*34.2*/(""" 


"""))
      }
    }
  }

  def render(addArticleForm:Form[models.products.Article],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addArticleForm,user)

  def f:((Form[models.products.Article],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addArticleForm,user) => apply(addArticleForm,user)

  def ref: this.type = this

}


}

/**/
object addArticle extends addArticle_Scope0.addArticle
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:01 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/addArticle.scala.html
                  HASH: 0940f1e023f4bc3c032d753986b967ab838fce1f
                  MATRIX: 809->1|1016->73|1044->101|1071->119|1098->121|1118->133|1152->159|1191->161|1220->164|1277->195|1423->331|1464->333|1495->338|1593->415|1623->419|1723->498|1761->509|1812->544|1852->546|1893->559|1970->609|1996->614|2028->619|2053->623|2106->645|2138->650|2374->859|2389->865|2443->898|2546->971|2580->975
                  LINES: 27->1|33->1|35->4|36->6|37->7|37->7|37->7|37->7|39->9|41->11|41->11|41->11|43->13|43->13|44->14|44->14|46->16|46->16|46->16|47->17|47->17|47->17|47->17|47->17|48->18|51->21|58->28|58->28|58->28|62->32|64->34
                  -- GENERATED --
              */
          