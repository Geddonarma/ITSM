
package views.html.productAdmin

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
/*1.2*/import models.users.User

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title: String, user: User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.45*/("""

"""),format.raw/*4.1*/("""<<!DOCTYPE html>

<html lang="en">
<style>

.dropdown .nav"""),format.raw/*9.15*/("""{"""),format.raw/*9.16*/("""
  """),format.raw/*10.3*/("""float: none;
  overflow: hidden;
"""),format.raw/*12.1*/("""}"""),format.raw/*12.2*/("""

"""),format.raw/*14.1*/(""".dropdown .dropbtn"""),format.raw/*14.19*/("""{"""),format.raw/*14.20*/("""
  """),format.raw/*15.3*/("""font-size: 17px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
"""),format.raw/*24.1*/(""".dropdown-content """),format.raw/*24.19*/("""{"""),format.raw/*24.20*/("""
  """),format.raw/*25.3*/("""display: none;
  position: absolute;
  background-color: #c2eff5;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(45, 138, 167, 0.377);
  z-index: 1;
"""),format.raw/*31.1*/("""}"""),format.raw/*31.2*/("""
"""),format.raw/*32.1*/(""".dropdown-content a """),format.raw/*32.21*/("""{"""),format.raw/*32.22*/("""
  """),format.raw/*33.3*/("""float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
"""),format.raw/*40.1*/(""".navbar a:hover, .dropdown:hover .dropbtn """),format.raw/*40.43*/("""{"""),format.raw/*40.44*/("""
  """),format.raw/*41.3*/("""background-color: rgba(45, 45, 48, 0.979);
  color: white;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

"""),format.raw/*45.1*/(""".dropdown-content a:hover """),format.raw/*45.27*/("""{"""),format.raw/*45.28*/("""
  """),format.raw/*46.3*/("""background-color: rgb(174, 205, 212);
  color: black;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/(""".dropdown:hover .dropdown-content """),format.raw/*50.35*/("""{"""),format.raw/*50.36*/("""
  """),format.raw/*51.3*/("""display: block;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""

"""),format.raw/*54.1*/(""".dropdown .dropbtn """),format.raw/*54.20*/("""{"""),format.raw/*54.21*/("""
    """),format.raw/*55.5*/("""display: block;
    width: 100%;
    text-align: left;
  """),format.raw/*58.3*/("""}"""),format.raw/*58.4*/("""

  """),format.raw/*60.3*/("""</style>
<head>
    <meta charset="utf-8">
    <title>Portable Devices- """),_display_(/*63.31*/title),format.raw/*63.36*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*67.18*/routes/*67.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*67.65*/("""" rel="stylesheet" />
</head>
<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">         
            </div>

            <ul class="nav navbar-nav">
                </li>  
                <li """),_display_(/*78.22*/if(title=="Portable Devices" )/*78.52*/{_display_(Seq[Any](format.raw/*78.53*/("""class="active"""")))}),format.raw/*78.68*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*79.53*/routes/*79.59*/.ProductCtrl.listProducts(0)),format.raw/*79.87*/("""">Portable Devices</a>
                </li>  
                <li """),_display_(/*81.22*/if(title=="Home" )/*81.40*/{_display_(Seq[Any](format.raw/*81.41*/("""class="active"""")))}),format.raw/*81.56*/(""">
                        <a class="navbar-brand" href=""""),_display_(/*82.56*/routes/*82.62*/.ProductCtrl.index()),format.raw/*82.82*/("""">Home</a>
                       </li>

                <li """),_display_(/*85.22*/if(title=="Products" )/*85.44*/{_display_(Seq[Any](format.raw/*85.45*/("""class="active"""")))}),format.raw/*85.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*86.49*/routes/*86.55*/.ProductCtrl.listProducts(0)),format.raw/*86.83*/("""">Products</a>
                </li>

              <!---- <li """),_display_(/*89.27*/if(title=="About" )/*89.46*/{_display_(Seq[Any](format.raw/*89.47*/("""class="active"""")))}),format.raw/*89.62*/(""">
                    <a href=""""),_display_(/*90.31*/routes/*90.37*/.ProductCtrl.about),format.raw/*90.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*94.26*/if(title=="Contact" )/*94.47*/{_display_(Seq[Any](format.raw/*94.48*/("""class="active"""")))}),format.raw/*94.63*/(""">
                        <a href=""""),_display_(/*95.35*/routes/*95.41*/.ProductCtrl.contact),format.raw/*95.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            
                <li """),_display_(/*100.22*/if(title=="Signup" )/*100.42*/{_display_(Seq[Any](format.raw/*100.43*/("""class="active"""")))}),format.raw/*100.58*/(""">
                    <a href=""""),_display_(/*101.31*/controllers/*101.42*/.security.routes.LoginCtrl.signup),format.raw/*101.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*106.22*/if(title=="Login")/*106.40*/{_display_(Seq[Any](format.raw/*106.41*/("""class="active"""")))}),format.raw/*106.56*/(""">
                    """),_display_(/*107.22*/if(user != null)/*107.38*/ {_display_(Seq[Any](format.raw/*107.40*/("""
                        """),format.raw/*108.25*/("""<a href=""""),_display_(/*108.35*/controllers/*108.46*/.security.routes.LoginCtrl.logout()),format.raw/*108.81*/("""">Logout """),_display_(/*108.91*/user/*108.95*/.getName()),format.raw/*108.105*/("""</a>
                    """)))}/*109.23*/else/*109.28*/{_display_(Seq[Any](format.raw/*109.29*/("""
                        """),format.raw/*110.25*/("""<a href=""""),_display_(/*110.35*/controllers/*110.46*/.security.routes.LoginCtrl.login()),format.raw/*110.80*/("""">Login</a>
                    """)))}),format.raw/*111.22*/("""

                """),format.raw/*113.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*115.31*/routes/*115.37*/.ShoppingCtrl.showBasket),format.raw/*115.61*/("""">
                    <span class="glyphicon glyphicon-shopping-cart"></span></a>
                </li>
                <li>
                    <a href=""""),_display_(/*119.31*/routes/*119.37*/.ShoppingCtrl.viewOrders),format.raw/*119.61*/("""">Order History</a>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown Menu</a>
                    
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*125.37*/routes/*125.43*/.ProductCtrl.listProducts(0)),format.raw/*125.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*126.37*/routes/*126.43*/.ProductCtrl.about),format.raw/*126.61*/("""">About Us</a>
                          <a href=""""),_display_(/*127.37*/routes/*127.43*/.ProductCtrl.contact),format.raw/*127.63*/("""">Contact Us</a>
                          
                        </div>
                    </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*140.18*/content),format.raw/*140.25*/("""
            """),format.raw/*141.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
               <p class="text-center">
                Copyright
                <strong>Portable Devices Online Store</strong>
                </p>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*157.19*/routes/*157.25*/.Assets.versioned("javascripts/main.js")),format.raw/*157.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 22:47:30 IST 2019
                  SOURCE: /home/wdd/IT/ITSM/ShoppinCartLY/app/views/productAdmin/main.scala.html
                  HASH: 4f0dd0be26364eb46509c57c58ed1b8d307d2b6e
                  MATRIX: 664->1|1002->27|1140->70|1168->72|1253->130|1281->131|1311->134|1371->167|1399->168|1428->170|1474->188|1503->189|1533->192|1716->348|1744->349|1772->350|1818->368|1847->369|1877->372|2062->530|2090->531|2118->532|2166->552|2195->553|2225->556|2366->670|2394->671|2422->672|2492->714|2521->715|2551->718|2637->777|2665->778|2694->780|2748->806|2777->807|2807->810|2888->864|2916->865|2945->867|3007->901|3036->902|3066->905|3109->921|3137->922|3166->924|3213->943|3242->944|3274->949|3358->1006|3386->1007|3417->1011|3517->1084|3543->1089|3755->1274|3770->1280|3832->1321|4129->1591|4168->1621|4207->1622|4253->1637|4334->1691|4349->1697|4398->1725|4493->1793|4520->1811|4559->1812|4605->1827|4689->1884|4704->1890|4745->1910|4834->1972|4865->1994|4904->1995|4950->2010|5027->2060|5042->2066|5091->2094|5182->2158|5210->2177|5249->2178|5295->2193|5354->2225|5369->2231|5408->2249|5519->2333|5549->2354|5588->2355|5634->2370|5697->2406|5712->2412|5753->2432|5896->2547|5926->2567|5966->2568|6013->2583|6073->2615|6094->2626|6149->2659|6238->2720|6266->2738|6306->2739|6353->2754|6404->2777|6430->2793|6471->2795|6525->2820|6563->2830|6584->2841|6641->2876|6679->2886|6693->2890|6726->2900|6772->2927|6786->2932|6826->2933|6880->2958|6918->2968|6939->2979|6995->3013|7060->3046|7107->3064|7192->3121|7208->3127|7254->3151|7438->3307|7454->3313|7500->3337|7803->3612|7819->3618|7869->3646|7959->3708|7975->3714|8015->3732|8094->3783|8110->3789|8152->3809|8411->4040|8440->4047|8482->4060|8869->4419|8885->4425|8947->4465
                  LINES: 24->1|29->2|34->2|36->4|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|55->23|55->23|56->24|56->24|56->24|57->25|63->31|63->31|64->32|64->32|64->32|65->33|71->39|71->39|72->40|72->40|72->40|73->41|75->43|75->43|77->45|77->45|77->45|78->46|80->48|80->48|82->50|82->50|82->50|83->51|84->52|84->52|86->54|86->54|86->54|87->55|90->58|90->58|92->60|95->63|95->63|99->67|99->67|99->67|110->78|110->78|110->78|110->78|111->79|111->79|111->79|113->81|113->81|113->81|113->81|114->82|114->82|114->82|117->85|117->85|117->85|117->85|118->86|118->86|118->86|121->89|121->89|121->89|121->89|122->90|122->90|122->90|126->94|126->94|126->94|126->94|127->95|127->95|127->95|132->100|132->100|132->100|132->100|133->101|133->101|133->101|138->106|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|143->111|145->113|147->115|147->115|147->115|151->119|151->119|151->119|157->125|157->125|157->125|158->126|158->126|158->126|159->127|159->127|159->127|172->140|172->140|173->141|189->157|189->157|189->157
                  -- GENERATED --
              */
          