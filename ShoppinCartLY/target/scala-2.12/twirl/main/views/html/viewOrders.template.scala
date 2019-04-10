
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("View Order history", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


	"""),format.raw/*12.2*/("""<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		
               
                    """),format.raw/*21.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*22.22*/for(o <- customer.getOrders()) yield /*22.52*/ {_display_(Seq[Any](format.raw/*22.54*/("""

                        """),format.raw/*24.25*/("""<p>Order Number: """),_display_(/*24.43*/o/*24.44*/.getId()),format.raw/*24.52*/("""</p>
                        <p>Order Date: """),_display_(/*25.41*/o/*25.42*/.getOrderDateString()),format.raw/*25.63*/("""</p>
                        <table class="table table-bordered table-hover table-condensed">
                        
                            <thead>
                            <!-- The header row-->
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Quantity</th>
                                <th>Price</th>
                                <th>Total</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*39.26*/for(i <- o.getItems()) yield /*39.48*/ {_display_(Seq[Any](format.raw/*39.50*/("""

                        """),format.raw/*41.25*/("""<tr>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getId),format.raw/*42.37*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getProduct.getName()),format.raw/*43.52*/("""</td>
                        <td>"""),_display_(/*44.30*/i/*44.31*/.getQuantity()),format.raw/*44.45*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getPrice()))),format.raw/*45.66*/("""</td>
                        <td>&euro; """),_display_(/*46.37*/("%.2f".format(i.getItemTotal))),format.raw/*46.68*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*49.22*/("""<!-- End of For loop -->
                    
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-center"><strong>Order Total: &euro; """),_display_(/*55.69*/("%.2f".format(o.getOrderTotal))),format.raw/*55.101*/("""</strong></p>
            </div>  
        </div>
<style>
.button1"""),format.raw/*59.9*/("""{"""),format.raw/*59.10*/("""
    """),format.raw/*60.5*/("""background-color: rgb(226, 13, 13);
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
"""),format.raw/*62.1*/("""</style>
        <div class="row">
            <div class="col-md-12">
        <p class="text-center">
            <a href=""""),_display_(/*66.23*/routes/*66.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*66.65*/("""">
              <button class="btn btn-warning button1">Cancel Order</button>
            </a>
          </p>
        </div>  
    </div>
         """)))}),format.raw/*72.11*/("""<!-- End of For loop -->
       
        </div>
        <div class="col-md-15">
            <p class="text-center">
                <a href=""""),_display_(/*77.27*/routes/*77.33*/.ProductCtrl.listProducts(0)),format.raw/*77.61*/("""" class="btn btn-success">
                <span class="glyphicon glyphicon-hand-left"></span> Continue Shopping</a>
            </p>
        </div> 
        <div class="col-md-15">
            <p class="text-center">
                <a href=""""),_display_(/*83.27*/routes/*83.33*/.ShoppingCtrl.showBasket),format.raw/*83.57*/("""" class="btn btn-primary">
                <span class="glyphicon glyphicon-shopping-cart"></span> View Basket</a>
            </p>
        </div> 


""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 10 14:33:01 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/viewOrders.scala.html
                  HASH: 081bbbeb32f001044a77b79620a1a8c739d069fb
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1196->34|1225->119|1252->120|1323->166|1367->202|1406->204|1437->208|1490->235|1531->267|1571->269|1604->275|1675->319|1689->324|1725->339|1758->345|1798->355|1868->397|1978->480|2024->510|2064->512|2118->538|2163->556|2173->557|2202->565|2274->610|2284->611|2326->632|2958->1237|2996->1259|3036->1261|3090->1287|3151->1321|3161->1322|3188->1328|3250->1363|3260->1364|3302->1385|3364->1420|3374->1421|3409->1435|3478->1477|3528->1506|3597->1548|3649->1579|3758->1657|3990->1862|4044->1894|4137->1960|4166->1961|4198->1966|4261->2002|4289->2003|4317->2004|4469->2129|4484->2135|4541->2171|4721->2320|4890->2462|4905->2468|4954->2496|5225->2740|5240->2746|5285->2770
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|53->21|54->22|54->22|54->22|56->24|56->24|56->24|56->24|57->25|57->25|57->25|71->39|71->39|71->39|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|78->46|78->46|81->49|87->55|87->55|91->59|91->59|92->60|93->61|93->61|94->62|98->66|98->66|98->66|104->72|109->77|109->77|109->77|115->83|115->83|115->83
                  -- GENERATED --
              */
          