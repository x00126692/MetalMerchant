
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listUsers_Scope0 {
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

     object listUsers_Scope1 {
import models.users.User

class listUsers extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(users: List[User],user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.32*/("""


"""),_display_(/*6.2*/productAdmin/*6.14*/.main("users Page", user)/*6.39*/ {_display_(Seq[Any](format.raw/*6.41*/("""

        """),format.raw/*8.9*/("""<div class ="users">
<table>
  <tr>
    <th>Name:</th>
    <th>Email:</th>
  </tr>
"""),_display_(/*14.2*/for(u <- users) yield /*14.17*/ {_display_(Seq[Any](format.raw/*14.19*/("""

 
  """),format.raw/*17.3*/("""<tr>
    <td style="color:white;">"""),_display_(/*18.31*/u/*18.32*/.getName),format.raw/*18.40*/("""</td>
    <td style="color:white;">"""),_display_(/*19.31*/u/*19.32*/.getEmail),format.raw/*19.41*/("""</td>
    
  </tr>

                  
                  
                 

            
         """)))}),format.raw/*28.11*/("""
"""),format.raw/*29.1*/("""</table>
</div>

<script>
    function confirmBan() """),format.raw/*33.27*/("""{"""),format.raw/*33.28*/("""
        """),format.raw/*34.9*/("""return confirm('Are you sure?');
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""
  """),format.raw/*36.3*/("""</script>

""")))}),format.raw/*38.2*/("""
"""))
      }
    }
  }

  def render(users:List[User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[User],User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


}
}

/**/
object listUsers extends listUsers_Scope0.listUsers_Scope1.listUsers
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:01 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/listUsers.scala.html
                  HASH: 0cbaeadf483f991dd0d9150fc387320d3b24b22e
                  MATRIX: 832->28|957->58|986->62|1006->74|1039->99|1078->101|1114->111|1224->195|1255->210|1295->212|1328->218|1390->253|1400->254|1429->262|1492->298|1502->299|1532->308|1663->408|1691->409|1771->461|1800->462|1836->471|1900->508|1928->509|1958->512|2000->524
                  LINES: 30->3|35->3|38->6|38->6|38->6|38->6|40->8|46->14|46->14|46->14|49->17|50->18|50->18|50->18|51->19|51->19|51->19|60->28|61->29|65->33|65->33|66->34|67->35|67->35|68->36|70->38
                  -- GENERATED --
              */
          