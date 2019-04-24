
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/IT/ITSM/ShoppinCartLY/conf/routes
// @DATE:Tue Apr 23 21:34:36 IST 2019


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
