
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""
"""),_display_(/*2.2*/main("index",user)/*2.20*/{_display_(Seq[Any](format.raw/*2.21*/("""

    """),format.raw/*4.5*/("""<!DOCTYPE html>
    <html lang="en">

        <head>
                <title>Bootstrap Example</title>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
                <style>
                      /* Remove the navbar's default margin-bottom and rounded borders */ 
                      .navbar """),format.raw/*16.31*/("""{"""),format.raw/*16.32*/("""
                        """),format.raw/*17.25*/("""margin-bottom: 0;
                        border-radius: 0;
                      """),format.raw/*19.23*/("""}"""),format.raw/*19.24*/("""
                      
                      """),format.raw/*21.23*/("""/* Add a gray background color and some padding to the footer */
                      footer """),format.raw/*22.30*/("""{"""),format.raw/*22.31*/("""
                        """),format.raw/*23.25*/("""background-color: #f2f2f2;
                        padding: 25px;
                      """),format.raw/*25.23*/("""}"""),format.raw/*25.24*/("""
                      
                    """),format.raw/*27.21*/(""".carousel-inner img """),format.raw/*27.41*/("""{"""),format.raw/*27.42*/("""
                        """),format.raw/*28.25*/("""width: 100%; /* Set width to 100% */
                        margin: auto;
                        height:200px;
                    """),format.raw/*31.21*/("""}"""),format.raw/*31.22*/("""
                  
                    """),format.raw/*33.21*/("""/* Hide the carousel text when the screen is less than 600 pixels wide */
                   
                </style>


</head>
<body>

<br>


<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="https://i.imgur.com/Y4Z1vNo.jpg" alt="Image">
        <div class="carousel-caption">
          <h3>-</h3>
          <p>--</p>
        </div>      
      </div>

      <div class="item">
        <img src="https://i.imgur.com/Dz5mb5Z.jpg" alt="Image">
        <div class="carousel-caption">
          <h3>-</h3>
          <p>--</p>
        </div>      
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
</div>
  
    <div class="container text-center">    
       <!-- <marquee style="background-color: red; text-center-color: blue;" > -->
        
      <h3>What We Have to offer </h3>
      
  <div class="row">
    <div class="col-sm-4">

       <br>
   </div>
  </div>
</div>

  
    </button> 
   <!-- <a href="#"><span class="navbar-brand" href="#">Logo</a> ->
    <1-->

  </div>
</nav>

<br>


<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">CYPER MONDAY DEAL</div>
        <div class="panel-body"><img src="https://image.shutterstock.com/image-photo/thirty-percent-off-discount-tag-450w-155472821.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">30% OFF ANY ITEMS</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">NEXT DAY TUESDAY DEAL</div>
        <div class="panel-body"><img src="https://image.shutterstock.com/image-photo/sixty-percent-off-discount-tag-450w-155472830.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">60% OFF SELECT ITEMS</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">WEDNESDAY DEAL</div>
        <div class="panel-body"><img src="https://image.shutterstock.com/image-photo/forty-percent-off-discount-tag-450w-155472833.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">40% OFF SELECT ITEMS</div>
      </div>
    </div>
  </div>
</div>

<br>

<div class="container">    
  <div class="row">
    <div class="col-sm-4">
      <div class="panel panel-primary">
        <div class="panel-heading">BORING THURSDAY DEAL</div>
        <div class="panel-body"><img src="https://image.shutterstock.com/image-photo/ten-percent-off-discount-tag-450w-155472806.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">10% OFF ANY ITEMS</div>
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-danger">
        <div class="panel-heading">BLACK FRIDAY DEAL</div>
        <div class="panel-body"><img src="https://image.shutterstock.com/image-photo/fifty-percent-off-discount-tag-450w-155472851.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">50% OFF SELECT ITEMS</div> 
        
      </div>
    </div>
    <div class="col-sm-4"> 
      <div class="panel panel-success">
        <div class="panel-heading">SUPER SUNDAY DEAL</div>
        <div class="panel-body"><img src="https://image.shutterstock.com/image-photo/eighty-percent-off-discount-tag-450w-155472845.jpg" class="img-responsive" style="width:100%" alt="Image"></div>
        <div class="panel-footer">80% OFF SELECT ITEMS</div>
      </div>
    </div>
  </div>
</div><br><br>

<marquee style="background-color: red;"></marquee>
     
      <footer class="container-fluid text-center">
      
        <p>PORTABLE DEVICES</p> 
      <form class="form-inline">Get deals:
        
        <button type="button" class="btn btn-danger" onclick="window.location.href = '"""),_display_(/*167.88*/controllers/*167.99*/.security.routes.LoginCtrl.signup()),format.raw/*167.134*/("""';">Sign Up</button>
      </form>
    </footer>
    </head>
    </body>
""")))}),format.raw/*172.2*/("""
"""))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Apr 28 21:57:04 IST 2019
                  SOURCE: /home/wdd/AD/ITSM/ShoppinCartLY/app/views/index.scala.html
                  HASH: 1ebbaad8eb4d874e17641954c1d3a8b7cd694d31
                  MATRIX: 959->1|1079->26|1106->28|1132->46|1170->47|1202->53|1931->754|1960->755|2013->780|2123->862|2152->863|2226->909|2348->1003|2377->1004|2430->1029|2546->1117|2575->1118|2647->1162|2695->1182|2724->1183|2777->1208|2938->1341|2967->1342|3035->1382|7753->6072|7774->6083|7832->6118|7937->6192
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|48->16|48->16|49->17|51->19|51->19|53->21|54->22|54->22|55->23|57->25|57->25|59->27|59->27|59->27|60->28|63->31|63->31|65->33|199->167|199->167|199->167|204->172
                  -- GENERATED --
              */
          