package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField userName;
	@FXML
	private TextField userQualificationTitle;
	@FXML
	private Label userNameErrorLabel;
	@FXML
	private Label userTitleErrorLabel;
	
	
	public void generateCv(ActionEvent event) throws IOException {
		
		//Assign user inputs to string variables
		String userNameV = userName.getText();
		String userQualificationTitleV = userQualificationTitle.getText();
		
		
		//Getting html cv format in a string
		String htmlString = new String(Files.readAllBytes(Paths.get("HtmlRsc/emptycv.html")));
		
		
		//Assign error determining boolean variables
		boolean isValidUserName = validName(userNameV);
		boolean isValidUserQualificationTitle = validTitle(userQualificationTitleV);
		
		
		//Put in error messages
		if(isValidUserName == false) {
			userNameErrorLabel.setText("Put in apropriate name");
		}else {userNameErrorLabel.setText("");}
		
		if(isValidUserQualificationTitle == false) {
			userTitleErrorLabel.setText("Put in apropriate title");
		}else {userTitleErrorLabel.setText("");}
		
		
		if(isValidUserName == true && isValidUserQualificationTitle == true) {
			
		//Put user inputs into html string	
		htmlString = htmlString.replace("$name", userNameV);
		htmlString = htmlString.replace("$title", userQualificationTitleV);
		
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
	

}
