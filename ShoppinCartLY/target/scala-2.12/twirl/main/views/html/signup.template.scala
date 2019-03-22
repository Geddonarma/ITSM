
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import models.users.Login
/*4.2*/import helper._


Seq[Any](format.raw/*1.27*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*5.2*/main("Sign Up",user)/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""

"""),format.raw/*7.1*/("""<!DOCTYPE html>
<html>
  <meta charset="utf-8">

<style>
body"""),format.raw/*12.5*/("""{"""),format.raw/*12.6*/("""
  """),format.raw/*13.3*/("""margin: 0;
  padding: 0;
  background: #487eb0;
"""),format.raw/*16.1*/("""}"""),format.raw/*16.2*/("""
"""),format.raw/*17.1*/(""".signup-form"""),format.raw/*17.13*/("""{"""),format.raw/*17.14*/("""
  """),format.raw/*18.3*/("""width: 350px;
  padding: 20px;
  text-align: center;
  position: absolute;
  top: 50%;
  left: 40%;
/*   transform: translate(-50%, -50%);
  overflow: hidden; */
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""
"""),format.raw/*27.1*/(""".signup-form h1"""),format.raw/*27.16*/("""{"""),format.raw/*27.17*/("""
  """),format.raw/*28.3*/("""margin-top: 100px;
  font-family: 'Permanent Maker', cursive;
  color: #fff;
  font-size: 40px;
  
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
"""),format.raw/*34.1*/(""".signup-form input"""),format.raw/*34.19*/("""{"""),format.raw/*34.20*/(""" 
"""),format.raw/*35.1*/("""/*   display: block; 
  widows: 100px;  */
  padding: 0 16px; 
  height: 44px; 
  text-align: center; 
/*   box-sizing: border-box; 
  outline: none; 
  border: none;  */
  """),format.raw/*43.3*/("""}"""),format.raw/*43.4*/(""" 

"""),format.raw/*45.1*/(""".txtb"""),format.raw/*45.6*/("""{"""),format.raw/*45.7*/(""" 
  """),format.raw/*46.3*/("""margin: 20px 0; 
  background: rgba(255,255, 255, .5); 
  border-radius: 6px; 
  """),format.raw/*49.3*/("""}"""),format.raw/*49.4*/(""" 
  """),format.raw/*50.3*/(""".signup-btn"""),format.raw/*50.14*/("""{"""),format.raw/*50.15*/(""" 
    """),format.raw/*51.5*/("""margin-top: 60px; 
    margin-bottom: 20px; 
    background: #487eb0; 
    color: #fff; 
    border-radius: 44px; 
    cursor: pointer; 
    transition: 0.8s; 
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/(""" 
    """),format.raw/*59.5*/(""".signup-btn:hover"""),format.raw/*59.22*/("""{"""),format.raw/*59.23*/(""" 
      """),format.raw/*60.7*/("""transform: scale(0.96); 
      """),format.raw/*61.7*/("""}"""),format.raw/*61.8*/(""" 
      """),format.raw/*62.7*/(""".signup-form a"""),format.raw/*62.21*/("""{"""),format.raw/*62.22*/(""" 
        """),format.raw/*63.9*/("""text-decoration: none; 
        color: #fff; 
        font-family: "montserrat",sans-serif; 
        font-size: 14px; 
        padding: 10px; 
        transition: 0.8s; 
        display: block;
         """),format.raw/*70.10*/("""}"""),format.raw/*70.11*/(""" 
         """),format.raw/*71.10*/(""".signup-form a:hover"""),format.raw/*71.30*/("""{"""),format.raw/*71.31*/("""
            """),format.raw/*72.13*/("""background: rgba(0,0, 0, .3)
             """),format.raw/*73.14*/("""}"""),format.raw/*73.15*/("""
"""),format.raw/*74.1*/("""</style>
<body>

    <div class="signup-form">
        <form class="" action="main.scala.html" method="POST">
            <h1> Sign Up</h1>
        <input type="text" placeholder="Full name" class="txtb">
        <input type="email" placeholder="Email" class="txtb">
        <input type="password" placeholder="Password" class="txtb">
        <input type="Submit" value="Create Account" class="signup-btn">
        <a href="#">Already have one ?</a>
        
        </form>
    </div>
</body>

</html>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 22 13:52:47 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: 27e16a521ac2b2dac9021392b79de1032793deda
                  MATRIX: 960->1|1058->28|1091->56|1136->26|1163->54|1190->73|1218->93|1256->94|1284->96|1372->157|1400->158|1430->161|1505->209|1533->210|1561->211|1601->223|1630->224|1660->227|1849->389|1877->390|1905->391|1948->406|1977->407|2007->410|2133->509|2161->510|2189->511|2235->529|2264->530|2293->532|2493->705|2521->706|2551->709|2583->714|2611->715|2642->719|2750->800|2778->801|2809->805|2848->816|2877->817|2910->823|3101->987|3129->988|3162->994|3207->1011|3236->1012|3271->1020|3329->1051|3357->1052|3392->1060|3434->1074|3463->1075|3500->1085|3731->1288|3760->1289|3799->1300|3847->1320|3876->1321|3917->1334|3987->1376|4016->1377|4044->1378
                  LINES: 28->1|31->2|32->4|35->1|36->3|37->5|37->5|37->5|39->7|44->12|44->12|45->13|48->16|48->16|49->17|49->17|49->17|50->18|58->26|58->26|59->27|59->27|59->27|60->28|65->33|65->33|66->34|66->34|66->34|67->35|75->43|75->43|77->45|77->45|77->45|78->46|81->49|81->49|82->50|82->50|82->50|83->51|90->58|90->58|91->59|91->59|91->59|92->60|93->61|93->61|94->62|94->62|94->62|95->63|102->70|102->70|103->71|103->71|103->71|104->72|105->73|105->73|106->74
                  -- GENERATED --
              */
          