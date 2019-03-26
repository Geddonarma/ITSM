
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

"""),format.raw/*21.1*/("""<style>

  *"""),format.raw/*23.4*/("""{"""),format.raw/*23.5*/("""
    """),format.raw/*24.5*/("""color:red;
  """),format.raw/*25.3*/("""}"""),format.raw/*25.4*/("""
"""),format.raw/*26.1*/("""/* REGISTER */
.box"""),format.raw/*27.5*/("""{"""),format.raw/*27.6*/("""
  """),format.raw/*28.3*/("""width: 40%;
  top: 10%;
  left: 30%;
  /* transform: translate(-50%,-50%); */
  position: absolute;
  float: left;
  background-color: none;
  text-align: center;
  color:black;
  border: 1px solid #3498db;
  border-radius: 3em;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
"""),format.raw/*40.1*/(""".box h1"""),format.raw/*40.8*/("""{"""),format.raw/*40.9*/("""
  """),format.raw/*41.3*/("""color: black;
  text-transform: uppercase;
  font-weight: 500;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
"""),format.raw/*45.1*/(""".box input[type = "text"],.box input[type = "password"]"""),format.raw/*45.56*/("""{"""),format.raw/*45.57*/("""
  """),format.raw/*46.3*/("""border:0;
  background: none;
  display: block;
  margin: 0 auto;
  text-align: center;
  border: 2px solid black;
  padding: 14px 10px;
  width: 200px;
  outline: none;
  color:;
  border-radius: 24px;
  transition: 0.25s;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
"""),format.raw/*59.1*/(""".box input[type = "text"]:focus,.box input[type = "password"]:focus"""),format.raw/*59.68*/("""{"""),format.raw/*59.69*/("""
  """),format.raw/*60.3*/("""width: 280px;
  border-color: black;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""
"""),format.raw/*63.1*/(""".box input[type = "submit"],.box input[type = "button"]"""),format.raw/*63.56*/("""{"""),format.raw/*63.57*/("""
  """),format.raw/*64.3*/("""border:0;
  background: none;
  display: block;
  margin: 20px auto;
  text-align: center;
  border: 2px solid black;
  padding: 14px 40px;
  outline: none;
  color: black;
  border-radius: 24px;
  transition: 0.25s;
  cursor: pointer;
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""
"""),format.raw/*77.1*/(""".box input[type = "submit"]:hover,.box input[type = "button"]:hover"""),format.raw/*77.68*/("""{"""),format.raw/*77.69*/("""
  """),format.raw/*78.3*/("""background: #2ecc71;
"""),format.raw/*79.1*/("""}"""),format.raw/*79.2*/("""

"""),format.raw/*81.1*/(""".hide"""),format.raw/*81.6*/("""{"""),format.raw/*81.7*/("""
  """),format.raw/*82.3*/("""display: none;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""
"""),format.raw/*84.1*/("""/* END OF REGISTER */


</style>
      <div class="box">

        <h1>Register</h1>
 
                 """),_display_(/*92.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*93.61*/("""
             
                 """),_display_(/*95.19*/inputText(userForm("name"), '_label -> "",
                 'class -> "input", 'placeholder -> "Username")),format.raw/*96.64*/("""
            
                 """),_display_(/*98.19*/inputPassword(userForm("password"), '_label -> "",
                 'class -> "input", 'placeholder -> "Password")),format.raw/*99.64*/("""
            
                 """),_display_(/*101.19*/inputPassword(userForm("password2"), '_label -> "",
                 'class -> "input", 'placeholder -> "Confirm Password")),format.raw/*102.72*/("""

                 """),_display_(/*104.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "", 'class -> "hide", 'hidden -> "hidden")),format.raw/*104.129*/("""
"""),format.raw/*105.1*/("""<!--                 
                 """),_display_(/*106.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*106.110*/("""
                  """),_display_(/*107.20*/inputText(userForm("role"), '_label -> "",
                 'class -> "input", 'placeholder -> "role")),format.raw/*108.60*/("""
     
                 """),_display_(/*110.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*111.61*/("""
             
             """),_display_(/*113.15*/inputText(userForm("type").copy(value=Some("customer")), '_label -> "", 'hidden -> "hidden")),format.raw/*113.107*/(""" """),format.raw/*113.108*/("""-->
        
     
      <input type="submit" value="Sign up" class="btn"/>
             
             <input type="button" value="Cancel" class="btn"
             onclick="window.location.href = '"""),_display_(/*119.48*/controllers/*119.59*/.security.routes.LoginCtrl.signup()),format.raw/*119.94*/("""';">
             
         </div>  
          <!-- """),_display_(/*122.17*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*122.91*/("""
          """),_display_(/*123.12*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*123.84*/("""
          """),_display_(/*124.12*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*124.92*/("""
          """),_display_(/*125.12*/inputText(userForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*125.101*/("""
          
          """),_display_(/*127.12*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*127.103*/("""
          """),_display_(/*128.12*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*128.76*/("""
          """),_display_(/*129.12*/inputText(userForm("type").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*129.103*/("""
        
          """),format.raw/*131.11*/("""<div class="actions">
              <input type="submit" value="Sign Up" class="btn btn-primary">
              <a href=""""),_display_(/*133.25*/controllers/*133.36*/.security.routes.LoginCtrl.signup()),format.raw/*133.71*/("""">
                  <button type="button" class="btn btn-warning">Cancel</button>
              </a>
          </div> 
   """)))}),format.raw/*137.5*/(""" """),format.raw/*137.23*/("""
""")))}),format.raw/*138.2*/(""" """),format.raw/*138.20*/(""" 
 """),format.raw/*139.2*/("""-->

<!-- <!DOCTYPE html>
<html>
  <meta charset="utf-8">

<style>
body"""),format.raw/*146.5*/("""{"""),format.raw/*146.6*/("""
  """),format.raw/*147.3*/("""margin: 0;
  padding: 0;
  background: #487eb0;
"""),format.raw/*150.1*/("""}"""),format.raw/*150.2*/("""
"""),format.raw/*151.1*/(""".signup-form"""),format.raw/*151.13*/("""{"""),format.raw/*151.14*/("""
  """),format.raw/*152.3*/("""width: 350px;
  padding: 20px;
  text-align: center;
  position: absolute;
  top: 50%;
  left: 40%;
/*   transform: translate(-50%, -50%);
  overflow: hidden; */
"""),format.raw/*160.1*/("""}"""),format.raw/*160.2*/("""
"""),format.raw/*161.1*/(""".signup-form h1"""),format.raw/*161.16*/("""{"""),format.raw/*161.17*/("""
  """),format.raw/*162.3*/("""margin-top: 100px;
  font-family: 'Permanent Maker', cursive;
  color: #fff;
  font-size: 40px;
  
"""),format.raw/*167.1*/("""}"""),format.raw/*167.2*/("""
"""),format.raw/*168.1*/(""".signup-form input"""),format.raw/*168.19*/("""{"""),format.raw/*168.20*/(""" 
"""),format.raw/*169.1*/("""/*   display: block; 
  widows: 100px;  */
  padding: 0 16px; 
  height: 44px; 
  text-align: center; 
/*   box-sizing: border-box; 
  outline: none; 
  border: none;  */
  """),format.raw/*177.3*/("""}"""),format.raw/*177.4*/(""" 

"""),format.raw/*179.1*/(""".txtb"""),format.raw/*179.6*/("""{"""),format.raw/*179.7*/(""" 
  """),format.raw/*180.3*/("""margin: 20px 0; 
  background: rgba(255,255, 255, .5); 
  border-radius: 6px; 
  """),format.raw/*183.3*/("""}"""),format.raw/*183.4*/(""" 
  """),format.raw/*184.3*/(""".signup-btn"""),format.raw/*184.14*/("""{"""),format.raw/*184.15*/(""" 
    """),format.raw/*185.5*/("""margin-top: 60px; 
    margin-bottom: 20px; 
    background: #487eb0; 
    color: #fff; 
    border-radius: 44px; 
    cursor: pointer; 
    transition: 0.8s; 
    """),format.raw/*192.5*/("""}"""),format.raw/*192.6*/(""" 
    """),format.raw/*193.5*/(""".signup-btn:hover"""),format.raw/*193.22*/("""{"""),format.raw/*193.23*/(""" 
      """),format.raw/*194.7*/("""transform: scale(0.96); 
      """),format.raw/*195.7*/("""}"""),format.raw/*195.8*/(""" 
      """),format.raw/*196.7*/(""".signup-form a"""),format.raw/*196.21*/("""{"""),format.raw/*196.22*/(""" 
        """),format.raw/*197.9*/("""text-decoration: none; 
        color: #fff; 
        font-family: "montserrat",sans-serif; 
        font-size: 14px; 
        padding: 10px; 
        transition: 0.8s; 
        display: block;
         """),format.raw/*204.10*/("""}"""),format.raw/*204.11*/(""" 
         """),format.raw/*205.10*/(""".signup-form a:hover"""),format.raw/*205.30*/("""{"""),format.raw/*205.31*/("""
            """),format.raw/*206.13*/("""background: rgba(0,0, 0, .3)
             """),format.raw/*207.14*/("""}"""),format.raw/*207.15*/("""
"""),format.raw/*208.1*/("""</style>
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
                  DATE: Tue Mar 26 13:12:17 GMT 2019
                  SOURCE: /home/wdd/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: 5fe965ec4d2e35425a47cda2c1e3456b3907caac
                  MATRIX: 988->1|1125->68|1158->96|1203->65|1231->94|1258->113|1286->133|1324->134|1353->137|1418->227|1446->229|1485->259|1525->261|1555->264|1620->303|1634->308|1668->321|1698->324|1736->332|1767->337|1888->448|1929->450|1964->485|1999->582|2033->590|2046->594|2077->604|2106->606|2145->618|2173->619|2205->624|2245->637|2273->638|2301->639|2347->658|2375->659|2405->662|2661->891|2689->892|2717->893|2751->900|2779->901|2809->904|2899->967|2927->968|2955->969|3038->1024|3067->1025|3097->1028|3348->1252|3376->1253|3404->1254|3499->1321|3528->1322|3558->1325|3622->1362|3650->1363|3678->1364|3761->1419|3790->1420|3820->1423|4083->1659|4111->1660|4139->1661|4234->1728|4263->1729|4293->1732|4341->1753|4369->1754|4398->1756|4430->1761|4458->1762|4488->1765|4530->1780|4558->1781|4586->1782|4717->1886|4842->1990|4902->2023|5029->2129|5088->2161|5223->2275|5283->2307|5428->2430|5476->2450|5609->2560|5638->2561|5706->2601|5820->2692|5868->2712|5992->2814|6045->2839|6171->2943|6228->2972|6343->3064|6374->3065|6600->3263|6621->3274|6678->3309|6759->3362|6855->3436|6895->3448|6989->3520|7029->3532|7131->3612|7171->3624|7283->3713|7334->3736|7448->3827|7488->3839|7574->3903|7614->3915|7728->4006|7777->4026|7927->4148|7948->4159|8005->4194|8160->4318|8190->4336|8223->4338|8253->4356|8284->4359|8383->4430|8412->4431|8443->4434|8519->4482|8548->4483|8577->4484|8618->4496|8648->4497|8679->4500|8869->4662|8898->4663|8927->4664|8971->4679|9001->4680|9032->4683|9159->4782|9188->4783|9217->4784|9264->4802|9294->4803|9324->4805|9525->4978|9554->4979|9585->4982|9618->4987|9647->4988|9679->4992|9788->5073|9817->5074|9849->5078|9889->5089|9919->5090|9953->5096|10145->5260|10174->5261|10208->5267|10254->5284|10284->5285|10320->5293|10379->5324|10408->5325|10444->5333|10487->5347|10517->5348|10555->5358|10787->5561|10817->5562|10857->5573|10906->5593|10936->5594|10978->5607|11049->5649|11079->5650|11108->5651
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|55->23|55->23|56->24|57->25|57->25|58->26|59->27|59->27|60->28|71->39|71->39|72->40|72->40|72->40|73->41|76->44|76->44|77->45|77->45|77->45|78->46|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|108->76|108->76|109->77|109->77|109->77|110->78|111->79|111->79|113->81|113->81|113->81|114->82|115->83|115->83|116->84|124->92|125->93|127->95|128->96|130->98|131->99|133->101|134->102|136->104|136->104|137->105|138->106|138->106|139->107|140->108|142->110|143->111|145->113|145->113|145->113|151->119|151->119|151->119|154->122|154->122|155->123|155->123|156->124|156->124|157->125|157->125|159->127|159->127|160->128|160->128|161->129|161->129|163->131|165->133|165->133|165->133|169->137|169->137|170->138|170->138|171->139|178->146|178->146|179->147|182->150|182->150|183->151|183->151|183->151|184->152|192->160|192->160|193->161|193->161|193->161|194->162|199->167|199->167|200->168|200->168|200->168|201->169|209->177|209->177|211->179|211->179|211->179|212->180|215->183|215->183|216->184|216->184|216->184|217->185|224->192|224->192|225->193|225->193|225->193|226->194|227->195|227->195|228->196|228->196|228->196|229->197|236->204|236->204|237->205|237->205|237->205|238->206|239->207|239->207|240->208
                  -- GENERATED --
              */
          