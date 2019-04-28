
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
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

    <head>
            <meta charset="utf-8">
               
                <!-- Bootstrap Core CSS -->
            <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
                <!-- Custom CSS -->
            <link href=""""),_display_(/*13.26*/routes/*13.32*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.73*/("""" rel="stylesheet" />
            <title>Portable Devices- """),_display_(/*14.39*/title),format.raw/*14.44*/("""</title>
    </head>
    <style>

.dropdown .nav"""),format.raw/*18.15*/("""{"""),format.raw/*18.16*/("""
  """),format.raw/*19.3*/("""float: none;
  overflow: hidden;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""

"""),format.raw/*23.1*/(""".dropdown .dropbtn"""),format.raw/*23.19*/("""{"""),format.raw/*23.20*/("""
  """),format.raw/*24.3*/("""font-size: 17px;  
  border: none;
  outline: none;
  color: white;
  padding: 14px 16px;
  background-color: inherit;
  font-family: inherit;
  margin: 0;
"""),format.raw/*32.1*/("""}"""),format.raw/*32.2*/("""
"""),format.raw/*33.1*/(""".dropdown-content """),format.raw/*33.19*/("""{"""),format.raw/*33.20*/("""
  """),format.raw/*34.3*/("""display: none;
  position: absolute;
  background-color: #c2eff5;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(45, 138, 167, 0.377);
  z-index: 1;
"""),format.raw/*40.1*/("""}"""),format.raw/*40.2*/("""
"""),format.raw/*41.1*/(""".dropdown-content a """),format.raw/*41.21*/("""{"""),format.raw/*41.22*/("""
  """),format.raw/*42.3*/("""float: none;
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""
"""),format.raw/*49.1*/(""".navbar a:hover, .dropdown:hover .dropbtn """),format.raw/*49.43*/("""{"""),format.raw/*49.44*/("""
  """),format.raw/*50.3*/("""background-color: rgba(45, 45, 48, 0.979);
  color: white;
"""),format.raw/*52.1*/("""}"""),format.raw/*52.2*/("""

"""),format.raw/*54.1*/(""".dropdown-content a:hover """),format.raw/*54.27*/("""{"""),format.raw/*54.28*/("""
  """),format.raw/*55.3*/("""background-color: rgb(174, 205, 212);
  color: black;
"""),format.raw/*57.1*/("""}"""),format.raw/*57.2*/("""

"""),format.raw/*59.1*/(""".dropdown:hover .dropdown-content """),format.raw/*59.35*/("""{"""),format.raw/*59.36*/("""
  """),format.raw/*60.3*/("""display: block;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""

"""),format.raw/*63.1*/(""".dropdown .dropbtn """),format.raw/*63.20*/("""{"""),format.raw/*63.21*/("""
    """),format.raw/*64.5*/("""display: block;
    width: 100%;
    text-align: left;
  """),format.raw/*67.3*/("""}"""),format.raw/*67.4*/("""

    """),format.raw/*69.5*/("""</style>

    <body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">         
            </div>

            <ul class="nav navbar-nav">
                </li>  
                <li """),_display_(/*80.22*/if(title=="Portable Devices" )/*80.52*/{_display_(Seq[Any](format.raw/*80.53*/("""class="active"""")))}),format.raw/*80.68*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*81.53*/routes/*81.59*/.ProductCtrl.listProducts(0)),format.raw/*81.87*/("""">Portable Devices</a>
                </li>  
                <li """),_display_(/*83.22*/if(title=="Home" )/*83.40*/{_display_(Seq[Any](format.raw/*83.41*/("""class="active"""")))}),format.raw/*83.56*/(""">
                        <a class="navbar-brand" href=""""),_display_(/*84.56*/routes/*84.62*/.ProductCtrl.index()),format.raw/*84.82*/("""">Home</a>
                       </li>

                <li """),_display_(/*87.22*/if(title=="Products" )/*87.44*/{_display_(Seq[Any](format.raw/*87.45*/("""class="active"""")))}),format.raw/*87.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*88.49*/routes/*88.55*/.ProductCtrl.listProducts(0)),format.raw/*88.83*/("""">Products</a>
                </li>

              <!---- <li """),_display_(/*91.27*/if(title=="About" )/*91.46*/{_display_(Seq[Any](format.raw/*91.47*/("""class="active"""")))}),format.raw/*91.62*/(""">
                    <a href=""""),_display_(/*92.31*/routes/*92.37*/.ProductCtrl.about),format.raw/*92.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*96.26*/if(title=="Contact" )/*96.47*/{_display_(Seq[Any](format.raw/*96.48*/("""class="active"""")))}),format.raw/*96.63*/(""">
                        <a href=""""),_display_(/*97.35*/routes/*97.41*/.ProductCtrl.contact),format.raw/*97.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            
                <li """),_display_(/*102.22*/if(title=="Signup" )/*102.42*/{_display_(Seq[Any](format.raw/*102.43*/("""class="active"""")))}),format.raw/*102.58*/(""">
                    <a href=""""),_display_(/*103.31*/controllers/*103.42*/.security.routes.LoginCtrl.signup),format.raw/*103.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*108.22*/if(title=="Login")/*108.40*/{_display_(Seq[Any](format.raw/*108.41*/("""class="active"""")))}),format.raw/*108.56*/(""">
                    """),_display_(/*109.22*/if(user != null)/*109.38*/ {_display_(Seq[Any](format.raw/*109.40*/("""
                        """),format.raw/*110.25*/("""<a href=""""),_display_(/*110.35*/controllers/*110.46*/.security.routes.LoginCtrl.logout()),format.raw/*110.81*/("""">Logout """),_display_(/*110.91*/user/*110.95*/.getName()),format.raw/*110.105*/("""</a>
                    """)))}/*111.23*/else/*111.28*/{_display_(Seq[Any](format.raw/*111.29*/("""
                        """),format.raw/*112.25*/("""<a href=""""),_display_(/*112.35*/controllers/*112.46*/.security.routes.LoginCtrl.login()),format.raw/*112.80*/("""">Login</a>
                    """)))}),format.raw/*113.22*/("""

                """),format.raw/*115.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*117.31*/routes/*117.37*/.ShoppingCtrl.showBasket),format.raw/*117.61*/("""">
                    <span class="glyphicon glyphicon-shopping-cart"></span></a>
                </li>
                <li>
                    <a href=""""),_display_(/*121.31*/routes/*121.37*/.ShoppingCtrl.viewOrders),format.raw/*121.61*/("""">Order History</a>
                </li>
                <li class="dropdown">
                    <a href="javascript:void(0)" class="dropbtn">Dropdown Menu</a>
                    
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*127.37*/routes/*127.43*/.ProductCtrl.listProducts(0)),format.raw/*127.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*128.37*/routes/*128.43*/.ProductCtrl.about),format.raw/*128.61*/("""">About Us</a>
                          <a href=""""),_display_(/*129.37*/routes/*129.43*/.ProductCtrl.contact),format.raw/*129.63*/("""">Contact Us</a>
                          
                        </div>
                    </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*142.18*/content),format.raw/*142.25*/("""
            """),format.raw/*143.13*/("""</div>
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
    <script src=""""),_display_(/*159.19*/routes/*159.25*/.Assets.versioned("javascripts/main.js")),format.raw/*159.65*/(""""></script>
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
                  DATE: Sun Apr 28 21:26:30 IST 2019
                  SOURCE: /home/wdd/AD/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: bd14b34c1e5da1b7ae217c8189085e7379bfd430
                  MATRIX: 970->1|1120->56|1148->58|1488->371|1503->377|1565->418|1652->478|1678->483|1754->531|1783->532|1813->535|1873->568|1901->569|1930->571|1976->589|2005->590|2035->593|2218->749|2246->750|2274->751|2320->769|2349->770|2379->773|2564->931|2592->932|2620->933|2668->953|2697->954|2727->957|2868->1071|2896->1072|2924->1073|2994->1115|3023->1116|3053->1119|3139->1178|3167->1179|3196->1181|3250->1207|3279->1208|3309->1211|3390->1265|3418->1266|3447->1268|3509->1302|3538->1303|3568->1306|3611->1322|3639->1323|3668->1325|3715->1344|3744->1345|3776->1350|3860->1407|3888->1408|3921->1414|4202->1668|4241->1698|4280->1699|4326->1714|4407->1768|4422->1774|4471->1802|4566->1870|4593->1888|4632->1889|4678->1904|4762->1961|4777->1967|4818->1987|4907->2049|4938->2071|4977->2072|5023->2087|5100->2137|5115->2143|5164->2171|5255->2235|5283->2254|5322->2255|5368->2270|5427->2302|5442->2308|5481->2326|5592->2410|5622->2431|5661->2432|5707->2447|5770->2483|5785->2489|5826->2509|5969->2624|5999->2644|6039->2645|6086->2660|6146->2692|6167->2703|6222->2736|6311->2797|6339->2815|6379->2816|6426->2831|6477->2854|6503->2870|6544->2872|6598->2897|6636->2907|6657->2918|6714->2953|6752->2963|6766->2967|6799->2977|6845->3004|6859->3009|6899->3010|6953->3035|6991->3045|7012->3056|7068->3090|7133->3123|7180->3141|7265->3198|7281->3204|7327->3228|7511->3384|7527->3390|7573->3414|7876->3689|7892->3695|7942->3723|8032->3785|8048->3791|8088->3809|8167->3860|8183->3866|8225->3886|8484->4117|8513->4124|8555->4137|8942->4496|8958->4502|9020->4542
                  LINES: 28->1|33->1|35->3|45->13|45->13|45->13|46->14|46->14|50->18|50->18|51->19|53->21|53->21|55->23|55->23|55->23|56->24|64->32|64->32|65->33|65->33|65->33|66->34|72->40|72->40|73->41|73->41|73->41|74->42|80->48|80->48|81->49|81->49|81->49|82->50|84->52|84->52|86->54|86->54|86->54|87->55|89->57|89->57|91->59|91->59|91->59|92->60|93->61|93->61|95->63|95->63|95->63|96->64|99->67|99->67|101->69|112->80|112->80|112->80|112->80|113->81|113->81|113->81|115->83|115->83|115->83|115->83|116->84|116->84|116->84|119->87|119->87|119->87|119->87|120->88|120->88|120->88|123->91|123->91|123->91|123->91|124->92|124->92|124->92|128->96|128->96|128->96|128->96|129->97|129->97|129->97|134->102|134->102|134->102|134->102|135->103|135->103|135->103|140->108|140->108|140->108|140->108|141->109|141->109|141->109|142->110|142->110|142->110|142->110|142->110|142->110|142->110|143->111|143->111|143->111|144->112|144->112|144->112|144->112|145->113|147->115|149->117|149->117|149->117|153->121|153->121|153->121|159->127|159->127|159->127|160->128|160->128|160->128|161->129|161->129|161->129|174->142|174->142|175->143|191->159|191->159|191->159
                  -- GENERATED --
              */
          