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
		
		
		//Getting html cv format in a string
		String htmlString = new String(Files.readAllBytes(Paths.get("HtmlRsc/emptycv.html")));
		
		
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
			
		//Put user inputs into html string	
		htmlString = htmlString.replace("$name", userNameV);
		htmlString = htmlString.replace("$title", userQualificationTitleV);
		htmlString = htmlString.replace("$address", userAddressV);
		
		//Write html string to new html document 
		Files.write(Paths.get("GeneratedCV/CV.html"), htmlString.getBytes());
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
