
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
    <body class="FreeLance-soen">
    
    <div class="container">
   	<center><h3>Welcome to FreeLanceLot</h3>      
        <main class="main-wrap-open">
            <div class="center">
                <form class="form-inline" method="GET" action="/SearchPage" onsubmit="myFunction()">
                    """),_display_(/*24.22*/if(request.session().data().size() < 9)/*24.61*/ {_display_(Seq[Any](format.raw/*24.63*/("""
                    	"""),format.raw/*25.22*/("""<input class="form-control" id="s_val" name="keyWord" type="text" placeholder="Enter Search Terms"/>
                    	<input type="submit" id="btn_submit" class="btn btn-success" value="Search" />
                    """)))}/*27.23*/else/*27.28*/{_display_(Seq[Any](format.raw/*27.29*/("""
                    	"""),format.raw/*28.22*/("""<input class="form-control" id="s_val" name="keyWord" type="text" placeholder="Enter Search Terms" disabled/>
                    	<input type="submit" id="btn_submit" class="btn btn-success" value="Search" disabled/>
                    """)))}),format.raw/*30.22*/("""
                     
                """),format.raw/*32.17*/("""</form>
                <br>
                <div class="main-body">
           
                </div>
            </div>
        </main></center>
        <div class="search-body">
        """),_display_(/*40.10*/if(searchResult.isEmpty() && searchResult.size()==0)/*40.62*/ {_display_(Seq[Any](format.raw/*40.64*/("""
        	"""),format.raw/*41.10*/("""<div class="search">
        	<table id="infoTable" class="table">
	        	<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
	        </table>
	        </div>
        """)))}/*46.11*/else/*46.16*/{_display_(Seq[Any](format.raw/*46.17*/("""
        	"""),format.raw/*47.10*/("""<center><h5><a href="/GlobalStats" target="_blank">Global Stats</a></h5></center>
        	<h5 class="pheadline" id="search_term">Search Term: """),_display_(/*48.63*/keyWord),format.raw/*48.70*/("""  """),format.raw/*48.72*/("""|  Flesch Index: """),_display_(/*48.90*/{searchResult.map(_.flesch_index).sum/searchResult.size()}),format.raw/*48.148*/("""  """),format.raw/*48.150*/("""|  FKGL: """),_display_(/*48.160*/{searchResult.map(_.fkgl).sum/searchResult.size()}),format.raw/*48.210*/("""</h5>	
        	<div class="search">
        	<table id="infoTable" class="table">
			"""),_display_(/*51.5*/if(searchResult!=null && searchResult.size()!=0)/*51.53*/{_display_(Seq[Any](format.raw/*51.54*/("""
					"""),format.raw/*52.6*/("""<thead>
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
					"""),_display_(/*66.7*/for((project, index)<-searchResult.zipWithIndex) yield /*66.55*/{_display_(Seq[Any](format.raw/*66.56*/("""
					"""),format.raw/*67.6*/("""<tr>
						<td>"""),_display_(/*68.12*/(index+1)),format.raw/*68.21*/("""</td>
			    		<td><a>"""),_display_(/*69.18*/project/*69.25*/.owner_id),format.raw/*69.34*/("""</a> </td>
			    		<td>"""),_display_(/*70.15*/project/*70.22*/.time_submitted),format.raw/*70.37*/("""</td>
			    		<td><a href="https://www.freelancer.com/projects/"""),_display_(/*71.60*/project/*71.67*/.seo_url),format.raw/*71.75*/("""?w=f&ngsw-bypass=" target="_blank">"""),_display_(/*71.111*/project/*71.118*/.title),format.raw/*71.124*/("""</a></td>
			    		<td>"""),_display_(/*72.15*/project/*72.22*/.project_type),format.raw/*72.35*/("""</td>
			    		<td>"""),_display_(/*73.15*/for((skill, index)<-project.skills.zipWithIndex) yield /*73.63*/{_display_(Seq[Any](format.raw/*73.64*/("""
			    			"""),_display_(/*74.12*/if(project.skills.size() == (index + 1))/*74.52*/ {_display_(Seq[Any](format.raw/*74.54*/("""
			    				"""),format.raw/*75.12*/("""<a href="/Skills?skill="""),_display_(/*75.36*/skill),format.raw/*75.41*/("""" target="_blank">"""),_display_(/*75.60*/skill),format.raw/*75.65*/("""</a>
			    			""")))}/*76.13*/else/*76.18*/{_display_(Seq[Any](format.raw/*76.19*/("""
			    				"""),format.raw/*77.12*/("""<a href="/Skills?skill="""),_display_(/*77.36*/skill),format.raw/*77.41*/("""" target="_blank">"""),_display_(/*77.60*/skill),format.raw/*77.65*/("""</a>,
			    			""")))}),format.raw/*78.12*/("""
			    		""")))}),format.raw/*79.11*/("""</td>
			    		<td><a href="/Stats/"""),_display_(/*80.31*/project/*80.38*/.prevDescriptor),format.raw/*80.53*/("""" target="_blank">Stats</a></td>
			    		<td>"""),_display_(/*81.15*/project/*81.22*/.flesch_index),format.raw/*81.35*/("""</td>
			    		<td>"""),_display_(/*82.15*/project/*82.22*/.fkgl),format.raw/*82.27*/("""</td>
			    		<td>"""),_display_(/*83.15*/project/*83.22*/.edu_level),format.raw/*83.32*/("""</td>
			    	</tr>
					""")))}),format.raw/*85.7*/("""
				""")))}/*86.7*/else/*86.11*/{_display_(Seq[Any](format.raw/*86.12*/("""
					"""),format.raw/*87.6*/("""<tr><h3><i>No Result to Show Please Search in box</i></h3></tr>
				""")))}),format.raw/*88.6*/("""
			"""),format.raw/*89.4*/("""</table>
		</div>
        	"""),_display_(/*91.11*/for((keyword, results) <- response) yield /*91.46*/{_display_(Seq[Any](format.raw/*91.47*/("""
        	"""),_display_(/*92.11*/if(keyword !=keyWord)/*92.32*/{_display_(Seq[Any](format.raw/*92.33*/(""" 
        	"""),_display_(/*93.11*/if(request.session().get(keyword).isPresent())/*93.57*/{_display_(Seq[Any](format.raw/*93.58*/("""
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
			""")))}),format.raw/*138.5*/("""
        	""")))}),format.raw/*139.11*/("""
        	""")))}),format.raw/*140.11*/("""
        	 """)))}),format.raw/*141.12*/("""
        """),format.raw/*142.9*/("""</div>
	</div>
        
		<br><br><br>
        <script src=""""),_display_(/*146.23*/routes/*146.29*/.Assets.versioned("javascripts/search.js")),format.raw/*146.71*/(""""></script>
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
                  HASH: 36a7ee6b22d363d779349e2990a9c052fe6796b6
                  MATRIX: 998->1|1236->143|1264->146|1292->166|1330->167|1358->169|2419->1203|2467->1242|2507->1244|2558->1267|2801->1492|2814->1497|2853->1498|2904->1521|3176->1762|3245->1803|3471->2002|3532->2054|3572->2056|3611->2067|3819->2257|3832->2262|3871->2263|3910->2274|4082->2419|4110->2426|4140->2428|4185->2446|4265->2504|4296->2506|4334->2516|4406->2566|4522->2656|4579->2704|4618->2705|4652->2712|5085->3119|5149->3167|5188->3168|5222->3175|5266->3192|5296->3201|5347->3225|5363->3232|5393->3241|5446->3267|5462->3274|5498->3289|5591->3355|5607->3362|5636->3370|5700->3406|5717->3413|5745->3419|5797->3444|5813->3451|5847->3464|5895->3485|5959->3533|5998->3534|6038->3547|6087->3587|6127->3589|6168->3602|6219->3626|6245->3631|6291->3650|6317->3655|6353->3673|6366->3678|6405->3679|6446->3692|6497->3716|6523->3721|6569->3740|6595->3745|6644->3763|6687->3775|6751->3812|6767->3819|6803->3834|6878->3882|6894->3889|6928->3902|6976->3923|6992->3930|7018->3935|7066->3956|7082->3963|7113->3973|7171->4001|7196->4009|7209->4013|7248->4014|7282->4021|7382->4091|7414->4096|7471->4126|7522->4161|7561->4162|7600->4174|7630->4195|7669->4196|7709->4209|7764->4255|7803->4256|7842->4267|7926->4324|7954->4331|7984->4333|8029->4351|8099->4399|8130->4401|8168->4411|8230->4451|8348->4543|8395->4581|8434->4582|8468->4589|8902->4996|8962->5039|9002->5040|9037->5047|9082->5064|9113->5073|9165->5097|9182->5104|9213->5113|9267->5139|9284->5146|9321->5161|9415->5227|9432->5234|9462->5242|9527->5278|9545->5285|9574->5291|9627->5316|9644->5323|9679->5336|9728->5357|9793->5405|9833->5406|9874->5419|9924->5459|9965->5461|10007->5474|10059->5498|10086->5503|10133->5522|10160->5527|10197->5545|10211->5550|10251->5551|10293->5564|10345->5588|10372->5593|10419->5612|10446->5617|10496->5635|10540->5647|10605->5684|10622->5691|10659->5706|10735->5754|10752->5761|10787->5774|10836->5795|10853->5802|10880->5807|10929->5828|10946->5835|10978->5845|11037->5873|11063->5881|11077->5885|11117->5886|11152->5893|11253->5963|11286->5968|11341->5992|11385->6004|11429->6016|11474->6029|11512->6039|11605->6104|11621->6110|11685->6152
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|55->24|55->24|55->24|56->25|58->27|58->27|58->27|59->28|61->30|63->32|71->40|71->40|71->40|72->41|77->46|77->46|77->46|78->47|79->48|79->48|79->48|79->48|79->48|79->48|79->48|79->48|82->51|82->51|82->51|83->52|97->66|97->66|97->66|98->67|99->68|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|109->78|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|116->85|117->86|117->86|117->86|118->87|119->88|120->89|122->91|122->91|122->91|123->92|123->92|123->92|124->93|124->93|124->93|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|125->94|129->98|129->98|129->98|130->99|144->113|144->113|144->113|145->114|146->115|146->115|147->116|147->116|147->116|148->117|148->117|148->117|149->118|149->118|149->118|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|155->124|155->124|156->125|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|163->132|164->133|164->133|164->133|165->134|166->135|167->136|169->138|170->139|171->140|172->141|173->142|177->146|177->146|177->146
                  -- GENERATED --
              */
          