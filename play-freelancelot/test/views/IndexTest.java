package views;

import static org.junit.Assert.*;

import org.junit.Test;

public class IndexTest {

	@Test
	public void renderTemplate() {
	  assertEquals("text/html", views.html.landingPage.render().contentType());
	 // assertTrue(contentAsString(views.html.landingPage.render()).contains("Welcome to FreeLanceLot"));
	}

}
