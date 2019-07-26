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
	

	
	
	
	//INPUT SPACE PARTITION
	
	/* Interface based input domain modeling
	 * 
	 * 
	 * Characteristics with blocks :
	 * 
	 * Weather input is null : 
	 * Block a: true (Value = null) [Case1]
	 * Block b: false (Value = "Asif123") [Case2] 
	 * 
	 * Weather input is empty : 
	 * Block c: true (Value = "") [Case3] 
	 * Block d: false (Value = "Asif") [Case4]
	 * 
	 * Input is not null or empty :
	 * Block e: special characters (Value = "!@#$%^&*()_-=+<>?|/.;':\"[]{}") [Case5]
	 * Block f: numbers (Value = "0123456789") [Case6]
	 * Block g: characters (Value = "Asif Mahmud") [Case7]
	 */
	
	
	//validName Method Tests
	@Test
	public void test_validName_Case1() {
		
		boolean actual = mc.validName(null);  
		
		assertFalse(actual);		//Not Valid name so using assertFalse to evaluate
		
	}
	
	
	@Test
	public void test_validName_Case2() {
		
		boolean actual = mc.validName("Asif123");
		
		assertFalse(actual);		//Not Valid name so using assertFalse to evaluate         
		
	}
	
	@Test
	public void test_validName_Case3() {
		
		boolean actual = mc.validName("");
		
		assertFalse(actual); 	//Not Valid name so using assertFalse to evaluate	
		
	}
	
	@Test
	public void test_validName_Case4() {
		
		boolean actual = mc.validName("Asif");
		
		assertTrue(actual); 	//Valid name so using assertTrue to evaluate	
		
	}
	
	@Test
	public void test_validName_Case5() {
		
		boolean actual = mc.validName("!@#$%^&*()_-=+<>?|/.;':\"[]{}");
		
		assertFalse(actual); 	//Not Valid name so using assertTrue to evaluate	
		
	}
	
	@Test
	public void test_validName_Case6() {
		
		boolean actual = mc.validName("0123456789");
		
		assertFalse(actual); 	//Not Valid name so using assertTrue to evaluate	
		
	}
	
	@Test
	public void test_validName_Case7() {
		
		boolean actual = mc.validName("Asif Mahmud");
		
		assertTrue(actual); 	//Valid name so using assertTrue to evaluate	
		
	}
	
	
	
	//validText Method Tests
	@Test
	public void test_validText_Case1() {
		
		boolean actual = mc.validText(null);
		
		assertFalse(actual); 	//Not Valid text so using assertFalse to evaluate	
		
	}
	
	@Test
	public void test_validText_Case2() {
		
		boolean actual = mc.validText("Asif123");
		
		assertFalse(actual); 	//Not Valid so using assertFalse to evaluate		
		
	}
	
	@Test
	public void test_validText_Case3() {
		
		boolean actual = mc.validText("");
		
		assertTrue(actual); 	//valid text so using assertTrue to evaluate		
		
	}
	
	@Test
	public void test_validText_Case4() {
		
		boolean actual = mc.validText("Asif");
		
		assertTrue(actual); 	//valid text so using assertTrue to evaluate		
		
	}
	
	@Test
	public void test_validText_Case5() {
		
		boolean actual = mc.validText("!@#$%^&*()_-=+<>?|/.;':\"[]{}");
		
		assertFalse(actual); 	//Not Valid so using assertFalse to evaluate		
		
	}
	
	@Test
	public void test_validText_Case6() {
		
		boolean actual = mc.validText("0123456789");
		
		assertFalse(actual); 	//Not Valid so using assertFalse to evaluate		
		
	}
	
	@Test
	public void test_validText_Case7() {
		
		boolean actual = mc.validText("Asif Mahmud");
		
		assertTrue(actual); 	//Valid so using assertTrue to evaluate			
		
	}
	
	
	
	//isEmpty Method Tests
	@Test
	public void test_isEmpty_Case1() {
		
		boolean actual = mc.isEmpty(null);
		
		assertTrue(actual); 	//Should return true	
		
	}
	
	@Test
	public void test_isEmpty_Case2() {
		
		boolean actual = mc.isEmpty("Asif123");
		
		assertFalse(actual); 	//Should return false	
		
	}
	
	@Test
	public void test_isEmpty_Case3() {
		
		boolean actual = mc.isEmpty("");
		
		assertTrue(actual); 	//Should return true	
		
	}
	
	@Test
	public void test_isEmpty_Case4() {
		
		boolean actual = mc.isEmpty("Asif");
		
		assertFalse(actual); 	//Should return false	
		
	}
	
	@Test
	public void test_isEmpty_Case5() {
		
		boolean actual = mc.isEmpty("!@#$%^&*()_-=+<>?|/.;':\"[]{}");
		
		assertFalse(actual); 	//Should return false	
		
	}
	
	@Test
	public void test_isEmpty_Case6() {
		
		boolean actual = mc.isEmpty("0123456789");
		
		assertFalse(actual); 	//Should return false	
		
	}
	
	@Test
	public void test_isEmpty_Case7() {
		
		boolean actual = mc.isEmpty("Asif Mahmud");
		
		assertFalse(actual); 	//Should return false	
		
	}
	
	
	
	//validPhoneNumber Method Tests
	@Test
	public void test_validPhoneNumber_Case1() {
		
		boolean actual = mc.validPhoneNumber(null);  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Case2() {
		
		boolean actual = mc.validPhoneNumber("Asif123");  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Case3() {
		
		boolean actual = mc.validPhoneNumber("");  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Case4() {
		
		boolean actual = mc.validPhoneNumber("Asif");  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Case5() {
		
		boolean actual = mc.validPhoneNumber("!@#$%^&*()_-=+<>?|/.;':\"[]{}");  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Case6() {
		
		boolean actual = mc.validPhoneNumber("0123456789");  
		
		assertTrue(actual);		//Valid Phone Number so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Case7() {
		
		boolean actual = mc.validPhoneNumber("Asif Mahmud");  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	
	
	//validEmail Method Tests
	@Test
	public void test_validEmail_Case1() {
		
		boolean actual = mc.validEmail(null);  
		
		assertFalse(actual);		//Not Valid Email so using assertFalse to evaluate
		
	}
	
	//Changing the input value to "asiffyy@gmail.com"
	@Test
	public void test_validEmail_Case2() {
		
		boolean actual = mc.validEmail("asiffyy@gmail.com");  
		
		assertTrue(actual);		//Valid Email so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validEmail_Case3() {
		
		boolean actual = mc.validEmail("");  
		
		assertFalse(actual);		//Not Valid Email so using assertFalse to evaluate
		
	}
	
	//Changing the input value to "asifmahmud22@gmail.com"
	@Test
	public void test_validEmail_Case4() {
		
		boolean actual = mc.validEmail("asifmahmud22@gmail.com");  
		
		assertTrue(actual);		//Valid Email so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validEmail_Case5() {
		
		boolean actual = mc.validEmail("!@#$%^&*()_-=+<>?|/.;':\"[]{}");  
		
		assertFalse(actual);		//Not Valid Email so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validEmail_Case6() {
		
		boolean actual = mc.validEmail("0123456789");  
		
		assertFalse(actual);		//Not Valid Email so using assertFalse to evaluate
		
	}
	
	//Changing the input value to "abdul.hamid123@yahoo.com"
	@Test
	public void test_validEmail_Case7() {
		
		boolean actual = mc.validEmail("abdul.hamid123@yahoo.com");  
		
		assertTrue(actual);		//Valid Email so using assertTrue to evaluate
		
	}
	
	
	
	//validYear Method Tests
	@Test
	public void test_validYear_Case1() {
		
		boolean actual = mc.validYear(null);  
		
		assertFalse(actual);		//Not Valid Year so using assertFalse to evaluate
		
	}
	
	//Changing the input value to 2019
	@Test
	public void test_validYear_Case2() {
		
		boolean actual = mc.validYear("2019");  
		
		assertTrue(actual);		//Valid Year so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validYear_Case3() {
		
		boolean actual = mc.validYear("");  
		
		assertFalse(actual);		//Not Valid Year so using assertFalse to evaluate
		
	}
	
	//Changing the input value to 1999
	@Test
	public void test_validYear_Case4() {
		
		boolean actual = mc.validYear("1999");  
		
		assertTrue(actual);		//Valid Year so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validYear_Case5() {
		
		boolean actual = mc.validYear("!@#$%^&*()_-=+<>?|/.;':\"[]{}");  
		
		assertFalse(actual);		//Not Valid Year so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validYear_Case6() {
		
		boolean actual = mc.validYear("0123456789");  
		
		assertFalse(actual);		//Not Valid Year so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validYear_Case7() {
		
		boolean actual = mc.validYear("Asif Mahmud");  
		
		assertFalse(actual);		//Not Valid Year so using assertFalse to evaluate
		
	}
	
	
	
	//validGrade Method Tests
	@Test
	public void test_validGrade_Case1() {
		
		boolean actual = mc.validGrade(null);  
		
		assertFalse(actual);		//Not Valid Grade so using assertFalse to evaluate
		
	}
	
	//Changing the input value to "4.0"
	@Test
	public void test_validGrade_Case2() {
		
		boolean actual = mc.validGrade("4.0");  
		
		assertTrue(actual);		//Valid Grade so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validGrade_Case3() {
		
		boolean actual = mc.validGrade("");  
		
		assertFalse(actual);		//Not Valid Grade so using assertFalse to evaluate
		
	}
	
	//Changing the input value to "3.77"
	@Test
	public void test_validGrade_Case4() {
		
		boolean actual = mc.validGrade("3.77");  
		
		assertTrue(actual);		//Valid Grade so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validGrade_Case5() {
		
		boolean actual = mc.validGrade("!@#$%^&*()_-=+<>?|/.;':\"[]{}");  
		
		assertFalse(actual);		//Not Valid Grade so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validGrade_Case6() {
		
		boolean actual = mc.validGrade("0123456789");  
		
		assertFalse(actual);		//Not Valid Grade so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validGrade_Case7() {
		
		boolean actual = mc.validGrade("Asif Mahmud");  
		
		assertFalse(actual);		//Not Valid Grade so using assertFalse to evaluate
		
	}
	
	
	
	//validTwoPlaceNum Method Tests
	@Test
	public void test_validTwoPlaceNum_Case1() {
		
		boolean actual = mc.validTwoPlaceNum(null);  
		
		assertFalse(actual);		//Not Valid Two Place Number so using assertFalse to evaluate
		
	}
	
	//Changing input value to "7"
	@Test
	public void test_validTwoPlaceNum_Case2() {
		
		boolean actual = mc.validTwoPlaceNum("7");  
		
		assertTrue(actual);		//Valid Two Place Number so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validTwoPlaceNum_Case3() {
		
		boolean actual = mc.validTwoPlaceNum("");  
		
		assertFalse(actual);		//Not Valid Two Place Number so using assertFalse to evaluate
		
	}
	
	//Changing input value to "12"
	@Test
	public void test_validTwoPlaceNum_Case4() {
		
		boolean actual = mc.validTwoPlaceNum("12");  
		
		assertTrue(actual);		//Valid Two Place Number so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validTwoPlaceNum_Case5() {
		
		boolean actual = mc.validTwoPlaceNum("!@#$%^&*()_-=+<>?|/.;':\"[]{}");  
		
		assertFalse(actual);		//Not Valid Two Place Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validTwoPlaceNum_Case6() {
		
		boolean actual = mc.validTwoPlaceNum("0123456789");  
		
		assertFalse(actual);		//Not Valid Two Place Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validTwoPlaceNum_Case7() {
		
		boolean actual = mc.validTwoPlaceNum("Asif Mahmud");  
		
		assertFalse(actual);		//Not Valid Two Place Number so using assertFalse to evaluate
		
	}
	
	
	
	//validImageFile Method Tests
	@Test
	public void test_validImageFile_Case1() {
		
		boolean actual = mc.validImageFile(null);  
		
		assertFalse(actual);		//Not Valid Image File so using assertFalse to evaluate
		
	}
	
	//Changing the input value to "pp.png"
	@Test
	public void test_validImageFile_Case2() {
		
		boolean actual = mc.validImageFile("pp.png");  
		
		assertTrue(actual);		//assertTrueValid Image File so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validImageFile_Case3() {
		
		boolean actual = mc.validImageFile("");  
		
		assertFalse(actual);		//Not Valid Image File so using assertFalse to evaluate
		
	}
	
	//Changing input value to "asif.jpeg"
	@Test
	public void test_validImageFile_Case4() {
		
		boolean actual = mc.validImageFile("asif.jpeg");  
		
		assertTrue(actual);		//Valid Image File so using assertTrue to evaluate
		
	}
	
	@Test
	public void test_validImageFile_Case5() {
		
		boolean actual = mc.validImageFile("!@#$%^&*()_-=+<>?|/.;':\"[]{}");  
		
		assertFalse(actual);		//Not Valid Image File so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validImageFile_Case6() {
		
		boolean actual = mc.validImageFile("0123456789");  
		
		assertFalse(actual);		//Not Valid Image File so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validImageFile_Case7() {
		
		boolean actual = mc.validImageFile("Asif Mahmud");  
		
		assertFalse(actual);		//Not Valid Image File so using assertFalse to evaluate
		
	}
	
	
	
	//GRAPH COVERAGE TESTING
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return false (Final Node)
	 * Node 3 : for input != null, return result (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = "Asif"
	 */
	
	@Test
	public void test_validName_Path1() {
		
		boolean actual = mc.validName(null);  
		
		assertFalse(actual);		//Not Valid name so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validName_Path2() {
		
		boolean actual = mc.validName("Asif");  
		
		assertTrue(actual);		//Valid name so using assertTrue to evaluate
		
	}
	
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return false (Final Node)
	 * Node 3 : for input != null, return result (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = "Asif"
	 */
	
	@Test
	public void test_validText_Path1() {
		
		boolean actual = mc.validText(null);
		
		assertFalse(actual); 	//Not Valid text so using assertFalse to evaluate	
		
	}
	
	@Test
	public void test_validText_Path2() {
		
		boolean actual = mc.validText("Asif");
		
		assertTrue(actual); 	//Valid text so using assertTrue to evaluate	
		
	}
	
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return true (Final Node)
	 * Node 3 : for input != null, Decision making node, weather input = ""
	 * Node 4 : for input = "", return true (Final Node)
	 * Node 5 : for input != "", return false (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3,4], [1,3,5]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = ""
	 * For Prime Path 3 the input value = "Asif"
	 */
	
	@Test
	public void test_isEmpty_Path1() {
		
		boolean actual = mc.isEmpty(null);
		
		assertTrue(actual); 	//Should return true	
		
	}
	
	@Test
	public void test_isEmpty_Path2() {
		
		boolean actual = mc.isEmpty("");
		
		assertTrue(actual); 	//Should return true	
		
	}
	
	@Test
	public void test_isEmpty_Path3() {
		
		boolean actual = mc.isEmpty("Asif");
		
		assertFalse(actual); 	//Should return false	
		
	}
	
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return false (Final Node)
	 * Node 3 : for input != null, a block of code
	 * Node 4 : return result (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3,4]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = "01671324427"
	 */
	
	@Test
	public void test_validPhoneNumber_Path1() {
		
		boolean actual = mc.validPhoneNumber(null);  
		
		assertFalse(actual);		//Not Valid Phone Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validPhoneNumber_Path2() {
		
		boolean actual = mc.validPhoneNumber("01671324427");  
		
		assertTrue(actual);		//Valid Phone Number so using assertTrue to evaluate
		
	}
	
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return false (Final Node)
	 * Node 3 : for input != null, a block of code
	 * Node 4 : return result (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3,4]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = "asif-mahmud22@gmail.com"
	 */
	
	@Test
	public void test_validEmail_Path1() {
		
		boolean actual = mc.validEmail(null);  
		
		assertFalse(actual);		//Not Valid Email so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validEmail_Path2() {
		
		boolean actual = mc.validEmail("asif-mahmud22@gmail.com");  
		
		assertTrue(actual);		//Valid Email so using assertTrue to evaluate
		
	}
	
	

	
	
	

}
