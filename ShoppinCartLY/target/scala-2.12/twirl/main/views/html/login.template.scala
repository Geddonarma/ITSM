
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
    """),format.raw/*7.5*/("""<p class="lead">Product Catalogue</p>
    <div class="col-xs-5">
        <h3>Login in</h3>
        """),_display_(/*10.10*/if(loginForm.hasGlobalErrors)/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
            """),format.raw/*11.13*/("""<p class="alert alert-warning">
                """),_display_(/*12.18*/loginForm/*12.27*/.globalError.message),format.raw/*12.47*/(""";
            </p>
        """)))}),format.raw/*14.10*/("""
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
            """),format.raw/*16.13*/("""<p class="alert alert-warning">
                """),_display_(/*17.18*/flash/*17.23*/.get("loginRequired")),format.raw/*17.44*/("""
            """),format.raw/*18.13*/("""</p>
        """)))}),format.raw/*19.10*/("""


        """),_display_(/*22.10*/helper/*22.16*/.form(controllers.security.routes.LoginCtrl.loginSubmit())/*22.74*/ {_display_(Seq[Any](format.raw/*22.76*/("""
            """),_display_(/*23.14*/CSRF/*23.18*/.formField),format.raw/*23.28*/("""

            """),format.raw/*25.13*/("""<div class="form-group">
                """),_display_(/*26.18*/inputText(loginForm("email"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*27.76*/("""
            """),format.raw/*28.13*/("""</div>
            <div class="form-group">
                """),_display_(/*30.18*/inputPassword(loginForm("password"), '_label -> "", 
                'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*31.79*/("""
            """),format.raw/*32.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
            </div>
        """)))}),format.raw/*36.10*/("""
    """),format.raw/*37.5*/("""</div>
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
                  DATE: Sat Mar 23 00:36:01 GMT 2019
                  SOURCE: D:/steph/ITSM/ShoppinCartLY/app/views/login.scala.html
                  HASH: 19ee815b29090c7bd22d5c9d2f19edf437d09ba7
                  MATRIX: 651->1|683->28|1023->56|1132->95|1177->92|1205->112|1233->115|1260->134|1299->136|1331->142|1461->245|1499->274|1539->276|1581->290|1658->340|1676->349|1717->369|1778->399|1816->410|1855->440|1895->442|1937->456|2014->506|2028->511|2070->532|2112->546|2158->561|2200->576|2215->582|2282->640|2322->642|2364->657|2377->661|2408->671|2452->687|2522->730|2665->852|2707->866|2797->929|2950->1061|2992->1075|3177->1229|3210->1235
                  LINES: 24->1|25->2|30->3|33->4|36->3|37->5|38->6|38->6|38->6|39->7|42->10|42->10|42->10|43->11|44->12|44->12|44->12|46->14|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|54->22|54->22|54->22|54->22|55->23|55->23|55->23|57->25|58->26|59->27|60->28|62->30|63->31|64->32|68->36|69->37
                  -- GENERATED --
              */
          