
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[dao.ProjectResponse],play.mvc.Http.Request,String,HashMap[String, List[dao.ProjectResponse]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchResult:List[dao.ProjectResponse],request: play.mvc.Http.Request, keyWord: String, response: HashMap[String, List[dao.ProjectResponse]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.144*/("""
"""),_display_(/*2.2*/main("Freelancelot")/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
"""),format.raw/*3.1*/("""<html lang="en" class="no-js">
    <head>
       	<meta charset="utf-8">
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script src="public/javascripts/main.js"></script>
        <link rel="stylesheet" href="public/stylesheets/main.css">
        
        <!--[if IE]>
  		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
		<![endif]-->
    </head>
	<script>
        init()
                var webSocket;
                function init() """),format.raw/*20.33*/("""{"""),format.raw/*20.34*/("""
                    """),format.raw/*21.21*/("""initWebSocket();

            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""
            """),format.raw/*24.13*/("""async function initWebSocket() """),format.raw/*24.44*/("""{"""),format.raw/*24.45*/("""
                """),_display_(/*25.18*/for( (keyword, searchResult:List[dao.ProjectResponse]) <- response ) yield /*25.86*/{_display_(Seq[Any](format.raw/*25.87*/("""
                """),_display_(/*26.18*/if(request.session().get(keyword).isPresent() || keyword==keyWord)/*26.84*/{_display_(Seq[Any](format.raw/*26.85*/("""
                    """),format.raw/*27.21*/("""webSocket = new WebSocket(""""),_display_(/*27.49*/routes/*27.55*/.HomeController.socket(keyWord:String).webSocketURL(request)),format.raw/*27.115*/("""");
                    console.log("WebSocket -> ",webSocket)
                    webSocket.onopen = onOpen;
                    webSocket.onclose = onClose;
                    webSocket.onmessage = onMessage;
                    webSocket.onerror = onError;
                """)))}),format.raw/*33.18*/("""
			""")))}),format.raw/*34.5*/("""
            """),format.raw/*35.13*/("""}"""),format.raw/*35.14*/("""

			"""),format.raw/*37.4*/("""async function onOpen(evt) """),format.raw/*37.31*/("""{"""),format.raw/*37.32*/("""
                """),format.raw/*38.17*/("""writeToScreen("CONNECTED");
            """),format.raw/*39.13*/("""}"""),format.raw/*39.14*/("""

            """),format.raw/*41.13*/("""async function onClose(evt) """),format.raw/*41.41*/("""{"""),format.raw/*41.42*/("""
                """),format.raw/*42.17*/("""writeToScreen("DISCONNECTED");
            """),format.raw/*43.13*/("""}"""),format.raw/*43.14*/("""

            """),format.raw/*45.13*/("""async function onError(evt) """),format.raw/*45.41*/("""{"""),format.raw/*45.42*/("""
                """),format.raw/*46.17*/("""writeToScreen("ERROR: " + JSON.stringify(evt));
            """),format.raw/*47.13*/("""}"""),format.raw/*47.14*/("""
            
            """),format.raw/*49.13*/("""async function onMessage(evt) """),format.raw/*49.43*/("""{"""),format.raw/*49.44*/("""
            	"""),format.raw/*50.14*/("""var webSocketData = JSON.parse(evt.data);
            	console.log("Data from Web Socket call ↓");
				console.log(webSocketData);
                
                let headline = "";
                let tableContent = "";
                
                headline += "Search Term: " + """"),_display_(/*57.49*/keyWord),format.raw/*57.56*/("""" + "  |  Flesch Index: " + """"),_display_(/*57.86*/{searchResult.map(_.flesch_index).sum/searchResult.size()}),format.raw/*57.144*/("""" + "  |  FKGL: " + """"),_display_(/*57.166*/{searchResult.map(_.fkgl).sum/searchResult.size()}),format.raw/*57.216*/("""";
                document.getElementById("search_term").innerHTML = headline;
                
                tableContent += "<thead><tr><th>Sr.No</th><th>Owner ID</th><th>Time Submitted</th><th>Project Title</th><th>Project Type</th><th>Project Skills</th><th>Project Stats</th><th>Flesch Index</th><th>FKG Index</th><th>Edu. Level</th></tr></thead>";
                
                if (webSocketData.length!=0) """),format.raw/*62.46*/("""{"""),format.raw/*62.47*/("""
                	"""),format.raw/*63.18*/("""for (let i = 0; i < webSocketData.length; i++) """),format.raw/*63.65*/("""{"""),format.raw/*63.66*/("""
                		"""),format.raw/*64.19*/("""let asyncData = webSocketData[i];
                		tableContent +=
                		"<tr><td>" + (i+1) + "</td>" +
			    		"<td>" + asyncData.owner_id + "</td>" +
			    		"<td>" + asyncData.time_submitted + "</td>" +
			    		"<td><a href=\"https://www.freelancer.com/projects/" + asyncData.seo_url + "?w=f&ngsw-bypass=\" target=\"_blank\">" + asyncData.title + "</a></td>" +
			    		"<td>" + asyncData.project_type + "</td><td>";
			    		
			    		if (asyncData.skills.length > 0) """),format.raw/*72.43*/("""{"""),format.raw/*72.44*/("""
                            """),format.raw/*73.29*/("""if (asyncData.skills.length == 1) """),format.raw/*73.63*/("""{"""),format.raw/*73.64*/("""
                            	"""),format.raw/*74.30*/("""tableContent += "<a href=\"/Skills?skill="+ asyncData.skills[0]+ "\" target=\"_blank\">" + asyncData.skills[0] + "</a>";
                            """),format.raw/*75.29*/("""}"""),format.raw/*75.30*/(""" """),format.raw/*75.31*/("""else """),format.raw/*75.36*/("""{"""),format.raw/*75.37*/("""
                            	"""),format.raw/*76.30*/("""for (let j = 0; j < asyncData.skills.length; j++) """),format.raw/*76.80*/("""{"""),format.raw/*76.81*/("""
                                   	"""),format.raw/*77.37*/("""let skill = asyncData.skills[j];
                                   	tableContent += "<a href=\"/Skills?skill=" + skill + "\" target=\"_blank\">" + skill + ", " + "</a>";                            
    			    			"""),format.raw/*79.15*/("""}"""),format.raw/*79.16*/("""	
                            """),format.raw/*80.29*/("""}"""),format.raw/*80.30*/("""
			    		"""),format.raw/*81.10*/("""}"""),format.raw/*81.11*/("""
			    		
			    		"""),format.raw/*83.10*/("""tableContent += "</td><td><a href=\"/Stats/" + asyncData.prevDescriptor+ "\" target=\"_blank\">" + "Stats" + "</a></td>" +
			    		"<td>" + asyncData.flesch_index + "</td>" + 
			    		"<td>" + asyncData.fkgl + "</td>" +
			    		"<td>" + asyncData.edu_level + "</td></tr>";
                	"""),format.raw/*87.18*/("""}"""),format.raw/*87.19*/("""
                """),format.raw/*88.17*/("""}"""),format.raw/*88.18*/("""
                
                """),format.raw/*90.17*/("""document.getElementById("infoTable").innerHTML = tableContent;
            """),format.raw/*91.13*/("""}"""),format.raw/*91.14*/("""
   
    """),format.raw/*93.5*/("""</script>
    <body class="FreeLance-soen">
    
    <div class="container">
   	<center><h3>Welcome to FreeLanceLot</h3>      
        <main class="main-wrap-open">
            <div class="center">
                <form class="form-inline" method="GET" action="/SearchPage" onsubmit="myFunction()">
                    """),_display_(/*101.22*/if(request.session().data().size() < 9)/*101.61*/ {_display_(Seq[Any](format.raw/*101.63*/("""
                    	"""),format.raw/*102.22*/("""<input class="form-control" id="s_val" name="keyWord" type="text" placeholder="Enter Search Terms"/>
                    	<input type="submit" id="btn_submit" class="btn btn-success" value="Search" />
                    """)))}/*104.23*/else/*104.28*/{_display_(Seq[Any](format.raw/*104.29*/("""
                    	"""),format.raw/*105.22*/("""<input class="form-control" id="s_val" name="keyWord" type="text" placeholder="Enter Search Terms" disabled/>
                    	<input type="submit" id="btn_submit" class="btn btn-success" value="Search" disabled/>
                    """)))}),format.raw/*107.22*/("""
                     
                """),format.raw/*109.17*/("""</form>
                <br>
                <div class="main-body">
           
                </div>
            </div>
        </main></center>
        <div class="search-body">
        """),_display_(/*117.10*/if(searchResult.isEmpty() && searchResult.size()==0)/*117.62*/ {_display_(Seq[Any](format.raw/*117.64*/("""
        	"""),format.raw/*118.10*/("""<div class="search">
        	<table id="infoTable" class="table">
	        	<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
	        </table>
	        </div>
        """)))}/*123.11*/else/*123.16*/{_display_(Seq[Any](format.raw/*123.17*/("""
        	"""),format.raw/*124.10*/("""<center><h5><a href="/GlobalStats" target="_blank">Global Stats</a></h5></center>
        	<h5 class="pheadline" id="search_term">Search Term: """),_display_(/*125.63*/keyWord),format.raw/*125.70*/("""  """),format.raw/*125.72*/("""|  Flesch Index: """),_display_(/*125.90*/{searchResult.map(_.flesch_index).sum/searchResult.size()}),format.raw/*125.148*/("""  """),format.raw/*125.150*/("""|  FKGL: """),_display_(/*125.160*/{searchResult.map(_.fkgl).sum/searchResult.size()}),format.raw/*125.210*/("""</h5>	
        	<div class="search">
        	<table id="infoTable" class="table">
			"""),_display_(/*128.5*/if(searchResult!=null && searchResult.size()!=0)/*128.53*/{_display_(Seq[Any](format.raw/*128.54*/("""
					"""),format.raw/*129.6*/("""<thead>
      					<tr>
      					<th>Sr.No</th>
        				<th>Owner ID</th>
        				<th>Time Submitted</th>
        				<th>Project Title</th>
        				<th>Project Type</th>
        				<th>Project Skills</th>
        				<th>Project Stats</th>
        				<th>Flesch Index</th>
        				<th>FKG Index</th>
        				<th>Edu. Level</th>
      					</tr>
    				</thead>
    				"""),_display_(/*143.10*/for((project, index)<-searchResult.zipWithIndex) yield /*143.58*/{_display_(Seq[Any](format.raw/*143.59*/("""
					"""),format.raw/*144.6*/("""<tr>
						<td>"""),_display_(/*145.12*/(index+1)),format.raw/*145.21*/("""</td>
			    		<td><a href=""""),_display_(/*146.24*/routes/*146.30*/.HomeController.profile(project.owner_id)),format.raw/*146.71*/(""""  target="_blank">"""),_display_(/*146.91*/project/*146.98*/.owner_id),format.raw/*146.107*/("""</a> </td>
		    			<td>"""),_display_(/*147.15*/project/*147.22*/.time_submitted),format.raw/*147.37*/("""</td>
		    			<td><a href="https://www.freelancer.com/projects/"""),_display_(/*148.60*/project/*148.67*/.seo_url),format.raw/*148.75*/("""?w=f&ngsw-bypass=" target="_blank">"""),_display_(/*148.111*/project/*148.118*/.title),format.raw/*148.124*/("""</a></td>
		    			<td>"""),_display_(/*149.15*/project/*149.22*/.project_type),format.raw/*149.35*/("""</td>
			   			<td>"""),_display_(/*150.15*/for((skill, index)<-project.skills.zipWithIndex) yield /*150.63*/{_display_(Seq[Any](format.raw/*150.64*/("""
			   				"""),_display_(/*151.12*/if(project.skills.size() == (index + 1))/*151.52*/ {_display_(Seq[Any](format.raw/*151.54*/("""
			   					"""),format.raw/*152.12*/("""<a href="/Skills?skill="""),_display_(/*152.36*/skill),format.raw/*152.41*/("""" target="_blank">"""),_display_(/*152.60*/skill),format.raw/*152.65*/("""</a>
			   				""")))}/*153.13*/else/*153.18*/{_display_(Seq[Any](format.raw/*153.19*/("""
			    				"""),format.raw/*154.12*/("""<a href="/Skills?skill="""),_display_(/*154.36*/skill),format.raw/*154.41*/("""" target="_blank">"""),_display_(/*154.60*/skill),format.raw/*154.65*/("""</a>,
			    			""")))}),format.raw/*155.12*/("""
			    		""")))}),format.raw/*156.11*/("""</td>
			   			<td><a href="/Stats/"""),_display_(/*157.31*/project/*157.38*/.prevDescriptor),format.raw/*157.53*/("""" target="_blank">Stats</a></td>
			    		<td>"""),_display_(/*158.15*/project/*158.22*/.flesch_index),format.raw/*158.35*/("""</td>
			    		<td>"""),_display_(/*159.15*/project/*159.22*/.fkgl),format.raw/*159.27*/("""</td>
			    		<td>"""),_display_(/*160.15*/project/*160.22*/.edu_level),format.raw/*160.32*/("""</td>
			    	</tr>
					""")))}),format.raw/*162.7*/("""
				""")))}/*163.7*/else/*163.11*/{_display_(Seq[Any](format.raw/*163.12*/("""
					"""),format.raw/*164.6*/("""<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
				""")))}),format.raw/*165.6*/("""
			"""),format.raw/*166.4*/("""</table>
		</div>
        	"""),_display_(/*168.11*/for((keyword, results) <- response) yield /*168.46*/{_display_(Seq[Any](format.raw/*168.47*/("""
        	"""),_display_(/*169.11*/if(keyword !=keyWord)/*169.32*/{_display_(Seq[Any](format.raw/*169.33*/(""" 
        	"""),_display_(/*170.11*/if(request.session().get(keyword).isPresent())/*170.57*/{_display_(Seq[Any](format.raw/*170.58*/("""
        	"""),format.raw/*171.10*/("""<br><h5 class="pheadline" id="search_term">Search Term: """),_display_(/*171.67*/keyword),format.raw/*171.74*/("""  """),format.raw/*171.76*/("""|  Flesch Index: """),_display_(/*171.94*/{results.map(_.flesch_index).sum/results.size()}),format.raw/*171.142*/("""  """),format.raw/*171.144*/("""|  FKGL: """),_display_(/*171.154*/{results.map(_.fkgl).sum/results.size()}),format.raw/*171.194*/("""</h5>	
        	
        	<div class="search">
        	<table id="infoTable" class="table">
			"""),_display_(/*175.5*/if(results!=null && results.size()!=0)/*175.43*/{_display_(Seq[Any](format.raw/*175.44*/("""
					"""),format.raw/*176.6*/("""<thead>
      					<tr>
      					<th>Sr.No</th>
        				<th>Owner ID</th>
        				<th>Time Submitted</th>
        				<th>Project Title</th>
        				<th>Project Type</th>
        				<th>Project Skills</th>
        				<th>Project Stats</th>
        				<th>Flesch Index</th>
        				<th>FKG Index</th>
        				<th>Edu. Level</th>
      					</tr>
    				</thead>				
					"""),_display_(/*190.7*/for((project, index)<-results.zipWithIndex) yield /*190.50*/{_display_(Seq[Any](format.raw/*190.51*/("""
					"""),format.raw/*191.6*/("""<tr>
						<td>"""),_display_(/*192.12*/(index+1)),format.raw/*192.21*/("""</td>
			    		<td><a href=""""),_display_(/*193.24*/routes/*193.30*/.HomeController.profile(project.owner_id)),format.raw/*193.71*/(""""  target="_blank">"""),_display_(/*193.91*/project/*193.98*/.owner_id),format.raw/*193.107*/("""</a> </td>
			    		<td>"""),_display_(/*194.15*/project/*194.22*/.time_submitted),format.raw/*194.37*/("""</td>
			    		<td><a href="https://www.freelancer.com/projects/"""),_display_(/*195.60*/project/*195.67*/.seo_url),format.raw/*195.75*/("""?w=f&ngsw-bypass=" target="_blank">"""),_display_(/*195.111*/project/*195.118*/.title),format.raw/*195.124*/("""</a></td>
			   			<td>"""),_display_(/*196.15*/project/*196.22*/.project_type),format.raw/*196.35*/("""</td>
			   			<td>"""),_display_(/*197.15*/for((skill, index)<-project.skills.zipWithIndex) yield /*197.63*/{_display_(Seq[Any](format.raw/*197.64*/("""
			   				"""),_display_(/*198.12*/if(project.skills.size() == (index + 1))/*198.52*/ {_display_(Seq[Any](format.raw/*198.54*/("""
			    				"""),format.raw/*199.12*/("""<a href="/Skills?skill="""),_display_(/*199.36*/skill),format.raw/*199.41*/("""" target="_blank">"""),_display_(/*199.60*/skill),format.raw/*199.65*/("""</a>
			    			""")))}/*200.13*/else/*200.18*/{_display_(Seq[Any](format.raw/*200.19*/("""
			    				"""),format.raw/*201.12*/("""<a href="/Skills?skill="""),_display_(/*201.36*/skill),format.raw/*201.41*/("""" target="_blank">"""),_display_(/*201.60*/skill),format.raw/*201.65*/("""</a>,
			    			""")))}),format.raw/*202.12*/("""
			    		""")))}),format.raw/*203.11*/("""</td>
			   			<td><a href="/Stats/"""),_display_(/*204.31*/project/*204.38*/.prevDescriptor),format.raw/*204.53*/("""" target="_blank">Stats</a></td>
			   			<td>"""),_display_(/*205.15*/project/*205.22*/.flesch_index),format.raw/*205.35*/("""</td>
			   			<td>"""),_display_(/*206.15*/project/*206.22*/.fkgl),format.raw/*206.27*/("""</td>
			    		<td>"""),_display_(/*207.15*/project/*207.22*/.edu_level),format.raw/*207.32*/("""</td>
			    	</tr>
					""")))}),format.raw/*209.7*/("""
				""")))}/*210.7*/else/*210.11*/{_display_(Seq[Any](format.raw/*210.12*/("""
					"""),format.raw/*211.6*/("""<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
				""")))}),format.raw/*212.6*/("""
			"""),format.raw/*213.4*/("""</table>
		</div>
			""")))}),format.raw/*215.5*/("""
        	""")))}),format.raw/*216.11*/("""
        	""")))}),format.raw/*217.11*/("""
        	 """)))}),format.raw/*218.12*/("""
        """),format.raw/*219.9*/("""</div>
	</div>
        
		<br><br><br>
        <script src=""""),_display_(/*223.23*/routes/*223.29*/.Assets.versioned("javascripts/search.js")),format.raw/*223.71*/(""""></script>
    </body>
</html>
""")))}))
      }
    }
  }

  def render(searchResult:List[dao.ProjectResponse],request:play.mvc.Http.Request,keyWord:String,response:HashMap[String, List[dao.ProjectResponse]]): play.twirl.api.HtmlFormat.Appendable = apply(searchResult,request,keyWord,response)

  def f:((List[dao.ProjectResponse],play.mvc.Http.Request,String,HashMap[String, List[dao.ProjectResponse]]) => play.twirl.api.HtmlFormat.Appendable) = (searchResult,request,keyWord,response) => apply(searchResult,request,keyWord,response)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 11971f77e5a642262e60f83491a4d37e6f327ce9
                  MATRIX: 998->1|1236->143|1264->146|1292->166|1330->167|1358->169|2193->976|2222->977|2272->999|2332->1031|2361->1032|2403->1046|2462->1077|2491->1078|2537->1097|2621->1165|2660->1166|2706->1185|2781->1251|2820->1252|2870->1274|2925->1302|2940->1308|3022->1368|3337->1652|3373->1658|3415->1672|3444->1673|3478->1680|3533->1707|3562->1708|3608->1726|3677->1767|3706->1768|3750->1784|3806->1812|3835->1813|3881->1831|3953->1875|3982->1876|4026->1892|4082->1920|4111->1921|4157->1939|4246->2000|4275->2001|4331->2029|4389->2059|4418->2060|4461->2075|4782->2369|4810->2376|4867->2406|4947->2464|4997->2486|5069->2536|5521->2960|5550->2961|5597->2980|5672->3027|5701->3028|5749->3048|6273->3544|6302->3545|6360->3575|6422->3609|6451->3610|6510->3641|6688->3791|6717->3792|6746->3793|6779->3798|6808->3799|6867->3830|6945->3880|6974->3881|7040->3919|7283->4134|7312->4135|7371->4166|7400->4167|7439->4178|7468->4179|7518->4201|7843->4498|7872->4499|7918->4517|7947->4518|8011->4554|8115->4630|8144->4631|8182->4642|8539->4971|8588->5010|8629->5012|8681->5035|8925->5260|8939->5265|8979->5266|9031->5289|9304->5530|9374->5571|9601->5770|9663->5822|9704->5824|9744->5835|9953->6025|9967->6030|10007->6031|10047->6042|10220->6187|10249->6194|10280->6196|10326->6214|10407->6272|10439->6274|10478->6284|10551->6334|10668->6424|10726->6472|10766->6473|10801->6480|11239->6890|11304->6938|11344->6939|11379->6946|11424->6963|11455->6972|11513->7002|11529->7008|11592->7049|11640->7069|11657->7076|11689->7085|11743->7111|11760->7118|11797->7133|11891->7199|11908->7206|11938->7214|12003->7250|12021->7257|12050->7263|12103->7288|12120->7295|12155->7308|12204->7329|12269->7377|12309->7378|12350->7391|12400->7431|12441->7433|12483->7446|12535->7470|12562->7475|12609->7494|12636->7499|12673->7517|12687->7522|12727->7523|12769->7536|12821->7560|12848->7565|12895->7584|12922->7589|12972->7607|13016->7619|13081->7656|13098->7663|13135->7678|13211->7726|13228->7733|13263->7746|13312->7767|13329->7774|13356->7779|13405->7800|13422->7807|13454->7817|13513->7845|13539->7853|13553->7857|13593->7858|13628->7865|13729->7935|13762->7940|13820->7970|13872->8005|13912->8006|13952->8018|13983->8039|14023->8040|14064->8053|14120->8099|14160->8100|14200->8111|14285->8168|14314->8175|14345->8177|14391->8195|14462->8243|14494->8245|14533->8255|14596->8295|14724->8396|14772->8434|14812->8435|14847->8442|15285->8853|15345->8896|15385->8897|15420->8904|15465->8921|15496->8930|15554->8960|15570->8966|15633->9007|15681->9027|15698->9034|15730->9043|15784->9069|15801->9076|15838->9091|15932->9157|15949->9164|15979->9172|16044->9208|16062->9215|16091->9221|16144->9246|16161->9253|16196->9266|16245->9287|16310->9335|16350->9336|16391->9349|16441->9389|16482->9391|16524->9404|16576->9428|16603->9433|16650->9452|16677->9457|16714->9475|16728->9480|16768->9481|16810->9494|16862->9518|16889->9523|16936->9542|16963->9547|17013->9565|17057->9577|17122->9614|17139->9621|17176->9636|17252->9684|17269->9691|17304->9704|17353->9725|17370->9732|17397->9737|17446->9758|17463->9765|17495->9775|17554->9803|17580->9811|17594->9815|17634->9816|17669->9823|17770->9893|17803->9898|17858->9922|17902->9934|17946->9946|17991->9959|18029->9969|18122->10034|18138->10040|18202->10082
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|51->20|51->20|52->21|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|58->27|64->33|65->34|66->35|66->35|68->37|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|73->42|74->43|74->43|76->45|76->45|76->45|77->46|78->47|78->47|80->49|80->49|80->49|81->50|88->57|88->57|88->57|88->57|88->57|88->57|93->62|93->62|94->63|94->63|94->63|95->64|103->72|103->72|104->73|104->73|104->73|105->74|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|110->79|110->79|111->80|111->80|112->81|112->81|114->83|118->87|118->87|119->88|119->88|121->90|122->91|122->91|124->93|132->101|132->101|132->101|133->102|135->104|135->104|135->104|136->105|138->107|140->109|148->117|148->117|148->117|149->118|154->123|154->123|154->123|155->124|156->125|156->125|156->125|156->125|156->125|156->125|156->125|156->125|159->128|159->128|159->128|160->129|174->143|174->143|174->143|175->144|176->145|176->145|177->146|177->146|177->146|177->146|177->146|177->146|178->147|178->147|178->147|179->148|179->148|179->148|179->148|179->148|179->148|180->149|180->149|180->149|181->150|181->150|181->150|182->151|182->151|182->151|183->152|183->152|183->152|183->152|183->152|184->153|184->153|184->153|185->154|185->154|185->154|185->154|185->154|186->155|187->156|188->157|188->157|188->157|189->158|189->158|189->158|190->159|190->159|190->159|191->160|191->160|191->160|193->162|194->163|194->163|194->163|195->164|196->165|197->166|199->168|199->168|199->168|200->169|200->169|200->169|201->170|201->170|201->170|202->171|202->171|202->171|202->171|202->171|202->171|202->171|202->171|202->171|206->175|206->175|206->175|207->176|221->190|221->190|221->190|222->191|223->192|223->192|224->193|224->193|224->193|224->193|224->193|224->193|225->194|225->194|225->194|226->195|226->195|226->195|226->195|226->195|226->195|227->196|227->196|227->196|228->197|228->197|228->197|229->198|229->198|229->198|230->199|230->199|230->199|230->199|230->199|231->200|231->200|231->200|232->201|232->201|232->201|232->201|232->201|233->202|234->203|235->204|235->204|235->204|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|240->209|241->210|241->210|241->210|242->211|243->212|244->213|246->215|247->216|248->217|249->218|250->219|254->223|254->223|254->223
                  -- GENERATED --
              */
          