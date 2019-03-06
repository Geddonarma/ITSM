
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

<head>
    <meta charset="utf-8">
    <title>Online store - """),_display_(/*9.28*/title),format.raw/*9.33*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                   
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*26.22*/if(title=="Online store" )/*26.48*/{_display_(Seq[Any](format.raw/*26.49*/("""class="active"""")))}),format.raw/*26.64*/(""">
                     <a class="navbar-brand" href=""""),_display_(/*27.53*/routes/*27.59*/.ProductCtrl.listProducts(0)),format.raw/*27.87*/("""">Online Store</a>
                </li>  

                <li """),_display_(/*30.22*/if(title=="Products" )/*30.44*/{_display_(Seq[Any](format.raw/*30.45*/("""class="active"""")))}),format.raw/*30.60*/(""">
                 <a class="navbar-brand" href=""""),_display_(/*31.49*/routes/*31.55*/.ProductCtrl.listProducts(0)),format.raw/*31.83*/("""">home</a>
                    
                </li>

                <li """),_display_(/*35.22*/if(title=="About" )/*35.41*/{_display_(Seq[Any](format.raw/*35.42*/("""class="active"""")))}),format.raw/*35.57*/(""">
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.ProductCtrl.about),format.raw/*36.55*/("""">About us</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*42.22*/if(title=="Login")/*42.40*/{_display_(Seq[Any](format.raw/*42.41*/("""class="active"""")))}),format.raw/*42.56*/(""">
                    """),_display_(/*43.22*/if(user != null)/*43.38*/ {_display_(Seq[Any](format.raw/*43.40*/("""
                        """),format.raw/*44.25*/("""<a href=""""),_display_(/*44.35*/controllers/*44.46*/.security.routes.LoginCtrl.logout()),format.raw/*44.81*/("""">Logout """),_display_(/*44.91*/user/*44.95*/.getName()),format.raw/*44.105*/("""</a>
                    """)))}/*45.23*/else/*45.28*/{_display_(Seq[Any](format.raw/*45.29*/("""
                        """),format.raw/*46.25*/("""<a href=""""),_display_(/*46.35*/controllers/*46.46*/.security.routes.LoginCtrl.login()),format.raw/*46.80*/("""">Login</a>
                    """)))}),format.raw/*47.22*/("""

                """),format.raw/*49.17*/("""</li>
                <li>
                    <a href=""""),_display_(/*51.31*/routes/*51.37*/.ShoppingCtrl.viewOrders),format.raw/*51.61*/("""">View Orders</a>
                </li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*62.18*/content),format.raw/*62.25*/("""
            """),format.raw/*63.13*/("""</div>
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
    <script src=""""),_display_(/*77.19*/routes/*77.25*/.Assets.versioned("javascripts/main.js")),format.raw/*77.65*/(""""></script>
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
                  DATE: Wed Mar 06 15:35:28 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/main.scala.html
                  HASH: ebf630e33cb462efd6069229b8a7eba2abaf0625
                  MATRIX: 970->1|1121->57|1149->59|1271->155|1296->160|1508->345|1523->351|1585->392|1871->651|1906->677|1945->678|1991->693|2072->747|2087->753|2136->781|2228->846|2259->868|2298->869|2344->884|2421->934|2436->940|2485->968|2588->1044|2616->1063|2655->1064|2701->1079|2760->1111|2775->1117|2814->1135|2987->1281|3014->1299|3053->1300|3099->1315|3149->1338|3174->1354|3214->1356|3267->1381|3304->1391|3324->1402|3380->1437|3417->1447|3430->1451|3462->1461|3507->1488|3520->1493|3559->1494|3612->1519|3649->1529|3669->1540|3724->1574|3788->1607|3834->1625|3918->1682|3933->1688|3978->1712|4175->1882|4203->1889|4244->1902|4562->2193|4577->2199|4638->2239
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|58->26|58->26|58->26|58->26|59->27|59->27|59->27|62->30|62->30|62->30|62->30|63->31|63->31|63->31|67->35|67->35|67->35|67->35|68->36|68->36|68->36|74->42|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|76->44|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|78->46|79->47|81->49|83->51|83->51|83->51|94->62|94->62|95->63|109->77|109->77|109->77
                  -- GENERATED --
              */
          