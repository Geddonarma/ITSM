
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ITSM/ShoppinCartLY/conf/routes
// @DATE:Wed Apr 03 13:32:37 IST 2019


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
