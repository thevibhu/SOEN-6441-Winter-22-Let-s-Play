// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def skills(skill:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Skills" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("skill", skill)))))
    }
  
    // @LINE:9
    def globalStats(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "GlobalStats")
    }
  
    // @LINE:6
    def landingPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "freelancelot")
    }
  
    // @LINE:7
    def index(keyWord:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "SearchPage" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("keyWord", keyWord)))))
    }
  
    // @LINE:8
    def stats(descriptor:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Stats/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("descriptor", descriptor)))
    }
  
  }

  // @LINE:13
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
