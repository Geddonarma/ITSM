
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

.dropdown """),format.raw/*8.11*/("""{"""),format.raw/*8.12*/("""
  """),format.raw/*9.3*/("""float: left;
  overflow: hidden;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/(""".dropdown .dropbtn """),format.raw/*13.20*/("""{"""),format.raw/*13.21*/("""
  """),format.raw/*14.3*/("""font-size: 17px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
"""),format.raw/*22.1*/("""}"""),format.raw/*22.2*/("""
"""),format.raw/*23.1*/(""".dropdown-content """),format.raw/*23.19*/("""{"""),format.raw/*23.20*/("""
  """),format.raw/*24.3*/("""display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
"""),format.raw/*31.1*/(""".dropdown-content a """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""
  """),format.raw/*32.3*/("""float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
"""),format.raw/*38.1*/("""}"""),format.raw/*38.2*/("""
"""),format.raw/*39.1*/(""".navbar a:hover, .dropdown:hover .dropbtn """),format.raw/*39.43*/("""{"""),format.raw/*39.44*/("""
  """),format.raw/*40.3*/("""background-color: #555;
  color: white;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

"""),format.raw/*44.1*/(""".dropdown-content a:hover """),format.raw/*44.27*/("""{"""),format.raw/*44.28*/("""
  """),format.raw/*45.3*/("""background-color: #ddd;
  color: black;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""

"""),format.raw/*49.1*/(""".dropdown:hover .dropdown-content """),format.raw/*49.35*/("""{"""),format.raw/*49.36*/("""
  """),format.raw/*50.3*/("""display: block;
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""

"""),format.raw/*53.1*/(""".dropdown .dropbtn """),format.raw/*53.20*/("""{"""),format.raw/*53.21*/("""
    """),format.raw/*54.5*/("""display: none;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
  """),format.raw/*56.3*/(""".dropdown """),format.raw/*56.13*/("""{"""),format.raw/*56.14*/("""
      """),format.raw/*57.7*/("""float: none;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/("""
"""),format.raw/*59.1*/(""".dropdown-content """),format.raw/*59.19*/("""{"""),format.raw/*59.20*/("""
    """),format.raw/*60.5*/("""position: relative;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
"""),format.raw/*62.1*/(""".dropdown .dropbtn """),format.raw/*62.20*/("""{"""),format.raw/*62.21*/("""
    """),format.raw/*63.5*/("""display: block;
    width: 100%;
    text-align: left;
  """),format.raw/*66.3*/("""}"""),format.raw/*66.4*/("""

  """),format.raw/*68.3*/("""</style>
<head>
    <meta charset="utf-8">
    <title>Portable Devices- """),_display_(/*71.31*/title),format.raw/*71.36*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*75.18*/routes/*75.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*75.65*/("""" rel="stylesheet" />
</head>
<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">         
            </div>

            <ul class="nav navbar-nav">
                </li>  
                <li """),_display_(/*86.22*/if(title=="Portable Devices" )/*86.52*/{_display_(Seq[Any](format.raw/*86.53*/("""class="active"""")))}),format.raw/*86.68*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*87.53*/routes/*87.59*/.ProductCtrl.listProducts(0)),format.raw/*87.87*/("""">Portable Devices</a>
                </li>  

                <li """),_display_(/*90.22*/if(title=="Products" )/*90.44*/{_display_(Seq[Any](format.raw/*90.45*/("""class="active"""")))}),format.raw/*90.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*91.49*/routes/*91.55*/.ProductCtrl.listProducts(0)),format.raw/*91.83*/("""">Home</a>
                </li>

              <!---- <li """),_display_(/*94.27*/if(title=="About" )/*94.46*/{_display_(Seq[Any](format.raw/*94.47*/("""class="active"""")))}),format.raw/*94.62*/(""">
                    <a href=""""),_display_(/*95.31*/routes/*95.37*/.ProductCtrl.about),format.raw/*95.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*99.26*/if(title=="Contact" )/*99.47*/{_display_(Seq[Any](format.raw/*99.48*/("""class="active"""")))}),format.raw/*99.63*/(""">
                        <a href=""""),_display_(/*100.35*/routes/*100.41*/.ProductCtrl.contact),format.raw/*100.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            
                <li """),_display_(/*105.22*/if(title=="Signup" )/*105.42*/{_display_(Seq[Any](format.raw/*105.43*/("""class="active"""")))}),format.raw/*105.58*/(""">
                    <a href=""""),_display_(/*106.31*/controllers/*106.42*/.security.routes.LoginCtrl.signup),format.raw/*106.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*111.22*/if(title=="Login")/*111.40*/{_display_(Seq[Any](format.raw/*111.41*/("""class="active"""")))}),format.raw/*111.56*/(""">
                    """),_display_(/*112.22*/if(user != null)/*112.38*/ {_display_(Seq[Any](format.raw/*112.40*/("""
                        """),format.raw/*113.25*/("""<a href=""""),_display_(/*113.35*/controllers/*113.46*/.security.routes.LoginCtrl.logout()),format.raw/*113.81*/("""">Logout """),_display_(/*113.91*/user/*113.95*/.getName()),format.raw/*113.105*/("""</a>
                    """)))}/*114.23*/else/*114.28*/{_display_(Seq[Any](format.raw/*114.29*/("""
                        """),format.raw/*115.25*/("""<a href=""""),_display_(/*115.35*/controllers/*115.46*/.security.routes.LoginCtrl.login()),format.raw/*115.80*/("""">Login</a>
                    """)))}),format.raw/*116.22*/("""

                """),format.raw/*118.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*120.31*/routes/*120.37*/.ShoppingCtrl.viewOrders),format.raw/*120.61*/("""">View Orders</a>
                </li>
                <div class="dropdown">
                        <button class="dropbtn">Dropdown Menu<i class="fa fa-caret-down"></i></button>
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*125.37*/routes/*125.43*/.ProductCtrl.listProducts(0)),format.raw/*125.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*126.37*/routes/*126.43*/.ProductCtrl.about),format.raw/*126.61*/("""">About Us</a>
                          <a href=""""),_display_(/*127.37*/routes/*127.43*/.ProductCtrl.contact),format.raw/*127.63*/("""">Contact Us</a>
                          
                        </div>
                      </div>
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
                Copyright
                <strong>Portable Devices Online Store</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*155.19*/routes/*155.25*/.Assets.versioned("javascripts/main.js")),format.raw/*155.65*/(""""></script>
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
                  DATE: Wed Mar 27 10:44:28 GMT 2019
                  SOURCE: /home/wdd/Downloads/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: 258a90b3b519715219eef08f3aeb94bfcccbbe77
                  MATRIX: 970->1|1121->57|1149->59|1229->112|1257->113|1286->116|1346->149|1374->150|1403->152|1450->171|1479->172|1509->175|1692->331|1720->332|1748->333|1794->351|1823->352|1853->355|2028->503|2056->504|2084->505|2132->525|2161->526|2191->529|2332->643|2360->644|2388->645|2458->687|2487->688|2517->691|2584->731|2612->732|2641->734|2695->760|2724->761|2754->764|2821->804|2849->805|2878->807|2940->841|2969->842|2999->845|3042->861|3070->862|3099->864|3146->883|3175->884|3207->889|3249->904|3277->905|3307->908|3345->918|3374->919|3408->926|3448->939|3476->940|3504->941|3550->959|3579->960|3611->965|3658->985|3686->986|3714->987|3761->1006|3790->1007|3822->1012|3906->1069|3934->1070|3965->1074|4065->1147|4091->1152|4303->1337|4318->1343|4380->1384|4677->1654|4716->1684|4755->1685|4801->1700|4882->1754|4897->1760|4946->1788|5042->1857|5073->1879|5112->1880|5158->1895|5235->1945|5250->1951|5299->1979|5386->2039|5414->2058|5453->2059|5499->2074|5558->2106|5573->2112|5612->2130|5723->2214|5753->2235|5792->2236|5838->2251|5902->2287|5918->2293|5960->2313|6103->2428|6133->2448|6173->2449|6220->2464|6280->2496|6301->2507|6356->2540|6445->2601|6473->2619|6513->2620|6560->2635|6611->2658|6637->2674|6678->2676|6732->2701|6770->2711|6791->2722|6848->2757|6886->2767|6900->2771|6933->2781|6979->2808|6993->2813|7033->2814|7087->2839|7125->2849|7146->2860|7202->2894|7267->2927|7314->2945|7399->3002|7415->3008|7461->3032|7762->3305|7778->3311|7828->3339|7918->3401|7934->3407|7974->3425|8053->3476|8069->3482|8111->3502|8373->3736|8402->3743|8444->3756|8771->4055|8787->4061|8849->4101
                  LINES: 28->1|33->1|35->3|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|54->22|54->22|55->23|55->23|55->23|56->24|62->30|62->30|63->31|63->31|63->31|64->32|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|76->44|76->44|76->44|77->45|79->47|79->47|81->49|81->49|81->49|82->50|83->51|83->51|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|91->59|92->60|93->61|93->61|94->62|94->62|94->62|95->63|98->66|98->66|100->68|103->71|103->71|107->75|107->75|107->75|118->86|118->86|118->86|118->86|119->87|119->87|119->87|122->90|122->90|122->90|122->90|123->91|123->91|123->91|126->94|126->94|126->94|126->94|127->95|127->95|127->95|131->99|131->99|131->99|131->99|132->100|132->100|132->100|137->105|137->105|137->105|137->105|138->106|138->106|138->106|143->111|143->111|143->111|143->111|144->112|144->112|144->112|145->113|145->113|145->113|145->113|145->113|145->113|145->113|146->114|146->114|146->114|147->115|147->115|147->115|147->115|148->116|150->118|152->120|152->120|152->120|157->125|157->125|157->125|158->126|158->126|158->126|159->127|159->127|159->127|172->140|172->140|173->141|187->155|187->155|187->155
                  -- GENERATED --
              */
          