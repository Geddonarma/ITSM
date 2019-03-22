
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


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Sign Up",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""

"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
  <meta charset="utf-8">

<style>
body"""),format.raw/*9.5*/("""{"""),format.raw/*9.6*/("""
  """),format.raw/*10.3*/("""margin: 0;
  padding: 0;
  background: #487eb0;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""
"""),format.raw/*14.1*/(""".signup-form"""),format.raw/*14.13*/("""{"""),format.raw/*14.14*/("""
  """),format.raw/*15.3*/("""width: 300px;
  padding: 20px;
  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  overflow: hidden;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
"""),format.raw/*24.1*/(""".signup-form h1"""),format.raw/*24.16*/("""{"""),format.raw/*24.17*/("""
  """),format.raw/*25.3*/("""margin-top: 100px;
  font-family: 'Permanent Maker', cursive;
  color: #fff;
  font-size: 40px;
  
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""

"""),format.raw/*32.1*/("""</style>
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
                  DATE: Fri Mar 22 12:06:55 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: 962776e8a33887ceda7e40d3f51b111d22948820
                  MATRIX: 960->1|1080->26|1107->28|1135->48|1173->49|1201->51|1288->112|1315->113|1345->116|1420->164|1448->165|1476->166|1516->178|1545->179|1575->182|1758->338|1786->339|1814->340|1857->355|1886->356|1916->359|2042->458|2070->459|2099->461
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|41->9|41->9|42->10|45->13|45->13|46->14|46->14|46->14|47->15|55->23|55->23|56->24|56->24|56->24|57->25|62->30|62->30|64->32
                  -- GENERATED --
              */
          