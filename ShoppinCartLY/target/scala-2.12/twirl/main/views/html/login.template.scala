
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
 
 </style>
    
    <p class="lead"></p>
    <div class="col-xs-5">
        <h3>Login in</h3>
        """),_display_(/*14.10*/if(loginForm.hasGlobalErrors)/*14.39*/ {_display_(Seq[Any](format.raw/*14.41*/("""
            """),format.raw/*15.13*/("""<p class="alert alert-warning">
                """),_display_(/*16.18*/loginForm/*16.27*/.globalError.message),format.raw/*16.47*/(""";
            </p>
        """)))}),format.raw/*18.10*/("""
        """),_display_(/*19.10*/if(flash.containsKey("error"))/*19.40*/ {_display_(Seq[Any](format.raw/*19.42*/("""
            """),format.raw/*20.13*/("""<p class="alert alert-warning">
                """),_display_(/*21.18*/flash/*21.23*/.get("loginRequired")),format.raw/*21.44*/("""
            """),format.raw/*22.13*/("""</p>
        """)))}),format.raw/*23.10*/("""

"""),format.raw/*25.1*/("""<!-- this is the login form -->
        """),_display_(/*26.10*/helper/*26.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*26.74*/ {_display_(Seq[Any](format.raw/*26.76*/("""
            """),_display_(/*27.14*/CSRF/*27.18*/.formField),format.raw/*27.28*/("""

            """),format.raw/*29.13*/("""<div class="form-group">
                """),_display_(/*30.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*31.76*/("""
            """),format.raw/*32.13*/("""</div>
            <div class="form-group">
                """),_display_(/*34.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*35.79*/("""
            """),format.raw/*36.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*40.10*/("""
    """),format.raw/*41.5*/("""</div>
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
                  DATE: Mon Apr 08 15:24:14 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/login.scala.html
                  HASH: fe7a2a7eb0f796b357b130f085e8435acc10fca8
                  MATRIX: 651->1|683->27|1023->54|1132->92|1177->90|1204->108|1231->110|1258->129|1297->131|1328->136|1467->248|1505->277|1545->279|1586->292|1662->341|1680->350|1721->370|1780->398|1817->408|1856->438|1896->440|1937->453|2013->502|2027->507|2069->528|2110->541|2155->555|2184->557|2252->598|2267->604|2334->662|2374->664|2415->678|2428->682|2459->692|2501->706|2570->748|2712->869|2753->882|2841->943|2993->1074|3034->1087|3215->1237|3247->1242
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|46->14|46->14|46->14|47->15|48->16|48->16|48->16|50->18|51->19|51->19|51->19|52->20|53->21|53->21|53->21|54->22|55->23|57->25|58->26|58->26|58->26|58->26|59->27|59->27|59->27|61->29|62->30|63->31|64->32|66->34|67->35|68->36|72->40|73->41
                  -- GENERATED --
              */
          