
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

                <li """),_display_(/*81.22*/if(title=="Products" )/*81.44*/{_display_(Seq[Any](format.raw/*81.45*/("""class="active"""")))}),format.raw/*81.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*82.49*/routes/*82.55*/.ProductCtrl.listProducts(0)),format.raw/*82.83*/("""">Home</a>
                </li>

              <!---- <li """),_display_(/*85.27*/if(title=="About" )/*85.46*/{_display_(Seq[Any](format.raw/*85.47*/("""class="active"""")))}),format.raw/*85.62*/(""">
                    <a href=""""),_display_(/*86.31*/routes/*86.37*/.ProductCtrl.about),format.raw/*86.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*90.26*/if(title=="Contact" )/*90.47*/{_display_(Seq[Any](format.raw/*90.48*/("""class="active"""")))}),format.raw/*90.63*/(""">
                        <a href=""""),_display_(/*91.35*/routes/*91.41*/.ProductCtrl.contact),format.raw/*91.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            
                <li """),_display_(/*96.22*/if(title=="Signup" )/*96.42*/{_display_(Seq[Any](format.raw/*96.43*/("""class="active"""")))}),format.raw/*96.58*/(""">
                    <a href=""""),_display_(/*97.31*/controllers/*97.42*/.security.routes.LoginCtrl.signup),format.raw/*97.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*102.22*/if(title=="Login")/*102.40*/{_display_(Seq[Any](format.raw/*102.41*/("""class="active"""")))}),format.raw/*102.56*/(""">
                    """),_display_(/*103.22*/if(user != null)/*103.38*/ {_display_(Seq[Any](format.raw/*103.40*/("""
                        """),format.raw/*104.25*/("""<a href=""""),_display_(/*104.35*/controllers/*104.46*/.security.routes.LoginCtrl.logout()),format.raw/*104.81*/("""">Logout """),_display_(/*104.91*/user/*104.95*/.getName()),format.raw/*104.105*/("""</a>
                    """)))}/*105.23*/else/*105.28*/{_display_(Seq[Any](format.raw/*105.29*/("""
                        """),format.raw/*106.25*/("""<a href=""""),_display_(/*106.35*/controllers/*106.46*/.security.routes.LoginCtrl.login()),format.raw/*106.80*/("""">Login</a>
                    """)))}),format.raw/*107.22*/("""

                """),format.raw/*109.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*111.31*/routes/*111.37*/.ShoppingCtrl.viewOrders),format.raw/*111.61*/("""">View Orders</a>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown Menu</a>                        <div class="dropdown-content">
                          <a href=""""),_display_(/*115.37*/routes/*115.43*/.ProductCtrl.listProducts(0)),format.raw/*115.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*116.37*/routes/*116.43*/.ProductCtrl.about),format.raw/*116.61*/("""">About Us</a>
                          <a href=""""),_display_(/*117.37*/routes/*117.43*/.ProductCtrl.contact),format.raw/*117.63*/("""">Contact Us</a>
                          
                        </div>
                    </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*130.18*/content),format.raw/*130.25*/("""
            """),format.raw/*131.13*/("""</div>
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
    <script src=""""),_display_(/*145.19*/routes/*145.25*/.Assets.versioned("javascripts/main.js")),format.raw/*145.65*/(""""></script>
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
                  DATE: Wed Mar 27 15:23:33 GMT 2019
                  SOURCE: /home/wdd/Downloads/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: d83aa9f463d085249f94959a5770166596658a20
                  MATRIX: 970->1|1121->57|1149->59|1233->116|1261->117|1290->120|1350->153|1378->154|1407->156|1453->174|1482->175|1512->178|1695->334|1723->335|1751->336|1797->354|1826->355|1856->358|2041->516|2069->517|2097->518|2145->538|2174->539|2204->542|2345->656|2373->657|2401->658|2471->700|2500->701|2530->704|2616->763|2644->764|2673->766|2727->792|2756->793|2786->796|2867->850|2895->851|2924->853|2986->887|3015->888|3045->891|3088->907|3116->908|3145->910|3192->929|3221->930|3253->935|3337->992|3365->993|3396->997|3496->1070|3522->1075|3734->1260|3749->1266|3811->1307|4108->1577|4147->1607|4186->1608|4232->1623|4313->1677|4328->1683|4377->1711|4473->1780|4504->1802|4543->1803|4589->1818|4666->1868|4681->1874|4730->1902|4817->1962|4845->1981|4884->1982|4930->1997|4989->2029|5004->2035|5043->2053|5154->2137|5184->2158|5223->2159|5269->2174|5332->2210|5347->2216|5388->2236|5530->2351|5559->2371|5598->2372|5644->2387|5703->2419|5723->2430|5777->2463|5866->2524|5894->2542|5934->2543|5981->2558|6032->2581|6058->2597|6099->2599|6153->2624|6191->2634|6212->2645|6269->2680|6307->2690|6321->2694|6354->2704|6400->2731|6414->2736|6454->2737|6508->2762|6546->2772|6567->2783|6623->2817|6688->2850|6735->2868|6820->2925|6836->2931|6882->2955|7161->3206|7177->3212|7227->3240|7317->3302|7333->3308|7373->3326|7452->3377|7468->3383|7510->3403|7769->3634|7798->3641|7840->3654|8167->3953|8183->3959|8245->3999
                  LINES: 28->1|33->1|35->3|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|54->22|54->22|55->23|55->23|55->23|56->24|62->30|62->30|63->31|63->31|63->31|64->32|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|76->44|76->44|76->44|77->45|79->47|79->47|81->49|81->49|81->49|82->50|83->51|83->51|85->53|85->53|85->53|86->54|89->57|89->57|91->59|94->62|94->62|98->66|98->66|98->66|109->77|109->77|109->77|109->77|110->78|110->78|110->78|113->81|113->81|113->81|113->81|114->82|114->82|114->82|117->85|117->85|117->85|117->85|118->86|118->86|118->86|122->90|122->90|122->90|122->90|123->91|123->91|123->91|128->96|128->96|128->96|128->96|129->97|129->97|129->97|134->102|134->102|134->102|134->102|135->103|135->103|135->103|136->104|136->104|136->104|136->104|136->104|136->104|136->104|137->105|137->105|137->105|138->106|138->106|138->106|138->106|139->107|141->109|143->111|143->111|143->111|147->115|147->115|147->115|148->116|148->116|148->116|149->117|149->117|149->117|162->130|162->130|163->131|177->145|177->145|177->145
                  -- GENERATED --
              */
          