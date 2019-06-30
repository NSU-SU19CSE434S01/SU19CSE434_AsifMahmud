package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

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
	@FXML
	private TextField company1Name;
	@FXML
	private TextField company1Position;
	@FXML
	private TextField company1YearsWorked;
	@FXML
	private TextField company2Name;
	@FXML
	private TextField company2Position;
	@FXML
	private TextField company2YearsWorked;
	@FXML
	private TextField company3Name;
	@FXML
	private TextField company3Position;
	@FXML
	private TextField company3YearsWorked;
	@FXML
	private TextField skill1;
	@FXML
	private TextField skill2;
	@FXML
	private TextField skill3;
	@FXML
	private TextField skill4;
	@FXML
	private TextField skill5;
	@FXML
	private TextField skill6;
	@FXML
	private TextField skill7;
	@FXML
	private TextField skill8;
	@FXML
	private TextField reference1Name;
	@FXML
	private TextField reference1Institution;
	@FXML
	private TextField reference1Position;
	@FXML
	private TextField reference1Email;
	@FXML
	private TextField reference2Name;
	@FXML
	private TextField reference2Institution;
	@FXML
	private TextField reference2Position;
	@FXML
	private TextField reference2Email;

	
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
	private Label company1NameErrorLabel;
	@FXML
	private Label company1PositionErrorLabel;
	@FXML
	private Label company1YearsWorkedErrorLabel;
	@FXML
	private Label company2NameErrorLabel;
	@FXML
	private Label company2PositionErrorLabel;
	@FXML
	private Label company2YearsWorkedErrorLabel;
	@FXML
	private Label company3NameErrorLabel;
	@FXML
	private Label company3PositionErrorLabel;
	@FXML
	private Label company3YearsWorkedErrorLabel;
	@FXML
	private Label skill1ErrorLabel;
	@FXML
	private Label skill2ErrorLabel;
	@FXML
	private Label skill3ErrorLabel;
	@FXML
	private Label skill4ErrorLabel;
	@FXML
	private Label skill5ErrorLabel;
	@FXML
	private Label skill6ErrorLabel;
	@FXML
	private Label skill7ErrorLabel;
	@FXML
	private Label skill8ErrorLabel;
	@FXML
	private Label reference1NameErrorLabel;
	@FXML
	private Label reference1InstitutionErrorLabel;
	@FXML
	private Label reference1PositionErrorLabel;
	@FXML
	private Label reference1EmailErrorLabel;
	@FXML
	private Label reference2NameErrorLabel;
	@FXML
	private Label reference2InstitutionErrorLabel;
	@FXML
	private Label reference2PositionErrorLabel;
	@FXML
	private Label reference2EmailErrorLabel;
	@FXML
	private Label cvGeneratedLocationLabel;
	@FXML
	private Label imageFileErrorLabel;
	@FXML
	private Label imageFileErrorLabel1;
	
	
	@FXML
	private TextArea userStatement;
	
	private String profilePicPath = "Images/boy.png";
	
	
	//Error determining variable for all user inputs
	public boolean noInputError;
	
	
	
	public void generateCv(ActionEvent event) throws IOException {
		
		noInputError = true;
		
		//Assign user inputs to string variables
		
		//General inputs variables
		String userNameV = userName.getText();
		String userQualificationTitleV = userQualificationTitle.getText();
		String userAddressV = userAddress.getText();
		String userPhoneNumberV = userPhoneNumber.getText();
		String userEmailV = userEmail.getText();
		String userStatementV = userStatement.getText();
		
		//Academic achievement inputs variables
		String award1NameV = award1Name.getText();
		String award1PositionV = award1Position.getText();
		String award1YearV = award1Year.getText();
		String award2NameV = award2Name.getText();
		String award2PositionV = award2Position.getText();
		String award2YearV = award2Year.getText();
		String award3NameV = award3Name.getText();
		String award3PositionV = award3Position.getText();
		String award3YearV = award3Year.getText();
		
		//Language inputs variables
		String language1V = language1.getText();
		String language2V = language2.getText();
		
		//Education inputs variables
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
		
		//Job experience inputs variables
		String company1NameV = company1Name.getText();
		String company1PositionV = company1Position.getText();
		String company1YearsWorkedV = company1YearsWorked.getText();
		String company2NameV = company2Name.getText();
		String company2PositionV = company2Position.getText();
		String company2YearsWorkedV = company2YearsWorked.getText();
		String company3NameV = company3Name.getText();
		String company3PositionV = company3Position.getText();
		String company3YearsWorkedV = company3YearsWorked.getText();
		
		//Skill inputs variables
		String skill1V = skill1.getText();
		String skill2V = skill2.getText();
		String skill3V = skill3.getText();
		String skill4V = skill4.getText();
		String skill5V = skill5.getText();
		String skill6V = skill6.getText();
		String skill7V = skill7.getText();
		String skill8V = skill8.getText();
		
		//Reference inputs variables
		String reference1NameV = reference1Name.getText();
		String reference1InstitutionV = reference1Institution.getText();
		String reference1PositionV = reference1Position.getText();
		String reference1EmailV = reference1Email.getText();
		String reference2NameV = reference2Name.getText();
		String reference2InstitutionV = reference2Institution.getText();
		String reference2PositionV = reference2Position.getText();
		String reference2EmailV = reference2Email.getText();
		
	
	
		
		
		
		//Put in error messages
		generalDataProcessing(userNameV, userQualificationTitleV);
		contactDataProcessing(userAddressV, userPhoneNumberV, userEmailV);
		statementDataProcessing(userStatementV);
		
		
		
		
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
		
		//Job experience input error messages
		if(company1NameV.length() !=0 || company1PositionV.length() !=0 || company1YearsWorkedV.length() !=0 ) {
			
			if(validText(company1NameV) == false) {
				company1NameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else if(isEmpty(company1NameV) == true) {
				company1NameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else {company1NameErrorLabel.setText("");}
			
			if(isEmpty(company1PositionV) == true) {
				company1PositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {company1PositionErrorLabel.setText("");}
			
			if(validTwoPlaceNum(company1YearsWorkedV) == false) {
				company1YearsWorkedErrorLabel.setText("Put in right years worked for");
				noInputError = false;
			}else {company1YearsWorkedErrorLabel.setText("");}
		}else {
			company1NameErrorLabel.setText("");
			company1PositionErrorLabel.setText("");
			company1YearsWorkedErrorLabel.setText("");
		}
		
		if(company2NameV.length() !=0 || company2PositionV.length() !=0 || company2YearsWorkedV.length() !=0 ) {
			
			if(validText(company2NameV) == false) {
				company2NameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else if(isEmpty(company2NameV) == true) {
				company2NameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else {company2NameErrorLabel.setText("");}
			
			if(isEmpty(company2PositionV) == true) {
				company2PositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {company2PositionErrorLabel.setText("");}
			
			if(validTwoPlaceNum(company2YearsWorkedV) == false) {
				company2YearsWorkedErrorLabel.setText("Put in right years worked for");
				noInputError = false;
			}else {company2YearsWorkedErrorLabel.setText("");}
		}else {
			company2NameErrorLabel.setText("");
			company2PositionErrorLabel.setText("");
			company2YearsWorkedErrorLabel.setText("");
		}
		
		if(company3NameV.length() !=0 || company3PositionV.length() !=0 || company3YearsWorkedV.length() !=0 ) {
			
			if(validText(company3NameV) == false) {
				company3NameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else if(isEmpty(company3NameV) == true) {
				company3NameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else {company3NameErrorLabel.setText("");}
			
			if(isEmpty(company3PositionV) == true) {
				company3PositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {company3PositionErrorLabel.setText("");}
			
			if(validTwoPlaceNum(company3YearsWorkedV) == false) {
				company3YearsWorkedErrorLabel.setText("Put in right years worked for");
				noInputError = false;
			}else {company3YearsWorkedErrorLabel.setText("");}
		}else {
			company3NameErrorLabel.setText("");
			company3PositionErrorLabel.setText("");
			company3YearsWorkedErrorLabel.setText("");
		}
		
		//Skill input error messages
		if(validText(skill1V) == false) {
			skill1ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill1ErrorLabel.setText("");
		
		if(validText(skill2V) == false) {
			skill2ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill2ErrorLabel.setText("");
		
		if(validText(skill3V) == false) {
			skill3ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill3ErrorLabel.setText("");
		
		if(validText(skill4V) == false) {
			skill4ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill4ErrorLabel.setText("");
		
		if(validText(skill5V) == false) {
			skill5ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill5ErrorLabel.setText("");
		
		if(validText(skill6V) == false) {
			skill6ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill6ErrorLabel.setText("");
		
		if(validText(skill7V) == false) {
			skill7ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill7ErrorLabel.setText("");
		
		if(validText(skill8V) == false) {
			skill8ErrorLabel.setText("Put in appropriate skill");
			noInputError = false;
		}else skill8ErrorLabel.setText("");
		
		//Reference input error messages
		if(reference1NameV.length() !=0 || reference1InstitutionV.length() !=0 || reference1PositionV.length() !=0 || reference1EmailV.length() !=0) {
			
			if(validText(reference1NameV) == false) {
				reference1NameErrorLabel.setText("Put in appropriate reference name");
				noInputError = false;
			}else if(isEmpty(reference1NameV) == true) {
				reference1NameErrorLabel.setText("Put in appropriate reference name");
				noInputError = false;
			}else {reference1NameErrorLabel.setText("");}
			
			if(validText(reference1InstitutionV) == false) {
				reference1InstitutionErrorLabel.setText("Put in appropriate reference institution name");
				noInputError = false;
			}else if(isEmpty(reference1InstitutionV) == true) {
				reference1InstitutionErrorLabel.setText("Put in appropriate reference institution name");
				noInputError = false;
			}else {reference1InstitutionErrorLabel.setText("");}
			
			if(validText(reference1PositionV) == false) {
				reference1PositionErrorLabel.setText("Put in appropriate position");
				noInputError = false;
			}else if(isEmpty(reference1PositionV) == true) {
				reference1PositionErrorLabel.setText("Put in appropriate position");
				noInputError = false;
			}else {reference1PositionErrorLabel.setText("");}
			
			if(validEmail(reference1EmailV) == false) {
				reference1EmailErrorLabel.setText("Put in appropriate reference email");
				noInputError = false;
			}else {reference1EmailErrorLabel.setText("");}
		}else {
			reference1NameErrorLabel.setText("");
			reference1InstitutionErrorLabel.setText("");
			reference1PositionErrorLabel.setText("");
			reference1EmailErrorLabel.setText("");
		}
		
		if(reference2NameV.length() !=0 || reference2InstitutionV.length() !=0 || reference2PositionV.length() !=0 || reference2EmailV.length() !=0) {
			
			if(validText(reference2NameV) == false) {
				reference2NameErrorLabel.setText("Put in appropriate reference name");
				noInputError = false;
			}else if(isEmpty(reference2NameV) == true) {
				reference2NameErrorLabel.setText("Put in appropriate reference name");
				noInputError = false;
			}else {reference2NameErrorLabel.setText("");}
			
			if(validText(reference2InstitutionV) == false) {
				reference2InstitutionErrorLabel.setText("Put in appropriate reference institution name");
				noInputError = false;
			}else if(isEmpty(reference2InstitutionV) == true) {
				reference2InstitutionErrorLabel.setText("Put in appropriate reference institution name");
				noInputError = false;
			}else {reference2InstitutionErrorLabel.setText("");}
			
			if(validText(reference2PositionV) == false) {
				reference2PositionErrorLabel.setText("Put in appropriate position");
				noInputError = false;
			}else if(isEmpty(reference2PositionV) == true) {
				reference2PositionErrorLabel.setText("Put in appropriate position");
				noInputError = false;
			}else {reference2PositionErrorLabel.setText("");}
			
			if(validEmail(reference2EmailV) == false) {
				reference2EmailErrorLabel.setText("Put in appropriate reference email");
				noInputError = false;
			}else {reference2EmailErrorLabel.setText("");}
		}else {
			reference2NameErrorLabel.setText("");
			reference2InstitutionErrorLabel.setText("");
			reference2PositionErrorLabel.setText("");
			reference2EmailErrorLabel.setText("");
		}
		
		
		
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
				"                <img src=\""+profilePicPath+"\" alt=\"\">\r\n" + 
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
				"                    <div><h3>"+language1V+"</h3></div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/language.png\" alt=\"\"></div>\r\n" + 
				"                    <div><h3>"+language2V+"</h3></div>\r\n" + 
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
				"                        <h3>"+underGradDegreeNameV+"</h3>\r\n" + 
				"                        <p>"+underGradUnivarsityNameV+"</p>\r\n" + 
				"                        <p>Graduation Year: "+underGradGraduationYearV+"</p>\r\n" + 
				"                        <p>Grade Point: "+underGradGarePointV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>hsc / a level</h3>\r\n" + 
				"                        <p>"+hscOrALevelCollegeNameV+"</p>\r\n" + 
				"                        <p>Graduation Year: "+hscOrALevelGraduationYearV+"</p>\r\n" + 
				"                        <p>Grade Point: "+hscOrALevelGradePointV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>ssc / o level</h3>\r\n" + 
				"                        <p>"+sscOrOLevelSchoolNameV+"</p>\r\n" + 
				"                        <p>Graduation Year: "+sscOrOLevelGraduationYearV+"</p>\r\n" + 
				"                        <p>Grade Point: "+sscOrOLevelGradePointV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"             <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">JOB EXPERIENCE</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>"+company1NameV+"</h3>\r\n" + 
				"                        <p>Position: "+company1PositionV+"</p>\r\n" + 
				"                        <p>Years Worked: "+company1YearsWorkedV+"</p>\r\n" + 
				"                        \r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>"+company2NameV+"</h3>\r\n" + 
				"                        <p>Position: "+company2PositionV+"</p>\r\n" + 
				"                        <p>Years Worked: "+company2YearsWorkedV+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>"+company3NameV+"</h3>\r\n" + 
				"                        <p>Position: "+company3PositionV+"</p>\r\n" + 
				"                        <p>Years Worked: "+company3YearsWorkedV+"</p>\r\n" + 
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
				"                            <h4>"+skill1V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill2V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill3V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill4V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill5V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill6V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill7V+"</h4>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h4>"+skill8V+"</h4>\r\n" + 
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
				"                            <h3>"+reference1NameV+"</h3>\r\n" + 
				"                            <p>Institution: "+reference1InstitutionV+"</p>\r\n" + 
				"                            <p>Position: "+reference1PositionV+"</p>\r\n" + 
				"                            <p>Mail: "+reference1EmailV+"</p>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h3>"+reference2NameV+"</h3>\r\n" + 
				"                            <p>Institution: "+reference2InstitutionV+"</p>\r\n" + 
				"                            <p>Position: "+reference2PositionV+"</p>\r\n" + 
				"                            <p>Mail: "+reference2EmailV+"</p>\r\n" + 
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
		
		//Shows the location of generated cv within the ui
		cvGeneratedLocationLabel.setText("CV Generated: Project1/GeneratedCV");
		}else {
			cvGeneratedLocationLabel.setText("Put in appropriate information");
		}
	}
	
	//Image upload button action
	public void profilePicUpload(ActionEvent event) throws IOException {
		
		 
		File selectedFile;
		Path destinationPath;

		
	    FileChooser fc = new FileChooser();
	    fc.setTitle("Attach an image");
	    selectedFile = fc.showOpenDialog(null);
	    
	    if (selectedFile != null) {
	    	
	    	if(validImageFile(selectedFile.getName()) == true) {
	    	
	        destinationPath = Paths.get("G:\\Java Projects\\CSE434\\Project1\\GeneratedCV\\Images\\"+ selectedFile.getName());
	        profilePicPath = "Images/" +selectedFile.getName(); 
	        Files.copy(selectedFile.toPath(), destinationPath, StandardCopyOption.REPLACE_EXISTING);
	        
	        imageFileErrorLabel.setText("");
    		imageFileErrorLabel1.setText("");
	    	
	    	}else {
	    		
	    		imageFileErrorLabel.setText("Only JPG, jpeg and png file is allowed");
	    		imageFileErrorLabel1.setText("Image name can only contain letters, numbers, _, -, .");
	    	}
        }

	    
	}
	
	
	//User input data processing methods
	
	public void generalDataProcessing(String userNameV, String userQualificationTitleV) {
		
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
	}
	
	
	public void contactDataProcessing(String userAddressV, String userPhoneNumberV, String userEmailV) {
		
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
	}
	
	
	public void statementDataProcessing(String userStatementV) {
		
		if(isEmpty(userStatementV) == true) {
			userStatementErrorLabel.setText("Please fill this up");
			noInputError = false;
		}else {userStatementErrorLabel.setText("");}
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
	
	//Used to validate user grade point
	public boolean validGrade(String input) {
		
		Pattern p = Pattern.compile("[0-5]{1}+\\.[0-9]{1,3}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate two place number
	public boolean validTwoPlaceNum(String input) {
			
		Pattern p = Pattern.compile("[0-9]{1,2}");
		Matcher m = p.matcher(input);
		return m.matches();
		}
	
	//Check for valid image file
	public boolean validImageFile(String input) {
		
		Pattern p = Pattern.compile("[A-Za-z0-9._-]+\\.JPG|[A-Za-z0-9._-]+\\.jpeg|[A-Za-z0-9._-]+\\.png");
		Matcher m = p.matcher(input);
		return m.matches();
	}
		
	
	

}
