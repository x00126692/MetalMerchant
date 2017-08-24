
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object error_Scope0 {
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

class error extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<h2>Message:</h2>
<h3>"""),_display_(/*3.6*/message),format.raw/*3.13*/("""</h3>
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object error extends error_Scope0.error
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:58 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/error.scala.html
                  HASH: edb3bb294ba603a859180420a8db899f5de44a5b
                  MATRIX: 745->1|857->18|884->19|932->42|959->49
                  LINES: 27->1|32->1|33->2|34->3|34->3
                  -- GENERATED --
              */
          