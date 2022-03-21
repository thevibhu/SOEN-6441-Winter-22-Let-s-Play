package views;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.ProjectResponse;

/**
 * This class is used to test Index View
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class IndexTest {
	/**
	 * This method is used to test Index View
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void renderTemplate() {
	  assertEquals("text/html", views.html.landingPage.render().contentType());
	 // assertTrue(contentAsString(views.html.landingPage.render()).contains("Welcome to FreeLanceLot"));
	  //views.html.index.render((List<ProjectResponse>)response,request,keyWord,cache))
	  
	  //assertEquals("text/html", views.html.index.render(null,null,"key",null).contentType());
	}

}
