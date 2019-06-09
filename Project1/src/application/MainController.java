package application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField userName;
	@FXML
	private TextField userQualificationTitle;
	
	
	public void generateCv(ActionEvent event) throws IOException {
		
		String userNameV = userName.getText();
		String userQualificationTitleV = userQualificationTitle.getText();
		
		String htmlString = new String(Files.readAllBytes(Paths.get("HtmlRsc/emptycv.html")));
		
		htmlString = htmlString.replace("$name", userNameV);
		htmlString = htmlString.replace("$title", userQualificationTitleV);
		
		Files.write(Paths.get("GeneratedCV/CV.html"), htmlString.getBytes());
	}
	

}
