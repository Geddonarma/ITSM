
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/AS/ITSM/ShoppinCartLY/conf/routes
// @DATE:Sat Apr 27 11:42:41 IST 2019


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
