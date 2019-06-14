package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
	
	//User input fields
	@FXML
	private TextField userName;
	@FXML
	private TextField userQualificationTitle;
	@FXML
	private TextField userAddress;
	@FXML
	private TextField userPhoneNumber;
	@FXML
	private TextField userEmail;
	
	//Input error labels
	@FXML
	private Label userNameErrorLabel;
	@FXML
	private Label userTitleErrorLabel;
	@FXML
	private Label userAddressErrorLabel;
	@FXML
	private Label userPhoneNumberErrorLabel;
	@FXML
	private Label userEmailErrorLabel;
	@FXML
	private Label userStatementErrorLabel;
	
	
	@FXML
	private TextArea userStatement;
	
	
	public void generateCv(ActionEvent event) throws IOException {
		
		//Assign user inputs to string variables
		String userNameV = userName.getText();
		String userQualificationTitleV = userQualificationTitle.getText();
		String userAddressV = userAddress.getText();
		String userPhoneNumberV = userPhoneNumber.getText();
		String userEmailV = userEmail.getText();
		String userStatementV = userStatement.getText();
		
		
		//Error determining variable for all user inputs
		boolean noInputError = true;
		
		
		//Put in error messages
		if(validName(userNameV) == false) {
			userNameErrorLabel.setText("Put in appropriate name");
			noInputError = false;
		}else {userNameErrorLabel.setText("");}
		
		if(validTitle(userQualificationTitleV) == false) {
			userTitleErrorLabel.setText("Put in appropriate title");
			noInputError = false;
		}else if(isEmpty(userQualificationTitleV) == true) {
			userTitleErrorLabel.setText("Put in appropriate title");
			noInputError = false;
		}else {userTitleErrorLabel.setText("");}
		
		if(isEmpty(userAddressV) == true) {
			userAddressErrorLabel.setText("Put in appropriate address");
			noInputError = false;
		}else {userAddressErrorLabel.setText("");}
		
		
		
		if(noInputError == true) {
			
		//Getting html cv format in a string and putting in user inputs
		String htmlString = "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"    <link rel=\"stylesheet\" href=\"style.css\">\r\n" + 
				"    <link href=\"https://fonts.googleapis.com/css?family=Raleway&display=swap\" rel=\"stylesheet\">\r\n" + 
				"    <title>CV</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <div class=\"container\">\r\n" + 
				"        <div class=\"leftcontainer\">\r\n" + 
				"            <div class=\"profileimg\">\r\n" + 
				"                <img src=\"Images/boy.png\" alt=\"\">\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"contactbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">CONTACT INFO</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/user.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Name</h4>\r\n" + 
				"                        <p>"+userNameV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/address.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Address</h4>\r\n" + 
				"                        <p>"+userAddressV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/phone.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Phone</h4>\r\n" + 
				"                        <p>+880 1671324427</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/mail.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Mail</h4>\r\n" + 
				"                        <p>asifmahmud.officials@gmail.com</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"statementbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">STATEMENT</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Dicta soluta tenetur natus aspernatur dolorem harum minus quas ipsum magnam! Dicta ad inventore error excepturi dolor amet sapiente quae cupiditate laborum.</p>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"achievementbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">ACADEMIC ACIEVEMENTS</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: 2015</p>\r\n" + 
				"                        <h3>Microsoft Young Developer</h3>\r\n" + 
				"                        <p>Position: 2nd</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: 2017</p>\r\n" + 
				"                        <h3>Google Programing Competition</h3>\r\n" + 
				"                        <p>Position: 4th</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: 2019</p>\r\n" + 
				"                        <h3>Social Youth Award</h3>\r\n" + 
				"                        <p>Position: 1st</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"languagebox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">LANGUAGES</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/language.png\" alt=\"\"></div>\r\n" + 
				"                    <div><h3>Bangla</h3></div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/language.png\" alt=\"\"></div>\r\n" + 
				"                    <div><h3>English</h3></div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"rightcontainer\">\r\n" + 
				"            <div class=\"namebanner\">\r\n" + 
				"                <h1>"+userNameV+"</h1>\r\n" + 
				"                <h3>"+userQualificationTitleV+"</h3>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">EDUCATION</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>computer science and engineering</h3>\r\n" + 
				"                        <p>North South University</p>\r\n" + 
				"                        <p>Graduation Year: 2019 </p>\r\n" + 
				"                        <p>Grade Point: 3.5</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>hsc / a level</h3>\r\n" + 
				"                        <p>Dhaka Imperial College</p>\r\n" + 
				"                        <p>Graduation Year: 2014 </p>\r\n" + 
				"                        <p>Grade Point: 5.0</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>ssc / o level</h3>\r\n" + 
				"                        <p>Khilgaon High School</p>\r\n" + 
				"                        <p>Graduation Year: 2012 </p>\r\n" + 
				"                        <p>Grade Point: 5.0</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"             <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">JOB EXPERIENCE</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>nsu it</h3>\r\n" + 
				"                        <p>Position: General Manager</p>\r\n" + 
				"                        <p>Years Worked: 1 </p>\r\n" + 
				"                        \r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>brack it</h3>\r\n" + 
				"                        <p>Position: General Manager</p>\r\n" + 
				"                        <p>Years Worked: 1 </p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>uber</h3>\r\n" + 
				"                        <p>Position: Developer</p>\r\n" + 
				"                        <p>Years Worked: 1 </p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">SKILLS</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Java</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Php</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Laravel</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Java Script</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Java</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Php</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Laravel</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>Java Script</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">REFERENCES</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h3>Abdul Hamid</h3>\r\n" + 
				"                            <p>Institution: North South University</p>\r\n" + 
				"                            <p>Position: Lecturer</p>\r\n" + 
				"                            <p>Mail: ah@gmail.com</p>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h3>Abdul Hamid</h3>\r\n" + 
				"                            <p>Institution: North South University</p>\r\n" + 
				"                            <p>Position: Lecturer</p>\r\n" + 
				"                            <p>Mail: ah@gmail.com</p>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            <div>\r\n" + 
				"        </div>\r\n" + 
				"       \r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		
		//Write html string to new html document 
		Files.write(Paths.get("GeneratedCV/CV Of "+userNameV+".html"), htmlString.getBytes());
		}
	}
	
	
	public boolean validName(String input) {
		
		return Pattern.matches("^[\\p{L} .'-]+$", input);
	}
	
	public boolean validTitle(String input) {
		
		return Pattern.matches("^[a-zA-Z\\s]*$", input);
	}
	
	public boolean isEmpty(String input) {
		
		if (input.equals("") == true) {
			return true;
		}else return false;
	}
	

}
