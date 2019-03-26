
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
    <title>Portable Devices- """),_display_(/*72.31*/title),format.raw/*72.36*/("""</title>
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
                </li>  
                <li """),_display_(/*88.22*/if(title=="Portable Devices" )/*88.52*/{_display_(Seq[Any](format.raw/*88.53*/("""class="active"""")))}),format.raw/*88.68*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*89.53*/routes/*89.59*/.ProductCtrl.listProducts(0)),format.raw/*89.87*/("""">Portable Devices</a>
                </li>  

                <li """),_display_(/*92.22*/if(title=="Products" )/*92.44*/{_display_(Seq[Any](format.raw/*92.45*/("""class="active"""")))}),format.raw/*92.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*93.49*/routes/*93.55*/.ProductCtrl.listProducts(0)),format.raw/*93.83*/("""">Home</a>
                </li>

              <!---- <li """),_display_(/*96.27*/if(title=="About" )/*96.46*/{_display_(Seq[Any](format.raw/*96.47*/("""class="active"""")))}),format.raw/*96.62*/(""">
                    <a href=""""),_display_(/*97.31*/routes/*97.37*/.ProductCtrl.about),format.raw/*97.55*/("""">About us</a>
                </li>

                <li>
                    <li """),_display_(/*101.26*/if(title=="Contact" )/*101.47*/{_display_(Seq[Any](format.raw/*101.48*/("""class="active"""")))}),format.raw/*101.63*/(""">
                        <a href=""""),_display_(/*102.35*/routes/*102.41*/.ProductCtrl.contact),format.raw/*102.61*/("""">Contact us</a>
                    </li>
                </li>
            -->
            
                <li """),_display_(/*107.22*/if(title=="Signup" )/*107.42*/{_display_(Seq[Any](format.raw/*107.43*/("""class="active"""")))}),format.raw/*107.58*/(""">
                    <a href=""""),_display_(/*108.31*/controllers/*108.42*/.security.routes.LoginCtrl.signup),format.raw/*108.75*/("""">Sign Up</a>
                </li> 



                <li """),_display_(/*113.22*/if(title=="Login")/*113.40*/{_display_(Seq[Any](format.raw/*113.41*/("""class="active"""")))}),format.raw/*113.56*/(""">
                    """),_display_(/*114.22*/if(user != null)/*114.38*/ {_display_(Seq[Any](format.raw/*114.40*/("""
                        """),format.raw/*115.25*/("""<a href=""""),_display_(/*115.35*/controllers/*115.46*/.security.routes.LoginCtrl.logout()),format.raw/*115.81*/("""">Logout """),_display_(/*115.91*/user/*115.95*/.getName()),format.raw/*115.105*/("""</a>
                    """)))}/*116.23*/else/*116.28*/{_display_(Seq[Any](format.raw/*116.29*/("""
                        """),format.raw/*117.25*/("""<a href=""""),_display_(/*117.35*/controllers/*117.46*/.security.routes.LoginCtrl.login()),format.raw/*117.80*/("""">Login</a>
                    """)))}),format.raw/*118.22*/("""

                """),format.raw/*120.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*122.31*/routes/*122.37*/.ShoppingCtrl.viewOrders),format.raw/*122.61*/("""">View Orders</a>
                </li>
                <div class="dropdown">
                        <button class="dropbtn">Dropdown Menu<i class="fa fa-caret-down"></i></button>
                        <div class="dropdown-content">
                          <a href=""""),_display_(/*127.37*/routes/*127.43*/.ProductCtrl.listProducts(0)),format.raw/*127.71*/("""">Search for Products</a>
                          <a href=""""),_display_(/*128.37*/routes/*128.43*/.ProductCtrl.about),format.raw/*128.61*/("""">About Us</a>
                          <a href=""""),_display_(/*129.37*/routes/*129.43*/.ProductCtrl.contact),format.raw/*129.63*/("""">Contact Us</a>
                          
                        </div>
                      </div>
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
                Copyright
                <strong>Portable Devices Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*157.19*/routes/*157.25*/.Assets.versioned("javascripts/main.js")),format.raw/*157.65*/(""""></script>
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
                  DATE: Tue Mar 26 13:19:14 GMT 2019
                  SOURCE: /home/wdd/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: e0d2e6de69600e76333ed877aad3f5a99b26d592
                  MATRIX: 970->1|1121->57|1149->59|1229->112|1257->113|1286->116|1346->149|1374->150|1403->152|1450->171|1479->172|1509->175|1692->331|1720->332|1748->333|1794->351|1823->352|1853->355|2028->503|2056->504|2084->505|2132->525|2161->526|2191->529|2332->643|2360->644|2388->645|2458->687|2487->688|2517->691|2584->731|2612->732|2641->734|2695->760|2724->761|2754->764|2821->804|2849->805|2878->807|2940->841|2969->842|2999->845|3042->861|3070->862|3099->864|3146->883|3175->884|3207->889|3249->904|3277->905|3307->908|3345->918|3374->919|3408->926|3448->939|3476->940|3504->941|3550->959|3579->960|3611->965|3658->985|3686->986|3714->987|3761->1006|3790->1007|3822->1012|3906->1069|3934->1070|3965->1074|4066->1148|4092->1153|4304->1338|4319->1344|4381->1385|4689->1666|4728->1696|4767->1697|4813->1712|4894->1766|4909->1772|4958->1800|5054->1869|5085->1891|5124->1892|5170->1907|5247->1957|5262->1963|5311->1991|5398->2051|5426->2070|5465->2071|5511->2086|5570->2118|5585->2124|5624->2142|5736->2226|5767->2247|5807->2248|5854->2263|5918->2299|5934->2305|5976->2325|6119->2440|6149->2460|6189->2461|6236->2476|6296->2508|6317->2519|6372->2552|6461->2613|6489->2631|6529->2632|6576->2647|6627->2670|6653->2686|6694->2688|6748->2713|6786->2723|6807->2734|6864->2769|6902->2779|6916->2783|6949->2793|6995->2820|7009->2825|7049->2826|7103->2851|7141->2861|7162->2872|7218->2906|7283->2939|7330->2957|7415->3014|7431->3020|7477->3044|7778->3317|7794->3323|7844->3351|7934->3413|7950->3419|7990->3437|8069->3488|8085->3494|8127->3514|8389->3748|8418->3755|8460->3768|8779->4059|8795->4065|8857->4105
                  LINES: 28->1|33->1|35->3|40->8|40->8|41->9|43->11|43->11|45->13|45->13|45->13|46->14|54->22|54->22|55->23|55->23|55->23|56->24|62->30|62->30|63->31|63->31|63->31|64->32|70->38|70->38|71->39|71->39|71->39|72->40|74->42|74->42|76->44|76->44|76->44|77->45|79->47|79->47|81->49|81->49|81->49|82->50|83->51|83->51|85->53|85->53|85->53|86->54|87->55|87->55|88->56|88->56|88->56|89->57|90->58|90->58|91->59|91->59|91->59|92->60|93->61|93->61|94->62|94->62|94->62|95->63|98->66|98->66|100->68|104->72|104->72|108->76|108->76|108->76|120->88|120->88|120->88|120->88|121->89|121->89|121->89|124->92|124->92|124->92|124->92|125->93|125->93|125->93|128->96|128->96|128->96|128->96|129->97|129->97|129->97|133->101|133->101|133->101|133->101|134->102|134->102|134->102|139->107|139->107|139->107|139->107|140->108|140->108|140->108|145->113|145->113|145->113|145->113|146->114|146->114|146->114|147->115|147->115|147->115|147->115|147->115|147->115|147->115|148->116|148->116|148->116|149->117|149->117|149->117|149->117|150->118|152->120|154->122|154->122|154->122|159->127|159->127|159->127|160->128|160->128|160->128|161->129|161->129|161->129|174->142|174->142|175->143|189->157|189->157|189->157
                  -- GENERATED --
              */
          