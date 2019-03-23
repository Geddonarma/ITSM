
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/steph/ITSM/ShoppinCartLY/conf/routes
// @DATE:Sat Mar 23 00:35:56 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
