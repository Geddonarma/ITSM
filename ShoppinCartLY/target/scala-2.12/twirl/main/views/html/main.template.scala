
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
  """),format.raw/*8.3*/("""float: left;
  overflow: hidden;
"""),format.raw/*10.1*/("""}"""),format.raw/*10.2*/("""

"""),format.raw/*12.1*/(""".dropdown .dropbtn """),format.raw/*12.20*/("""{"""),format.raw/*12.21*/("""
  """),format.raw/*13.3*/("""font-size: 16px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""

"""),format.raw/*23.1*/(""".navbar a:hover, .dropdown:hover .dropbtn """),format.raw/*23.43*/("""{"""),format.raw/*23.44*/("""
  """),format.raw/*24.3*/("""background-color: red;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

"""),format.raw/*27.1*/(""".dropdown-content """),format.raw/*27.19*/("""{"""),format.raw/*27.20*/("""
  """),format.raw/*28.3*/("""display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""

"""),format.raw/*36.1*/(""".dropdown-content a """),format.raw/*36.21*/("""{"""),format.raw/*36.22*/("""
  """),format.raw/*37.3*/("""float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
"""),format.raw/*43.1*/("""}"""),format.raw/*43.2*/("""

"""),format.raw/*45.1*/(""".dropdown-content a:hover """),format.raw/*45.27*/("""{"""),format.raw/*45.28*/("""
  """),format.raw/*46.3*/("""background-color: #ddd;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""



  """),format.raw/*51.3*/("""</style>

<head>
    <meta charset="utf-8">
    <title>Online store - """),_display_(/*55.28*/title),format.raw/*55.33*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*59.18*/routes/*59.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*59.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                   
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*72.22*/if(title=="Online store" )/*72.48*/{_display_(Seq[Any](format.raw/*72.49*/("""class="active"""")))}),format.raw/*72.64*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*73.53*/routes/*73.59*/.ProductCtrl.listProducts(0)),format.raw/*73.87*/("""">Online Store</a>
                </li>  

                <li """),_display_(/*76.22*/if(title=="Products" )/*76.44*/{_display_(Seq[Any](format.raw/*76.45*/("""class="active"""")))}),format.raw/*76.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*77.49*/routes/*77.55*/.ProductCtrl.listProducts(0)),format.raw/*77.83*/("""">home</a>
                </li>

                <div class="dropdown">
                    <button class="dropbtn">DropDown Menu</button>
                    <div class="dropdown-content">
                      <a href=""""),_display_(/*83.33*/routes/*83.39*/.ProductCtrl.listProducts(0)),format.raw/*83.67*/("""">Search for Products</a>
                      <a href=""""),_display_(/*84.33*/routes/*84.39*/.ProductCtrl.about),format.raw/*84.57*/("""">About Us</a>
                      <a href=""""),_display_(/*85.33*/routes/*85.39*/.ProductCtrl.contact),format.raw/*85.59*/("""">Contact Us</a>
                      
                    </div>
                  </div>

                <li """),_display_(/*90.22*/if(title=="About" )/*90.41*/{_display_(Seq[Any](format.raw/*90.42*/("""class="active"""")))}),format.raw/*90.57*/(""">
                    <a href=""""),_display_(/*91.31*/routes/*91.37*/.ProductCtrl.about),format.raw/*91.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*95.26*/if(title=="Contact" )/*95.47*/{_display_(Seq[Any](format.raw/*95.48*/("""class="active"""")))}),format.raw/*95.63*/(""">
                        <a href=""""),_display_(/*96.35*/routes/*96.41*/.ProductCtrl.contact),format.raw/*96.61*/("""">Contact us</a>
                    </li>
                </li>

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
                    <a href=""""),_display_(/*115.31*/routes/*115.37*/.ShoppingCtrl.viewOrders),format.raw/*115.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*126.18*/content),format.raw/*126.25*/("""
            """),format.raw/*127.13*/("""</div>
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
    <script src=""""),_display_(/*141.19*/routes/*141.25*/.Assets.versioned("javascripts/main.js")),format.raw/*141.65*/(""""></script>
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
                  DATE: Fri Mar 22 15:20:21 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: e56a424e5165fcbd13df69d645ae930e4309b5da
                  MATRIX: 970->1|1121->57|1149->59|1228->111|1256->112|1285->115|1345->148|1373->149|1402->151|1449->170|1478->171|1508->174|1691->330|1719->331|1748->333|1818->375|1847->376|1877->379|1927->402|1955->403|1984->405|2030->423|2059->424|2089->427|2264->575|2292->576|2321->578|2369->598|2398->599|2428->602|2569->716|2597->717|2626->719|2680->745|2709->746|2739->749|2790->773|2818->774|2851->780|2949->851|2975->856|3187->1041|3202->1047|3264->1088|3550->1347|3585->1373|3624->1374|3670->1389|3751->1443|3766->1449|3815->1477|3907->1542|3938->1564|3977->1565|4023->1580|4100->1630|4115->1636|4164->1664|4414->1887|4429->1893|4478->1921|4563->1979|4578->1985|4617->2003|4691->2050|4706->2056|4747->2076|4888->2190|4916->2209|4955->2210|5001->2225|5060->2257|5075->2263|5114->2281|5225->2365|5255->2386|5294->2387|5340->2402|5403->2438|5418->2444|5459->2464|5574->2551|5604->2571|5644->2572|5691->2587|5751->2619|5772->2630|5827->2663|5916->2724|5944->2742|5984->2743|6031->2758|6082->2781|6108->2797|6149->2799|6203->2824|6241->2834|6262->2845|6319->2880|6357->2890|6371->2894|6404->2904|6450->2931|6464->2936|6504->2937|6558->2962|6596->2972|6617->2983|6673->3017|6738->3050|6785->3068|6870->3125|6886->3131|6932->3155|7130->3325|7159->3332|7201->3345|7520->3636|7536->3642|7598->3682
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|42->10|42->10|44->12|44->12|44->12|45->13|53->21|53->21|55->23|55->23|55->23|56->24|57->25|57->25|59->27|59->27|59->27|60->28|66->34|66->34|68->36|68->36|68->36|69->37|75->43|75->43|77->45|77->45|77->45|78->46|79->47|79->47|83->51|87->55|87->55|91->59|91->59|91->59|104->72|104->72|104->72|104->72|105->73|105->73|105->73|108->76|108->76|108->76|108->76|109->77|109->77|109->77|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|122->90|122->90|122->90|122->90|123->91|123->91|123->91|127->95|127->95|127->95|127->95|128->96|128->96|128->96|132->100|132->100|132->100|132->100|133->101|133->101|133->101|138->106|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|143->111|145->113|147->115|147->115|147->115|158->126|158->126|159->127|173->141|173->141|173->141
                  -- GENERATED --
              */
          