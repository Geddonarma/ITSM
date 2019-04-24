
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*7.1*/("""
"""),_display_(/*8.2*/main("Order Confirmation", customer)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""

"""),format.raw/*10.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		"""),format.raw/*19.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*31.18*/if(order != null)/*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
                    """),format.raw/*32.21*/("""<!-- Start of For loop  -->
                    """),_display_(/*33.22*/for(i <- order.getItems) yield /*33.46*/ {_display_(Seq[Any](format.raw/*33.48*/("""
                    """),format.raw/*34.21*/("""<tr>
                        <td>"""),_display_(/*35.30*/i/*35.31*/.getProduct.getName),format.raw/*35.50*/("""</td>
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getDescription),format.raw/*36.57*/("""</td>
                        <td>&euro; """),_display_(/*37.37*/("%.2f".format(i.getPrice))),format.raw/*37.64*/("""</td>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getQuantity()),format.raw/*38.45*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getItemTotal))),format.raw/*39.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*41.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*42.16*/("""
			"""),format.raw/*43.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*47.68*/("%.2f".format(order.getOrderTotal))),format.raw/*47.104*/("""</strong></p>
            </div>  
        </div>
        </div></div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 21:34:36 IST 2019
                  SOURCE: /home/wdd/IT/ITSM/ShoppinCartLY/app/views/orderConfirmed.scala.html
                  HASH: c517bd10cc188d0f538eb570b45b302de388e156
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1260->68|1289->153|1316->155|1360->191|1399->193|1428->195|1501->242|1542->274|1582->276|1615->282|1686->326|1700->331|1736->346|1769->352|1809->362|1841->367|2147->646|2173->663|2213->665|2262->686|2338->735|2378->759|2418->761|2467->782|2528->816|2538->817|2578->836|2640->871|2650->872|2697->898|2766->940|2814->967|2876->1002|2886->1003|2921->1017|2990->1059|3042->1090|3126->1143|3197->1183|3228->1187|3404->1336|3462->1372
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|40->8|40->8|42->10|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|51->19|63->31|63->31|63->31|64->32|65->33|65->33|65->33|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|70->38|70->38|70->38|71->39|71->39|73->41|74->42|75->43|79->47|79->47
                  -- GENERATED --
              */
          