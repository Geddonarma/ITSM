
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

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
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""

"""),format.raw/*11.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*14.4*/if(flash.containsKey("success"))/*14.36*/ {_display_(Seq[Any](format.raw/*14.38*/("""
			  """),format.raw/*15.6*/("""<div class="alert alert-success">
			      """),_display_(/*16.11*/flash/*16.16*/.get("success")),format.raw/*16.31*/("""
			  """),format.raw/*17.6*/("""</div>
		""")))}),format.raw/*18.4*/(""" 

		"""),format.raw/*20.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*34.18*/if(customer.getBasket() != null)/*34.50*/ {_display_(Seq[Any](format.raw/*34.52*/("""
                    """),format.raw/*35.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*36.22*/for(i <- customer.getBasket().getBasketItems()) yield /*36.69*/ {_display_(Seq[Any](format.raw/*36.71*/("""
                    """),format.raw/*37.21*/("""<tr>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getName),format.raw/*38.50*/("""</td>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getProduct.getDescription()),format.raw/*39.59*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getPrice))),format.raw/*40.64*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getItemTotal))),format.raw/*41.68*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getQuantity()),format.raw/*42.45*/("""</td>
                        <td><a href=""""),_display_(/*43.39*/routes/*43.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*43.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.addOne(i.getId,i.getProduct.getId())),format.raw/*44.95*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*46.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*47.16*/("""
			"""),format.raw/*48.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-center"><strong>Basket Total: &euro; """),_display_(/*52.70*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*52.120*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-15">
                <p class="text-center">
                    <a href=""""),_display_(/*58.31*/routes/*58.37*/.ShoppingCtrl.emptyBasket()),format.raw/*58.64*/("""" class="btn btn-danger" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-15">
                <p class="text-center">
                    <a href=""""),_display_(/*64.31*/routes/*64.37*/.ShoppingCtrl.placeOrder()),format.raw/*64.63*/("""" class="btn btn-success">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
            <div class="col-md-15">
                <p class="text-center">
                    <a href=""""),_display_(/*70.31*/routes/*70.37*/.ProductCtrl.listProducts(0)),format.raw/*70.65*/("""" class="btn btn-info ">
                    <span class="glyphicon glyphicon-hand-left"></span> Continue Shopping</a>
                </p>
            </div>
            <div class="col-md-15">
                <p class="text-center">
                    <a href=""""),_display_(/*76.31*/routes/*76.37*/.ShoppingCtrl.viewOrders),format.raw/*76.61*/("""" class="btn btn-primary ">
                    <span class="glyphicon glyphicon-hourglass"></span> Order History</a>
                </p>
            </div>  
        </div>
    </div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*85.24*/("""{"""),format.raw/*85.25*/("""
		"""),format.raw/*86.3*/("""return confirm('Are you sure?');
	"""),format.raw/*87.2*/("""}"""),format.raw/*87.3*/("""
"""),format.raw/*88.1*/("""</script>



<form action=""""),_display_(/*92.16*/routes/*92.22*/.ShoppingCtrl.placeOrder()),format.raw/*92.48*/("""" method="GET">
        <script
        src="https://checkout.stripe.com/checkout.js" class="stripe-button" class="text-center"
        data-key="pk_test_cO2OSsh3YSQq7EPGH7QFK50F00xgTIyrfJ"
        data-amount='"""),_display_(/*96.23*/("%.0f".format(customer.getBasket.getBasketTotal))),format.raw/*96.73*/("""00'
        data-name="Portable Devices"
        data-description="Widget"
        data-image=""
        data-locale="auto"
        data-currency="eur">
        
        </script>
   
</form>




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
                  DATE: Wed Apr 10 13:56:40 IST 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/basket.scala.html
                  HASH: a6d3b273bb2bf02f0df976ca6b03ab5fcc04d827
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1192->34|1221->119|1248->120|1319->166|1360->199|1399->201|1428->203|1501->250|1542->282|1582->284|1615->290|1686->334|1700->339|1736->354|1769->360|1809->370|1841->375|2195->702|2236->734|2276->736|2325->757|2435->840|2498->887|2538->889|2587->910|2648->944|2658->945|2698->964|2760->999|2770->1000|2819->1028|2888->1070|2936->1097|3005->1139|3057->1170|3119->1205|3129->1206|3164->1220|3235->1264|3250->1270|3303->1302|3432->1404|3447->1410|3518->1460|3659->1570|3730->1610|3761->1614|3939->1765|4011->1815|4220->1997|4235->2003|4283->2030|4600->2320|4615->2326|4662->2352|4947->2610|4962->2616|5011->2644|5303->2909|5318->2915|5363->2939|5684->3232|5713->3233|5743->3236|5804->3270|5832->3271|5860->3272|5915->3300|5930->3306|5977->3332|6216->3544|6287->3594
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|43->11|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|50->18|52->20|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|76->44|76->44|76->44|78->46|79->47|80->48|84->52|84->52|90->58|90->58|90->58|96->64|96->64|96->64|102->70|102->70|102->70|108->76|108->76|108->76|117->85|117->85|118->86|119->87|119->87|120->88|124->92|124->92|124->92|128->96|128->96
                  -- GENERATED --
              */
          