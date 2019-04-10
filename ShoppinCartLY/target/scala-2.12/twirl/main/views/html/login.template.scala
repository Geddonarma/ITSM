
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
 """),format.raw/*36.2*/("""</style>
    <div class="container">
            <div class="box">
    <p class="lead"></p>
    <div class="col-xs-5">
        <h3>Login in</h3>
        """),_display_(/*42.10*/if(loginForm.hasGlobalErrors)/*42.39*/ {_display_(Seq[Any](format.raw/*42.41*/("""
            """),format.raw/*43.13*/("""<p class="alert alert-warning">
                """),_display_(/*44.18*/loginForm/*44.27*/.globalError.message),format.raw/*44.47*/(""";
            </p>
        """)))}),format.raw/*46.10*/("""
        """),_display_(/*47.10*/if(flash.containsKey("error"))/*47.40*/ {_display_(Seq[Any](format.raw/*47.42*/("""
            """),format.raw/*48.13*/("""<p class="alert alert-warning">
                """),_display_(/*49.18*/flash/*49.23*/.get("loginRequired")),format.raw/*49.44*/("""
            """),format.raw/*50.13*/("""</p>
        """)))}),format.raw/*51.10*/("""

"""),format.raw/*53.1*/("""<!-- this is the login form -->
        """),_display_(/*54.10*/helper/*54.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*54.74*/ {_display_(Seq[Any](format.raw/*54.76*/("""
            """),_display_(/*55.14*/CSRF/*55.18*/.formField),format.raw/*55.28*/("""

            """),format.raw/*57.13*/("""<div class="form-group">
                """),_display_(/*58.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*59.76*/("""
            """),format.raw/*60.13*/("""</div>
            <div class="form-group">
                """),_display_(/*62.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*63.79*/("""
            """),format.raw/*64.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*68.10*/("""
    """),format.raw/*69.5*/("""</div>
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
                  DATE: Wed Apr 10 12:59:20 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/login.scala.html
                  HASH: d794b054dc76356f54e2e6aa56f7493361a4ed8b
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1328->136|1374->155|1402->156|1430->158|1754->455|1782->456|1811->458|1842->462|1870->463|1900->466|2140->679|2168->680|2197->682|2378->836|2416->865|2456->867|2497->880|2573->929|2591->938|2632->958|2691->986|2728->996|2767->1026|2807->1028|2848->1041|2924->1090|2938->1095|2980->1116|3021->1129|3066->1143|3095->1145|3163->1186|3178->1192|3245->1250|3285->1252|3326->1266|3339->1270|3370->1280|3412->1294|3481->1336|3623->1457|3664->1470|3752->1531|3904->1662|3945->1675|4126->1825|4158->1830
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|41->9|54->22|54->22|56->24|56->24|56->24|57->25|67->35|67->35|68->36|74->42|74->42|74->42|75->43|76->44|76->44|76->44|78->46|79->47|79->47|79->47|80->48|81->49|81->49|81->49|82->50|83->51|85->53|86->54|86->54|86->54|86->54|87->55|87->55|87->55|89->57|90->58|91->59|92->60|94->62|95->63|96->64|100->68|101->69
                  -- GENERATED --
              */
          