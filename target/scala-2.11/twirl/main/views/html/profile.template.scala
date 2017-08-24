
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.resource
import play.api.Play.current

Seq[Any](format.raw/*1.35*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("profile", customer)/*6.27*/ {_display_(Seq[Any](format.raw/*6.29*/("""
"""),format.raw/*7.1*/("""<aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
<br>
<h3 >Profile</h3>
<br>

<p align="left"><strong>Name:</strong> """),_display_(/*14.41*/customer/*14.49*/.getName),format.raw/*14.57*/("""</p></li>
<p align="left"><strong>Email:</strong> """),_display_(/*15.42*/customer/*15.50*/.getEmail),format.raw/*15.59*/("""</p></li>
<br>
<p align="left"><strong>Address:</strong></p>
<h5 align="left">"""),_display_(/*18.19*/customer/*18.27*/.getStreet1),format.raw/*18.38*/("""</h5>
<h5 align="left">"""),_display_(/*19.19*/customer/*19.27*/.getStreet2),format.raw/*19.38*/("""</h5>
<h5 align="left">"""),_display_(/*20.19*/customer/*20.27*/.getTown),format.raw/*20.35*/("""</h5>
<h5 align="left">"""),_display_(/*21.19*/customer/*21.27*/.getPostCode),format.raw/*21.39*/("""</h5>

<br>
<p align="left"><strong>Credit Card Number:</strong> """),_display_(/*24.55*/customer/*24.63*/.getCreditCard),format.raw/*24.77*/("""</p>
</ul>
<br>

""")))}),format.raw/*28.2*/("""
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
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:00 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/profile.scala.html
                  HASH: 506ac4fb8ca202d67c0adaecdafe6ff73ed3dc5e
                  MATRIX: 764->1|950->34|978->97|1005->99|1038->124|1077->126|1104->127|1309->305|1326->313|1355->321|1433->372|1450->380|1480->389|1586->468|1603->476|1635->487|1686->511|1703->519|1735->530|1786->554|1803->562|1832->570|1883->594|1900->602|1933->614|2026->680|2043->688|2078->702|2126->720
                  LINES: 27->1|33->1|35->5|36->6|36->6|36->6|37->7|44->14|44->14|44->14|45->15|45->15|45->15|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|54->24|54->24|54->24|58->28
                  -- GENERATED --
              */
          