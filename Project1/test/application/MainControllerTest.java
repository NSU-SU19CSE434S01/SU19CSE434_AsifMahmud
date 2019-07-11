package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainControllerTest {
	
	MainController mc = new MainController();
	
	
	//Testing Html String generator methods
	
	@Test
	public void test_skillHtmlGenerator_Case1() {
		
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
	public void test_skillHtmlGenerator_Case2() {
		
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
	
	@Test
	public void test_academicAchievementHtmlGenerator_Case1() {
		
		String actual = mc.academicAchievementHtmlGenerator("Youth Award", "2", "2011");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: 2011</p>\r\n" + 
						"                        <h3>Youth Award</h3>\r\n" + 
						"                        <p>Position: 2</p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_academicAchievementHtmlGenerator_Case2() {
		
		String actual = mc.academicAchievementHtmlGenerator("Gaming Champ Award", "3", "2018");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: 2018</p>\r\n" + 
						"                        <h3>Gaming Champ Award</h3>\r\n" + 
						"                        <p>Position: 3</p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case1() {
		
		String actual = mc.jobExperienceHtmlGenerator("Uber", "Sofware Management", "2");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <h3>Uber</h3>\r\n" + 
						"                        <p>Position: Sofware Management</p>\r\n" + 
						"                        <p>Years Worked: 2</p>\r\n" + 
						"                        \r\n" + 
						"                    </div>\r\n" + 
						"                </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case2() {
		
		String actual = mc.jobExperienceHtmlGenerator("Brac IT", "Sofware Management", "3");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <h3>Brac IT</h3>\r\n" + 
						"                        <p>Position: Sofware Management</p>\r\n" + 
						"                        <p>Years Worked: 3</p>\r\n" + 
						"                        \r\n" + 
						"                    </div>\r\n" + 
						"                </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_rferenceHtmlGenerator_Case1() {
		
		String actual = mc.rferenceHtmlGenerator("Abdul Hmid", "North South Uni", "Lecturer", "Ab@gmail.com");
		String expected = 
				        "                   <div class=\"boxestoflex\">\r\n" + 
						"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
						"                        <div>\r\n" + 
						"                            <h3>Abdul Hmid</h3>\r\n" + 
						"                            <p>Institution: North South Uni</p>\r\n" + 
						"                            <p>Position: Lecturer</p>\r\n" + 
						"                            <p>Mail: Ab@gmail.com</p>\r\n" + 
						"                        </div>\r\n" + 
						"                    </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_rferenceHtmlGenerator_Case2() {
		
		String actual = mc.rferenceHtmlGenerator("Abdul Bari", "Youtuber", "Content creator", "Ab@gmail.com");
		String expected = 
				        "                   <div class=\"boxestoflex\">\r\n" + 
						"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
						"                        <div>\r\n" + 
						"                            <h3>Abdul Bari</h3>\r\n" + 
						"                            <p>Institution: Youtuber</p>\r\n" + 
						"                            <p>Position: Content creator</p>\r\n" + 
						"                            <p>Mail: Ab@gmail.com</p>\r\n" + 
						"                        </div>\r\n" + 
						"                    </div>\r\n";
		
		assertEquals(expected, actual);
	}
	

	
	//Testing Validation methods
	
	@Test
	public void test_validName_Case1() {
		
		boolean actual = mc.validName("Asif");  
		
		assertTrue(actual);		//Valid name so using assertTrue to evaluate
		
	}
	
	
	@Test
	public void test_validName_Case2() {
		
		boolean actual = mc.validName("Asif Mahmud");
		
		assertTrue(actual);		//Valid name so using assertTrue to evaluate         
		
	}
	
	@Test
	public void test_validName_Case3() {
		
		boolean actual = mc.validName("Asif Mahmud25");
		
		assertFalse(actual); 	//Not a valid name so using assertFalse to evaluate	
		
	}
	

}
