
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

     
      """),format.raw/*22.7*/("""<img src="https://wallpapertag.com/wallpaper/full/9/6/e/138252-4k-abstract-wallpaper-2560x1600-for-iphone-6.jpg" id="bg" alt="Image">
      
<style>
#bg"""),format.raw/*25.4*/("""{"""),format.raw/*25.5*/("""
  """),format.raw/*26.3*/("""background:url("https://wallpapertag.com/wallpaper/full/9/6/e/138252-4k-abstract-wallpaper-2560x1600-for-iphone-6.jpg") no-repeat;
  width:auto;
  margin: auto;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
"""),format.raw/*30.1*/("""#sig"""),format.raw/*30.5*/("""{"""),format.raw/*30.6*/("""
  """),format.raw/*31.3*/("""border:2px solid white;
  padding:60px 40px;
  margin-top: 80px;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
"""),format.raw/*35.1*/("""img"""),format.raw/*35.4*/("""{"""),format.raw/*35.5*/("""
  """),format.raw/*36.3*/("""width:auto;
  margin: auto;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
  """),format.raw/*39.3*/("""*"""),format.raw/*39.4*/("""{"""),format.raw/*39.5*/("""
    """),format.raw/*40.5*/("""color:red;
  """),format.raw/*41.3*/("""}"""),format.raw/*41.4*/("""
"""),format.raw/*42.1*/("""/* REGISTER */
.box"""),format.raw/*43.5*/("""{"""),format.raw/*43.6*/("""
  """),format.raw/*44.3*/("""width: 40%;
  top: 10%;
  left: 30%;
  position: absolute;
  float: left;
  background-color: none;
  text-align: center;
  color:black;
  border: 1px solid #3498db;
  border-radius: 3em;
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""
"""),format.raw/*55.1*/(""".box h1"""),format.raw/*55.8*/("""{"""),format.raw/*55.9*/("""
  """),format.raw/*56.3*/("""color: black;
  text-transform: uppercase;
  font-weight: 500;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""
"""),format.raw/*60.1*/(""".box input[type = "text"],.box input[type = "password"]"""),format.raw/*60.56*/("""{"""),format.raw/*60.57*/("""
  """),format.raw/*61.3*/("""border:0;
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
"""),format.raw/*72.1*/("""}"""),format.raw/*72.2*/("""
"""),format.raw/*73.1*/(""".box input[type = "text"]:focus,.box input[type = "password"]:focus"""),format.raw/*73.68*/("""{"""),format.raw/*73.69*/("""
  """),format.raw/*74.3*/("""width: 280px;
  border-color: black;
"""),format.raw/*76.1*/("""}"""),format.raw/*76.2*/("""
"""),format.raw/*77.1*/(""".box input[type = "submit"],.box input[type = "button"]"""),format.raw/*77.56*/("""{"""),format.raw/*77.57*/("""
  """),format.raw/*78.3*/("""border:0;
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
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
"""),format.raw/*91.1*/(""".box input[type = "submit"]:hover,.box input[type = "button"]:hover"""),format.raw/*91.68*/("""{"""),format.raw/*91.69*/("""
  """),format.raw/*92.3*/("""background: #2ecc71;
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""

"""),format.raw/*95.1*/(""".hide"""),format.raw/*95.6*/("""{"""),format.raw/*95.7*/("""
  """),format.raw/*96.3*/("""display: none;
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/("""
"""),format.raw/*98.1*/("""/* END OF REGISTER */


</style>
<form id="sig">
      <div class="box">

        <h1>Register</h1>
 
                 """),_display_(/*107.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*108.61*/("""
             
                 """),_display_(/*110.19*/inputText(userForm("name"), '_label -> "",
                 'class -> "input", 'placeholder -> "Username")),format.raw/*111.64*/("""
            
                 """),_display_(/*113.19*/inputPassword(userForm("password"), '_label -> "",
                 'class -> "input", 'placeholder -> "Password")),format.raw/*114.64*/("""
            


                 """),_display_(/*118.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "", 'class -> "hide", 'hidden -> "hidden")),format.raw/*118.129*/("""

     
      """),format.raw/*121.7*/("""<input type="submit" value="Sign up" class="btn"/>
             
             <input type="button" value="Cancel" class="btn"
             onclick="window.location.href = '"""),_display_(/*124.48*/controllers/*124.59*/.security.routes.LoginCtrl.signup()),format.raw/*124.94*/("""';">
             
         </div> 
        
        </form>
      """)))}),format.raw/*129.8*/("""
    """)))}),format.raw/*130.6*/("""
    
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
                  DATE: Mon Apr 08 16:54:40 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: a0fb9ea5aa7cd3649a0586b785056fa21a93612a
                  MATRIX: 988->1|1125->68|1158->96|1203->65|1231->94|1258->113|1286->133|1324->134|1353->137|1404->213|1432->215|1471->245|1511->247|1541->250|1606->289|1620->294|1654->307|1684->310|1722->318|1753->323|1874->434|1915->436|1950->471|1985->568|2019->576|2032->580|2063->590|2104->604|2283->756|2311->757|2341->760|2529->921|2557->922|2585->923|2616->927|2644->928|2674->931|2766->996|2794->997|2822->998|2852->1001|2880->1002|2910->1005|2965->1033|2993->1034|3023->1037|3051->1038|3079->1039|3111->1044|3151->1057|3179->1058|3207->1059|3253->1078|3281->1079|3311->1082|3526->1270|3554->1271|3582->1272|3616->1279|3644->1280|3674->1283|3764->1346|3792->1347|3820->1348|3903->1403|3932->1404|3962->1407|4203->1621|4231->1622|4259->1623|4354->1690|4383->1691|4413->1694|4477->1731|4505->1732|4533->1733|4616->1788|4645->1789|4675->1792|4938->2028|4966->2029|4994->2030|5089->2097|5118->2098|5148->2101|5196->2122|5224->2123|5253->2125|5285->2130|5313->2131|5343->2134|5385->2149|5413->2150|5441->2151|5589->2271|5715->2375|5776->2408|5904->2514|5964->2546|6100->2660|6162->2694|6295->2804|6337->2818|6538->2991|6559->3002|6616->3037|6715->3105|6752->3111
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|54->22|57->25|57->25|58->26|61->29|61->29|62->30|62->30|62->30|63->31|66->34|66->34|67->35|67->35|67->35|68->36|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|74->42|75->43|75->43|76->44|86->54|86->54|87->55|87->55|87->55|88->56|91->59|91->59|92->60|92->60|92->60|93->61|104->72|104->72|105->73|105->73|105->73|106->74|108->76|108->76|109->77|109->77|109->77|110->78|122->90|122->90|123->91|123->91|123->91|124->92|125->93|125->93|127->95|127->95|127->95|128->96|129->97|129->97|130->98|139->107|140->108|142->110|143->111|145->113|146->114|150->118|150->118|153->121|156->124|156->124|156->124|161->129|162->130
                  -- GENERATED --
              */
          