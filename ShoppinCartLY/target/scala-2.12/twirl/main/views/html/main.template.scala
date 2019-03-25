
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
    <title>Online store - """),_display_(/*72.28*/title),format.raw/*72.33*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*76.18*/routes/*76.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*76.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                   
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*89.22*/if(title=="Online store" )/*89.48*/{_display_(Seq[Any](format.raw/*89.49*/("""class="active"""")))}),format.raw/*89.64*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*90.53*/routes/*90.59*/.ProductCtrl.listProducts(0)),format.raw/*90.87*/("""">Online Store</a>
                </li>  

                <li """),_display_(/*93.22*/if(title=="Products" )/*93.44*/{_display_(Seq[Any](format.raw/*93.45*/("""class="active"""")))}),format.raw/*93.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*94.49*/routes/*94.55*/.ProductCtrl.listProducts(0)),format.raw/*94.83*/("""">home</a>
                </li>


                <li """),_display_(/*98.22*/if(title=="About" )/*98.41*/{_display_(Seq[Any](format.raw/*98.42*/("""class="active"""")))}),format.raw/*98.57*/(""">
                    <a href=""""),_display_(/*99.31*/routes/*99.37*/.ProductCtrl.about),format.raw/*99.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*103.26*/if(title=="Contact" )/*103.47*/{_display_(Seq[Any](format.raw/*103.48*/("""class="active"""")))}),format.raw/*103.63*/(""">
                        <a href=""""),_display_(/*104.35*/routes/*104.41*/.ProductCtrl.contact),format.raw/*104.61*/("""">Contact us</a>
                    </li>
                </li>

                <li """),_display_(/*108.22*/if(title=="Signup" )/*108.42*/{_display_(Seq[Any](format.raw/*108.43*/("""class="active"""")))}),format.raw/*108.58*/(""">
                    <a href=""""),_display_(/*109.31*/controllers/*109.42*/.security.routes.LoginCtrl.signup),format.raw/*109.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*114.22*/if(title=="Login")/*114.40*/{_display_(Seq[Any](format.raw/*114.41*/("""class="active"""")))}),format.raw/*114.56*/(""">
                    """),_display_(/*115.22*/if(user != null)/*115.38*/ {_display_(Seq[Any](format.raw/*115.40*/("""
                        """),format.raw/*116.25*/("""<a href=""""),_display_(/*116.35*/controllers/*116.46*/.security.routes.LoginCtrl.logout()),format.raw/*116.81*/("""">Logout """),_display_(/*116.91*/user/*116.95*/.getName()),format.raw/*116.105*/("""</a>
                    """)))}/*117.23*/else/*117.28*/{_display_(Seq[Any](format.raw/*117.29*/("""
                        """),format.raw/*118.25*/("""<a href=""""),_display_(/*118.35*/controllers/*118.46*/.security.routes.LoginCtrl.login()),format.raw/*118.80*/("""">Login</a>
                    """)))}),format.raw/*119.22*/("""

                """),format.raw/*121.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*123.31*/routes/*123.37*/.ShoppingCtrl.viewOrders),format.raw/*123.61*/("""">View Orders</a>
                </li>
                <div class="dropdown">
                        <button class="dropbtn">Dropdown Menu<i class="fa fa-caret-down"></i></button>
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*128.37*/routes/*128.43*/.ProductCtrl.listProducts(0)),format.raw/*128.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*129.37*/routes/*129.43*/.ProductCtrl.about),format.raw/*129.61*/("""">About Us</a>
                          <a href=""""),_display_(/*130.37*/routes/*130.43*/.ProductCtrl.contact),format.raw/*130.63*/("""">Contact Us</a>
                          
                        </div>
                      </div>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*143.18*/content),format.raw/*143.25*/("""
            """),format.raw/*144.13*/("""</div>
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
    <script src=""""),_display_(/*158.19*/routes/*158.25*/.Assets.versioned("javascripts/main.js")),format.raw/*158.65*/(""""></script>
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
                  DATE: Mon Mar 25 10:43:50 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: 97a7fa236fb753043ca9c832a319820901a8dd61
                  MATRIX: 970->1|1121->57|1149->59|1229->112|1257->113|1286->116|1346->149|1374->150|1403->152|1450->171|1479->172|1509->175|1692->331|1720->332|1748->333|1794->351|1823->352|1853->355|2028->503|2056->504|2084->505|2132->525|2161->526|2191->529|2332->643|2360->644|2388->645|2458->687|2487->688|2517->691|2584->731|2612->732|2641->734|2695->760|2724->761|2754->764|2821->804|2849->805|2878->807|2940->841|2969->842|2999->845|3042->861|3070->862|3099->864|3146->883|3175->884|3207->889|3249->904|3277->905|3307->908|3345->918|3374->919|3408->926|3448->939|3476->940|3504->941|3550->959|3579->960|3611->965|3658->985|3686->986|3714->987|3761->1006|3790->1007|3822->1012|3906->1069|3934->1070|3965->1074|4063->1145|4089->1150|4301->1335|4316->1341|4378->1382|4664->1641|4699->1667|4738->1668|4784->1683|4865->1737|4880->1743|4929->1771|5021->1836|5052->1858|5091->1859|5137->1874|5214->1924|5229->1930|5278->1958|5361->2014|5389->2033|5428->2034|5474->2049|5533->2081|5548->2087|5587->2105|5699->2189|5730->2210|5770->2211|5817->2226|5881->2262|5897->2268|5939->2288|6054->2375|6084->2395|6124->2396|6171->2411|6231->2443|6252->2454|6307->2487|6396->2548|6424->2566|6464->2567|6511->2582|6562->2605|6588->2621|6629->2623|6683->2648|6721->2658|6742->2669|6799->2704|6837->2714|6851->2718|6884->2728|6930->2755|6944->2760|6984->2761|7038->2786|7076->2796|7097->2807|7153->2841|7218->2874|7265->2892|7350->2949|7366->2955|7412->2979|7713->3252|7729->3258|7779->3286|7869->3348|7885->3354|7925->3372|8004->3423|8020->3429|8062->3449|8324->3683|8353->3690|8395->3703|8714->3994|8730->4000|8792->4040
                  LINES: 28->1|33->1|35->3|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|54->22|54->22|55->23|55->23|55->23|56->24|62->30|62->30|63->31|63->31|63->31|64->32|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|76->44|76->44|76->44|77->45|79->47|79->47|81->49|81->49|81->49|82->50|83->51|83->51|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|91->59|92->60|93->61|93->61|94->62|94->62|94->62|95->63|98->66|98->66|100->68|104->72|104->72|108->76|108->76|108->76|121->89|121->89|121->89|121->89|122->90|122->90|122->90|125->93|125->93|125->93|125->93|126->94|126->94|126->94|130->98|130->98|130->98|130->98|131->99|131->99|131->99|135->103|135->103|135->103|135->103|136->104|136->104|136->104|140->108|140->108|140->108|140->108|141->109|141->109|141->109|146->114|146->114|146->114|146->114|147->115|147->115|147->115|148->116|148->116|148->116|148->116|148->116|148->116|148->116|149->117|149->117|149->117|150->118|150->118|150->118|150->118|151->119|153->121|155->123|155->123|155->123|160->128|160->128|160->128|161->129|161->129|161->129|162->130|162->130|162->130|175->143|175->143|176->144|190->158|190->158|190->158
                  -- GENERATED --
              */
          