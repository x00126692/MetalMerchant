
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object about_Scope0 {
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

class about extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("about",user)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""</header>

    <section class="bg-primary" id="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading" style="color:black"><strong>Information</strong></h2>
                    <hr class="light">
                    <p class="text-faded" style="color:black;">Heavy Metal Merchant is a website that sells clothes and accessories relating to all genres of metal music and puts out news articles that tell the latest stories in the metal scene.</p>
                    <a href="#services" class="page-scroll btn btn-default btn-xl sr-button">Learn more about metal!</a>
                </div>
            </div>
        </div>
    </section>

    <section id="services">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2 class="section-heading"><strong>Metal Genres</strong></h2>
            </div>
        </div>
    </aside>
                    
                    <br class="primary">
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        
                        <h3><strong><u>Thrash Metal</u></strong></h3>
                        <p class="text-muted">Thrash metal is an extreme subgenre of heavy metal music characterized by its fast tempo and overall aggression. The songs usually use fast percussive beats and low-register guitar riffs, overlaid with shredding-style lead work. The lyrics often deal with social issues and reproach for The Establishment, using direct and denunciatory language, an approach borrowed from hardcore punk. The genre evolved in the early 1980s from combining the fast drum beats and attitude of hardcore with the double bass drumming, heavy and complex guitar style of the new wave of British heavy metal (NWOBHM). It emerged partially as a reaction to the more conventional and widely acceptable glam metal, a less aggressive, pop music–infused heavy metal subgenre which appeared simultaneously. Thrash metal was an inspiration for subsequent extreme genres such as death metal and black metal. </p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        
                        <h3><strong><u>New Wave Of British Heavy Metal</u></strong></h3>
                        <p class="text-muted">The new wave of British heavy metal (commonly abbreviated as NWOBHM) was a nationwide musical movement that started in the United Kingdom in the late 1970s and achieved international attention by the early 1980s. Journalist Geoff Barton coined the term in a May 1979 issue of the British music newspaper Sounds to describe the emergence of new heavy metal bands in the late 1970s, during the period of punk rock's decline and the dominance of new wave music.Although encompassing diverse mainstream and underground styles, the music of the NWOBHM is best remembered for drawing on the heavy metal of the 1970s and infusing it with the intensity of punk rock to produce fast and aggressive songs. The DIY attitude of the new metal bands led to the spread of raw-sounding, self-produced recordings and a proliferation of independent record labels. Song lyrics were usually about escapist themes such as mythology, fantasy, horror and the rock lifestyle. </p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        
                        <h3><strong><u>Death Metal</u></strong></h3>
                        <p class="text-muted">Death metal is an extreme subgenre of heavy metal music. It typically employs heavily distorted and low-tuned guitars, played with techniques such as palm muting and tremolo picking, deep growling vocals, aggressive, powerful drumming featuring double kick or blast beat techniques, minor keys or atonality, abrupt tempo, key, and time signature changes and chromatic chord progressions. The lyrical themes of death metal may invoke slasher film-stylized violence, religion (sometimes Satanism), occultism, Lovecraftian horror, nature, mysticism, mythology, philosophy, science fiction, and politics, and they may describe extreme acts, including mutilation, dissection, torture, rape, cannibalism, and necrophilia. Building from the musical structure of thrash metal and early black metal, death metal emerged during the mid-1980s. Bands such as Venom, Celtic Frost, Slayer, and Kreator were important influences on the genre's creation. Possessed and Death, along with bands such as Obituary, Autopsy and Morbid Angel, are often considered pioneers of the genre. </p>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        
                        <h3><strong><u>Power Metal</u></strong></h3>
                        <p class="text-muted">Power metal is a subgenre of heavy metal combining characteristics of traditional metal with speed metal, often within symphonic context. Generally, power metal is characterized by a faster, lighter and more uplifting sound, in contrast with the heaviness and dissonance prevalent for example in extreme metal. Power metal bands usually have anthem-like songs with fantasy-based subject matter and strong choruses, thus creating a theatrical, dramatic and emotionally "powerful" sound. The term was first used in the middle of the 1980s and refers to two different but related styles: the first pioneered and largely practiced in North America with a harder sound similar to speed metal, and a later more widespread and popular style based in Europe (especially Scandinavia, Germany, Greece and Italy), South America (especially Brazil and Argentina) and Japan, with a lighter, more melodic sound and frequent use of keyboards. </p>
                    </div>
                </div>
            </div>
         </div>
         
          <div class="container">
            <div class="row">
                    <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        
                        <h3><strong><u>Black Metal</u></strong></h3>
                        <p class="text-muted">Black metal is a style of extreme metal music. Common traits include fast tempos, a shrieking vocal style, heavily distorted guitars played with tremolo picking, raw (lo-fi) recording, unconventional song structures, and an emphasis on atmosphere. Artists often appear in corpse paint and adopt pseudonyms. During the 1980s, several thrash and death metal bands formed a prototype for black metal. This so-called first wave included bands such as Venom, Bathory, Mercyful Fate, Hellhammer and Celtic Frost. A second wave arose in the early 1990s, spearheaded by Norwegian bands such as Mayhem, Darkthrone, Burzum, Immortal, Emperor, Satyricon and Gorgoroth. The early Norwegian black metal scene developed the style of their forebears into a distinct genre. Norwegian-inspired black metal scenes emerged throughout Europe and North America, although some other scenes developed their own styles independently. Some prominent Swedish bands spawned during this second wave, such as Marduk, Nifelheim and Dark Funeral. </p>
                    </div>
                </div>
                                          <div class="col-lg-3 col-md-6 text-center">
                    <div class="service-box">
                        
                        <h3><strong><u>MetalCore</u></strong></h3>
                        <p class="text-muted">Metalcore is a fusion music genre using elements of extreme metal and hardcore punk. The word is a portmanteau of the names of the two genres. Among other genres blending metal and hardcore, such as crust punk and grindcore, metalcore is noted for its use of breakdowns, which are slow, intense passages that are conducive to moshing. Pioneering metalcore bands—such as Integrity, Earth Crisis and Converge, all of which had formed by 1990—are described as leaning more toward hardcore, with their style sometimes being called metallic hardcore, whereas later bands—such as Killswitch Engage, All That Remains, Trivium, As I Lay Dying, Bullet for My Valentine, and Parkway Drive—are described as leaning more towards metal. Pantera and Sepultura (who influenced Trivium, Atreyu, Bleeding Through and Unearth) have been particularly influential to the development of metalcore in the 2000s, which saw many bands in the genre achieve some success. </p>
                    </div>
                </div>  
                <div class="service-box">
                        
                        <h3><strong></strong></h3>
                        <p class="text-muted"> </p>
                    </div>
                </div> 
                <div class="service-box">
                        
                        <h3><strong></strong></h3>
                        <p class="text-muted"> </p>
                    </div>
                </div> 
             <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <a href="#contact" class="page-scroll btn btn-default btn-xl sr-button">Contact Details</a>
            </div>
        </div>
    </aside>
             
            </div>
        </div>
    </section>







    <aside class="bg-dark">
        <div class="container text-center">
            <div class="call-to-action">
                <h2>Visit The Official Wiki Websites Here!</h2>
                <a href="http://www.wikipedia.com/" class="btn btn-default btn-xl sr-button">Wikipedia</a>
            </div>
        </div>
    </aside>
     
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2 text-center">
                    <h2 class="section-heading">Contact info</h2>
                    <br class="primary">
                    <p style="color:white">If you have any questions, please contact us using the information given below!</p>
                </div>
                <div style="color:white" class="col-lg-4 col-lg-offset-2 text-center">
                    

                    <p style="color:white">085 8473 803</p>
                </div>
                <div style="color:white" class="col-lg-4 text-center">
                    

                    <p>kwonw1998@gmail.com</p>
                </div>
            </div>
        </div>
    </section>


""")))}),format.raw/*146.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object about extends about_Scope0.about
              /*
                  -- GENERATED --
                  DATE: Thu Aug 24 17:21:58 IST 2017
                  SOURCE: /home/wdd/webapps/MetalMerchant/app/views/about.scala.html
                  HASH: 7f480c390411410ce92049caad064a9c5fea50fb
                  MATRIX: 756->1|876->26|904->29|930->47|968->48|999->53|12073->11097
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|177->146
                  -- GENERATED --
              */
          