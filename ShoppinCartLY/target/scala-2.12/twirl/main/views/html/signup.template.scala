
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

         
"""),format.raw/*22.1*/("""<style>
.container"""),format.raw/*23.11*/("""{"""),format.raw/*23.12*/("""
 """),format.raw/*24.2*/("""width: 130%;
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
"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

"""),format.raw/*39.1*/(""".box"""),format.raw/*39.5*/("""{"""),format.raw/*39.6*/("""
  """),format.raw/*40.3*/("""width: 400px;
  text-align: center;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  background-color: white;
  border-radius: 10px;
  padding: 40px;
  box-shadow: 0 8px 12px 0 rgba(0, 0, 0, 0.15);
  text-align: center;
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""

"""),format.raw/*53.1*/("""h1"""),format.raw/*53.3*/("""{"""),format.raw/*53.4*/("""
"""),format.raw/*54.1*/("""font-size: 50px;
text-align: center;
font-weight: bold;
color: black;
margin: 20px 0 70px 0;
"""),format.raw/*59.1*/("""}"""),format.raw/*59.2*/("""

"""),format.raw/*61.1*/(""".btn"""),format.raw/*61.5*/("""{"""),format.raw/*61.6*/("""
  """),format.raw/*62.3*/("""width: 90%;
  border-radius: 50px;
  padding: 12px;
  border: none;
  outline: none;
  font-size: 20px;
  font-weight: 600;
  cursor: pointer;
  margin: 40px 0;
  color: white;
  background-image: linear-gradient(170deg, #B621fe, #1fd1f9);
"""),format.raw/*73.1*/("""}"""),format.raw/*73.2*/("""

"""),format.raw/*75.1*/("""</style>
<body>
<form id="sig">
  <div class="container">
      <div class="box">

        <h1>Register</h1>
 
                 """),_display_(/*83.19*/inputText(userForm("email"), '_label -> "",
                 'class -> "input", 'placeholder -> "Email")),format.raw/*84.61*/("""
             
                 """),_display_(/*86.19*/inputText(userForm("name"), '_label -> "",
                 'class -> "input", 'placeholder -> "Username")),format.raw/*87.64*/("""
            
                 """),_display_(/*89.19*/inputPassword(userForm("password"), '_label -> "",
                 'class -> "input", 'placeholder -> "Password")),format.raw/*90.64*/("""
                  
                 """),_display_(/*92.19*/inputPassword(userForm("password"), '_label -> "",
                 'class -> "input", 'placeholder -> "Password")),format.raw/*93.64*/("""


                 """),_display_(/*96.19*/inputText(userForm("role").copy(value=Some("customer")), '_label -> "", 'class -> "hide", 'hidden -> "hidden")),format.raw/*96.129*/("""

     
      """),format.raw/*99.7*/("""<input type="submit" value="Sign up" class="btn"/>
             
             <input type="button" value="Cancel" class="btn"
             onclick="window.location.href = '"""),_display_(/*102.48*/controllers/*102.59*/.security.routes.LoginCtrl.signup()),format.raw/*102.94*/("""';">
            </div> 
         </div> 
        </div>
        </form>
      </body>
      """)))}),format.raw/*108.8*/("""
    """)))}),format.raw/*109.6*/("""
    
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
                  DATE: Tue Apr 23 21:34:36 IST 2019
                  SOURCE: /home/wdd/IT/ITSM/ShoppinCartLY/app/views/signup.scala.html
                  HASH: b453ec0642a520ac1aa83a283ca0d4d1899234fe
                  MATRIX: 988->1|1125->68|1158->96|1203->65|1231->94|1258->113|1286->133|1324->134|1353->137|1404->213|1432->215|1471->245|1511->247|1541->250|1606->289|1620->294|1654->307|1684->310|1722->318|1753->323|1874->434|1915->436|1950->471|1985->568|2019->576|2032->580|2063->590|2102->602|2148->620|2177->621|2206->623|2530->920|2558->921|2587->923|2618->927|2646->928|2676->931|2959->1187|2987->1188|3016->1190|3045->1192|3073->1193|3101->1194|3221->1287|3249->1288|3278->1290|3309->1294|3337->1295|3367->1298|3634->1538|3662->1539|3691->1541|3847->1670|3972->1774|4032->1807|4159->1913|4218->1945|4353->2059|4418->2097|4553->2211|4601->2232|4733->2342|4774->2356|4975->2529|4996->2540|5053->2575|5178->2669|5215->2675
                  LINES: 28->1|31->3|32->5|35->1|37->4|38->6|38->6|38->6|39->7|41->9|42->10|42->10|42->10|43->11|44->12|44->12|44->12|45->13|46->14|48->16|48->16|48->16|49->17|50->18|51->19|51->19|51->19|54->22|55->23|55->23|56->24|69->37|69->37|71->39|71->39|71->39|72->40|83->51|83->51|85->53|85->53|85->53|86->54|91->59|91->59|93->61|93->61|93->61|94->62|105->73|105->73|107->75|115->83|116->84|118->86|119->87|121->89|122->90|124->92|125->93|128->96|128->96|131->99|134->102|134->102|134->102|140->108|141->109
                  -- GENERATED --
              */
          