
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Customer], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.Login
/*5.2*/import helper._


Seq[Any](format.raw/*1.66*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*6.2*/main("Sign Up",user)/*6.22*/{_display_(Seq[Any](format.raw/*6.23*/("""
  """),format.raw/*7.3*/("""<p class="lead">Add a new user</p>

  """),format.raw/*9.55*/("""
"""),_display_(/*10.2*/if(flash.containsKey("error"))/*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
  """),format.raw/*11.3*/("""<div class="alert alert-success">
    """),_display_(/*12.6*/flash/*12.11*/.get("error")),format.raw/*12.24*/("""
  """),format.raw/*13.3*/("""</div>
""")))}),format.raw/*14.2*/("""

  """),_display_(/*16.4*/form(action=controllers.security.routes.LoginCtrl.signupSubmit(), 'class -> "form-horizontal", 'role -> "form")/*16.115*/ {_display_(Seq[Any](format.raw/*16.117*/("""
      """),format.raw/*17.35*/("""
      """),format.raw/*18.97*/("""
      """),_display_(/*19.8*/CSRF/*19.12*/.formField),format.raw/*19.22*/("""

          """),_display_(/*21.12*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*21.86*/("""
          """),_display_(/*22.12*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*22.84*/("""
          """),_display_(/*23.12*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*23.92*/("""
          """),_display_(/*24.12*/inputText(userForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*24.101*/("""
          
          """),_display_(/*26.12*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*26.103*/("""
          """),_display_(/*27.12*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*27.76*/("""
          """),_display_(/*28.12*/inputText(userForm("type").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*28.103*/("""
        
          """),format.raw/*30.11*/("""<div class="actions">
              <input type="submit" value="Sign Up" class="btn btn-primary">
              <a href=""""),_display_(/*32.25*/controllers/*32.36*/.security.routes.LoginCtrl.signup()),format.raw/*32.71*/("""">
                  <button type="button" class="btn btn-warning">Cancel</button>
              </a>
          </div>
  """)))}),format.raw/*36.4*/(""" """),format.raw/*36.22*/("""
""")))}),format.raw/*37.2*/(""" """),format.raw/*37.20*/("""


"""),format.raw/*40.1*/("""<!-- <!DOCTYPE html>
<html>
  <meta charset="utf-8">

<style>
body"""),format.raw/*45.5*/("""{"""),format.raw/*45.6*/("""
  """),format.raw/*46.3*/("""margin: 0;
  padding: 0;
  background: #487eb0;
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""
"""),format.raw/*50.1*/(""".signup-form"""),format.raw/*50.13*/("""{"""),format.raw/*50.14*/("""
  """),format.raw/*51.3*/("""width: 350px;
  padding: 20px;
  text-align: center;
  position: absolute;
  top: 50%;
  left: 40%;
/*   transform: translate(-50%, -50%);
  overflow: hidden; */
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""
"""),format.raw/*60.1*/(""".signup-form h1"""),format.raw/*60.16*/("""{"""),format.raw/*60.17*/("""
  """),format.raw/*61.3*/("""margin-top: 100px;
  font-family: 'Permanent Maker', cursive;
  color: #fff;
  font-size: 40px;
  
"""),format.raw/*66.1*/("""}"""),format.raw/*66.2*/("""
"""),format.raw/*67.1*/(""".signup-form input"""),format.raw/*67.19*/("""{"""),format.raw/*67.20*/(""" 
"""),format.raw/*68.1*/("""/*   display: block; 
  widows: 100px;  */
  padding: 0 16px; 
  height: 44px; 
  text-align: center; 
/*   box-sizing: border-box; 
  outline: none; 
  border: none;  */
  """),format.raw/*76.3*/("""}"""),format.raw/*76.4*/(""" 

"""),format.raw/*78.1*/(""".txtb"""),format.raw/*78.6*/("""{"""),format.raw/*78.7*/(""" 
  """),format.raw/*79.3*/("""margin: 20px 0; 
  background: rgba(255,255, 255, .5); 
  border-radius: 6px; 
  """),format.raw/*82.3*/("""}"""),format.raw/*82.4*/(""" 
  """),format.raw/*83.3*/(""".signup-btn"""),format.raw/*83.14*/("""{"""),format.raw/*83.15*/(""" 
    """),format.raw/*84.5*/("""margin-top: 60px; 
    margin-bottom: 20px; 
    background: #487eb0; 
    color: #fff; 
    border-radius: 44px; 
    cursor: pointer; 
    transition: 0.8s; 
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/(""" 
    """),format.raw/*92.5*/(""".signup-btn:hover"""),format.raw/*92.22*/("""{"""),format.raw/*92.23*/(""" 
      """),format.raw/*93.7*/("""transform: scale(0.96); 
      """),format.raw/*94.7*/("""}"""),format.raw/*94.8*/(""" 
      """),format.raw/*95.7*/(""".signup-form a"""),format.raw/*95.21*/("""{"""),format.raw/*95.22*/(""" 
        """),format.raw/*96.9*/("""text-decoration: none; 
        color: #fff; 
        font-family: "montserrat",sans-serif; 
        font-size: 14px; 
        padding: 10px; 
        transition: 0.8s; 
        display: block;
         """),format.raw/*103.10*/("""}"""),format.raw/*103.11*/(""" 
         """),format.raw/*104.10*/(""".signup-form a:hover"""),format.raw/*104.30*/("""{"""),format.raw/*104.31*/("""
            """),format.raw/*105.13*/("""background: rgba(0,0, 0, .3)
             """),format.raw/*106.14*/("""}"""),format.raw/*106.15*/("""
"""),format.raw/*107.1*/("""</style>
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

</html> -->
"""))
      }
    }
  }

  def render(userForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 23 01:23:08 GMT 2019
                  SOURCE: D:/steph/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: dbef5f65888ef2098ae9526c4cdc6e4105f3cbf2
                  MATRIX: 988->1|1125->70|1158->100|1203->65|1233->97|1261->118|1289->138|1327->139|1357->143|1424->235|1453->238|1492->268|1532->270|1563->274|1629->314|1643->319|1677->332|1708->336|1747->345|1780->352|1901->463|1942->465|1978->501|2014->599|2049->608|2062->612|2093->622|2135->637|2230->711|2270->724|2363->796|2403->809|2504->889|2544->902|2655->991|2707->1016|2820->1107|2860->1120|2945->1184|2985->1197|3098->1288|3148->1310|3299->1434|3319->1445|3375->1480|3531->1606|3560->1624|3593->1627|3622->1645|3655->1651|3753->1722|3781->1723|3812->1727|3890->1778|3918->1779|3947->1781|3987->1793|4016->1794|4047->1798|4244->1968|4272->1969|4301->1971|4344->1986|4373->1987|4404->1991|4535->2095|4563->2096|4592->2098|4638->2116|4667->2117|4697->2120|4905->2301|4933->2302|4965->2307|4997->2312|5025->2313|5057->2318|5168->2402|5196->2403|5228->2408|5267->2419|5296->2420|5330->2427|5528->2598|5556->2599|5590->2606|5635->2623|5664->2624|5700->2633|5759->2665|5787->2666|5823->2675|5865->2689|5894->2690|5932->2701|6171->2911|6201->2912|6242->2924|6291->2944|6321->2945|6364->2959|6436->3002|6466->3003|6496->3005
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|53->21|54->22|54->22|55->23|55->23|56->24|56->24|58->26|58->26|59->27|59->27|60->28|60->28|62->30|64->32|64->32|64->32|68->36|68->36|69->37|69->37|72->40|77->45|77->45|78->46|81->49|81->49|82->50|82->50|82->50|83->51|91->59|91->59|92->60|92->60|92->60|93->61|98->66|98->66|99->67|99->67|99->67|100->68|108->76|108->76|110->78|110->78|110->78|111->79|114->82|114->82|115->83|115->83|115->83|116->84|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|127->95|127->95|127->95|128->96|135->103|135->103|136->104|136->104|136->104|137->105|138->106|138->106|139->107
                  -- GENERATED --
              */
          