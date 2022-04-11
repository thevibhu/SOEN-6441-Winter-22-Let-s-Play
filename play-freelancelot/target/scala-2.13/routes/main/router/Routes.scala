// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:13
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:13
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """freelancelot""", """controllers.HomeController.landingPage()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """SearchPage""", """controllers.HomeController.index(request:Request, keyWord:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Stats/""" + "$" + """descriptor<[^/]+>""", """controllers.HomeController.stats(descriptor:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """GlobalStats""", """controllers.HomeController.globalStats()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Skills""", """controllers.HomeController.skills(skill:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_landingPage0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("freelancelot")))
  )
  private[this] lazy val controllers_HomeController_landingPage0_invoker = createInvoker(
    HomeController_0.landingPage(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "landingPage",
      Nil,
      "GET",
      this.prefix + """freelancelot""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("SearchPage")))
  )
  private[this] lazy val controllers_HomeController_index1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.index(fakeValue[play.mvc.Http.Request], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[play.mvc.Http.Request], classOf[String]),
      "GET",
      this.prefix + """SearchPage""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_stats2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Stats/"), DynamicPart("descriptor", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_stats2_invoker = createInvoker(
    HomeController_0.stats(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "stats",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Stats/""" + "$" + """descriptor<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_globalStats3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("GlobalStats")))
  )
  private[this] lazy val controllers_HomeController_globalStats3_invoker = createInvoker(
    HomeController_0.globalStats(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "globalStats",
      Nil,
      "GET",
      this.prefix + """GlobalStats""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_skills4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Skills")))
  )
  private[this] lazy val controllers_HomeController_skills4_invoker = createInvoker(
    HomeController_0.skills(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "skills",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Skills""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_landingPage0_route(params@_) =>
      call { 
        controllers_HomeController_landingPage0_invoker.call(HomeController_0.landingPage())
      }
  
    // @LINE:7
    case controllers_HomeController_index1_route(params@_) =>
      call(params.fromQuery[String]("keyWord", None)) { (keyWord) =>
        controllers_HomeController_index1_invoker.call(
          req => HomeController_0.index(req, keyWord))
      }
  
    // @LINE:8
    case controllers_HomeController_stats2_route(params@_) =>
      call(params.fromPath[String]("descriptor", None)) { (descriptor) =>
        controllers_HomeController_stats2_invoker.call(HomeController_0.stats(descriptor))
      }
  
    // @LINE:9
    case controllers_HomeController_globalStats3_route(params@_) =>
      call { 
        controllers_HomeController_globalStats3_invoker.call(HomeController_0.globalStats())
      }
  
    // @LINE:10
    case controllers_HomeController_skills4_route(params@_) =>
      call(params.fromQuery[String]("skill", None)) { (skill) =>
        controllers_HomeController_skills4_invoker.call(HomeController_0.skills(skill))
      }
  
    // @LINE:13
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
