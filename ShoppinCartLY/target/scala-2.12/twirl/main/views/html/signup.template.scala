
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
  """),format.raw/*7.3*/("""<p class="lead"></p>

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
  border-radius: 24px;
  transition: 0.25s;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""
"""),format.raw/*58.1*/(""".box input[type = "text"]:focus,.box input[type = "password"]:focus"""),format.raw/*58.68*/("""{"""),format.raw/*58.69*/("""
  """),format.raw/*59.3*/("""width: 280px;
  border-color: black;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
"""),format.raw/*62.1*/(""".box input[type = "submit"],.box input[type = "button"]"""),format.raw/*62.56*/("""{"""),format.raw/*62.57*/("""
  """),format.raw/*63.3*/("""border:0;
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
"""),format.raw/*75.1*/("""}"""),format.raw/*75.2*/("""
"""),format.raw/*76.1*/(""".box input[type = "submit"]:hover,.box input[type = "button"]:hover"""),format.raw/*76.68*/("""{"""),format.raw/*76.69*/("""
  """),format.raw/*77.3*/("""background: #2ecc71;
"""),format.raw/*78.1*/("""}"""),format.raw/*78.2*/("""

"""),format.raw/*80.1*/(""".hide"""),format.raw/*80.6*/("""{"""),format.raw/*80.7*/("""
  """),format.raw/*81.3*/("""display: none;
"""),format.raw/*82.1*/("""}"""),format.raw/*82.2*/("""
"""),format.raw/*83.1*/("""/* END OF REGISTER */


</style>
      <div class="box">

        <h1>Register</h1>
 
                 """),_display_(/*91.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*92.61*/("""
             
                 """),_display_(/*94.19*/inputText(userForm("name"), '_label -> "",
                 'class -> "input", 'placeholder -> "Username")),format.raw/*95.64*/("""
            
                 """),_display_(/*97.19*/inputPassword(userForm("password"), '_label -> "",
                 'class -> "input", 'placeholder -> "Password")),format.raw/*98.64*/("""
            
"""),format.raw/*100.1*/("""<!--              """),_display_(/*100.20*/inputPassword(userForm("password2"), '_label -> "",
                 'class -> "input", 'placeholder -> "Confirm Password")),format.raw/*101.72*/(""" """),format.raw/*101.73*/("""-->

                 """),_display_(/*103.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "", 'class -> "hide", 'hidden -> "hidden")),format.raw/*103.129*/("""
"""),format.raw/*104.1*/("""<!--                 
                 """),_display_(/*105.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*105.110*/("""
                  """),_display_(/*106.20*/inputText(userForm("role"), '_label -> "",
                 'class -> "input", 'placeholder -> "role")),format.raw/*107.60*/("""
     
                 """),_display_(/*109.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*110.61*/("""
             
             """),_display_(/*112.15*/inputText(userForm("type").copy(value=Some("customer")), '_label -> "", 'hidden -> "hidden")),format.raw/*112.107*/(""" """),format.raw/*112.108*/("""-->
        
     
      <input type="submit" value="Sign up" class="btn"/>
             
             <input type="button" value="Cancel" class="btn"
             onclick="window.location.href = '"""),_display_(/*118.48*/controllers/*118.59*/.security.routes.LoginCtrl.signup()),format.raw/*118.94*/("""';">
             
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
                  DATE: Wed Mar 27 10:47:23 GMT 2019
                  SOURCE: /home/wdd/Downloads/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: bd277dc4a14963c7765e5666ca56c29fa8185904
                  MATRIX: 988->1|1125->68|1158->96|1203->65|1231->94|1258->113|1286->133|1324->134|1353->137|1404->213|1432->215|1471->245|1511->247|1541->250|1606->289|1620->294|1654->307|1684->310|1722->318|1753->323|1874->434|1915->436|1950->471|1985->568|2019->576|2032->580|2063->590|2092->592|2131->604|2159->605|2191->610|2231->623|2259->624|2287->625|2333->644|2361->645|2391->648|2647->877|2675->878|2703->879|2737->886|2765->887|2795->890|2885->953|2913->954|2941->955|3024->1010|3053->1011|3083->1014|3324->1228|3352->1229|3380->1230|3475->1297|3504->1298|3534->1301|3598->1338|3626->1339|3654->1340|3737->1395|3766->1396|3796->1399|4059->1635|4087->1636|4115->1637|4210->1704|4239->1705|4269->1708|4317->1729|4345->1730|4374->1732|4406->1737|4434->1738|4464->1741|4506->1756|4534->1757|4562->1758|4693->1862|4818->1966|4878->1999|5005->2105|5064->2137|5199->2251|5241->2265|5288->2284|5433->2407|5463->2408|5514->2431|5647->2541|5676->2542|5744->2582|5858->2673|5906->2693|6030->2795|6083->2820|6209->2924|6266->2953|6381->3045|6412->3046|6638->3244|6659->3255|6716->3290|6797->3343|6893->3417|6933->3429|7027->3501|7067->3513|7169->3593|7209->3605|7321->3694|7372->3717|7486->3808|7526->3820|7612->3884|7652->3896|7766->3987|7815->4007|7965->4129|7986->4140|8043->4175|8198->4299|8228->4317|8261->4319|8291->4337|8322->4340|8421->4411|8450->4412|8481->4415|8557->4463|8586->4464|8615->4465|8656->4477|8686->4478|8717->4481|8907->4643|8936->4644|8965->4645|9009->4660|9039->4661|9070->4664|9197->4763|9226->4764|9255->4765|9302->4783|9332->4784|9362->4786|9563->4959|9592->4960|9623->4963|9656->4968|9685->4969|9717->4973|9826->5054|9855->5055|9887->5059|9927->5070|9957->5071|9991->5077|10183->5241|10212->5242|10246->5248|10292->5265|10322->5266|10358->5274|10417->5305|10446->5306|10482->5314|10525->5328|10555->5329|10593->5339|10825->5542|10855->5543|10895->5554|10944->5574|10974->5575|11016->5588|11087->5630|11117->5631|11146->5632
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|55->23|55->23|56->24|57->25|57->25|58->26|59->27|59->27|60->28|71->39|71->39|72->40|72->40|72->40|73->41|76->44|76->44|77->45|77->45|77->45|78->46|89->57|89->57|90->58|90->58|90->58|91->59|93->61|93->61|94->62|94->62|94->62|95->63|107->75|107->75|108->76|108->76|108->76|109->77|110->78|110->78|112->80|112->80|112->80|113->81|114->82|114->82|115->83|123->91|124->92|126->94|127->95|129->97|130->98|132->100|132->100|133->101|133->101|135->103|135->103|136->104|137->105|137->105|138->106|139->107|141->109|142->110|144->112|144->112|144->112|150->118|150->118|150->118|154->122|154->122|155->123|155->123|156->124|156->124|157->125|157->125|159->127|159->127|160->128|160->128|161->129|161->129|163->131|165->133|165->133|165->133|169->137|169->137|170->138|170->138|171->139|178->146|178->146|179->147|182->150|182->150|183->151|183->151|183->151|184->152|192->160|192->160|193->161|193->161|193->161|194->162|199->167|199->167|200->168|200->168|200->168|201->169|209->177|209->177|211->179|211->179|211->179|212->180|215->183|215->183|216->184|216->184|216->184|217->185|224->192|224->192|225->193|225->193|225->193|226->194|227->195|227->195|228->196|228->196|228->196|229->197|236->204|236->204|237->205|237->205|237->205|238->206|239->207|239->207|240->208
                  -- GENERATED --
              */
          