package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
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
	@FXML
	private TextField award1Name;
	@FXML
	private TextField award1Position;
	@FXML
	private TextField award1Year;
	@FXML
	private TextField award2Name;
	@FXML
	private TextField award2Position;
	@FXML
	private TextField award2Year;
	@FXML
	private TextField award3Name;
	@FXML
	private TextField award3Position;
	@FXML
	private TextField award3Year;
	@FXML
	private TextField language1;
	@FXML
	private TextField language2;
	@FXML
	private TextField underGradDegreeName;
	@FXML
	private TextField underGradUnivarsityName;
	@FXML
	private TextField underGradGraduationYear;
	@FXML
	private TextField underGradGarePoint;
	@FXML
	private TextField hscOrALevelCollegeName;
	@FXML
	private TextField hscOrALevelGraduationYear;
	@FXML
	private TextField hscOrALevelGradePoint;
	@FXML
	private TextField sscOrOLevelSchoolName;
	@FXML
	private TextField sscOrOLevelGraduationYear;
	@FXML
	private TextField sscOrOLevelGradePoint;
	
	
	
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
	private Label award1NameErrorLabel;
	@FXML
	private Label award1PositionErrorLabel;
	@FXML
	private Label award1YearErrorLabel;
	@FXML
	private Label award2NameErrorLabel;
	@FXML
	private Label award2PositionErrorLabel;
	@FXML
	private Label award2YearErrorLabel;
	@FXML
	private Label award3NameErrorLabel;
	@FXML
	private Label award3PositionErrorLabel;
	@FXML
	private Label award3YearErrorLabel;
	@FXML
	private Label language1ErrorLabel;
	@FXML
	private Label language2ErrorLabel;
	@FXML
	private Label underGradDegreeNameErrorLabel;
	@FXML
	private Label underGradUnivarsityNameErrorLabel;
	@FXML
	private Label underGradGraduationYearErrorLabel;
	@FXML
	private Label underGradGarePointErrorLabel;
	@FXML
	private Label hscOrALevelCollegeNameErrorLabel;
	@FXML
	private Label hscOrALevelGraduationYearErrorLabel;
	@FXML
	private Label hscOrALevelGradePointErrorLabel;
	@FXML
	private Label sscOrOLevelSchoolNameErrorLabel;
	@FXML
	private Label sscOrOLevelGraduationYearErrorLabel;
	@FXML
	private Label sscOrOLevelGradePointErrorLabel;
	
	
	@FXML
	private TextArea userStatement;
	
	
	public void generateCv(ActionEvent event) throws IOException {
		
		//Assign user inputs to string variables
		
		//Generic inputs
		String userNameV = userName.getText();
		String userQualificationTitleV = userQualificationTitle.getText();
		String userAddressV = userAddress.getText();
		String userPhoneNumberV = userPhoneNumber.getText();
		String userEmailV = userEmail.getText();
		String userStatementV = userStatement.getText();
		
		//Academic achievement inputs
		String award1NameV = award1Name.getText();
		String award1PositionV = award1Position.getText();
		String award1YearV = award1Year.getText();
		String award2NameV = award2Name.getText();
		String award2PositionV = award2Position.getText();
		String award2YearV = award2Year.getText();
		String award3NameV = award3Name.getText();
		String award3PositionV = award3Position.getText();
		String award3YearV = award3Year.getText();
		
		//Language inputs
		String language1V = language1.getText();
		String language2V = language2.getText();
		
		//Education inputs
		String underGradDegreeNameV = underGradDegreeName.getText();
		String underGradUnivarsityNameV = underGradUnivarsityName.getText();
		String underGradGraduationYearV = underGradGraduationYear.getText();
		String underGradGarePointV = underGradGarePoint.getText();
		String hscOrALevelCollegeNameV = hscOrALevelCollegeName.getText();
		String hscOrALevelGraduationYearV = hscOrALevelGraduationYear.getText();
		String hscOrALevelGradePointV = hscOrALevelGradePoint.getText();
		String sscOrOLevelSchoolNameV = sscOrOLevelSchoolName.getText();
		String sscOrOLevelGraduationYearV = sscOrOLevelGraduationYear.getText();
		String sscOrOLevelGradePointV = sscOrOLevelGradePoint.getText();
		
	
	
		//Error determining variable for all user inputs
		boolean noInputError = true;
		
		
		//Put in error messages
		if(validName(userNameV) == false) {
			userNameErrorLabel.setText("Put in appropriate name");
			noInputError = false;
		}else {userNameErrorLabel.setText("");}
		
		if(validText(userQualificationTitleV) == false) {
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
		
		if(validPhoneNumber(userPhoneNumberV) == false) {
			userPhoneNumberErrorLabel.setText("Put in appropriate phone number");
			noInputError = false;
		}else {userPhoneNumberErrorLabel.setText("");}
		
		if(validEmail(userEmailV) == false) {
			userEmailErrorLabel.setText("Put in appropriate email");
			noInputError = false;
		}else {userEmailErrorLabel.setText("");}
		
		if(isEmpty(userStatementV) == true) {
			userStatementErrorLabel.setText("Please fill this up");
			noInputError = false;
		}else {userStatementErrorLabel.setText("");}
		
		//Academic achievements input error messages
		if(award1NameV.length() !=0 || award1PositionV.length() !=0 || award1YearV.length() !=0 ) {
			
			if(validText(award1NameV) == false) {
				award1NameErrorLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else if(isEmpty(award1NameV) == true) {
				award1NameErrorLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else {award1NameErrorLabel.setText("");}
			
			if(isEmpty(award1PositionV) == true) {
				award1PositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {award1PositionErrorLabel.setText("");}
			
			if(validYear(award1YearV) == false) {
				award1YearErrorLabel.setText("Put in right year");
				noInputError = false;
			}else {award1YearErrorLabel.setText("");}
		}else {
			award1NameErrorLabel.setText("");
			award1PositionErrorLabel.setText("");
			award1YearErrorLabel.setText("");
		}
		
		if(award2NameV.length() !=0 || award2PositionV.length() !=0 || award2YearV.length() !=0 ) {
			
			if(validText(award2NameV) == false) {
				award2NameErrorLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else if(isEmpty(award2NameV) == true) {
				award2NameErrorLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else {award2NameErrorLabel.setText("");}
			
			if(isEmpty(award2PositionV) == true) {
				award2PositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {award2PositionErrorLabel.setText("");}
			
			if(validYear(award2YearV) == false) {
				award2YearErrorLabel.setText("Put in right year");
				noInputError = false;
			}else {award2YearErrorLabel.setText("");}
		}else {
			award2NameErrorLabel.setText("");
			award2PositionErrorLabel.setText("");
			award2YearErrorLabel.setText("");
		}
		
		if(award3NameV.length() !=0 || award3PositionV.length() !=0 || award3YearV.length() !=0 ) {
			
			if(validText(award3NameV) == false) {
				award3NameErrorLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else if(isEmpty(award3NameV) == true) {
				award3NameErrorLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else {award3NameErrorLabel.setText("");}
			
			if(isEmpty(award3PositionV) == true) {
				award3PositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {award3PositionErrorLabel.setText("");}
			
			if(validYear(award3YearV) == false) {
				award3YearErrorLabel.setText("Put in right year");
				noInputError = false;
			}else {award3YearErrorLabel.setText("");}
		}else {
			award3NameErrorLabel.setText("");
			award3PositionErrorLabel.setText("");
			award3YearErrorLabel.setText("");
		}
		
		//Language input error messages
		if(validText(language1V) == false) {
			language1ErrorLabel.setText("Put in primary language");
			noInputError = false;
		}else if(isEmpty(language1V) == true) {
			language1ErrorLabel.setText("Put in primary language");
			noInputError = false;
		}else {language1ErrorLabel.setText("");}
		
		if(validText(language2V) == false) {
			language2ErrorLabel.setText("Put in secondary language");
			noInputError = false;
		}else if(isEmpty(language2V) == true) {
			language2ErrorLabel.setText("Put in secondary language");
			noInputError = false;
		}else {language2ErrorLabel.setText("");}
		
		//Education input error messages
		if(validText(underGradDegreeNameV) == false) {
			underGradDegreeNameErrorLabel.setText("Put in appropriate degree name");
			noInputError = false;
		}else if(isEmpty(underGradDegreeNameV) == true) {
			underGradDegreeNameErrorLabel.setText("Put in appropriate degree name");
			noInputError = false;
		}else {underGradDegreeNameErrorLabel.setText("");}
		
		if(validText(underGradUnivarsityNameV) == false) {
			underGradUnivarsityNameErrorLabel.setText("Put in appropriate university name");
			noInputError = false;
		}else if(isEmpty(underGradUnivarsityNameV) == true) {
			underGradUnivarsityNameErrorLabel.setText("Put in appropriate univarsity name");
			noInputError = false;
		}else {underGradUnivarsityNameErrorLabel.setText("");}
		
		if(validYear(underGradGraduationYearV) == false) {
			underGradGraduationYearErrorLabel.setText("Put in right year");
			noInputError = false;
		}else {underGradGraduationYearErrorLabel.setText("");}
		
		if(validGrade(underGradGarePointV) == false) {
			underGradGarePointErrorLabel.setText("Put in appropriate grade");
			noInputError = false;
		}else {underGradGarePointErrorLabel.setText("");}
		
		if(validText(hscOrALevelCollegeNameV) == false) {
			hscOrALevelCollegeNameErrorLabel.setText("Put in appropriate college name");
			noInputError = false;
		}else if(isEmpty(hscOrALevelCollegeNameV) == true) {
			hscOrALevelCollegeNameErrorLabel.setText("Put in appropriate college name");
			noInputError = false;
		}else {hscOrALevelCollegeNameErrorLabel.setText("");}
		
		if(validYear(hscOrALevelGraduationYearV) == false) {
			hscOrALevelGraduationYearErrorLabel.setText("Put in right year");
			noInputError = false;
		}else {hscOrALevelGraduationYearErrorLabel.setText("");}
		
		if(validGrade(hscOrALevelGradePointV) == false) {
			hscOrALevelGradePointErrorLabel.setText("Put in appropriate grade");
			noInputError = false;
		}else {hscOrALevelGradePointErrorLabel.setText("");}
		
		if(validText(sscOrOLevelSchoolNameV) == false) {
			sscOrOLevelSchoolNameErrorLabel.setText("Put in appropriate school name");
			noInputError = false;
		}else if(isEmpty(sscOrOLevelSchoolNameV) == true) {
			sscOrOLevelSchoolNameErrorLabel.setText("Put in appropriate school name");
			noInputError = false;
		}else {sscOrOLevelSchoolNameErrorLabel.setText("");}
		
		if(validYear(sscOrOLevelGraduationYearV) == false) {
			sscOrOLevelGraduationYearErrorLabel.setText("Put in right year");
			noInputError = false;
		}else {sscOrOLevelGraduationYearErrorLabel.setText("");}
		
		if(validGrade(sscOrOLevelGradePointV) == false) {
			sscOrOLevelGradePointErrorLabel.setText("Put in appropriate grade");
			noInputError = false;
		}else {sscOrOLevelGradePointErrorLabel.setText("");}
		
		
		
		
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
				"                        <p>"+userPhoneNumberV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/mail.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Mail</h4>\r\n" + 
				"                        <p>"+userEmailV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"statementbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">STATEMENT</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <p>"+userStatementV+"</p>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"achievementbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">ACADEMIC ACIEVEMENTS</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: "+award1YearV+"</p>\r\n" + 
				"                        <h3>"+award1NameV+"</h3>\r\n" + 
				"                        <p>Position: "+award1PositionV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: "+award2YearV+"</p>\r\n" + 
				"                        <h3>"+award2NameV+"</h3>\r\n" + 
				"                        <p>Position: "+award2PositionV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: "+award3YearV+"</p>\r\n" + 
				"                        <h3>"+award3NameV+"</h3>\r\n" + 
				"                        <p>Position: "+award3PositionV+"</p>\r\n" + 
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
	
	//Used to validate user name. Learned from stack overflow.
	public boolean validName(String input) {
		
		return Pattern.matches("^[\\p{L} .'-]+$", input);  
	}
	
	//Used to validate user text
	public boolean validText(String input) {
		
		return Pattern.matches("^[a-zA-Z\\s]*$", input);
	}
	
	//Used to check empty string
	public boolean isEmpty(String input) {
		
		if (input.equals("") == true) {
			return true;
		}else return false;
	}
	
	//Used to validate phone number
	public boolean validPhoneNumber(String input) {
		
		Pattern p = Pattern.compile("[0-9]{9,13}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate email
	public boolean validEmail(String input) {
		
		Pattern p = Pattern.compile("[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate year
	public boolean validYear(String input) {
		
		Pattern p = Pattern.compile("20[0-9]{2}|19[0-9]{2}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate user name grade point
	public boolean validGrade(String input) {
		
		Pattern p = Pattern.compile("[0-5]{1}+\\.[0-9]{1,3}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	

}
