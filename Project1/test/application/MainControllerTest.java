package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainControllerTest {
	
	MainController mc = new MainController();
	
	
	//Testing Html String generator methods
	
	@Test
	void test_skillHtmlGenerator_Case1() {
		
		String actual = mc.skillHtmlGenerator("php");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>php</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	void test_skillHtmlGenerator_Case2() {
		
		String actual = mc.skillHtmlGenerator("Laravel");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>Laravel</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}

}
