
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
                  DATE: Sat Mar 23 02:29:36 GMT 2019
                  SOURCE: D:/steph/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: 3fcfe61afd8b648a6e022651eb6d59af52030e47
                  MATRIX: 988->1|1125->70|1158->100|1203->65|1233->97|1261->118|1289->138|1327->139|1357->143|1424->235|1453->238|1492->268|1532->270|1563->274|1629->314|1643->319|1677->332|1708->336|1747->345|1780->352|1901->463|1942->465|1978->501|2014->599|2049->608|2062->612|2093->622|2124->626|2165->640|2193->641|2226->647|2273->667|2301->668|2330->670|2377->690|2405->691|2436->695|2707->939|2735->940|2764->942|2798->949|2826->950|2857->954|2954->1024|2982->1025|3011->1027|3094->1082|3123->1083|3154->1087|3428->1334|3456->1335|3485->1337|3580->1404|3609->1405|3640->1409|3708->1450|3736->1451|3765->1453|3848->1508|3877->1509|3908->1513|4189->1767|4217->1768|4246->1770|4341->1837|4370->1838|4401->1842|4450->1864|4478->1865|4509->1869|4541->1874|4569->1875|4600->1879|4643->1895|4671->1896|4700->1898|4839->2010|4965->2115|5027->2150|5155->2257|5216->2291|5352->2406|5414->2440|5560->2564|5610->2586|5743->2696|5773->2698|5842->2739|5956->2830|6005->2851|6130->2954|6185->2981|6312->3086|6371->3117|6486->3209|6517->3210|6749->3414|6770->3425|6827->3460|6911->3516|7007->3590|7048->3603|7142->3675|7183->3688|7285->3768|7326->3781|7438->3870|7491->3895|7605->3986|7646->3999|7732->4063|7773->4076|7887->4167|7938->4189|8090->4313|8111->4324|8168->4359|8327->4487|8357->4505|8391->4508|8421->4526|8453->4530|8559->4608|8588->4609|8620->4613|8699->4664|8728->4665|8758->4667|8799->4679|8829->4680|8861->4684|9059->4854|9088->4855|9118->4857|9162->4872|9192->4873|9224->4877|9356->4981|9385->4982|9415->4984|9462->5002|9492->5003|9523->5006|9732->5187|9761->5188|9794->5193|9827->5198|9856->5199|9889->5204|10001->5288|10030->5289|10063->5294|10103->5305|10133->5306|10168->5313|10367->5484|10396->5485|10431->5492|10477->5509|10507->5510|10544->5519|10604->5551|10633->5552|10670->5561|10713->5575|10743->5576|10782->5587|11021->5797|11051->5798|11092->5810|11141->5830|11171->5831|11214->5845|11286->5888|11316->5889|11346->5891
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|53->21|55->23|55->23|56->24|57->25|57->25|58->26|59->27|59->27|60->28|71->39|71->39|72->40|72->40|72->40|73->41|76->44|76->44|77->45|77->45|77->45|78->46|90->58|90->58|91->59|91->59|91->59|92->60|94->62|94->62|95->63|95->63|95->63|96->64|108->76|108->76|109->77|109->77|109->77|110->78|111->79|111->79|113->81|113->81|113->81|114->82|115->83|115->83|116->84|124->92|125->93|127->95|128->96|130->98|131->99|133->101|134->102|136->104|136->104|137->105|138->106|138->106|139->107|140->108|142->110|143->111|145->113|145->113|145->113|151->119|151->119|151->119|154->122|154->122|155->123|155->123|156->124|156->124|157->125|157->125|159->127|159->127|160->128|160->128|161->129|161->129|163->131|165->133|165->133|165->133|169->137|169->137|170->138|170->138|171->139|178->146|178->146|179->147|182->150|182->150|183->151|183->151|183->151|184->152|192->160|192->160|193->161|193->161|193->161|194->162|199->167|199->167|200->168|200->168|200->168|201->169|209->177|209->177|211->179|211->179|211->179|212->180|215->183|215->183|216->184|216->184|216->184|217->185|224->192|224->192|225->193|225->193|225->193|226->194|227->195|227->195|228->196|228->196|228->196|229->197|236->204|236->204|237->205|237->205|237->205|238->206|239->207|239->207|240->208
                  -- GENERATED --
              */
          