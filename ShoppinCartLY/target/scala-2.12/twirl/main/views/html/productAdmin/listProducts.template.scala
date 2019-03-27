
package views.html.productAdmin

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
/*2.2*/import models.products.Category
/*3.2*/import models.products.Product
/*4.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],List[Category],User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(products: List[Product], categories: List[Category], user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.93*/("""

"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Products</p>
<br>
<div class="row">
  <div class="col-sm-3">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.AdminProductCtrl.listProducts(0)),format.raw/*15.56*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*17.64*/("""" class="list-group-item">"""),_display_(/*17.91*/c/*17.92*/.getName),format.raw/*17.100*/("""
          """),format.raw/*18.11*/("""<span class="badge">"""),_display_(/*18.32*/c/*18.33*/.getProducts.size()),format.raw/*18.52*/("""</span>
        </a>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</div>
  </div>
  <div class="col-sm-9">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*25.8*/if(flash.containsKey("success"))/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""
        """),format.raw/*26.9*/("""<div class="alert alert-success">
          """),_display_(/*27.12*/flash/*27.17*/.get("success")),format.raw/*27.32*/("""
        """),format.raw/*28.9*/("""</div>
      """)))}),format.raw/*29.8*/("""
      """),format.raw/*30.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Description</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*43.10*/for(p<-products) yield /*43.26*/ {_display_(Seq[Any](format.raw/*43.28*/("""
          """),format.raw/*44.11*/("""<tr>
              """),_display_(/*45.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*45.104*/ {_display_(Seq[Any](format.raw/*45.106*/("""
                """),format.raw/*46.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*46.72*/(p.getId + ".jpg")),format.raw/*46.90*/(""""/></td>
            """)))}/*47.15*/else/*47.20*/{_display_(Seq[Any](format.raw/*47.21*/("""
                """),format.raw/*48.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*49.14*/("""
            """),format.raw/*50.13*/("""<td class="numeric">"""),_display_(/*50.34*/p/*50.35*/.getId),format.raw/*50.41*/("""</td>
            <td><a href=""""),_display_(/*51.27*/routes/*51.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*51.69*/("""">
             """),_display_(/*52.15*/p/*52.16*/.getName),format.raw/*52.24*/("""</td>
            </a>
     
            <td>"""),_display_(/*55.18*/p/*55.19*/.getDescription),format.raw/*55.34*/("""</td>
            <td  class="numeric">"""),_display_(/*56.35*/p/*56.36*/.getStock),format.raw/*56.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*57.37*/("%.2f".format(p.getPrice))),format.raw/*57.64*/("""</td>
            <td>
              <a href=""""),_display_(/*59.25*/routes/*59.31*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*59.71*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*63.25*/routes/*63.31*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*63.71*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*68.10*/("""
      """),format.raw/*69.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*74.17*/routes/*74.23*/.AdminProductCtrl.addProduct()),format.raw/*74.53*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[Product],List[Category],User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 27 10:37:55 GMT 2019
                  SOURCE: /home/wdd/Downloads/ITSM/ShoppinCartLY/app/views/productAdmin/listProducts.scala.html
                  HASH: 28a0924eb895ac85e711f29cdd969f3c0a70ee2f
                  MATRIX: 664->2|703->35|741->67|1125->93|1311->184|1339->187|1368->208|1407->210|1435->212|1608->358|1623->364|1677->397|1755->449|1791->469|1831->471|1867->480|1904->490|1919->496|1979->535|2033->562|2043->563|2073->571|2112->582|2160->603|2170->604|2210->623|2268->651|2300->656|2443->773|2484->805|2524->807|2560->816|2632->861|2646->866|2682->881|2718->890|2762->904|2796->911|3087->1175|3119->1191|3159->1193|3198->1204|3245->1224|3343->1312|3384->1314|3429->1331|3511->1386|3550->1404|3591->1427|3604->1432|3643->1433|3688->1450|3806->1537|3847->1550|3895->1571|3905->1572|3932->1578|3991->1610|4006->1616|4063->1652|4107->1669|4117->1670|4146->1678|4219->1724|4229->1725|4265->1740|4332->1780|4342->1781|4372->1790|4441->1832|4489->1859|4563->1906|4578->1912|4639->1952|4836->2122|4851->2128|4912->2168|5132->2357|5166->2364|5241->2412|5256->2418|5307->2448
                  LINES: 24->2|25->3|26->4|31->5|36->5|38->7|38->7|38->7|40->9|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|74->43|74->43|74->43|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|80->49|81->50|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|90->59|90->59|90->59|94->63|94->63|94->63|99->68|100->69|105->74|105->74|105->74
                  -- GENERATED --
              */
          