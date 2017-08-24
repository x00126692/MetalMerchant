
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

"""),_display_(/*3.2*/main("Login Required", user)/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
"""),format.raw/*4.1*/("""<div class="col-xs-4">
<br>
  <h3>Sign in</h3>

	"""),_display_(/*8.3*/if(form.hasGlobalErrors)/*8.27*/ {_display_(Seq[Any](format.raw/*8.29*/("""
		  """),format.raw/*9.5*/("""<p class="alert alert-warning">
		      """),_display_(/*10.10*/form/*10.14*/.globalError.message),format.raw/*10.34*/("""
		  """),format.raw/*11.5*/("""</p>
	""")))}),format.raw/*12.3*/("""
    """),_display_(/*13.6*/if(flash.containsKey("error"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
		  """),format.raw/*14.5*/("""<div class="alert alert-warning">
		      """),_display_(/*15.10*/flash/*15.15*/.get("loginRequired")),format.raw/*15.36*/("""
		  """),format.raw/*16.5*/("""</div>
	""")))}),format.raw/*17.3*/("""
	"""),_display_(/*18.3*/helper/*18.9*/.form(action = controllers.security.routes.LoginCtrl.loginSubmit())/*18.76*/ {_display_(Seq[Any](format.raw/*18.78*/("""

    """),format.raw/*20.5*/("""<div class="form-group">
        <input type="text" name="email" class="form-control input-xs" placeholder="Email" value=""""),_display_(/*21.99*/form("email")/*21.112*/.value),format.raw/*21.118*/("""">
    </div>
    <div class="form-group">
        <input type="password" name="password" class="form-control input-xs" placeholder="Password">
    </div>

		<div class="form-group">
		    <input type="submit" value="Sign In" class="btn btn-primary">
		</div>
		""")))}),format.raw/*30.4*/("""
"""),format.raw/*31.1*/("""</div>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(form:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(form,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (form,user) => apply(form,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:58 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/login.scala.html
                  HASH: dc738aca31ad01b6e12d5444ff39fa5f7eb31b7a
                  MATRIX: 781->1|933->58|961->61|997->89|1036->91|1063->92|1138->142|1170->166|1209->168|1240->173|1308->214|1321->218|1362->238|1394->243|1431->250|1463->256|1502->286|1542->288|1574->293|1644->336|1658->341|1700->362|1732->367|1771->376|1800->379|1814->385|1890->452|1930->454|1963->460|2113->583|2136->596|2164->602|2457->865|2485->866|2523->874
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|49->18|49->18|49->18|49->18|51->20|52->21|52->21|52->21|61->30|62->31|63->32
                  -- GENERATED --
              */
          