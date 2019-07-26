package application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainControllerTest {
	
	MainController mc = new MainController();
	
	
	//TESTING HTML GENERATOR METHODS
	
	//INPUT SPACE PARTITION TESTSTING
	
	
	//Interface-Based Input Domain Modeling
	
	
	/* 
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
	
	@Test
	public void test_skillHtmlGenerator_Case1() {
		
		String actual = mc.skillHtmlGenerator(null);
		String expected = "";
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Case2() {
		
		String actual = mc.skillHtmlGenerator("Asif123");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>Asif123</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Case3() {
		
		String actual = mc.skillHtmlGenerator("");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4></h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Case4() {
		
		String actual = mc.skillHtmlGenerator("Asif");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>Asif</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Case5() {
		
		String actual = mc.skillHtmlGenerator("!@#$%^&*()_-=+<>?|/.;':\"[]{}");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>!@#$%^&*()_-=+<>?|/.;':\"[]{}</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Case6() {
		
		String actual = mc.skillHtmlGenerator("0123456789");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>0123456789</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Case7() {
		
		String actual = mc.skillHtmlGenerator("Asif Mahmud");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>Asif Mahmud</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	
	
	/* 
	 * Characteristics with blocks :
	 * 
	 * Weather input is null : 
	 * Block a: true (Value = null) 
	 * Block b: false (Value = "Asif123") [Base]
	 * 
	 * Weather input is empty : 
	 * Block c: true (Value = "")  
	 * Block d: false (Value = "Asif") [Base]
	 * 
	 * Input is not null or empty :
	 * Block e: special characters (Value = "!@#$%^&*()_-=+<>?|/.;':\"[]{}") 
	 * Block f: numbers (Value = "0123456789") 
	 * Block g: characters (Value = "Asif Mahmud") [Base]
	 * 
	 * 
	 * Base Choice Coverage :
	 * 
	 * Base Choice test : (b, d, g) [Case 1]
	 * Additional tests :
	 * 
	 * (a, d, g) [Case 2]
	 * (b, c, g) [Case 3]
	 * (b, d, e) [Case 4]
	 * (b, d, f) [Case 5]
	 */

	@Test
	public void test_academicAchievementHtmlGenerator_Case1() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif123", "Asif", "Asif Mahmud");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: Asif Mahmud</p>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: Asif</p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_academicAchievementHtmlGenerator_Case2() {
		
		String actual = mc.academicAchievementHtmlGenerator(null, "Asif", "Asif Mahmud");
		String expected = "";				        
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_academicAchievementHtmlGenerator_Case3() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif123", "", "Asif Mahmud");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: Asif Mahmud</p>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: </p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_academicAchievementHtmlGenerator_Case4() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif123", "Asif", "!@#$%^&*()_-=+<>?|/.;':\"[]{}");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: !@#$%^&*()_-=+<>?|/.;':\"[]{}</p>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: Asif</p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_academicAchievementHtmlGenerator_Case5() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif123", "Asif", "0123456789");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: 0123456789</p>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: Asif</p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);
	}



	
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case1() {
		
		String actual = mc.jobExperienceHtmlGenerator("Asif123", "Asif", "Asif Mahmud");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: Asif</p>\r\n" + 
						"                        <p>Years Worked: Asif Mahmud</p>\r\n" + 
						"                        \r\n" + 
						"                    </div>\r\n" + 
						"                </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case2() {
		
		String actual = mc.jobExperienceHtmlGenerator(null, "Asif", "Asif Mahmud");
		String expected = "";				        
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case3() {
		
		String actual = mc.jobExperienceHtmlGenerator("Asif123", "", "Asif Mahmud");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: </p>\r\n" + 
						"                        <p>Years Worked: Asif Mahmud</p>\r\n" + 
						"                        \r\n" + 
						"                    </div>\r\n" + 
						"                </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case4() {
		
		String actual = mc.jobExperienceHtmlGenerator("Asif123", "Asif", "!@#$%^&*()_-=+<>?|/.;':\"[]{}");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: Asif</p>\r\n" + 
						"                        <p>Years Worked: !@#$%^&*()_-=+<>?|/.;':\"[]{}</p>\r\n" + 
						"                        \r\n" + 
						"                    </div>\r\n" + 
						"                </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_jobExperienceHtmlGenerator_Case5() {
		
		String actual = mc.jobExperienceHtmlGenerator("Asif123", "Asif", "0123456789");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <h3>Asif123</h3>\r\n" + 
						"                        <p>Position: Asif</p>\r\n" + 
						"                        <p>Years Worked: 0123456789</p>\r\n" + 
						"                        \r\n" + 
						"                    </div>\r\n" + 
						"                </div>\r\n";
		
		assertEquals(expected, actual);
	}



	
	@Test
	public void test_rferenceHtmlGenerator_Case1() {
		
		String actual = mc.rferenceHtmlGenerator("Asif123", "Asif", "Asif Mahmud", "Ab@gmail.com");
		String expected = 
				        "                   <div class=\"boxestoflex\">\r\n" + 
						"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
						"                        <div>\r\n" + 
						"                            <h3>Asif123</h3>\r\n" + 
						"                            <p>Institution: Asif</p>\r\n" + 
						"                            <p>Position: Asif Mahmud</p>\r\n" + 
						"                            <p>Mail: Ab@gmail.com</p>\r\n" + 
						"                        </div>\r\n" + 
						"                    </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_rferenceHtmlGenerator_Case2() {
		
		String actual = mc.rferenceHtmlGenerator(null, "Asif", "Asif Mahmud", "Ab@gmail.com");
		String expected = "";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_rferenceHtmlGenerator_Case3() {
		
		String actual = mc.rferenceHtmlGenerator("Asif123", "", "Asif Mahmud", "Ab@gmail.com");
		String expected = 
				        "                   <div class=\"boxestoflex\">\r\n" + 
						"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
						"                        <div>\r\n" + 
						"                            <h3>Asif123</h3>\r\n" + 
						"                            <p>Institution: </p>\r\n" + 
						"                            <p>Position: Asif Mahmud</p>\r\n" + 
						"                            <p>Mail: Ab@gmail.com</p>\r\n" + 
						"                        </div>\r\n" + 
						"                    </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_rferenceHtmlGenerator_Case4() {
		
		String actual = mc.rferenceHtmlGenerator("Asif123", "Asif", "!@#$%^&*()_-=+<>?|/.;':\"[]{}", "Ab@gmail.com");
		String expected = 
				        "                   <div class=\"boxestoflex\">\r\n" + 
						"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
						"                        <div>\r\n" + 
						"                            <h3>Asif123</h3>\r\n" + 
						"                            <p>Institution: Asif</p>\r\n" + 
						"                            <p>Position: !@#$%^&*()_-=+<>?|/.;':\"[]{}</p>\r\n" + 
						"                            <p>Mail: Ab@gmail.com</p>\r\n" + 
						"                        </div>\r\n" + 
						"                    </div>\r\n";
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_rferenceHtmlGenerator_Case5() {
		
		String actual = mc.rferenceHtmlGenerator("Asif123", "Asif", "0123456789", "Ab@gmail.com");
		String expected = 
				        "                   <div class=\"boxestoflex\">\r\n" + 
						"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
						"                        <div>\r\n" + 
						"                            <h3>Asif123</h3>\r\n" + 
						"                            <p>Institution: Asif</p>\r\n" + 
						"                            <p>Position: 0123456789</p>\r\n" + 
						"                            <p>Mail: Ab@gmail.com</p>\r\n" + 
						"                        </div>\r\n" + 
						"                    </div>\r\n";
		
		assertEquals(expected, actual);
	}

	
	
	//GRAPH TESTING
	
	//Structural Coverage Criteria
	//Prime Path Coverage
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return "" (Final Node)
	 * Node 3 : for input != null, return generated HTML block (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = "Asif"
	 */
	
	@Test
	public void test_skillHtmlGenerator_Path1() {
		
		String actual = mc.skillHtmlGenerator(null);
		String expected = "";
				
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_skillHtmlGenerator_Path2() {
		
		String actual = mc.skillHtmlGenerator("Asif");
		String expected = 
				"                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>Asif</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
		
		assertEquals(expected, actual);
	}
	
	
	
	/*
	 * Node 1 : Decision making node, weather input1 = null (Initial Node)
	 * Node 2 : for input1 = null, return "" (Final Node)
	 * Node 3 : for input1 != null, Decision making node, weather input2 = null
	 * Node 4 : for input2 = null, return "" (Final Node)
	 * Node 5 : for input2 != null, Decision making node, weather input3 = null
	 * Node 6 : for input3 = null, return "" (Final Node)
	 * Node 7 : for input3 != null, return generated HTML block (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3,4], [1,3,5,6], [1,3,5,7]
	 * 
	 * For Prime Path 1 the input values = null, "Asif", "NSU"
	 * For Prime Path 2 the input values = "Asif", null, "NSU"
	 * For Prime Path 3 the input values = "Asif", "NSU", null
	 * For Prime Path 4 the input values = "Asif", "NSU", "CSE"
	 */
	
	@Test
	public void test_academicAchievementHtmlGenerator_Path1() {
		
		String actual = mc.academicAchievementHtmlGenerator(null, "Asif", "NSU");
		String expected = "";				        
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void test_academicAchievementHtmlGenerator_Path2() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif", null, "NSU");
		String expected = "";				        
		
		assertEquals(expected, actual);
	}

	@Test
	public void test_academicAchievementHtmlGenerator_Path3() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif", "NSU", null);
		String expected = "";				        
		
		assertEquals(expected, actual);
	}

	@Test
	public void test_academicAchievementHtmlGenerator_Path4() {
		
		String actual = mc.academicAchievementHtmlGenerator("Asif", "NSU", "CSE");
		String expected = 
				        "               <div class=\"boxestoflex\">\r\n" + 
						"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
						"                    <div>\r\n" + 
						"                        <p>Year: CSE</p>\r\n" + 
						"                        <h3>Asif</h3>\r\n" + 
						"                        <p>Position: NSU</p>\r\n" + 
						"                    </div>\r\n" + 
						"               </div>\r\n";
		
		assertEquals(expected, actual);

		
	}





	

	
	//TESTING VALIDATION METHODS 
	
	
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
	
	
	
	
	
	//GRAPH TESTING
	
	//Structural Coverage Criteria
	
	
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
	
	
	
	/*
	 * Node 1 : Decision making node, weather input = null (Initial Node)
	 * Node 2 : for input = null, return false (Final Node)
	 * Node 3 : for input != null, a block of code
	 * Node 4 : return result (Final Node)
	 * 
	 * Prime Paths : [1,2], [1,3,4]
	 * 
	 * For Prime Path 1 the input value = null
	 * For Prime Path 2 the input value = "2001"
	 */
	
	@Test
	public void test_validYear_Path1() {
		
		boolean actual = mc.validYear(null);  
		
		assertFalse(actual);		//Not Valid Year so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validYear_Path2() {
		
		boolean actual = mc.validYear("2001");  
		
		assertTrue(actual);		//Valid Year so using assertTrue to evaluate
		
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
	 * For Prime Path 2 the input value = "3.5"
	 */
	
	@Test
	public void test_validGrade_Path1() {
		
		boolean actual = mc.validGrade(null);  
		
		assertFalse(actual);		//Not Valid Grade so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validGrade_Path2() {
		
		boolean actual = mc.validGrade("3.5");  
		
		assertTrue(actual);		//Valid Grade so using assertTrue to evaluate
		
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
	 * For Prime Path 2 the input value = "3"
	 */
	
	@Test
	public void test_validTwoPlaceNum_Path1() {
		
		boolean actual = mc.validTwoPlaceNum(null);  
		
		assertFalse(actual);		//Not Valid Two Place Number so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validTwoPlaceNum_Path2() {
		
		boolean actual = mc.validTwoPlaceNum("3");  
		
		assertTrue(actual);		//Valid Two Place Number so using assertTrue to evaluate
		
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
	 * For Prime Path 2 the input value = "asif.png"
	 */
	
	@Test
	public void test_validImageFile_Path1() {
		
		boolean actual = mc.validImageFile(null);  
		
		assertFalse(actual);		//Not Valid Image File so using assertFalse to evaluate
		
	}
	
	@Test
	public void test_validImageFile_Path2() {
		
		boolean actual = mc.validImageFile("asif.png");  
		
		assertTrue(actual);		//Valid Image File so using assertTrue to evaluate
		
	}
	
	

	
	
	

}
