
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/AD/ITSM/ShoppinCartLY/conf/routes
// @DATE:Sat Apr 27 13:16:16 IST 2019


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
