
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
<style>
.dropdown """),format.raw/*7.11*/("""{"""),format.raw/*7.12*/("""
  """),format.raw/*8.3*/("""position: relative;
  display: inline-block;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

"""),format.raw/*12.1*/(""".dropdown-content """),format.raw/*12.19*/("""{"""),format.raw/*12.20*/("""
  """),format.raw/*13.3*/("""display: none;
  position: absolute;
  background-color: #f1f1f1;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
"""),format.raw/*19.1*/("""}"""),format.raw/*19.2*/("""

"""),format.raw/*21.1*/(""".dropdown-content a """),format.raw/*21.21*/("""{"""),format.raw/*21.22*/("""
  """),format.raw/*22.3*/("""color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;

"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/(""" 
"""),format.raw/*28.1*/(""".dropdown-content a:hover """),format.raw/*28.27*/("""{"""),format.raw/*28.28*/("""background-color: #ddd;"""),format.raw/*28.51*/("""}"""),format.raw/*28.52*/("""

"""),format.raw/*30.1*/(""".dropdown:hover .dropdown-content """),format.raw/*30.35*/("""{"""),format.raw/*30.36*/("""display: block;"""),format.raw/*30.51*/("""}"""),format.raw/*30.52*/("""

"""),format.raw/*32.1*/(""".dropdown:hover .dropbtn """),format.raw/*32.26*/("""{"""),format.raw/*32.27*/("""background-color: #3e8e41;"""),format.raw/*32.53*/("""}"""),format.raw/*32.54*/("""

  """),format.raw/*34.3*/("""</style>

<head>
    <meta charset="utf-8">
    <title>Online store - """),_display_(/*38.28*/title),format.raw/*38.33*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*42.18*/routes/*42.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*42.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                   
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*55.22*/if(title=="Online store" )/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""class="active"""")))}),format.raw/*55.64*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*56.53*/routes/*56.59*/.ProductCtrl.listProducts(0)),format.raw/*56.87*/("""">Online Store</a>
                </li>  

                <li """),_display_(/*59.22*/if(title=="Products" )/*59.44*/{_display_(Seq[Any](format.raw/*59.45*/("""class="active"""")))}),format.raw/*59.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*60.49*/routes/*60.55*/.ProductCtrl.listProducts(0)),format.raw/*60.83*/("""">home</a>
                </li>

                <div class="dropdown">
                    <button class="dropbtn">Menu</button>
                    <div class="dropdown-content">
                      <a href=""""),_display_(/*66.33*/routes/*66.39*/.ProductCtrl.listProducts(0)),format.raw/*66.67*/("""">Search for Products</a>
                      <a href=""""),_display_(/*67.33*/routes/*67.39*/.ProductCtrl.about),format.raw/*67.57*/("""">About Us</a>
                      <a href="#">Contact Us</a>
                      
                    </div>
                  </div>

                <li """),_display_(/*73.22*/if(title=="About" )/*73.41*/{_display_(Seq[Any](format.raw/*73.42*/("""class="active"""")))}),format.raw/*73.57*/(""">
                    <a href=""""),_display_(/*74.31*/routes/*74.37*/.ProductCtrl.about),format.raw/*74.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*78.26*/if(title=="Contact" )/*78.47*/{_display_(Seq[Any](format.raw/*78.48*/("""class="active"""")))}),format.raw/*78.63*/(""">
                        <a href=""""),_display_(/*79.35*/routes/*79.41*/.ProductCtrl.contact),format.raw/*79.61*/("""">Contact us</a>
                    </li>
                </li>
                <li """),_display_(/*82.22*/if(title=="Login")/*82.40*/{_display_(Seq[Any](format.raw/*82.41*/("""class="active"""")))}),format.raw/*82.56*/(""">
                    """),_display_(/*83.22*/if(user != null)/*83.38*/ {_display_(Seq[Any](format.raw/*83.40*/("""
                        """),format.raw/*84.25*/("""<a href=""""),_display_(/*84.35*/controllers/*84.46*/.security.routes.LoginCtrl.logout()),format.raw/*84.81*/("""">Logout """),_display_(/*84.91*/user/*84.95*/.getName()),format.raw/*84.105*/("""</a>
                    """)))}/*85.23*/else/*85.28*/{_display_(Seq[Any](format.raw/*85.29*/("""
                        """),format.raw/*86.25*/("""<a href=""""),_display_(/*86.35*/controllers/*86.46*/.security.routes.LoginCtrl.login()),format.raw/*86.80*/("""">Login</a>
                    """)))}),format.raw/*87.22*/("""

                """),format.raw/*89.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*91.31*/routes/*91.37*/.ShoppingCtrl.viewOrders),format.raw/*91.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*102.18*/content),format.raw/*102.25*/("""
            """),format.raw/*103.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Portable Devices Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*117.19*/routes/*117.25*/.Assets.versioned("javascripts/main.js")),format.raw/*117.65*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 11:49:01 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: b213cf077cee8f4e76d7e590aa630e01d743acbe
                  MATRIX: 970->1|1121->57|1149->59|1228->111|1256->112|1285->115|1357->160|1385->161|1414->163|1460->181|1489->182|1519->185|1694->333|1722->334|1751->336|1799->356|1828->357|1858->360|1965->440|1993->441|2022->443|2076->469|2105->470|2156->493|2185->494|2214->496|2276->530|2305->531|2348->546|2377->547|2406->549|2459->574|2488->575|2542->601|2571->602|2602->606|2700->677|2726->682|2938->867|2953->873|3015->914|3301->1173|3336->1199|3375->1200|3421->1215|3502->1269|3517->1275|3566->1303|3658->1368|3689->1390|3728->1391|3774->1406|3851->1456|3866->1462|3915->1490|4156->1704|4171->1710|4220->1738|4305->1796|4320->1802|4359->1820|4547->1981|4575->2000|4614->2001|4660->2016|4719->2048|4734->2054|4773->2072|4884->2156|4914->2177|4953->2178|4999->2193|5062->2229|5077->2235|5118->2255|5231->2341|5258->2359|5297->2360|5343->2375|5393->2398|5418->2414|5458->2416|5511->2441|5548->2451|5568->2462|5624->2497|5661->2507|5674->2511|5706->2521|5751->2548|5764->2553|5803->2554|5856->2579|5893->2589|5913->2600|5968->2634|6032->2667|6078->2685|6162->2742|6177->2748|6222->2772|6420->2942|6449->2949|6491->2962|6810->3253|6826->3259|6888->3299
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|42->10|42->10|44->12|44->12|44->12|45->13|51->19|51->19|53->21|53->21|53->21|54->22|59->27|59->27|60->28|60->28|60->28|60->28|60->28|62->30|62->30|62->30|62->30|62->30|64->32|64->32|64->32|64->32|64->32|66->34|70->38|70->38|74->42|74->42|74->42|87->55|87->55|87->55|87->55|88->56|88->56|88->56|91->59|91->59|91->59|91->59|92->60|92->60|92->60|98->66|98->66|98->66|99->67|99->67|99->67|105->73|105->73|105->73|105->73|106->74|106->74|106->74|110->78|110->78|110->78|110->78|111->79|111->79|111->79|114->82|114->82|114->82|114->82|115->83|115->83|115->83|116->84|116->84|116->84|116->84|116->84|116->84|116->84|117->85|117->85|117->85|118->86|118->86|118->86|118->86|119->87|121->89|123->91|123->91|123->91|134->102|134->102|135->103|149->117|149->117|149->117
                  -- GENERATED --
              */
          