
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
                  DATE: Sat Mar 23 00:36:02 GMT 2019
                  SOURCE: D:/steph/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: f24c74cbc697fe9678aeac224f8b8dd79209faff
                  MATRIX: 970->1|1121->57|1151->61|1234->117|1262->118|1292->122|1354->157|1382->158|1413->162|1460->181|1489->182|1520->186|1711->350|1739->351|1770->355|1840->397|1869->398|1900->402|1951->426|1979->427|2010->431|2056->449|2085->450|2116->454|2297->608|2325->609|2356->613|2404->633|2433->634|2464->638|2611->758|2639->759|2670->763|2724->789|2753->790|2784->794|2836->819|2864->820|2901->830|3003->905|3029->910|3245->1099|3260->1105|3322->1146|3621->1418|3656->1444|3695->1445|3741->1460|3823->1515|3838->1521|3887->1549|3982->1617|4013->1639|4052->1640|4098->1655|4176->1706|4191->1712|4240->1740|4496->1969|4511->1975|4560->2003|4646->2062|4661->2068|4700->2086|4775->2134|4790->2140|4831->2160|4977->2279|5005->2298|5044->2299|5090->2314|5150->2347|5165->2353|5204->2371|5319->2459|5349->2480|5388->2481|5434->2496|5498->2533|5513->2539|5554->2559|5673->2650|5703->2670|5743->2671|5790->2686|5851->2719|5872->2730|5927->2763|6021->2829|6049->2847|6089->2848|6136->2863|6188->2887|6214->2903|6255->2905|6310->2931|6348->2941|6369->2952|6426->2987|6464->2997|6478->3001|6511->3011|6558->3039|6572->3044|6612->3045|6667->3071|6705->3081|6726->3092|6782->3126|6848->3160|6897->3180|6984->3239|7000->3245|7046->3269|7255->3450|7284->3457|7327->3471|7660->3776|7676->3782|7738->3822
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|42->10|42->10|44->12|44->12|44->12|45->13|53->21|53->21|55->23|55->23|55->23|56->24|57->25|57->25|59->27|59->27|59->27|60->28|66->34|66->34|68->36|68->36|68->36|69->37|75->43|75->43|77->45|77->45|77->45|78->46|79->47|79->47|83->51|87->55|87->55|91->59|91->59|91->59|104->72|104->72|104->72|104->72|105->73|105->73|105->73|108->76|108->76|108->76|108->76|109->77|109->77|109->77|115->83|115->83|115->83|116->84|116->84|116->84|117->85|117->85|117->85|122->90|122->90|122->90|122->90|123->91|123->91|123->91|127->95|127->95|127->95|127->95|128->96|128->96|128->96|132->100|132->100|132->100|132->100|133->101|133->101|133->101|138->106|138->106|138->106|138->106|139->107|139->107|139->107|140->108|140->108|140->108|140->108|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|143->111|145->113|147->115|147->115|147->115|158->126|158->126|159->127|173->141|173->141|173->141
                  -- GENERATED --
              */
          