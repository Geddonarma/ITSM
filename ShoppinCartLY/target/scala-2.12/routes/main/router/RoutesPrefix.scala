
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/ITSM/ShoppinCartLY/conf/routes
// @DATE:Thu Mar 14 11:45:46 GMT 2019


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
