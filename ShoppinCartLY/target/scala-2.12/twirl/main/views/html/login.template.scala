
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
.container"""),format.raw/*8.11*/("""{"""),format.raw/*8.12*/("""
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
  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: white;
  border-radius: 10px;
  padding: 40px;
  box-shadow: 0 8px 12px 0 rgba(0, 0, 0, 0.15);
  text-align: center;
"""),format.raw/*36.1*/("""}"""),format.raw/*36.2*/("""

"""),format.raw/*38.1*/("""h1"""),format.raw/*38.3*/("""{"""),format.raw/*38.4*/("""
"""),format.raw/*39.1*/("""font-size: 50px;
text-align: center;
font-weight: bold;
color: black;
margin: 20px 0 70px 0;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""

"""),format.raw/*46.1*/(""".btn"""),format.raw/*46.5*/("""{"""),format.raw/*46.6*/("""
  """),format.raw/*47.3*/("""width: 90%;
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
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""

"""),format.raw/*60.1*/(""".form-group"""),format.raw/*60.12*/("""{"""),format.raw/*60.13*/("""
    """),format.raw/*61.5*/("""text-align: center;
    margin: 0;
    padding: 0;
    font-weight: bold;
    border: none;
    border-bottom: 1px solid #fff;

"""),format.raw/*68.1*/("""}"""),format.raw/*68.2*/("""
 """),format.raw/*69.2*/("""</style>

    <div class="container">
            <div class="box">
    <p class="lead"></p>
    <div class="col-xs-5">
        <h1>Login</h1> 
        """),_display_(/*76.10*/if(loginForm.hasGlobalErrors)/*76.39*/ {_display_(Seq[Any](format.raw/*76.41*/("""
            """),format.raw/*77.13*/("""<p class="alert alert-warning">
                """),_display_(/*78.18*/loginForm/*78.27*/.globalError.message),format.raw/*78.47*/(""";
            </p>
        """)))}),format.raw/*80.10*/("""
        """),_display_(/*81.10*/if(flash.containsKey("error"))/*81.40*/ {_display_(Seq[Any](format.raw/*81.42*/("""
            """),format.raw/*82.13*/("""<p class="alert alert-warning">
                """),_display_(/*83.18*/flash/*83.23*/.get("loginRequired")),format.raw/*83.44*/("""
            """),format.raw/*84.13*/("""</p>
        """)))}),format.raw/*85.10*/("""

"""),format.raw/*87.1*/("""<!-- this is the login form -->
        """),_display_(/*88.10*/helper/*88.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*88.74*/ {_display_(Seq[Any](format.raw/*88.76*/("""
            """),_display_(/*89.14*/CSRF/*89.18*/.formField),format.raw/*89.28*/("""

            """),format.raw/*91.13*/("""<div class="form-group">
                <p> Enter Email</p>
                """),_display_(/*93.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*94.76*/("""
            """),format.raw/*95.13*/("""</div>
            <div class="form-group">
                    <p> Enter Password</p>
                """),_display_(/*98.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*99.79*/("""
            """),format.raw/*100.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*104.10*/("""
    """),format.raw/*105.5*/("""</div>
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
                  DATE: Wed Apr 10 15:52:32 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/login.scala.html
                  HASH: 1e7299318a2f5960fe2193cf7ccb9b36a9cdb3b8
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1328->136|1373->154|1401->155|1429->157|1753->454|1781->455|1810->457|1841->461|1869->462|1899->465|2182->721|2210->722|2239->724|2268->726|2296->727|2324->728|2444->821|2472->822|2501->824|2532->828|2560->829|2590->832|2857->1072|2885->1073|2914->1075|2953->1086|2982->1087|3014->1092|3169->1220|3197->1221|3226->1223|3406->1376|3444->1405|3484->1407|3525->1420|3601->1469|3619->1478|3660->1498|3719->1526|3756->1536|3795->1566|3835->1568|3876->1581|3952->1630|3966->1635|4008->1656|4049->1669|4094->1683|4123->1685|4191->1726|4206->1732|4273->1790|4313->1792|4354->1806|4367->1810|4398->1820|4440->1834|4545->1912|4687->2033|4728->2046|4859->2150|5011->2281|5053->2294|5235->2444|5268->2449
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|41->9|54->22|54->22|56->24|56->24|56->24|57->25|68->36|68->36|70->38|70->38|70->38|71->39|76->44|76->44|78->46|78->46|78->46|79->47|90->58|90->58|92->60|92->60|92->60|93->61|100->68|100->68|101->69|108->76|108->76|108->76|109->77|110->78|110->78|110->78|112->80|113->81|113->81|113->81|114->82|115->83|115->83|115->83|116->84|117->85|119->87|120->88|120->88|120->88|120->88|121->89|121->89|121->89|123->91|125->93|126->94|127->95|130->98|131->99|132->100|136->104|137->105
                  -- GENERATED --
              */
          