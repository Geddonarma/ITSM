
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

.dropdown .nav"""),format.raw/*8.15*/("""{"""),format.raw/*8.16*/("""
  """),format.raw/*9.3*/("""float: none;
  overflow: hidden;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/(""".dropdown .dropbtn"""),format.raw/*13.19*/("""{"""),format.raw/*13.20*/("""
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
  background-color: #c2eff5;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(45, 138, 167, 0.377);
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
  """),format.raw/*40.3*/("""background-color: rgba(45, 45, 48, 0.979);
  color: white;
"""),format.raw/*42.1*/("""}"""),format.raw/*42.2*/("""

"""),format.raw/*44.1*/(""".dropdown-content a:hover """),format.raw/*44.27*/("""{"""),format.raw/*44.28*/("""
  """),format.raw/*45.3*/("""background-color: rgb(174, 205, 212);
  color: black;
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""

"""),format.raw/*49.1*/(""".dropdown:hover .dropdown-content """),format.raw/*49.35*/("""{"""),format.raw/*49.36*/("""
  """),format.raw/*50.3*/("""display: block;
"""),format.raw/*51.1*/("""}"""),format.raw/*51.2*/("""

"""),format.raw/*53.1*/(""".dropdown .dropbtn """),format.raw/*53.20*/("""{"""),format.raw/*53.21*/("""
    """),format.raw/*54.5*/("""display: block;
    width: 100%;
    text-align: left;
  """),format.raw/*57.3*/("""}"""),format.raw/*57.4*/("""

  """),format.raw/*59.3*/("""</style>
<head>
    <meta charset="utf-8">
    <title>Portable Devices- """),_display_(/*62.31*/title),format.raw/*62.36*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*66.18*/routes/*66.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*66.65*/("""" rel="stylesheet" />
</head>
<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">         
            </div>

            <ul class="nav navbar-nav">
                </li>  
                <li """),_display_(/*77.22*/if(title=="Portable Devices" )/*77.52*/{_display_(Seq[Any](format.raw/*77.53*/("""class="active"""")))}),format.raw/*77.68*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*78.53*/routes/*78.59*/.ProductCtrl.listProducts(0)),format.raw/*78.87*/("""">Portable Devices</a>
                </li>  
                <li """),_display_(/*80.22*/if(title=="Home" )/*80.40*/{_display_(Seq[Any](format.raw/*80.41*/("""class="active"""")))}),format.raw/*80.56*/(""">
                        <a class="navbar-brand" href=""""),_display_(/*81.56*/routes/*81.62*/.ProductCtrl.index()),format.raw/*81.82*/("""">Home</a>
                       </li>

                <li """),_display_(/*84.22*/if(title=="Products" )/*84.44*/{_display_(Seq[Any](format.raw/*84.45*/("""class="active"""")))}),format.raw/*84.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*85.49*/routes/*85.55*/.ProductCtrl.listProducts(0)),format.raw/*85.83*/("""">Products</a>
                </li>

              <!---- <li """),_display_(/*88.27*/if(title=="About" )/*88.46*/{_display_(Seq[Any](format.raw/*88.47*/("""class="active"""")))}),format.raw/*88.62*/(""">
                    <a href=""""),_display_(/*89.31*/routes/*89.37*/.ProductCtrl.about),format.raw/*89.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*93.26*/if(title=="Contact" )/*93.47*/{_display_(Seq[Any](format.raw/*93.48*/("""class="active"""")))}),format.raw/*93.63*/(""">
                        <a href=""""),_display_(/*94.35*/routes/*94.41*/.ProductCtrl.contact),format.raw/*94.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            
                <li """),_display_(/*99.22*/if(title=="Signup" )/*99.42*/{_display_(Seq[Any](format.raw/*99.43*/("""class="active"""")))}),format.raw/*99.58*/(""">
                    <a href=""""),_display_(/*100.31*/controllers/*100.42*/.security.routes.LoginCtrl.signup),format.raw/*100.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*105.22*/if(title=="Login")/*105.40*/{_display_(Seq[Any](format.raw/*105.41*/("""class="active"""")))}),format.raw/*105.56*/(""">
                    """),_display_(/*106.22*/if(user != null)/*106.38*/ {_display_(Seq[Any](format.raw/*106.40*/("""
                        """),format.raw/*107.25*/("""<a href=""""),_display_(/*107.35*/controllers/*107.46*/.security.routes.LoginCtrl.logout()),format.raw/*107.81*/("""">Logout """),_display_(/*107.91*/user/*107.95*/.getName()),format.raw/*107.105*/("""</a>
                    """)))}/*108.23*/else/*108.28*/{_display_(Seq[Any](format.raw/*108.29*/("""
                        """),format.raw/*109.25*/("""<a href=""""),_display_(/*109.35*/controllers/*109.46*/.security.routes.LoginCtrl.login()),format.raw/*109.80*/("""">Login</a>
                    """)))}),format.raw/*110.22*/("""

                """),format.raw/*112.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*114.31*/routes/*114.37*/.ShoppingCtrl.viewOrders),format.raw/*114.61*/("""">View Orders</a>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown Menu</a>                        <div class="dropdown-content">
                          <a href=""""),_display_(/*118.37*/routes/*118.43*/.ProductCtrl.listProducts(0)),format.raw/*118.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*119.37*/routes/*119.43*/.ProductCtrl.about),format.raw/*119.61*/("""">About Us</a>
                          <a href=""""),_display_(/*120.37*/routes/*120.43*/.ProductCtrl.contact),format.raw/*120.63*/("""">Contact Us</a>
                          
                        </div>
                    </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*133.18*/content),format.raw/*133.25*/("""
            """),format.raw/*134.13*/("""</div>
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
    <script src=""""),_display_(/*148.19*/routes/*148.25*/.Assets.versioned("javascripts/main.js")),format.raw/*148.65*/(""""></script>
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
                  DATE: Thu Apr 04 14:23:54 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: d0cb30cdf22f9a754463c9a8c89095d426d72f53
                  MATRIX: 970->1|1121->57|1149->59|1233->116|1261->117|1290->120|1350->153|1378->154|1407->156|1453->174|1482->175|1512->178|1695->334|1723->335|1751->336|1797->354|1826->355|1856->358|2041->516|2069->517|2097->518|2145->538|2174->539|2204->542|2345->656|2373->657|2401->658|2471->700|2500->701|2530->704|2616->763|2644->764|2673->766|2727->792|2756->793|2786->796|2867->850|2895->851|2924->853|2986->887|3015->888|3045->891|3088->907|3116->908|3145->910|3192->929|3221->930|3253->935|3337->992|3365->993|3396->997|3496->1070|3522->1075|3734->1260|3749->1266|3811->1307|4108->1577|4147->1607|4186->1608|4232->1623|4313->1677|4328->1683|4377->1711|4472->1779|4499->1797|4538->1798|4584->1813|4668->1870|4683->1876|4724->1896|4813->1958|4844->1980|4883->1981|4929->1996|5006->2046|5021->2052|5070->2080|5161->2144|5189->2163|5228->2164|5274->2179|5333->2211|5348->2217|5387->2235|5498->2319|5528->2340|5567->2341|5613->2356|5676->2392|5691->2398|5732->2418|5874->2533|5903->2553|5942->2554|5988->2569|6048->2601|6069->2612|6124->2645|6213->2706|6241->2724|6281->2725|6328->2740|6379->2763|6405->2779|6446->2781|6500->2806|6538->2816|6559->2827|6616->2862|6654->2872|6668->2876|6701->2886|6747->2913|6761->2918|6801->2919|6855->2944|6893->2954|6914->2965|6970->2999|7035->3032|7082->3050|7167->3107|7183->3113|7229->3137|7508->3388|7524->3394|7574->3422|7664->3484|7680->3490|7720->3508|7799->3559|7815->3565|7857->3585|8116->3816|8145->3823|8187->3836|8514->4135|8530->4141|8592->4181
                  LINES: 28->1|33->1|35->3|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|54->22|54->22|55->23|55->23|55->23|56->24|62->30|62->30|63->31|63->31|63->31|64->32|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|76->44|76->44|76->44|77->45|79->47|79->47|81->49|81->49|81->49|82->50|83->51|83->51|85->53|85->53|85->53|86->54|89->57|89->57|91->59|94->62|94->62|98->66|98->66|98->66|109->77|109->77|109->77|109->77|110->78|110->78|110->78|112->80|112->80|112->80|112->80|113->81|113->81|113->81|116->84|116->84|116->84|116->84|117->85|117->85|117->85|120->88|120->88|120->88|120->88|121->89|121->89|121->89|125->93|125->93|125->93|125->93|126->94|126->94|126->94|131->99|131->99|131->99|131->99|132->100|132->100|132->100|137->105|137->105|137->105|137->105|138->106|138->106|138->106|139->107|139->107|139->107|139->107|139->107|139->107|139->107|140->108|140->108|140->108|141->109|141->109|141->109|141->109|142->110|144->112|146->114|146->114|146->114|150->118|150->118|150->118|151->119|151->119|151->119|152->120|152->120|152->120|165->133|165->133|166->134|180->148|180->148|180->148
                  -- GENERATED --
              */
          