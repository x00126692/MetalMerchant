
package views.html.productAdmin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object listArticles_Scope0 {
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

     object listArticles_Scope1 {
import models.products.Genre
import models.products.Article
import models.users.User

class listArticles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[play.api.Environment,List[Genre],List[Article],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, genres: List[Genre], articles: List[Article], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.87*/("""

"""),_display_(/*6.2*/productAdmin/*6.14*/.main("Articles Page", user)/*6.42*/ {_display_(Seq[Any](format.raw/*6.44*/("""

"""),format.raw/*8.1*/("""<br>

     <div class="row">
        <div class="col-sm-2">
	   <div class="list-group">
			
			<a href=""""),_display_(/*14.14*/routes/*14.20*/.AdminProductCtrl.listArticles(0)),format.raw/*14.53*/("""" class="list-group-item">All Genres</a>
			"""),_display_(/*15.5*/for(g <- genres) yield /*15.21*/ {_display_(Seq[Any](format.raw/*15.23*/("""
		"""),format.raw/*16.3*/("""<a href=""""),_display_(/*16.13*/routes/*16.19*/.AdminProductCtrl.listArticles(g.getId)),format.raw/*16.58*/("""" class="list-group-item">"""),_display_(/*16.85*/g/*16.86*/.getName),format.raw/*16.94*/("""</a>
			""")))}),format.raw/*17.5*/("""
	"""),format.raw/*18.2*/("""</div>
	  </div>

		


			
           
                        <br>
        


                    <div class="col-sm-10">

                        """),_display_(/*32.26*/if(flash.containsKey("success"))/*32.58*/ {_display_(Seq[Any](format.raw/*32.60*/("""
                            """),format.raw/*33.29*/("""<div class="alert alert-success">
                            """),_display_(/*34.30*/flash/*34.35*/.get("success")),format.raw/*34.50*/("""
                            """),format.raw/*35.29*/("""</div>
                        """)))}),format.raw/*36.26*/("""

                    """),_display_(/*38.22*/for(a <- articles) yield /*38.40*/ {_display_(Seq[Any](format.raw/*38.42*/("""
"""),format.raw/*39.1*/("""<aside class="bg-dark">
            <div class="container text-center">
                <div class="call-to-action">
                        <div class="row">
                            <div class="col-md-5">
          
            <a href="#">
         
			        
                  """),_display_(/*48.20*/if(env.resource("public/images/articleImages/thumbnails/" + a.getId + ".jpg").isDefined)/*48.108*/ {_display_(Seq[Any](format.raw/*48.110*/("""
                       """),format.raw/*49.24*/("""<img src="/assets/images/articleImages/thumbnails/"""),_display_(/*49.75*/(a.getId + ".jpg")),format.raw/*49.93*/(""""/>
                   """)))}/*50.22*/else/*50.27*/{_display_(Seq[Any](format.raw/*50.28*/("""
                       """),format.raw/*51.24*/("""<td><img src="/assets/images/articleImages/thumbnails/noImage.png"/>
             
                   """)))}),format.raw/*53.21*/("""
                  """),format.raw/*54.19*/("""</a>
                  </div>
                  <div class="col-md-3">
                  <h2><u>"""),_display_(/*57.27*/a/*57.28*/.getName),format.raw/*57.36*/("""</u></h2>
                  <p>"""),_display_(/*58.23*/a/*58.24*/.getStory),format.raw/*58.33*/("""</p>
                  
                  <table>
                        <th>Options</th>
                        <tr>
                        <td>
                  <a href=""""),_display_(/*64.29*/routes/*64.35*/.AdminProductCtrl.updateArticle(a.getId)),format.raw/*64.75*/("""" class="btn-xs btn-danger">
                      <span class="glyphicon glyphicon-pencil"></span></a>
                      
                  </td>
                  <td>
                  <a href=""""),_display_(/*69.29*/routes/*69.35*/.AdminProductCtrl.deleteArticle(a.getId)),format.raw/*69.75*/(""""  class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                      
                  </td>
				    </tr>
					
          </tbody>
        </table>
                  
        </div>
        </div>
                       </div>
                    </div>
                        
        </aside>
        <br>
        <br>
         """)))}),format.raw/*88.11*/("""
       """),format.raw/*89.8*/("""</div>
            <div class="add">
                    <p>
          <a href=""""),_display_(/*92.21*/routes/*92.27*/.AdminProductCtrl.addArticle()),format.raw/*92.57*/("""">
            <button class="btn btn-primary">Add Article</button>
          </a>
        </p>
        </div>
    </div>
    </div>
      <script>
    function confirmDel() """),format.raw/*100.27*/("""{"""),format.raw/*100.28*/("""
        """),format.raw/*101.9*/("""return confirm('Are you sure?');
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""
  """),format.raw/*103.3*/("""</script>
			
""")))}),format.raw/*105.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,genres:List[Genre],articles:List[Article],user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,genres,articles,user)

  def f:((play.api.Environment,List[Genre],List[Article],User) => play.twirl.api.HtmlFormat.Appendable) = (env,genres,articles,user) => apply(env,genres,articles,user)

  def ref: this.type = this

}


}
}

/**/
object listArticles extends listArticles_Scope0.listArticles_Scope1.listArticles
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:02 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/productAdmin/listArticles.scala.html
                  HASH: c342d52f855953d813e91fcde56dc2c8589b7c47
                  MATRIX: 937->89|1117->174|1145->177|1165->189|1201->217|1240->219|1268->221|1401->327|1416->333|1470->366|1541->411|1573->427|1613->429|1643->432|1680->442|1695->448|1755->487|1809->514|1819->515|1848->523|1887->532|1916->534|2092->683|2133->715|2173->717|2230->746|2320->809|2334->814|2370->829|2427->858|2490->890|2540->913|2574->931|2614->933|2642->934|2956->1221|3054->1309|3095->1311|3147->1335|3225->1386|3264->1404|3307->1429|3320->1434|3359->1435|3411->1459|3545->1562|3592->1581|3716->1678|3726->1679|3755->1687|3814->1719|3824->1720|3854->1729|4058->1906|4073->1912|4134->1952|4363->2154|4378->2160|4439->2200|4941->2671|4976->2679|5084->2760|5099->2766|5150->2796|5353->2970|5383->2971|5420->2980|5485->3017|5514->3018|5545->3021|5591->3036
                  LINES: 32->4|37->4|39->6|39->6|39->6|39->6|41->8|47->14|47->14|47->14|48->15|48->15|48->15|49->16|49->16|49->16|49->16|49->16|49->16|49->16|50->17|51->18|65->32|65->32|65->32|66->33|67->34|67->34|67->34|68->35|69->36|71->38|71->38|71->38|72->39|81->48|81->48|81->48|82->49|82->49|82->49|83->50|83->50|83->50|84->51|86->53|87->54|90->57|90->57|90->57|91->58|91->58|91->58|97->64|97->64|97->64|102->69|102->69|102->69|121->88|122->89|125->92|125->92|125->92|133->100|133->100|134->101|135->102|135->102|136->103|138->105
                  -- GENERATED --
              */
          