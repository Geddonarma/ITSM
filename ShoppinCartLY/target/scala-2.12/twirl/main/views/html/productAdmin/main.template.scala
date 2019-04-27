
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

"""),format.raw/*4.1*/("""<!DOCTYPE html>

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
                     <a class="navbar-brand" href=""""),_display_(/*79.53*/routes/*79.59*/.AdminProductCtrl.listProducts(0)),format.raw/*79.92*/("""">Portable Devices</a>
                </li>  
                <li """),_display_(/*81.22*/if(title=="Home" )/*81.40*/{_display_(Seq[Any](format.raw/*81.41*/("""class="active"""")))}),format.raw/*81.56*/(""">
                        <a class="navbar-brand" href=""""),_display_(/*82.56*/routes/*82.62*/.ProductCtrl.index()),format.raw/*82.82*/("""">Home</a>
                       </li>

                <li """),_display_(/*85.22*/if(title=="Products" )/*85.44*/{_display_(Seq[Any](format.raw/*85.45*/("""class="active"""")))}),format.raw/*85.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*86.49*/routes/*86.55*/.AdminProductCtrl.listProducts(0)),format.raw/*86.88*/("""">Products</a>
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


                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown Menu</a>
                    
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*120.37*/routes/*120.43*/.AdminProductCtrl.listProducts(0)),format.raw/*120.76*/("""">Search for Products</a>
                          <a href=""""),_display_(/*121.37*/routes/*121.43*/.ProductCtrl.about),format.raw/*121.61*/("""">About Us</a>
                          <a href=""""),_display_(/*122.37*/routes/*122.43*/.ProductCtrl.contact),format.raw/*122.63*/("""">Contact Us</a>
                          
                        </div>
                    </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*135.18*/content),format.raw/*135.25*/("""
            """),format.raw/*136.13*/("""</div>
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
    <script src=""""),_display_(/*152.19*/routes/*152.25*/.Assets.versioned("javascripts/main.js")),format.raw/*152.65*/(""""></script>
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
                  DATE: Sat Apr 27 13:25:54 IST 2019
                  SOURCE: /home/wdd/AD/ITSM/ShoppinCartLY/app/views/productAdmin/main.scala.html
                  HASH: 77e3230afaa1f225bc954fcb645031d70946e4f3
                  MATRIX: 664->1|1002->27|1140->70|1168->72|1252->129|1280->130|1310->133|1370->166|1398->167|1427->169|1473->187|1502->188|1532->191|1715->347|1743->348|1771->349|1817->367|1846->368|1876->371|2061->529|2089->530|2117->531|2165->551|2194->552|2224->555|2365->669|2393->670|2421->671|2491->713|2520->714|2550->717|2636->776|2664->777|2693->779|2747->805|2776->806|2806->809|2887->863|2915->864|2944->866|3006->900|3035->901|3065->904|3108->920|3136->921|3165->923|3212->942|3241->943|3273->948|3357->1005|3385->1006|3416->1010|3516->1083|3542->1088|3754->1273|3769->1279|3831->1320|4128->1590|4167->1620|4206->1621|4252->1636|4333->1690|4348->1696|4402->1729|4497->1797|4524->1815|4563->1816|4609->1831|4693->1888|4708->1894|4749->1914|4838->1976|4869->1998|4908->1999|4954->2014|5031->2064|5046->2070|5100->2103|5191->2167|5219->2186|5258->2187|5304->2202|5363->2234|5378->2240|5417->2258|5528->2342|5558->2363|5597->2364|5643->2379|5706->2415|5721->2421|5762->2441|5905->2556|5935->2576|5975->2577|6022->2592|6082->2624|6103->2635|6158->2668|6247->2729|6275->2747|6315->2748|6362->2763|6413->2786|6439->2802|6480->2804|6534->2829|6572->2839|6593->2850|6650->2885|6688->2895|6702->2899|6735->2909|6781->2936|6795->2941|6835->2942|6889->2967|6927->2977|6948->2988|7004->3022|7069->3055|7116->3073|7385->3314|7401->3320|7456->3353|7546->3415|7562->3421|7602->3439|7681->3490|7697->3496|7739->3516|7998->3747|8027->3754|8069->3767|8456->4126|8472->4132|8534->4172
                  LINES: 24->1|29->2|34->2|36->4|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|55->23|55->23|56->24|56->24|56->24|57->25|63->31|63->31|64->32|64->32|64->32|65->33|71->39|71->39|72->40|72->40|72->40|73->41|75->43|75->43|77->45|77->45|77->45|78->46|80->48|80->48|82->50|82->50|82->50|83->51|84->52|84->52|86->54|86->54|86->54|87->55|90->58|90->58|92->60|95->63|95->63|99->67|99->67|99->67|110->78|110->78|110->78|110->78|111->79|111->79|111->79|113->81|113->81|113->81|113->81|114->82|114->82|114->82|117->85|117->85|117->85|117->85|118->86|118->86|118->86|121->89|121->89|121->89|121->89|122->90|122->90|122->90|126->94|126->94|126->94|126->94|127->95|127->95|127->95|132->100|132->100|132->100|132->100|133->101|133->101|133->101|138->106|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|143->111|145->113|152->120|152->120|152->120|153->121|153->121|153->121|154->122|154->122|154->122|167->135|167->135|168->136|184->152|184->152|184->152
                  -- GENERATED --
              */
          