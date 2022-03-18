
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

"""),_display_(/*3.2*/main("Freelancelot")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
"""),format.raw/*4.1*/("""<html lang="en" class="no-js">
    <head>
       	<meta charset="utf-8">
  		<meta name="viewport" content="width=device-width, initial-scale=1">
  		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script src="public/javascripts/main.js"></script>
        <link rel="stylesheet" href="public/stylesheets/main.css">
        
        <!--[if IE]>
  		<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js">
		<![endif]-->
    </head>
    <body class="FreeLance-soen">
    
    <div class="container">
   	<center><h3>Welcome to FreeLanceLot</h3>      
        <main class="main-wrap-open">
            <div class="center">
                <form class="form-inline" method="GET" action="/SearchPage" onsubmit="myFunction()">
                    """),_display_(/*25.22*/if(request.session().data().size() < 9)/*25.61*/ {_display_(Seq[Any](format.raw/*25.63*/("""
                    	"""),format.raw/*26.22*/("""<input class="form-control" id="s_val" name="keyWord" type="text" placeholder="Enter Search Terms"/>
                    	<input type="submit" id="btn_submit" class="btn btn-success" value="Search" />
                    """)))}/*28.23*/else/*28.28*/{_display_(Seq[Any](format.raw/*28.29*/("""
                    	"""),format.raw/*29.22*/("""<input class="form-control" id="s_val" name="keyWord" type="text" placeholder="Enter Search Terms" disabled/>
                    	<input type="submit" id="btn_submit" class="btn btn-success" value="Search" disabled/>
                    """)))}),format.raw/*31.22*/("""
                     
                """),format.raw/*33.17*/("""</form>
                <br>
                <div class="main-body">
           
                </div>
            </div>
        </main></center>
        <div class="search-body">
        """),_display_(/*41.10*/if(searchResult.isEmpty() && searchResult.size()==0)/*41.62*/ {_display_(Seq[Any](format.raw/*41.64*/("""
        	"""),format.raw/*42.10*/("""<div class="search">
        	<table id="infoTable" class="table">
	        	<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
	        </table>
	        </div>
        """)))}/*47.11*/else/*47.16*/{_display_(Seq[Any](format.raw/*47.17*/("""
        	"""),format.raw/*48.10*/("""<center><h5><a href="/GlobalStats" target="_blank">Global Stats</a></h5></center>
        	<h5 class="pheadline" id="search_term">Search Term: """),_display_(/*49.63*/keyWord),format.raw/*49.70*/("""  """),format.raw/*49.72*/("""|  Flesch Index: """),_display_(/*49.90*/{searchResult.map(_.flesch_index).sum/searchResult.size()}),format.raw/*49.148*/("""  """),format.raw/*49.150*/("""|  FKGL: """),_display_(/*49.160*/{searchResult.map(_.fkgl).sum/searchResult.size()}),format.raw/*49.210*/("""</h5>	
        	<div class="search">
        	<table id="infoTable" class="table">
			"""),_display_(/*52.5*/if(searchResult!=null && searchResult.size()!=0)/*52.53*/{_display_(Seq[Any](format.raw/*52.54*/("""
					"""),format.raw/*53.6*/("""<thead>
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
					"""),_display_(/*67.7*/for((project, index)<-searchResult.zipWithIndex) yield /*67.55*/{_display_(Seq[Any](format.raw/*67.56*/("""
					"""),format.raw/*68.6*/("""<tr>
						<td>"""),_display_(/*69.12*/(index+1)),format.raw/*69.21*/("""</td>
			    		<td><a>"""),_display_(/*70.18*/project/*70.25*/.owner_id),format.raw/*70.34*/("""</a> </td>
			    		<td>"""),_display_(/*71.15*/project/*71.22*/.time_submitted),format.raw/*71.37*/("""</td>
			    		<td><a href="https://www.freelancer.com/projects/"""),_display_(/*72.60*/project/*72.67*/.seo_url),format.raw/*72.75*/("""?w=f&ngsw-bypass=" target="_blank">"""),_display_(/*72.111*/project/*72.118*/.title),format.raw/*72.124*/("""</a></td>
			    		<td>"""),_display_(/*73.15*/project/*73.22*/.project_type),format.raw/*73.35*/("""</td>
			    		<td>"""),_display_(/*74.15*/for((skill, index)<-project.skills.zipWithIndex) yield /*74.63*/{_display_(Seq[Any](format.raw/*74.64*/("""
			    			"""),_display_(/*75.12*/if(project.skills.size() == (index + 1))/*75.52*/ {_display_(Seq[Any](format.raw/*75.54*/("""
			    				"""),format.raw/*76.12*/("""<a href="/Skills?skill="""),_display_(/*76.36*/skill),format.raw/*76.41*/("""" target="_blank">"""),_display_(/*76.60*/skill),format.raw/*76.65*/("""</a>
			    			""")))}/*77.13*/else/*77.18*/{_display_(Seq[Any](format.raw/*77.19*/("""
			    				"""),format.raw/*78.12*/("""<a href="/Skills?skill="""),_display_(/*78.36*/skill),format.raw/*78.41*/("""" target="_blank">"""),_display_(/*78.60*/skill),format.raw/*78.65*/("""</a>,
			    			""")))}),format.raw/*79.12*/("""
			    		""")))}),format.raw/*80.11*/("""</td>
			    		<td><a href="/Stats/"""),_display_(/*81.31*/project/*81.38*/.prevDescriptor),format.raw/*81.53*/("""" target="_blank">Stats</a></td>
			    		<td>"""),_display_(/*82.15*/project/*82.22*/.flesch_index),format.raw/*82.35*/("""</td>
			    		<td>"""),_display_(/*83.15*/project/*83.22*/.fkgl),format.raw/*83.27*/("""</td>
			    		<td>"""),_display_(/*84.15*/project/*84.22*/.edu_level),format.raw/*84.32*/("""</td>
			    	</tr>
					""")))}),format.raw/*86.7*/("""
				""")))}/*87.7*/else/*87.11*/{_display_(Seq[Any](format.raw/*87.12*/("""
					"""),format.raw/*88.6*/("""<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
				""")))}),format.raw/*89.6*/("""
			"""),format.raw/*90.4*/("""</table>
		</div>
        	"""),_display_(/*92.11*/for((keyword, results) <- response) yield /*92.46*/{_display_(Seq[Any](format.raw/*92.47*/("""
        	"""),_display_(/*93.11*/if(keyword !=keyWord)/*93.32*/{_display_(Seq[Any](format.raw/*93.33*/(""" 
        	"""),format.raw/*94.10*/("""<br><h5 class="pheadline" id="search_term">Search Term: """),_display_(/*94.67*/keyword),format.raw/*94.74*/("""  """),format.raw/*94.76*/("""|  Flesch Index: """),_display_(/*94.94*/{results.map(_.flesch_index).sum/results.size()}),format.raw/*94.142*/("""  """),format.raw/*94.144*/("""|  FKGL: """),_display_(/*94.154*/{results.map(_.fkgl).sum/results.size()}),format.raw/*94.194*/("""</h5>	

        	<div class="search">
        	<table id="infoTable" class="table">
			"""),_display_(/*98.5*/if(results!=null && results.size()!=0)/*98.43*/{_display_(Seq[Any](format.raw/*98.44*/("""
					"""),format.raw/*99.6*/("""<thead>
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
					"""),_display_(/*113.7*/for((project, index)<-results.zipWithIndex) yield /*113.50*/{_display_(Seq[Any](format.raw/*113.51*/("""
					"""),format.raw/*114.6*/("""<tr>
						<td>"""),_display_(/*115.12*/(index+1)),format.raw/*115.21*/("""</td>
			    		<td><a>"""),_display_(/*116.18*/project/*116.25*/.owner_id),format.raw/*116.34*/("""</a> </td>
			    		<td>"""),_display_(/*117.15*/project/*117.22*/.time_submitted),format.raw/*117.37*/("""</td>
			    		<td><a href="https://www.freelancer.com/projects/"""),_display_(/*118.60*/project/*118.67*/.seo_url),format.raw/*118.75*/("""?w=f&ngsw-bypass=" target="_blank">"""),_display_(/*118.111*/project/*118.118*/.title),format.raw/*118.124*/("""</a></td>
			    		<td>"""),_display_(/*119.15*/project/*119.22*/.project_type),format.raw/*119.35*/("""</td>
			    		<td>"""),_display_(/*120.15*/for((skill, index)<-project.skills.zipWithIndex) yield /*120.63*/{_display_(Seq[Any](format.raw/*120.64*/("""
			    			"""),_display_(/*121.12*/if(project.skills.size() == (index + 1))/*121.52*/ {_display_(Seq[Any](format.raw/*121.54*/("""
			    				"""),format.raw/*122.12*/("""<a href="/Skills?skill="""),_display_(/*122.36*/skill),format.raw/*122.41*/("""" target="_blank">"""),_display_(/*122.60*/skill),format.raw/*122.65*/("""</a>
			    			""")))}/*123.13*/else/*123.18*/{_display_(Seq[Any](format.raw/*123.19*/("""
			    				"""),format.raw/*124.12*/("""<a href="/Skills?skill="""),_display_(/*124.36*/skill),format.raw/*124.41*/("""" target="_blank">"""),_display_(/*124.60*/skill),format.raw/*124.65*/("""</a>,
			    			""")))}),format.raw/*125.12*/("""
			    		""")))}),format.raw/*126.11*/("""</td>
			    		<td><a href="/Stats/"""),_display_(/*127.31*/project/*127.38*/.prevDescriptor),format.raw/*127.53*/("""" target="_blank">Stats</a></td>
			    		<td>"""),_display_(/*128.15*/project/*128.22*/.flesch_index),format.raw/*128.35*/("""</td>
			    		<td>"""),_display_(/*129.15*/project/*129.22*/.fkgl),format.raw/*129.27*/("""</td>
			    		<td>"""),_display_(/*130.15*/project/*130.22*/.edu_level),format.raw/*130.32*/("""</td>
			    	</tr>
					""")))}),format.raw/*132.7*/("""
				""")))}/*133.7*/else/*133.11*/{_display_(Seq[Any](format.raw/*133.12*/("""
					"""),format.raw/*134.6*/("""<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
				""")))}),format.raw/*135.6*/("""
			"""),format.raw/*136.4*/("""</table>
		</div>
        	""")))}),format.raw/*138.11*/("""
        	 """)))}),format.raw/*139.12*/("""
        """)))}),format.raw/*140.10*/("""
        """),format.raw/*141.9*/("""</div>
        </div>
        
		<br><br><br>
        <script src=""""),_display_(/*145.23*/routes/*145.29*/.Assets.versioned("javascripts/search.js")),format.raw/*145.71*/(""""></script>
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
                  HASH: bfd2b81f764075574155c121cd2666dddef51eaa
                  MATRIX: 998->1|1236->143|1266->148|1294->168|1332->169|1360->171|2412->1196|2460->1235|2500->1237|2551->1260|2794->1485|2807->1490|2846->1491|2897->1514|3169->1755|3238->1796|3464->1995|3525->2047|3565->2049|3604->2060|3812->2250|3825->2255|3864->2256|3903->2267|4075->2412|4103->2419|4133->2421|4178->2439|4258->2497|4289->2499|4327->2509|4399->2559|4515->2649|4572->2697|4611->2698|4645->2705|5078->3112|5142->3160|5181->3161|5215->3168|5259->3185|5289->3194|5340->3218|5356->3225|5386->3234|5439->3260|5455->3267|5491->3282|5584->3348|5600->3355|5629->3363|5693->3399|5710->3406|5738->3412|5790->3437|5806->3444|5840->3457|5888->3478|5952->3526|5991->3527|6031->3540|6080->3580|6120->3582|6161->3595|6212->3619|6238->3624|6284->3643|6310->3648|6346->3666|6359->3671|6398->3672|6439->3685|6490->3709|6516->3714|6562->3733|6588->3738|6637->3756|6680->3768|6744->3805|6760->3812|6796->3827|6871->3875|6887->3882|6921->3895|6969->3916|6985->3923|7011->3928|7059->3949|7075->3956|7106->3966|7164->3994|7189->4002|7202->4006|7241->4007|7275->4014|7375->4084|7407->4089|7464->4119|7515->4154|7554->4155|7593->4167|7623->4188|7662->4189|7702->4201|7786->4258|7814->4265|7844->4267|7889->4285|7959->4333|7990->4335|8028->4345|8090->4385|8208->4477|8255->4515|8294->4516|8328->4523|8762->4930|8822->4973|8862->4974|8897->4981|8942->4998|8973->5007|9025->5031|9042->5038|9073->5047|9127->5073|9144->5080|9181->5095|9275->5161|9292->5168|9322->5176|9387->5212|9405->5219|9434->5225|9487->5250|9504->5257|9539->5270|9588->5291|9653->5339|9693->5340|9734->5353|9784->5393|9825->5395|9867->5408|9919->5432|9946->5437|9993->5456|10020->5461|10057->5479|10071->5484|10111->5485|10153->5498|10205->5522|10232->5527|10279->5546|10306->5551|10356->5569|10400->5581|10465->5618|10482->5625|10519->5640|10595->5688|10612->5695|10647->5708|10696->5729|10713->5736|10740->5741|10789->5762|10806->5769|10838->5779|10897->5807|10923->5815|10937->5819|10977->5820|11012->5827|11113->5897|11146->5902|11208->5932|11253->5945|11296->5956|11334->5966|11434->6038|11450->6044|11514->6086
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|56->25|56->25|56->25|57->26|59->28|59->28|59->28|60->29|62->31|64->33|72->41|72->41|72->41|73->42|78->47|78->47|78->47|79->48|80->49|80->49|80->49|80->49|80->49|80->49|80->49|80->49|83->52|83->52|83->52|84->53|98->67|98->67|98->67|99->68|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|110->79|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|115->84|115->84|115->84|117->86|118->87|118->87|118->87|119->88|120->89|121->90|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|129->98|129->98|129->98|130->99|144->113|144->113|144->113|145->114|146->115|146->115|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|155->124|155->124|156->125|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|167->136|169->138|170->139|171->140|172->141|176->145|176->145|176->145
                  -- GENERATED --
              */
          