// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def userProj: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.userProj",
      """
        function(owner_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "UserProjects" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("owner_id", owner_id0)])})
        }
      """
    )
  
    // @LINE:13
    def skills: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.skills",
      """
        function(skill0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Skills" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("skill", skill0)])})
        }
      """
    )
  
    // @LINE:12
    def globalStats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.globalStats",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GlobalStats"})
        }
      """
    )
  
    // @LINE:7
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.profile",
      """
        function(owner_id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "UserProfile" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("owner_id", owner_id0)])})
        }
      """
    )
  
    // @LINE:9
    def landingPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.landingPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "freelancelot"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function(keyWord0) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "SearchPage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("keyWord", keyWord0)])})
          }
        
        }
      """
    )
  
    // @LINE:11
    def stats: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.stats",
      """
        function(descriptor0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Stats/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("descriptor", descriptor0))})
        }
      """
    )
  
    // @LINE:14
    def socket: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.socket",
      """
        function(keyWord0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "socket" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("keyWord", keyWord0)])})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
