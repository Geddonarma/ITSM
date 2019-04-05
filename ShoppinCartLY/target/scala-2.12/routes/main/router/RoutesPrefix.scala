
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ITSM/ShoppinCartLY/conf/routes
// @DATE:Fri Apr 05 11:10:41 IST 2019


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
