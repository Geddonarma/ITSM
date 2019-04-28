
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


                <li """),_display_(/*83.22*/if(title=="Products" )/*83.44*/{_display_(Seq[Any](format.raw/*83.45*/("""class="active"""")))}),format.raw/*83.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*84.49*/routes/*84.55*/.AdminProductCtrl.listProducts(0)),format.raw/*84.88*/("""">Products</a>
                </li>

              <!---- <li """),_display_(/*87.27*/if(title=="About" )/*87.46*/{_display_(Seq[Any](format.raw/*87.47*/("""class="active"""")))}),format.raw/*87.62*/(""">
                    <a href=""""),_display_(/*88.31*/routes/*88.37*/.ProductCtrl.about),format.raw/*88.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*92.26*/if(title=="Contact" )/*92.47*/{_display_(Seq[Any](format.raw/*92.48*/("""class="active"""")))}),format.raw/*92.63*/(""">
                        <a href=""""),_display_(/*93.35*/routes/*93.41*/.ProductCtrl.contact),format.raw/*93.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            


                <li """),_display_(/*100.22*/if(title=="Login")/*100.40*/{_display_(Seq[Any](format.raw/*100.41*/("""class="active"""")))}),format.raw/*100.56*/(""">
                    """),_display_(/*101.22*/if(user != null)/*101.38*/ {_display_(Seq[Any](format.raw/*101.40*/("""
                        """),format.raw/*102.25*/("""<a href=""""),_display_(/*102.35*/controllers/*102.46*/.security.routes.LoginCtrl.logout()),format.raw/*102.81*/("""">Logout """),_display_(/*102.91*/user/*102.95*/.getName()),format.raw/*102.105*/("""</a>
                    """)))}/*103.23*/else/*103.28*/{_display_(Seq[Any](format.raw/*103.29*/("""
                        """),format.raw/*104.25*/("""<a href=""""),_display_(/*104.35*/controllers/*104.46*/.security.routes.LoginCtrl.login()),format.raw/*104.80*/("""">Login</a>
                    """)))}),format.raw/*105.22*/("""

                """),format.raw/*107.17*/("""</li>


                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown Menu</a>
                    
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*114.37*/routes/*114.43*/.AdminProductCtrl.listProducts(0)),format.raw/*114.76*/("""">Search for Products</a>
                          
                        </div>
                    </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*127.18*/content),format.raw/*127.25*/("""
            """),format.raw/*128.13*/("""</div>
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
    <script src=""""),_display_(/*144.19*/routes/*144.25*/.Assets.versioned("javascripts/main.js")),format.raw/*144.65*/(""""></script>
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
                  DATE: Sun Apr 28 21:37:01 IST 2019
                  SOURCE: /home/wdd/AD/ITSM/ShoppinCartLY/app/views/productAdmin/main.scala.html
                  HASH: ade5724b404a3fd43b75d49909d3dbe0c00cf1c3
                  MATRIX: 664->1|1002->27|1140->70|1168->72|1252->129|1280->130|1310->133|1370->166|1398->167|1427->169|1473->187|1502->188|1532->191|1715->347|1743->348|1771->349|1817->367|1846->368|1876->371|2061->529|2089->530|2117->531|2165->551|2194->552|2224->555|2365->669|2393->670|2421->671|2491->713|2520->714|2550->717|2636->776|2664->777|2693->779|2747->805|2776->806|2806->809|2887->863|2915->864|2944->866|3006->900|3035->901|3065->904|3108->920|3136->921|3165->923|3212->942|3241->943|3273->948|3357->1005|3385->1006|3416->1010|3516->1083|3542->1088|3754->1273|3769->1279|3831->1320|4128->1590|4167->1620|4206->1621|4252->1636|4333->1690|4348->1696|4402->1729|4499->1799|4530->1821|4569->1822|4615->1837|4692->1887|4707->1893|4761->1926|4852->1990|4880->2009|4919->2010|4965->2025|5024->2057|5039->2063|5078->2081|5189->2165|5219->2186|5258->2187|5304->2202|5367->2238|5382->2244|5423->2264|5568->2381|5596->2399|5636->2400|5683->2415|5734->2438|5760->2454|5801->2456|5855->2481|5893->2491|5914->2502|5971->2537|6009->2547|6023->2551|6056->2561|6102->2588|6116->2593|6156->2594|6210->2619|6248->2629|6269->2640|6325->2674|6390->2707|6437->2725|6706->2966|6722->2972|6777->3005|7045->3245|7074->3252|7116->3265|7503->3624|7519->3630|7581->3670
                  LINES: 24->1|29->2|34->2|36->4|41->9|41->9|42->10|44->12|44->12|46->14|46->14|46->14|47->15|55->23|55->23|56->24|56->24|56->24|57->25|63->31|63->31|64->32|64->32|64->32|65->33|71->39|71->39|72->40|72->40|72->40|73->41|75->43|75->43|77->45|77->45|77->45|78->46|80->48|80->48|82->50|82->50|82->50|83->51|84->52|84->52|86->54|86->54|86->54|87->55|90->58|90->58|92->60|95->63|95->63|99->67|99->67|99->67|110->78|110->78|110->78|110->78|111->79|111->79|111->79|115->83|115->83|115->83|115->83|116->84|116->84|116->84|119->87|119->87|119->87|119->87|120->88|120->88|120->88|124->92|124->92|124->92|124->92|125->93|125->93|125->93|132->100|132->100|132->100|132->100|133->101|133->101|133->101|134->102|134->102|134->102|134->102|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|137->105|139->107|146->114|146->114|146->114|159->127|159->127|160->128|176->144|176->144|176->144
                  -- GENERATED --
              */
          