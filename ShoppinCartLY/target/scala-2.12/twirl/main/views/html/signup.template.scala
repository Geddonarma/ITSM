
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
<style>
body """),format.raw/*7.6*/("""{"""),format.raw/*7.7*/("""font-family: Arial, Helvetica, sans-serif;"""),format.raw/*7.49*/("""}"""),format.raw/*7.50*/("""
"""),format.raw/*8.1*/("""* """),format.raw/*8.3*/("""{"""),format.raw/*8.4*/("""box-sizing: border-box"""),format.raw/*8.26*/("""}"""),format.raw/*8.27*/("""

"""),format.raw/*10.1*/("""/* Full-width input fields */
input[type=text], input[type=password] """),format.raw/*11.40*/("""{"""),format.raw/*11.41*/("""
  """),format.raw/*12.3*/("""width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/("""input[type=text]:focus, input[type=password]:focus """),format.raw/*20.52*/("""{"""),format.raw/*20.53*/("""
  """),format.raw/*21.3*/("""background-color: #ddd;
  outline: none;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""

"""),format.raw/*25.1*/("""hr """),format.raw/*25.4*/("""{"""),format.raw/*25.5*/("""
  """),format.raw/*26.3*/("""border: 1px solid #f1f1f1;
  margin-bottom: 25px;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""

"""),format.raw/*30.1*/("""/* Set a style for all buttons */
button """),format.raw/*31.8*/("""{"""),format.raw/*31.9*/("""
  """),format.raw/*32.3*/("""background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""

"""),format.raw/*42.1*/("""button:hover """),format.raw/*42.14*/("""{"""),format.raw/*42.15*/("""
  """),format.raw/*43.3*/("""opacity:1;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/("""/* Extra styles for the cancel button */
.cancelbtn """),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
  """),format.raw/*48.3*/("""padding: 14px 20px;
  background-color: #f44336;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""

"""),format.raw/*52.1*/("""/* Float cancel and signup buttons and add an equal width */
.cancelbtn, .signupbtn """),format.raw/*53.24*/("""{"""),format.raw/*53.25*/("""
  """),format.raw/*54.3*/("""float: left;
  width: 50%;
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""

"""),format.raw/*58.1*/("""/* Add padding to container elements */
.container """),format.raw/*59.12*/("""{"""),format.raw/*59.13*/("""
  """),format.raw/*60.3*/("""padding: 16px;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""

"""),format.raw/*63.1*/("""/* Clear floats */
.clearfix::after """),format.raw/*64.18*/("""{"""),format.raw/*64.19*/("""
  """),format.raw/*65.3*/("""content: "";
  clear: both;
  display: table;
"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""


"""),format.raw/*71.1*/("""</style>
<body>

<form action="/action_page.php" style="border:1px solid #ccc">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" required>

    <label for="psw-repeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
    
    <label>
      <input type="checkbox" checked="checked" name="remember" style="margin-bottom:15px"> Remember me
    </label>
    
    <p>By creating an account you agree to our <a href="#" style="color:dodgerblue">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
  </div>
</form>

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
                  DATE: Fri Mar 22 11:01:05 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: 57c28da2f16ac35a45f390145e6f527c3efa7f24
                  MATRIX: 960->1|1080->26|1107->28|1135->48|1173->49|1201->51|1263->87|1290->88|1359->130|1387->131|1414->132|1442->134|1469->135|1518->157|1546->158|1575->160|1672->229|1701->230|1731->233|1876->351|1904->352|1933->354|2012->405|2041->406|2071->409|2139->450|2167->451|2196->453|2226->456|2254->457|2284->460|2361->510|2389->511|2418->513|2486->554|2514->555|2544->558|2719->706|2747->707|2776->709|2817->722|2846->723|2876->726|2914->737|2942->738|2971->740|3051->792|3080->793|3110->796|3186->845|3214->846|3243->848|3355->932|3384->933|3414->936|3468->963|3496->964|3525->966|3604->1017|3633->1018|3663->1021|3705->1036|3733->1037|3762->1039|3826->1075|3855->1076|3885->1079|3958->1125|3986->1126|4016->1129
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|40->8|42->10|43->11|43->11|44->12|50->18|50->18|52->20|52->20|52->20|53->21|55->23|55->23|57->25|57->25|57->25|58->26|60->28|60->28|62->30|63->31|63->31|64->32|72->40|72->40|74->42|74->42|74->42|75->43|76->44|76->44|78->46|79->47|79->47|80->48|82->50|82->50|84->52|85->53|85->53|86->54|88->56|88->56|90->58|91->59|91->59|92->60|93->61|93->61|95->63|96->64|96->64|97->65|100->68|100->68|103->71
                  -- GENERATED --
              */
          