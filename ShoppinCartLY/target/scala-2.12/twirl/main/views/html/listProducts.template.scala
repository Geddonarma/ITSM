
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
                  DATE: Mon Mar 25 10:17:43 GMT 2019
                  SOURCE: /home/wdd/Desktop/ITSM/ShoppinCartLY/app/views/listProducts.scala.html
                  HASH: afd32fe75c66855941cc14f040662303adaa17cc
                  MATRIX: 651->1|690->34|728->66|1124->92|1339->211|1368->215|1397->236|1436->238|1464->240|1637->386|1652->392|1709->428|1787->480|1823->500|1863->502|1899->511|1936->521|1951->527|2014->569|2068->596|2078->597|2108->605|2147->616|2195->637|2205->638|2245->657|2303->685|2335->690|2410->739|2451->771|2491->773|2527->782|2599->827|2613->832|2649->847|2685->856|2729->870|2768->881|2861->947|2876->953|2929->985|3039->1068|3066->1074|3592->1573|3624->1589|3664->1591|3703->1602|3750->1622|3848->1710|3889->1712|3934->1729|4016->1784|4055->1802|4096->1825|4109->1830|4148->1831|4193->1848|4311->1935|4352->1948|4400->1969|4410->1970|4437->1976|4496->2008|4511->2014|4568->2050|4615->2070|4625->2071|4654->2079|4729->2127|4739->2128|4775->2143|4842->2183|4852->2184|4882->2193|4951->2235|4999->2262|5058->2294|5073->2300|5128->2334|5284->2459|5318->2466
                  LINES: 24->1|25->2|26->3|31->4|36->4|39->7|39->7|39->7|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|49->17|49->17|49->17|49->17|50->18|50->18|50->18|50->18|52->20|53->21|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|64->32|64->32|64->32|65->33|65->33|83->51|83->51|83->51|84->52|85->53|85->53|85->53|86->54|86->54|86->54|87->55|87->55|87->55|88->56|89->57|90->58|90->58|90->58|90->58|91->59|91->59|91->59|92->60|92->60|92->60|94->62|94->62|94->62|95->63|95->63|95->63|96->64|96->64|97->65|97->65|97->65|100->68|101->69
                  -- GENERATED --
              */
          