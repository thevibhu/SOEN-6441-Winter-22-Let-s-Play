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

  
    // @LINE:8
    def userProj(owner_id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "UserProjects" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("owner_id", owner_id)))))
    }
  
    // @LINE:13
    def skills(skill:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Skills" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("skill", skill)))))
    }
  
    // @LINE:12
    def globalStats(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "GlobalStats")
    }
  
    // @LINE:7
    def profile(owner_id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "UserProfile" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("owner_id", owner_id)))))
    }
  
    // @LINE:9
    def landingPage(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "freelancelot")
    }
  
    // @LINE:6
    def index(keyWord:String): Call = {
    
      (keyWord: @unchecked) match {
      
        // @LINE:6
        case (keyWord)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "SearchPage" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("keyWord", keyWord)))))
      
      }
    
    }
  
    // @LINE:11
    def stats(descriptor:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Stats/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("descriptor", descriptor)))
    }
  
    // @LINE:14
    def socket(keyWord:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "socket" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("keyWord", keyWord)))))
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
