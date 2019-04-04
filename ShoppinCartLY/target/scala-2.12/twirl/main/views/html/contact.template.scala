
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

object contact extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("Contact",user)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""

"""),format.raw/*4.1*/("""<h1>Contact Us!</h1>
<br>

<h4><b>Customer support can be reached at these available times:</b></h4>

<p>Monday: 8am - 6pm
<br>
Tuesday: 8am - 6pm
<br>
Wednseday: 8am - 6pm
<br>
Thursday: 8am - 6pm
<br>
Friday: 8am - 4pm
<br>
Saturday: 8am - 6pm
<br>
Sunday: 8am - 4pm
</p>
<br>

<h4><b>Email Us</b></h4>
<p>
    Email: "managerproductscom" for Manager assistace on Product enquiries
    <br>
    Email: "adminproductscom" for Administration assistace on Account enquiries
</p>

""")))}),format.raw/*32.2*/("""	"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 04 13:06:44 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/contact.scala.html
                  HASH: 87ceb98c6fbfb1b2b4c6000ffc65d22496460cdd
                  MATRIX: 961->1|1081->26|1108->28|1136->48|1174->49|1202->51|1712->531
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|64->32
                  -- GENERATED --
              */
          