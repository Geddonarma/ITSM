
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

  """),format.raw/*49.3*/("""</style>

<head>
    <meta charset="utf-8">
    <title>Online store - """),_display_(/*53.28*/title),format.raw/*53.33*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*57.18*/routes/*57.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*57.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                   
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*70.22*/if(title=="Online store" )/*70.48*/{_display_(Seq[Any](format.raw/*70.49*/("""class="active"""")))}),format.raw/*70.64*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*71.53*/routes/*71.59*/.ProductCtrl.listProducts(0)),format.raw/*71.87*/("""">Online Store</a>
                </li>  

                <li """),_display_(/*74.22*/if(title=="Products" )/*74.44*/{_display_(Seq[Any](format.raw/*74.45*/("""class="active"""")))}),format.raw/*74.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*75.49*/routes/*75.55*/.ProductCtrl.listProducts(0)),format.raw/*75.83*/("""">home</a>
                </li>

                <div class="dropdown">
                    <button class="dropbtn">DropDown Menu</button>
                    <div class="dropdown-content">
                      <a href=""""),_display_(/*81.33*/routes/*81.39*/.ProductCtrl.listProducts(0)),format.raw/*81.67*/("""">Search for Products</a>
                      <a href=""""),_display_(/*82.33*/routes/*82.39*/.ProductCtrl.about),format.raw/*82.57*/("""">About Us</a>
                      <a href=""""),_display_(/*83.33*/routes/*83.39*/.ProductCtrl.contact),format.raw/*83.59*/("""">Contact Us</a>
                      
                    </div>
                  </div>

                <li """),_display_(/*88.22*/if(title=="About" )/*88.41*/{_display_(Seq[Any](format.raw/*88.42*/("""class="active"""")))}),format.raw/*88.57*/(""">
                    <a href=""""),_display_(/*89.31*/routes/*89.37*/.ProductCtrl.about),format.raw/*89.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*93.26*/if(title=="Contact" )/*93.47*/{_display_(Seq[Any](format.raw/*93.48*/("""class="active"""")))}),format.raw/*93.63*/(""">
                        <a href=""""),_display_(/*94.35*/routes/*94.41*/.ProductCtrl.contact),format.raw/*94.61*/("""">Contact us</a>
                    </li>
                </li>
                <li """),_display_(/*97.22*/if(title=="Signup" )/*97.42*/{_display_(Seq[Any](format.raw/*97.43*/("""class="active"""")))}),format.raw/*97.58*/(""">
                    <a href=""""),_display_(/*98.31*/routes/*98.37*/.ProductCtrl.signup),format.raw/*98.56*/("""">Sign Up</a>
                </li>
                <li """),_display_(/*100.22*/if(title=="Login")/*100.40*/{_display_(Seq[Any](format.raw/*100.41*/("""class="active"""")))}),format.raw/*100.56*/(""">
                    """),_display_(/*101.22*/if(user != null)/*101.38*/ {_display_(Seq[Any](format.raw/*101.40*/("""
                        """),format.raw/*102.25*/("""<a href=""""),_display_(/*102.35*/controllers/*102.46*/.security.routes.LoginCtrl.logout()),format.raw/*102.81*/("""">Logout """),_display_(/*102.91*/user/*102.95*/.getName()),format.raw/*102.105*/("""</a>
                    """)))}/*103.23*/else/*103.28*/{_display_(Seq[Any](format.raw/*103.29*/("""
                        """),format.raw/*104.25*/("""<a href=""""),_display_(/*104.35*/controllers/*104.46*/.security.routes.LoginCtrl.login()),format.raw/*104.80*/("""">Login</a>
                    """)))}),format.raw/*105.22*/("""

                """),format.raw/*107.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*109.31*/routes/*109.37*/.ShoppingCtrl.viewOrders),format.raw/*109.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*120.18*/content),format.raw/*120.25*/("""
            """),format.raw/*121.13*/("""</div>
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
    <script src=""""),_display_(/*135.19*/routes/*135.25*/.Assets.versioned("javascripts/main.js")),format.raw/*135.65*/(""""></script>
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
                  DATE: Fri Mar 22 11:13:02 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: 97d818fc65805f784cad77ed99506d5447379f13
                  MATRIX: 970->1|1121->57|1149->59|1228->111|1256->112|1285->115|1345->148|1373->149|1402->151|1449->170|1478->171|1508->174|1691->330|1719->331|1748->333|1818->375|1847->376|1877->379|1927->402|1955->403|1984->405|2030->423|2059->424|2089->427|2264->575|2292->576|2321->578|2369->598|2398->599|2428->602|2569->716|2597->717|2626->719|2680->745|2709->746|2739->749|2790->773|2818->774|2849->778|2947->849|2973->854|3185->1039|3200->1045|3262->1086|3548->1345|3583->1371|3622->1372|3668->1387|3749->1441|3764->1447|3813->1475|3905->1540|3936->1562|3975->1563|4021->1578|4098->1628|4113->1634|4162->1662|4412->1885|4427->1891|4476->1919|4561->1977|4576->1983|4615->2001|4689->2048|4704->2054|4745->2074|4886->2188|4914->2207|4953->2208|4999->2223|5058->2255|5073->2261|5112->2279|5223->2363|5253->2384|5292->2385|5338->2400|5401->2436|5416->2442|5457->2462|5570->2548|5599->2568|5638->2569|5684->2584|5743->2616|5758->2622|5798->2641|5883->2698|5911->2716|5951->2717|5998->2732|6049->2755|6075->2771|6116->2773|6170->2798|6208->2808|6229->2819|6286->2854|6324->2864|6338->2868|6371->2878|6417->2905|6431->2910|6471->2911|6525->2936|6563->2946|6584->2957|6640->2991|6705->3024|6752->3042|6837->3099|6853->3105|6899->3129|7097->3299|7126->3306|7168->3319|7487->3610|7503->3616|7565->3656
                  LINES: 28->1|33->1|35->3|39->7|39->7|40->8|42->10|42->10|44->12|44->12|44->12|45->13|53->21|53->21|55->23|55->23|55->23|56->24|57->25|57->25|59->27|59->27|59->27|60->28|66->34|66->34|68->36|68->36|68->36|69->37|75->43|75->43|77->45|77->45|77->45|78->46|79->47|79->47|81->49|85->53|85->53|89->57|89->57|89->57|102->70|102->70|102->70|102->70|103->71|103->71|103->71|106->74|106->74|106->74|106->74|107->75|107->75|107->75|113->81|113->81|113->81|114->82|114->82|114->82|115->83|115->83|115->83|120->88|120->88|120->88|120->88|121->89|121->89|121->89|125->93|125->93|125->93|125->93|126->94|126->94|126->94|129->97|129->97|129->97|129->97|130->98|130->98|130->98|132->100|132->100|132->100|132->100|133->101|133->101|133->101|134->102|134->102|134->102|134->102|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|137->105|139->107|141->109|141->109|141->109|152->120|152->120|153->121|167->135|167->135|167->135
                  -- GENERATED --
              */
          