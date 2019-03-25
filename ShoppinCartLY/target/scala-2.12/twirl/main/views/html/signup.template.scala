
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
    """),format.raw/*24.5*/("""color:limegreen;
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
  color:limegreen;
  border: 1px solid #3498db;
  border-radius: 3em;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
"""),format.raw/*40.1*/(""".box h1"""),format.raw/*40.8*/("""{"""),format.raw/*40.9*/("""
  """),format.raw/*41.3*/("""color: limegreen;
  text-transform: uppercase;
  font-weight: 500;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
"""),format.raw/*45.1*/(""".box input[type = "text"],.box input[type = "password"]"""),format.raw/*45.56*/("""{"""),format.raw/*45.57*/("""
  """),format.raw/*46.3*/("""border:0;
  background: none;
  display: block;
  margin: 0 auto;
  text-align: center;
  border: 2px solid #3498db;
  padding: 14px 10px;
  width: 200px;
  outline: none;
  color:limegreen;
  border-radius: 24px;
  transition: 0.25s;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
"""),format.raw/*59.1*/(""".box input[type = "text"]:focus,.box input[type = "password"]:focus"""),format.raw/*59.68*/("""{"""),format.raw/*59.69*/("""
  """),format.raw/*60.3*/("""width: 280px;
  border-color: #2ecc71;
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""
"""),format.raw/*63.1*/(""".box input[type = "submit"],.box input[type = "button"]"""),format.raw/*63.56*/("""{"""),format.raw/*63.57*/("""
  """),format.raw/*64.3*/("""border:0;
  background: none;
  display: block;
  margin: 20px auto;
  text-align: center;
  border: 2px solid #2ecc71;
  padding: 14px 40px;
  outline: none;
  color: limegreen;
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
                  DATE: Mon Mar 25 10:17:43 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: bddb10238fc923444fb70547dc251c08ef6a228f
                  MATRIX: 988->1|1125->68|1158->96|1203->65|1231->94|1258->113|1286->133|1324->134|1353->137|1418->227|1446->229|1485->259|1525->261|1555->264|1620->303|1634->308|1668->321|1698->324|1736->332|1767->337|1888->448|1929->450|1964->485|1999->582|2033->590|2046->594|2077->604|2106->606|2145->618|2173->619|2205->624|2251->643|2279->644|2307->645|2353->664|2381->665|2411->668|2671->901|2699->902|2727->903|2761->910|2789->911|2819->914|2913->981|2941->982|2969->983|3052->1038|3081->1039|3111->1042|3373->1277|3401->1278|3429->1279|3524->1346|3553->1347|3583->1350|3649->1389|3677->1390|3705->1391|3788->1446|3817->1447|3847->1450|4116->1692|4144->1693|4172->1694|4267->1761|4296->1762|4326->1765|4374->1786|4402->1787|4431->1789|4463->1794|4491->1795|4521->1798|4563->1813|4591->1814|4619->1815|4750->1919|4875->2023|4935->2056|5062->2162|5121->2194|5256->2308|5316->2340|5461->2463|5509->2483|5642->2593|5671->2594|5739->2634|5853->2725|5901->2745|6025->2847|6078->2872|6204->2976|6261->3005|6376->3097|6407->3098|6633->3296|6654->3307|6711->3342|6792->3395|6888->3469|6928->3481|7022->3553|7062->3565|7164->3645|7204->3657|7316->3746|7367->3769|7481->3860|7521->3872|7607->3936|7647->3948|7761->4039|7810->4059|7960->4181|7981->4192|8038->4227|8193->4351|8223->4369|8256->4371|8286->4389|8317->4392|8416->4463|8445->4464|8476->4467|8552->4515|8581->4516|8610->4517|8651->4529|8681->4530|8712->4533|8902->4695|8931->4696|8960->4697|9004->4712|9034->4713|9065->4716|9192->4815|9221->4816|9250->4817|9297->4835|9327->4836|9357->4838|9558->5011|9587->5012|9618->5015|9651->5020|9680->5021|9712->5025|9821->5106|9850->5107|9882->5111|9922->5122|9952->5123|9986->5129|10178->5293|10207->5294|10241->5300|10287->5317|10317->5318|10353->5326|10412->5357|10441->5358|10477->5366|10520->5380|10550->5381|10588->5391|10820->5594|10850->5595|10890->5606|10939->5626|10969->5627|11011->5640|11082->5682|11112->5683|11141->5684
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|55->23|55->23|56->24|57->25|57->25|58->26|59->27|59->27|60->28|71->39|71->39|72->40|72->40|72->40|73->41|76->44|76->44|77->45|77->45|77->45|78->46|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|108->76|108->76|109->77|109->77|109->77|110->78|111->79|111->79|113->81|113->81|113->81|114->82|115->83|115->83|116->84|124->92|125->93|127->95|128->96|130->98|131->99|133->101|134->102|136->104|136->104|137->105|138->106|138->106|139->107|140->108|142->110|143->111|145->113|145->113|145->113|151->119|151->119|151->119|154->122|154->122|155->123|155->123|156->124|156->124|157->125|157->125|159->127|159->127|160->128|160->128|161->129|161->129|163->131|165->133|165->133|165->133|169->137|169->137|170->138|170->138|171->139|178->146|178->146|179->147|182->150|182->150|183->151|183->151|183->151|184->152|192->160|192->160|193->161|193->161|193->161|194->162|199->167|199->167|200->168|200->168|200->168|201->169|209->177|209->177|211->179|211->179|211->179|212->180|215->183|215->183|216->184|216->184|216->184|217->185|224->192|224->192|225->193|225->193|225->193|226->194|227->195|227->195|228->196|228->196|228->196|229->197|236->204|236->204|237->205|237->205|237->205|238->206|239->207|239->207|240->208
                  -- GENERATED --
              */
          