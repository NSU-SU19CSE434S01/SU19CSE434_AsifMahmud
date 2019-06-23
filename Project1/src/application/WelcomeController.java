package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WelcomeController {
	
	@FXML
	private Button proceed;
	
	public void proceedToNextScene(ActionEvent event) throws IOException {
		
		//Closes the welcome scene
		Stage stage = (Stage) proceed.getScene().getWindow();
	    stage.close();;
		
		Stage primaryStage = new Stage();
		
		//Shows the main scene
		Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
}
