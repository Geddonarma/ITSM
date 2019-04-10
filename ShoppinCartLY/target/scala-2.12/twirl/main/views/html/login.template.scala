
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
/*1.2*/import models.users.User
/*2.2*/import models.users.Login

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Login],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(loginForm: Form[Login], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*3.38*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Login", user)/*6.21*/ {_display_(Seq[Any](format.raw/*6.23*/("""
    """),format.raw/*7.5*/("""<style>
 .container"""),format.raw/*8.12*/("""{"""),format.raw/*8.13*/("""
 """),format.raw/*9.2*/("""width: 130%;
 min-height: 100vh;
 background-image: linear-gradient(170deg, #B621fe, #1fd1f9);
 display: -webkit-box;
 display: -webkit-flex;
 display: -moz-box;
 display: -moz-flexbox;
 display: flex;
 flex-wrap: wrap;
 justify-content: center;
 align-items: center;
 padding: 15px;
 z-index: 1;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""

"""),format.raw/*24.1*/(""".box"""),format.raw/*24.5*/("""{"""),format.raw/*24.6*/("""
  """),format.raw/*25.3*/("""width: 400px;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: white;
  border-radius: 10px;
  padding: 40px;
  box-shadow: 0 8px 12px 0 rgba(0, 0, 0, 0.15);

"""),format.raw/*35.1*/("""}"""),format.raw/*35.2*/("""
"""),format.raw/*36.1*/("""h1"""),format.raw/*36.3*/("""{"""),format.raw/*36.4*/("""
"""),format.raw/*37.1*/("""font-size: 50px;
text-align: center;
font-weight: bold;
color: black;
margin: 20px 0 70px 0;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

"""),format.raw/*44.1*/(""".btn"""),format.raw/*44.5*/("""{"""),format.raw/*44.6*/("""
    """),format.raw/*45.5*/("""text-align: center;
  width: 90%;
  border-radius: 50px;
  padding: 12px;
  border: none;
  outline: none;
  font-size: 20px;
  font-weight: 600;
  cursor: pointer;
  margin: 40px 0;
  color: white;
  background-image: linear-gradient(170deg, #B621fe, #1fd1f9);
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""
 """),format.raw/*58.2*/("""</style>
    <div class="container">
            <div class="box">
    <p class="lead"></p>
    <div class="col-xs-5">
        <h1>Login</h1> 
        """),_display_(/*64.10*/if(loginForm.hasGlobalErrors)/*64.39*/ {_display_(Seq[Any](format.raw/*64.41*/("""
            """),format.raw/*65.13*/("""<p class="alert alert-warning">
                """),_display_(/*66.18*/loginForm/*66.27*/.globalError.message),format.raw/*66.47*/(""";
            </p>
        """)))}),format.raw/*68.10*/("""
        """),_display_(/*69.10*/if(flash.containsKey("error"))/*69.40*/ {_display_(Seq[Any](format.raw/*69.42*/("""
            """),format.raw/*70.13*/("""<p class="alert alert-warning">
                """),_display_(/*71.18*/flash/*71.23*/.get("loginRequired")),format.raw/*71.44*/("""
            """),format.raw/*72.13*/("""</p>
        """)))}),format.raw/*73.10*/("""

"""),format.raw/*75.1*/("""<!-- this is the login form -->
        """),_display_(/*76.10*/helper/*76.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*76.74*/ {_display_(Seq[Any](format.raw/*76.76*/("""
            """),_display_(/*77.14*/CSRF/*77.18*/.formField),format.raw/*77.28*/("""

            """),format.raw/*79.13*/("""<div class="form-group">
                """),_display_(/*80.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*81.76*/("""
            """),format.raw/*82.13*/("""</div>
            <div class="form-group">
                """),_display_(/*84.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*85.79*/("""
            """),format.raw/*86.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*90.10*/("""
    """),format.raw/*91.5*/("""</div>
            </div></div>
""")))}))
      }
    }
  }

  def render(loginForm:Form[Login],user:User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[Login],User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 14:57:01 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/login.scala.html
                  HASH: c839b51cb4cc463de0b195b03c6c7656331878f7
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1328->136|1374->155|1402->156|1430->158|1754->455|1782->456|1811->458|1842->462|1870->463|1900->466|2140->679|2168->680|2196->681|2225->683|2253->684|2281->685|2401->778|2429->779|2458->781|2489->785|2517->786|2549->791|2838->1053|2866->1054|2895->1056|3074->1208|3112->1237|3152->1239|3193->1252|3269->1301|3287->1310|3328->1330|3387->1358|3424->1368|3463->1398|3503->1400|3544->1413|3620->1462|3634->1467|3676->1488|3717->1501|3762->1515|3791->1517|3859->1558|3874->1564|3941->1622|3981->1624|4022->1638|4035->1642|4066->1652|4108->1666|4177->1708|4319->1829|4360->1842|4448->1903|4600->2034|4641->2047|4822->2197|4854->2202
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|41->9|54->22|54->22|56->24|56->24|56->24|57->25|67->35|67->35|68->36|68->36|68->36|69->37|74->42|74->42|76->44|76->44|76->44|77->45|89->57|89->57|90->58|96->64|96->64|96->64|97->65|98->66|98->66|98->66|100->68|101->69|101->69|101->69|102->70|103->71|103->71|103->71|104->72|105->73|107->75|108->76|108->76|108->76|108->76|109->77|109->77|109->77|111->79|112->80|113->81|114->82|116->84|117->85|118->86|122->90|123->91
                  -- GENERATED --
              */
          