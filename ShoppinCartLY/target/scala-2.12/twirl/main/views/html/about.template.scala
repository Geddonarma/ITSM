
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

object about extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("About",user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""

"""),format.raw/*4.1*/("""<h1>About Us!</h1>
<p> This Portable Device online store created by Stephanie, Armandas, and Hiep and their will be more coming soon! </p>

""")))}),format.raw/*7.2*/("""	

"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 23 00:36:00 GMT 2019
                  SOURCE: D:/steph/ITSM/ShoppinCartLY/app/views/about.scala.html
                  HASH: 1b45c8b8ddc2b73af81eca9befb4b535b2da0785
                  MATRIX: 959->1|1079->26|1107->29|1133->47|1171->48|1201->52|1374->196
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|39->7
                  -- GENERATED --
              */
          