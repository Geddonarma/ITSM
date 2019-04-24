
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
        .navbar """),format.raw/*15.17*/("""{"""),format.raw/*15.18*/("""
          """),format.raw/*16.11*/("""margin-bottom: 0;
          border-radius: 0;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""
        
        """),format.raw/*20.9*/("""/* Add a gray background color and some padding to the footer */
        footer """),format.raw/*21.16*/("""{"""),format.raw/*21.17*/("""
          """),format.raw/*22.11*/("""background-color: #f2f2f2;
          padding: 25px;
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
        
      """),format.raw/*26.7*/(""".carousel-inner img """),format.raw/*26.27*/("""{"""),format.raw/*26.28*/("""
          """),format.raw/*27.11*/("""width: 100%; /* Set width to 100% */
          margin: auto;
          min-height:200px;
      """),format.raw/*30.7*/("""}"""),format.raw/*30.8*/("""
    
      """),format.raw/*32.7*/("""/* Hide the carousel text when the screen is less than 600 pixels wide */
     
      </style>
    </head>
    <body>
    
   
    
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
          <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
          <li data-target="#myCarousel" data-slide-to="1"></li>
        </ol>
    
        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
          <div class="item active">
            <img src="https://i.imgur.com/yDTP3sI.png" alt="Image">
            <div class="carousel-caption">
              <h3>-</h3>
              <p>--</p>
            </div>      
          </div>
    
          <div class="item">
            <img src="https://imgur.com/72W5uAM.jpg" alt="Image">
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
      
        <!--<div class="container text-center">    
      <h3>What We Do</h3><br>
      <div class="row">
        <div class="col-sm-4">
       
         -->
      <!---    
          
        </div>
      </div>
    </div>
    
      
    <!--<nav class="navbar navbar-inverse">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>                        
          </button>
      <!--    <a class="navbar-brand" href="#">Logo</a> -->
       
        <!-- <div class="collapse navbar-collapse" id="myNavbar">
         
          <!-- <ul class="nav navbar-nav navbar-right">
           <!-- <li><a href="#"><span class="glyphicon glyphicon-user"></span> Your Account</a></li>
            <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li> 
          </ul> 
        </div>
      </div>
    </nav>
   -->
    <br>

    
    <div class="container">    
      <div class="row">
        <div class="col-sm-4">
          <div class="panel panel-primary">
            <div class="panel-heading">CYPER MONDAY DEAL</div>
            <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">30% OFF ANY ITEMS</div>
          </div>
        </div>
        <div class="col-sm-4"> 
          <div class="panel panel-danger">
            <div class="panel-heading">NEXT DAY TUESDAY DEAL</div>
            <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">SPEND OVER 30£ AND GET NEXT DAY DELIVERY FREE</div>
          </div>
        </div>
        <div class="col-sm-4"> 
          <div class="panel panel-success">
            <div class="panel-heading">WEDNESDAY DEAL</div>
            <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">BUY ONE GET ONE HALF PRICE</div>
          </div>
        </div>
      </div>
    </div><br>
    
    <div class="container">    
      <div class="row">
        <div class="col-sm-4">
          <div class="panel panel-primary">
            <div class="panel-heading">THURSDAY DEAL</div>
            <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">20% OFF ANY ITEMS</div>
          </div>
        </div>
        <div class="col-sm-4"> 
          <div class="panel panel-primary">
            <div class="panel-heading">BLACK FRIDAY DEAL</div>
            <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">80% OFF SELECT ITEMS</div> <!---<marquee style="background-color: red; text-decoration-color: blue;"-->
          </div>
        </div>
        <div class="col-sm-4"> 
          <div class="panel panel-primary">
            <div class="panel-heading">SUPER SUNDAY DEAL</div>
            <div class="panel-body"><img src="https://placehold.it/150x80?text=IMAGE" class="img-responsive" style="width:100%" alt="Image"></div>
            <div class="panel-footer">Buy 50 mobiles and get a gift card</div>
          </div>
        </div>
      </div>
    </div><br><br>
    
    
      <footer class="container-fluid text-center">
      <p>PORTABLE DEVICES</p>
      <form class="form-inline">Get deals:
        
        <button type="button" class="btn btn-danger" onclick="window.location.href = '"""),_display_(/*170.88*/controllers/*170.99*/.security.routes.LoginCtrl.signup()),format.raw/*170.134*/("""';">Sign Up</button>
      </form>
    </footer>
    </head>
    </body>
""")))}),format.raw/*175.2*/("""	
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
                  DATE: Tue Apr 23 21:34:36 IST 2019
                  SOURCE: /home/wdd/IT/ITSM/ShoppinCartLY/app/views/index.scala.html
                  HASH: 93f9a2f3f94d6fcaf7feb98bb83de08257ba7032
                  MATRIX: 959->1|1079->26|1106->28|1132->46|1170->47|1202->53|1828->651|1857->652|1896->663|1977->717|2006->718|2051->736|2159->816|2188->817|2227->828|2314->888|2343->889|2386->905|2434->925|2463->926|2502->937|2624->1032|2652->1033|2691->1045|8185->6511|8206->6522|8264->6557|8369->6631
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|47->15|47->15|48->16|50->18|50->18|52->20|53->21|53->21|54->22|56->24|56->24|58->26|58->26|58->26|59->27|62->30|62->30|64->32|202->170|202->170|202->170|207->175
                  -- GENERATED --
              */
          