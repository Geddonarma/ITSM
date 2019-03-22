
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

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.User],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.Login
/*5.2*/import helper._


Seq[Any](format.raw/*1.62*/("""

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

  def render(userForm:Form[models.users.User],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.User],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 22 16:10:42 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: 2d1dfe80a60ed7a9c52f60e8e58185f41fda5d8a
                  MATRIX: 984->1|1117->64|1150->92|1195->61|1223->90|1250->109|1278->129|1316->130|1345->133|1410->223|1438->225|1477->255|1517->257|1547->260|1612->299|1626->304|1660->317|1690->320|1728->328|1759->333|1880->444|1921->446|1956->481|1991->578|2025->586|2038->590|2069->600|2109->613|2204->687|2243->699|2336->771|2375->783|2476->863|2515->875|2626->964|2676->987|2789->1078|2828->1090|2913->1154|2972->1185|3121->1307|3141->1318|3197->1353|3349->1475|3378->1493|3410->1495|3439->1513|3469->1516|3562->1582|3590->1583|3620->1586|3695->1634|3723->1635|3751->1636|3791->1648|3820->1649|3850->1652|4039->1814|4067->1815|4095->1816|4138->1831|4167->1832|4197->1835|4323->1934|4351->1935|4379->1936|4425->1954|4454->1955|4483->1957|4683->2130|4711->2131|4741->2134|4773->2139|4801->2140|4832->2144|4940->2225|4968->2226|4999->2230|5038->2241|5067->2242|5100->2248|5291->2412|5319->2413|5352->2419|5397->2436|5426->2437|5461->2445|5519->2476|5547->2477|5582->2485|5624->2499|5653->2500|5690->2510|5922->2713|5952->2714|5992->2725|6041->2745|6071->2746|6113->2759|6184->2801|6214->2802|6243->2803
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|53->21|54->22|54->22|55->23|55->23|56->24|56->24|58->26|58->26|59->27|59->27|62->30|64->32|64->32|64->32|68->36|68->36|69->37|69->37|72->40|77->45|77->45|78->46|81->49|81->49|82->50|82->50|82->50|83->51|91->59|91->59|92->60|92->60|92->60|93->61|98->66|98->66|99->67|99->67|99->67|100->68|108->76|108->76|110->78|110->78|110->78|111->79|114->82|114->82|115->83|115->83|115->83|116->84|123->91|123->91|124->92|124->92|124->92|125->93|126->94|126->94|127->95|127->95|127->95|128->96|135->103|135->103|136->104|136->104|136->104|137->105|138->106|138->106|139->107
                  -- GENERATED --
              */
          