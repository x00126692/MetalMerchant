
package views.html

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

class listArticles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[play.api.Environment,List[Genre],List[Article],Long,String,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(env: play.api.Environment, genres: List[Genre], articles: List[Article], genId: Long, filter: String, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.116*/("""

"""),_display_(/*6.2*/main("Products Page", user)/*6.29*/ {_display_(Seq[Any](format.raw/*6.31*/("""

	"""),format.raw/*8.2*/("""<br>

     <div class="row">
        <div class="col-sm-2">
	   <div class="list-group">
			<a href=""""),_display_(/*13.14*/routes/*13.20*/.ProductCtrl.listArticles(0, filter)),format.raw/*13.56*/("""" class="list-group-item">All Articles</a>
			"""),_display_(/*14.5*/for(g <- genres) yield /*14.21*/ {_display_(Seq[Any](format.raw/*14.23*/("""
		"""),format.raw/*15.3*/("""<a href=""""),_display_(/*15.13*/routes/*15.19*/.ProductCtrl.listArticles(g.getId, filter)),format.raw/*15.61*/("""" class="list-group-item">"""),_display_(/*15.88*/g/*15.89*/.getName),format.raw/*15.97*/("""</a>
			""")))}),format.raw/*16.5*/("""
	"""),format.raw/*17.2*/("""</div>
	  </div>

		
			"""),_display_(/*21.5*/if(flash.containsKey("success"))/*21.37*/ {_display_(Seq[Any](format.raw/*21.39*/("""
				  """),format.raw/*22.7*/("""<div class="alert alert-success">
					  """),_display_(/*23.9*/flash/*23.14*/.get("success")),format.raw/*23.29*/("""
				  """),format.raw/*24.7*/("""</div>
			""")))}),format.raw/*25.5*/("""

			"""),format.raw/*27.4*/("""<div id="actions">
			 <form action=""""),_display_(/*28.20*/routes/*28.26*/.ProductCtrl.listArticles(genId)),format.raw/*28.58*/("""" method="GET">
				<input type="search" id="searchbox" name="filter" value=""""),_display_(/*29.63*/filter),format.raw/*29.69*/("""" placeholder="Filter by product name...">
				<input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
			 </form>
   
			</div>
           
                        <br>
        


                    <div class="col-sm-10">

                        """),_display_(/*41.26*/if(flash.containsKey("success"))/*41.58*/ {_display_(Seq[Any](format.raw/*41.60*/("""
                            """),format.raw/*42.29*/("""<div class="alert alert-success">
                            """),_display_(/*43.30*/flash/*43.35*/.get("success")),format.raw/*43.50*/("""
                            """),format.raw/*44.29*/("""</div>
                        """)))}),format.raw/*45.26*/("""

                    """),_display_(/*47.22*/for(a <- articles) yield /*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
"""),format.raw/*48.1*/("""<aside class="bg-dark">
            <div class="container text-center">
                <div class="call-to-action">
                        <div class="row">
                            <div class="col-md-5">
          
            <a href="#">
         
			        
                  """),_display_(/*57.20*/if(env.resource("public/images/articleImages/thumbnails/" + a.getId + ".jpg").isDefined)/*57.108*/ {_display_(Seq[Any](format.raw/*57.110*/("""
                       """),format.raw/*58.24*/("""<img src="/assets/images/articleImages/thumbnails/"""),_display_(/*58.75*/(a.getId + ".jpg")),format.raw/*58.93*/(""""/>
                   """)))}/*59.22*/else/*59.27*/{_display_(Seq[Any](format.raw/*59.28*/("""
                       """),format.raw/*60.24*/("""<td><img src="/assets/images/articleImages/thumbnails/noImage.png"/>
             
                   """)))}),format.raw/*62.21*/("""
                  """),format.raw/*63.19*/("""</a>
                  </div>
                  <div class="col-md-3">
                  <h2><u>"""),_display_(/*66.27*/a/*66.28*/.getName),format.raw/*66.36*/("""</u></h2>
                  <p>"""),_display_(/*67.23*/a/*67.24*/.getStory),format.raw/*67.33*/("""</p>
                  
                  
        


        </div>
        </div>
                        </div>
                    </div>
                        
        </aside>
        <br>
        <br>
         """)))}),format.raw/*81.11*/("""
        
  """),format.raw/*83.3*/("""</div>
  </div>


			
""")))}),format.raw/*88.2*/("""
"""))
      }
    }
  }

  def render(env:play.api.Environment,genres:List[Genre],articles:List[Article],genId:Long,filter:String,user:User): play.twirl.api.HtmlFormat.Appendable = apply(env,genres,articles,genId,filter,user)

  def f:((play.api.Environment,List[Genre],List[Article],Long,String,User) => play.twirl.api.HtmlFormat.Appendable) = (env,genres,articles,genId,filter,user) => apply(env,genres,articles,genId,filter,user)

  def ref: this.type = this

}


}
}

/**/
object listArticles extends listArticles_Scope0.listArticles_Scope1.listArticles
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:22:00 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/listArticles.scala.html
                  HASH: e8f109f2d301bb49a5ccb987efe99f5dcefaf169
                  MATRIX: 936->89|1146->203|1174->206|1209->233|1248->235|1277->238|1406->340|1421->346|1478->382|1551->429|1583->445|1623->447|1653->450|1690->460|1705->466|1768->508|1822->535|1832->536|1861->544|1900->553|1929->555|1980->580|2021->612|2061->614|2095->621|2163->663|2177->668|2213->683|2247->690|2288->701|2320->706|2385->744|2400->750|2453->782|2558->860|2585->866|2897->1151|2938->1183|2978->1185|3035->1214|3125->1277|3139->1282|3175->1297|3232->1326|3295->1358|3345->1381|3379->1399|3419->1401|3447->1402|3761->1689|3859->1777|3900->1779|3952->1803|4030->1854|4069->1872|4112->1897|4125->1902|4164->1903|4216->1927|4350->2030|4397->2049|4521->2146|4531->2147|4560->2155|4619->2187|4629->2188|4659->2197|4910->2417|4949->2429|5002->2452
                  LINES: 32->4|37->4|39->6|39->6|39->6|41->8|46->13|46->13|46->13|47->14|47->14|47->14|48->15|48->15|48->15|48->15|48->15|48->15|48->15|49->16|50->17|54->21|54->21|54->21|55->22|56->23|56->23|56->23|57->24|58->25|60->27|61->28|61->28|61->28|62->29|62->29|74->41|74->41|74->41|75->42|76->43|76->43|76->43|77->44|78->45|80->47|80->47|80->47|81->48|90->57|90->57|90->57|91->58|91->58|91->58|92->59|92->59|92->59|93->60|95->62|96->63|99->66|99->66|99->66|100->67|100->67|100->67|114->81|116->83|121->88
                  -- GENERATED --
              */
          