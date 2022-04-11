package views;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import dao.ProjectResponse;
import play.mvc.Http;

/**
 * This class is used to test Index View
 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
 * @version 1.0
 * @since 1.0
 */
public class IndexTest {
	/**
	 * This method is used to test landing page view
	 * @author Vaibhav, Gagandeep, Gurpreet, Felipe
	 * @version 1.0
	 * @since 1.0
	 */
	@Test
	public void renderTemplate() {
	  assertEquals("text/html", views.html.landingPage.render().contentType());
	}
	
	
}
