
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

     
"""),format.raw/*22.1*/("""<!--       <img src="https://wallpapertag.com/wallpaper/full/9/6/e/138252-4k-abstract-wallpaper-2560x1600-for-iphone-6.jpg" id="bg" alt="Image">
 -->      
<style>
/* #bg"""),format.raw/*25.7*/("""{"""),format.raw/*25.8*/("""
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

"""),format.raw/*43.1*/(""".box"""),format.raw/*43.5*/("""{"""),format.raw/*43.6*/("""
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
"""),format.raw/*97.1*/("""}"""),format.raw/*97.2*/(""" """),format.raw/*97.3*/("""*/

.container"""),format.raw/*99.11*/("""{"""),format.raw/*99.12*/("""
 """),format.raw/*100.2*/("""width: 130%;
 min-height: 100vh;
 background-image: linear-gradient(170deg, #B621fe, #1fd1f9);
 display: -webkit-box;
 display: -webkit-flex;
 display: -moz-box;
 display: -moz-flexbox;
 display: flex;
 flex-wrap: wrap;
 justify-content: center;
 align-items: center;
 padding: 15px;
 z-index: 1;
"""),format.raw/*113.1*/("""}"""),format.raw/*113.2*/("""

"""),format.raw/*115.1*/(""".box"""),format.raw/*115.5*/("""{"""),format.raw/*115.6*/("""
  """),format.raw/*116.3*/("""width: 400px;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: white;
  border-radius: 10px;
  padding: 40px;
  box-shadow: 0 8px 12px 0 rgba(0, 0, 0, 0.15);

"""),format.raw/*126.1*/("""}"""),format.raw/*126.2*/("""

"""),format.raw/*128.1*/("""</style>
<body>
<form id="sig">
  <div class="container">
      <div class="box">

        <h1>Register</h1>
 
                 """),_display_(/*136.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*137.61*/("""
             
                 """),_display_(/*139.19*/inputText(userForm("name"), '_label -> "",
                 'class -> "input", 'placeholder -> "Username")),format.raw/*140.64*/("""
            
                 """),_display_(/*142.19*/inputPassword(userForm("password"), '_label -> "",
                 'class -> "input", 'placeholder -> "Password")),format.raw/*143.64*/("""
            


                 """),_display_(/*147.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "", 'class -> "hide", 'hidden -> "hidden")),format.raw/*147.129*/("""

     
      """),format.raw/*150.7*/("""<input type="submit" value="Sign up" class="btn"/>
             
             <input type="button" value="Cancel" class="btn"
             onclick="window.location.href = '"""),_display_(/*153.48*/controllers/*153.59*/.security.routes.LoginCtrl.signup()),format.raw/*153.94*/("""';">
             
         </div> 
        </div>
        </form>
      </body>
      """)))}),format.raw/*159.8*/("""
    """)))}),format.raw/*160.6*/("""
    
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
                  DATE: Wed Apr 10 12:59:59 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: add7adc8a3cfc92a0c69c921a6021f777397682b
                  MATRIX: 988->1|1125->68|1158->96|1203->65|1231->94|1258->113|1286->133|1324->134|1353->137|1404->213|1432->215|1471->245|1511->247|1541->250|1606->289|1620->294|1654->307|1684->310|1722->318|1753->323|1874->434|1915->436|1950->471|1985->568|2019->576|2032->580|2063->590|2098->598|2295->768|2323->769|2353->772|2541->933|2569->934|2597->935|2628->939|2656->940|2686->943|2778->1008|2806->1009|2834->1010|2864->1013|2892->1014|2922->1017|2977->1045|3005->1046|3035->1049|3063->1050|3091->1051|3123->1056|3163->1069|3191->1070|3220->1072|3251->1076|3279->1077|3309->1080|3524->1268|3552->1269|3580->1270|3614->1277|3642->1278|3672->1281|3762->1344|3790->1345|3818->1346|3901->1401|3930->1402|3960->1405|4201->1619|4229->1620|4257->1621|4352->1688|4381->1689|4411->1692|4475->1729|4503->1730|4531->1731|4614->1786|4643->1787|4673->1790|4936->2026|4964->2027|4992->2028|5087->2095|5116->2096|5146->2099|5194->2120|5222->2121|5251->2123|5283->2128|5311->2129|5341->2132|5383->2147|5411->2148|5439->2149|5481->2163|5510->2164|5540->2166|5865->2463|5894->2464|5924->2466|5956->2470|5985->2471|6016->2474|6257->2687|6286->2688|6316->2690|6473->2819|6599->2923|6660->2956|6788->3062|6848->3094|6984->3208|7046->3242|7179->3352|7221->3366|7422->3539|7443->3550|7500->3585|7619->3673|7656->3679
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|54->22|57->25|57->25|58->26|61->29|61->29|62->30|62->30|62->30|63->31|66->34|66->34|67->35|67->35|67->35|68->36|70->38|70->38|71->39|71->39|71->39|72->40|73->41|73->41|75->43|75->43|75->43|76->44|86->54|86->54|87->55|87->55|87->55|88->56|91->59|91->59|92->60|92->60|92->60|93->61|104->72|104->72|105->73|105->73|105->73|106->74|108->76|108->76|109->77|109->77|109->77|110->78|122->90|122->90|123->91|123->91|123->91|124->92|125->93|125->93|127->95|127->95|127->95|128->96|129->97|129->97|129->97|131->99|131->99|132->100|145->113|145->113|147->115|147->115|147->115|148->116|158->126|158->126|160->128|168->136|169->137|171->139|172->140|174->142|175->143|179->147|179->147|182->150|185->153|185->153|185->153|191->159|192->160
                  -- GENERATED --
              */
          