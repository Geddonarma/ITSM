
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
/*1.2*/import models.products.Product
/*2.2*/import models.users.User

object productDetails extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Product,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(p: Product,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.51*/("""

"""),_display_(/*5.2*/main("Full Image", user)/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/("""

  """),format.raw/*7.3*/("""<div class="col-sm-10">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*9.8*/if(flash.containsKey("success"))/*9.40*/ {_display_(Seq[Any](format.raw/*9.42*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
          """),_display_(/*11.12*/flash/*11.17*/.get("success")),format.raw/*11.32*/("""
        """),format.raw/*12.9*/("""</div>
      """)))}),format.raw/*13.8*/("""
      """),format.raw/*14.7*/("""<thead>
        <tr>
          <th>Image</th> 
          <th>ID</th> 
        </tr>
      </thead>

      <tbody>
          <tr>
              """),_display_(/*23.16*/if(env.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*23.93*/ {_display_(Seq[Any](format.raw/*23.95*/("""
                """),format.raw/*24.17*/("""<td><img src="/assets/images/productImages/"""),_display_(/*24.61*/(p.getId + ".jpg")),format.raw/*24.79*/(""""/></td>
            """)))}/*25.15*/else/*25.20*/{_display_(Seq[Any](format.raw/*25.21*/("""
                """),format.raw/*26.17*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
            """)))}),format.raw/*27.14*/("""
            """),format.raw/*28.13*/("""<td class="numeric">"""),_display_(/*28.34*/p/*28.35*/.getId),format.raw/*28.41*/("""</td>
            
          </tr>
      </tbody>

    </table>

  </div>

""")))}))
      }
    }
  }

  def render(p:Product,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(p,user,env)

  def f:((Product,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (p,user,env) => apply(p,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 12:58:33 IST 2019
                  SOURCE: /home/wdd/ITSM/ShoppinCartLY/app/views/productDetails.scala.html
                  HASH: 173323d4bd0244c4132f6edb8d8538b0f9d1387e
                  MATRIX: 651->1|689->33|1054->59|1198->108|1226->111|1258->135|1297->137|1327->141|1452->241|1492->273|1531->275|1567->284|1639->329|1653->334|1689->349|1725->358|1769->372|1803->379|1974->523|2060->600|2100->602|2145->619|2216->663|2255->681|2296->704|2309->709|2348->710|2393->727|2500->803|2541->816|2589->837|2599->838|2626->844
                  LINES: 24->1|25->2|30->3|35->3|37->5|37->5|37->5|39->7|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|46->14|55->23|55->23|55->23|56->24|56->24|56->24|57->25|57->25|57->25|58->26|59->27|60->28|60->28|60->28|60->28
                  -- GENERATED --
              */
          