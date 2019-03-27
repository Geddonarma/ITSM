
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Downloads/ITSM/ShoppinCartLY/conf/routes
// @DATE:Wed Mar 27 10:37:54 GMT 2019


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
