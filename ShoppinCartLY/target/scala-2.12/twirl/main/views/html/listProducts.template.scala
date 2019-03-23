
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template6[List[Product],List[Category],Long,String,User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(products: List[Product], categories: List[Category], catId: Long, filter: String,user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.121*/("""


"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Products</p>
<br>
<div class="row">
  <div class="col-sm-2">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.ProductCtrl.listProducts(0, filter)),format.raw/*15.59*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.ProductCtrl.listProducts(c.getId, filter)),format.raw/*17.67*/("""" class="list-group-item">"""),_display_(/*17.94*/c/*17.95*/.getName),format.raw/*17.103*/("""
          """),format.raw/*18.11*/("""<span class="badge">"""),_display_(/*18.32*/c/*18.33*/.getProducts.size()),format.raw/*18.52*/("""</span>
        </a>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</div>
  </div>
  <div class="col-sm-10">
      """),_display_(/*24.8*/if(flash.containsKey("success"))/*24.40*/ {_display_(Seq[Any](format.raw/*24.42*/("""
        """),format.raw/*25.9*/("""<div class="alert alert-success">
          """),_display_(/*26.12*/flash/*26.17*/.get("success")),format.raw/*26.32*/("""
        """),format.raw/*27.9*/("""</div>
      """)))}),format.raw/*28.8*/("""

      			"""),format.raw/*30.10*/("""<!-- Search Form -->
			<div id="actions">
        <form action=""""),_display_(/*32.24*/routes/*32.30*/.ProductCtrl.listProducts(catId)),format.raw/*32.62*/("""" method="GET">
         <input type="search" id="searchbox" name="filter" value=""""),_display_(/*33.68*/filter),format.raw/*33.74*/("""" placeholder="Filter by product name...">
         <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">
        </form>
       </div>
    <table class="table table-bordered table-hover table-condensed">   
      <thead>
        <tr>
          
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>         
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>   
        </tr>
      </thead>

      <tbody>
        """),_display_(/*51.10*/for(p<-products) yield /*51.26*/ {_display_(Seq[Any](format.raw/*51.28*/("""
          """),format.raw/*52.11*/("""<tr>
              """),_display_(/*53.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*53.104*/ {_display_(Seq[Any](format.raw/*53.106*/("""
                """),format.raw/*54.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*54.72*/(p.getId + ".jpg")),format.raw/*54.90*/(""""/></td>
            """)))}/*55.15*/else/*55.20*/{_display_(Seq[Any](format.raw/*55.21*/("""
                """),format.raw/*56.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*57.14*/("""
            """),format.raw/*58.13*/("""<td class="numeric">"""),_display_(/*58.34*/p/*58.35*/.getId),format.raw/*58.41*/("""</td>
            <td><a href=""""),_display_(/*59.27*/routes/*59.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*59.69*/("""">
                """),_display_(/*60.18*/p/*60.19*/.getName),format.raw/*60.27*/("""</td>
               </a>     
            <td>"""),_display_(/*62.18*/p/*62.19*/.getDescription),format.raw/*62.34*/("""</td>
            <td  class="numeric">"""),_display_(/*63.35*/p/*63.36*/.getStock),format.raw/*63.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*64.37*/("%.2f".format(p.getPrice))),format.raw/*64.64*/("""</td>
            <td><a href=""""),_display_(/*65.27*/routes/*65.33*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*65.67*/(""""  class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>

          </tr>
        """)))}),format.raw/*68.10*/("""
      """),format.raw/*69.7*/("""</tbody>

    </table>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],catId:Long,filter:String,user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,catId,filter,user,env)

  def f:((List[Product],List[Category],Long,String,User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,catId,filter,user,env) => apply(products,categories,catId,filter,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Mar 23 00:36:01 GMT 2019
                  SOURCE: D:/steph/ITSM/ShoppinCartLY/app/views/listProducts.scala.html
                  HASH: d777fcc0f0fa16bcce5ffa51edaf4a5629d9ff93
                  MATRIX: 651->1|690->35|728->68|1124->95|1339->214|1371->221|1400->242|1439->244|1469->248|1648->400|1663->406|1720->442|1799->495|1835->515|1875->517|1912->527|1949->537|1964->543|2027->585|2081->612|2091->613|2121->621|2161->633|2209->654|2219->655|2259->674|2319->704|2352->710|2430->762|2471->794|2511->796|2548->806|2621->852|2635->857|2671->872|2708->882|2753->897|2794->910|2889->978|2904->984|2957->1016|3068->1100|3095->1106|3639->1623|3671->1639|3711->1641|3751->1653|3799->1674|3897->1762|3938->1764|3984->1782|4066->1837|4105->1855|4147->1879|4160->1884|4199->1885|4245->1903|4364->1991|4406->2005|4454->2026|4464->2027|4491->2033|4551->2066|4566->2072|4623->2108|4671->2129|4681->2130|4710->2138|4787->2188|4797->2189|4833->2204|4901->2245|4911->2246|4941->2255|5011->2298|5059->2325|5119->2358|5134->2364|5189->2398|5348->2526|5383->2534
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|89->57|90->58|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|97->65|97->65|97->65|100->68|101->69
                  -- GENERATED --
              */
          