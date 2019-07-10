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
import javafx.scene.layout.VBox;
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
	
	@FXML
	private VBox skillSet1Vbox;
	@FXML
	private VBox skillSet2Vbox;
	@FXML
	private VBox academivAcievementsVbox1;
	@FXML
	private VBox academivAcievementsVbox2;
	@FXML
	private VBox jobExperienceVbox1;
	@FXML
	private VBox jobExperienceVbox2;
	@FXML
	private VBox referenceVbox;
	
	
	
	private String profilePicPath = "Images/boy.png";
	
	
	//Error determining variable for all user inputs
	public boolean noInputError;
	
	//Variables needed for Dynamic Skill Text-Fields
	private int skillLabelCount = 0;
	private String skillSet1HtmlFormat = "";
	private String skillSet2HtmlFormat = "";
	
	//Variables needed for Dynamic Academic Achievement Text-Fields
	private int academicAchievementLabelCount = 0;
	private String academicAchievementsHtmlFormat = "";
	
	//Variables needed for Dynamic Job Experience Text-Fields
	private int jobExperienceLabelCount = 0;
	private String jobExperienceHtmlFormat = "";
	
	//Variables needed for Dynamic Reference Text-Fields
	private int referenceLabelCount = 0;
	private String referenceHtmlFormat = "";
	
	
	
	public void generateCv (ActionEvent event) throws IOException {
		
		noInputError = true;
		
		generalDataProcessing(userName.getText(), userQualificationTitle.getText());
		contactDataProcessing(userAddress.getText(), userPhoneNumber.getText(), userEmail.getText());
		statementDataProcessing(userStatement.getText());
		
		if (award1Name != null) {academicAchievementsDataProcessing (award1Name.getText(), award1Position.getText(), award1Year.getText(),
				award1NameErrorLabel, award1PositionErrorLabel, award1YearErrorLabel);}
		if (award2Name != null) {academicAchievementsDataProcessing(award2Name.getText(), award2Position.getText(), award2Year.getText(),
				award2NameErrorLabel, award2PositionErrorLabel, award2YearErrorLabel);}
		if (award3Name != null)	{academicAchievementsDataProcessing(award3Name.getText(), award3Position.getText(), award3Year.getText(),
				award3NameErrorLabel, award3PositionErrorLabel, award3YearErrorLabel);}
		
		languageDataProcessing (language1.getText(), language2.getText());
		underGradGeneralDataProcessing (underGradDegreeName.getText(), underGradUnivarsityName.getText());
		underGradResultDataProcessing (underGradGraduationYear.getText(), underGradGarePoint.getText());
		hscOrALevelDataProcessing (hscOrALevelCollegeName.getText(), hscOrALevelGraduationYear.getText(), hscOrALevelGradePoint.getText());
		sscOrOLevelDataProcessing (sscOrOLevelSchoolName.getText(), sscOrOLevelGraduationYear.getText(), sscOrOLevelGradePoint.getText());
		
		if (company1Name != null) {jobExperienceDataProcessing (company1Name.getText(), company1Position.getText(), company1YearsWorked.getText(),
				company1NameErrorLabel,company1PositionErrorLabel,company1YearsWorkedErrorLabel);}
		if (company2Name != null) {jobExperienceDataProcessing (company2Name.getText(), company2Position.getText(), company2YearsWorked.getText(),
				company2NameErrorLabel,company2PositionErrorLabel,company2YearsWorkedErrorLabel);}
		if (company3Name != null) {jobExperienceDataProcessing (company3Name.getText(), company3Position.getText(), company3YearsWorked.getText(),
				company3NameErrorLabel,company3PositionErrorLabel,company3YearsWorkedErrorLabel);}
		
		if(skill1 != null) {skillSet1DataProcessing (skill1.getText(), skill1ErrorLabel);}
		if(skill2 != null) {skillSet1DataProcessing (skill2.getText(), skill2ErrorLabel);}
		if(skill3 != null) {skillSet1DataProcessing (skill3.getText(), skill3ErrorLabel);}
		if(skill4 != null) {skillSet1DataProcessing (skill4.getText(), skill4ErrorLabel);}
		if(skill5 != null) {skillSet2DataProcessing (skill5.getText(), skill5ErrorLabel);}
		if(skill6 != null) {skillSet2DataProcessing (skill6.getText(), skill6ErrorLabel);}
		if(skill7 != null) {skillSet2DataProcessing (skill7.getText(), skill7ErrorLabel);}
		if(skill8 != null) {skillSet2DataProcessing (skill8.getText(), skill8ErrorLabel);}
		
		reference1DataProcessing (reference1Name.getText(), reference1Institution.getText(), reference1Position.getText(), reference1Email.getText());
		reference2DataProcessing (reference2Name.getText(), reference2Institution.getText(), reference2Position.getText(), reference2Email.getText());
		
		
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
				"                        <p>"+userName.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/address.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Address</h4>\r\n" + 
				"                        <p>"+userAddress.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/phone.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Phone</h4>\r\n" + 
				"                        <p>"+userPhoneNumber.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/mail.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h4>Mail</h4>\r\n" + 
				"                        <p>"+userEmail.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"statementbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">STATEMENT</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <p>"+userStatement.getText()+"</p>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"achievementbox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">ACADEMIC ACIEVEMENTS</h2>\r\n" + 
				"                <hr>\r\n"  
				                 +academicAchievementsHtmlFormat+
				"            </div>\r\n" + 
				"            <div class=\"languagebox\">\r\n" + 
				"                <h2 class=\"leftcontainerheader\">LANGUAGES</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/language.png\" alt=\"\"></div>\r\n" + 
				"                    <div><h3>"+language1.getText()+"</h3></div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/language.png\" alt=\"\"></div>\r\n" + 
				"                    <div><h3>"+language2.getText()+"</h3></div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"        <div class=\"rightcontainer\">\r\n" + 
				"            <div class=\"namebanner\">\r\n" + 
				"                <h1>"+userName.getText()+"</h1>\r\n" + 
				"                <h3>"+userQualificationTitle.getText()+"</h3>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">EDUCATION</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>"+underGradDegreeName.getText()+"</h3>\r\n" + 
				"                        <p>"+underGradUnivarsityName.getText()+"</p>\r\n" + 
				"                        <p>Graduation Year: "+underGradGraduationYear.getText()+"</p>\r\n" + 
				"                        <p>Grade Point: "+underGradGarePoint.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>hsc / a level</h3>\r\n" + 
				"                        <p>"+hscOrALevelCollegeName.getText()+"</p>\r\n" + 
				"                        <p>Graduation Year: "+hscOrALevelGraduationYear.getText()+"</p>\r\n" + 
				"                        <p>Grade Point: "+hscOrALevelGradePoint.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/edu.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>ssc / o level</h3>\r\n" + 
				"                        <p>"+sscOrOLevelSchoolName.getText()+"</p>\r\n" + 
				"                        <p>Graduation Year: "+sscOrOLevelGraduationYear.getText()+"</p>\r\n" + 
				"                        <p>Grade Point: "+sscOrOLevelGradePoint.getText()+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"             <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">JOB EXPERIENCE</h2>\r\n" + 
				"                <hr>\r\n"  
				                 +jobExperienceHtmlFormat+
				"            </div>\r\n" + 
				"            <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">SKILLS</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n"  
				                    +skillSet1HtmlFormat+
				"                </div>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n"  
				                    +skillSet2HtmlFormat+
				"                </div>\r\n" + 
				"            </div>\r\n" + 
				"            <div class=\"rightcontainerbox\">\r\n" + 
				"                <h2 class=\"rightcontainerheader\">REFERENCES</h2>\r\n" + 
				"                <hr>\r\n" + 
				"                <div class=\"boxestoflex2\">\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h3>"+reference1Name.getText()+"</h3>\r\n" + 
				"                            <p>Institution: "+reference1Institution.getText()+"</p>\r\n" + 
				"                            <p>Position: "+reference1Position.getText()+"</p>\r\n" + 
				"                            <p>Mail: "+reference1Email.getText()+"</p>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                    <div class=\"boxestoflex\">\r\n" + 
				"                        <div><img src=\"Images/ref.png\" alt=\"\"></div>\r\n" + 
				"                        <div>\r\n" + 
				"                            <h3>"+reference2Name.getText()+"</h3>\r\n" + 
				"                            <p>Institution: "+reference2Institution.getText()+"</p>\r\n" + 
				"                            <p>Position: "+reference2Position.getText()+"</p>\r\n" + 
				"                            <p>Mail: "+reference2Email.getText()+"</p>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n" + 
				"            <div>\r\n" + 
				"        </div>\r\n" + 
				"       \r\n" + 
				"</body>\r\n" + 
				"</html>";
		
		
		//Write html string to new html document 
		Files.write(Paths.get("GeneratedCV/CV Of "+userName.getText()+".html"), htmlString.getBytes());
		
		//Shows the location of generated CV within the user interface of application
		cvGeneratedLocationLabel.setText("CV Generated: Project1/GeneratedCV");
		}else {
			cvGeneratedLocationLabel.setText("Put in appropriate information");
		}
		
		//Making generated Html strings empty before next run
		skillSet1HtmlFormat = "";
		skillSet2HtmlFormat = "";
		academicAchievementsHtmlFormat = "";
		jobExperienceHtmlFormat = "";
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
	
	
	
	
	//Skills dynamic Text-Fields generate button action method
	public void skillLabelGenerate (ActionEvent event) throws Exception {
		
		if (skillLabelCount == 0) {
			
			skill1 = new TextField();
			skill1ErrorLabel = new Label();
			skill1.setPromptText("Skill 1");
			skill1ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet1Vbox.getChildren().addAll(skill1, skill1ErrorLabel);
		} 
		
		if (skillLabelCount == 1) {
			
			skill2 = new TextField();
			skill2ErrorLabel = new Label();
			skill2.setPromptText("Skill 2");
			skill2ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet1Vbox.getChildren().addAll(skill2, skill2ErrorLabel);
		} 
		
		if (skillLabelCount == 2) {
			
			skill3 = new TextField();
			skill3ErrorLabel = new Label();
			skill3.setPromptText("Skill 3");
			skill3ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet1Vbox.getChildren().addAll(skill3, skill3ErrorLabel);
		}
		
		if (skillLabelCount == 3) {
			
			skill4 = new TextField();
			skill4ErrorLabel = new Label();
			skill4.setPromptText("Skill 4");
			skill4ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet1Vbox.getChildren().addAll(skill4,skill4ErrorLabel);
			}
		
		if (skillLabelCount == 4) {
			
			skill5 = new TextField();
			skill5ErrorLabel = new Label();
			skill5.setPromptText("Skill 5");
			skill5ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet2Vbox.getChildren().addAll(skill5, skill5ErrorLabel);
		} 
		
		if (skillLabelCount == 5) {
			
			skill6 = new TextField();
			skill6ErrorLabel = new Label();
			skill6.setPromptText("Skill 6");
			skill6ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet2Vbox.getChildren().addAll(skill6, skill6ErrorLabel);
		} 
		
		if (skillLabelCount == 6) {
			
			skill7 = new TextField();
			skill7ErrorLabel = new Label();
			skill7.setPromptText("Skill 7");
			skill7ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet2Vbox.getChildren().addAll(skill7, skill7ErrorLabel);
		}
		
		if (skillLabelCount == 7) {
			
			skill8 = new TextField();
			skill8ErrorLabel = new Label();
			skill8.setPromptText("Skill 8");
			skill8ErrorLabel.getStyleClass().add("dynamic-labels");
			skillSet2Vbox.getChildren().addAll(skill8,skill8ErrorLabel);
			}
		
		if (skillLabelCount > 7) {skill8ErrorLabel.setText("Mximum fields reached");}
		
		skillLabelCount++;
		
	}
	
	
	
	//Academic Achievements dynamic Text-Fields generate button action method
	public void academicAchievementsLabelGenerate (ActionEvent event) throws Exception {
		
		if (academicAchievementLabelCount == 0) {
			
			award1Name = new TextField();
			award1Position = new TextField();
			award1Year = new TextField();
			award1NameErrorLabel = new Label();
			award1PositionErrorLabel = new Label();
			award1YearErrorLabel = new Label();
			award1Name.setPromptText("Award1 Name");
			award1Position.setPromptText("Award1 Position");
			award1Year.setPromptText("Award1 Year");
			award1NameErrorLabel.getStyleClass().add("dynamic-labels");
			award1PositionErrorLabel.getStyleClass().add("dynamic-labels");
			award1YearErrorLabel.getStyleClass().add("dynamic-labels");
			academivAcievementsVbox1.getChildren().addAll(award1Name, award1NameErrorLabel, award1Position, award1PositionErrorLabel, award1Year, award1YearErrorLabel);
		} 
		
		if (academicAchievementLabelCount == 1) {
			
			award2Name = new TextField();
			award2Position = new TextField();
			award2Year = new TextField();
			award2NameErrorLabel = new Label();
			award2PositionErrorLabel = new Label();
			award2YearErrorLabel = new Label();
			award2Name.setPromptText("Award2 Name");
			award2Position.setPromptText("Award2 Position");
			award2Year.setPromptText("Award2 Year");
			award2NameErrorLabel.getStyleClass().add("dynamic-labels");
			award2PositionErrorLabel.getStyleClass().add("dynamic-labels");
			award2YearErrorLabel.getStyleClass().add("dynamic-labels");
			academivAcievementsVbox2.getChildren().addAll(award2Name, award2NameErrorLabel, award2Position, award2PositionErrorLabel, award2Year, award2YearErrorLabel);
		}
		
		if (academicAchievementLabelCount == 2) {
			
			award3Name = new TextField();
			award3Position = new TextField();
			award3Year = new TextField();
			award3NameErrorLabel = new Label();
			award3PositionErrorLabel = new Label();
			award3YearErrorLabel = new Label();
			award3Name.setPromptText("Award3 Name");
			award3Position.setPromptText("Award3 Position");
			award3Year.setPromptText("Award3 Year");
			award3NameErrorLabel.getStyleClass().add("dynamic-labels");
			award3PositionErrorLabel.getStyleClass().add("dynamic-labels");
			award3YearErrorLabel.getStyleClass().add("dynamic-labels");
			academivAcievementsVbox2.getChildren().addAll(award3Name, award3NameErrorLabel, award3Position, award3PositionErrorLabel, award3Year, award3YearErrorLabel);
		}
		
		if (academicAchievementLabelCount > 2) {award3YearErrorLabel.setText("Mximum fields reached");}
		
		academicAchievementLabelCount++;


	}
	
	
	
	//Job Experience dynamic Text-Fields generate button action method
	public void jobExperienceLabelGenerate (ActionEvent event) throws Exception {
		
		if (jobExperienceLabelCount == 0) {
			
			company1Name = new TextField();
			company1Position = new TextField();
			company1YearsWorked = new TextField();
			company1NameErrorLabel = new Label();
			company1PositionErrorLabel = new Label();
			company1YearsWorkedErrorLabel = new Label();
			company1Name.setPromptText("Company1 Name");
			company1Position.setPromptText("Company1 Position");
			company1YearsWorked.setPromptText("Company1 Years Worked");
			company1NameErrorLabel.getStyleClass().add("dynamic-labels");
			company1PositionErrorLabel.getStyleClass().add("dynamic-labels");
			company1YearsWorkedErrorLabel.getStyleClass().add("dynamic-labels");
			jobExperienceVbox1.getChildren().addAll(company1Name, company1NameErrorLabel, company1Position, company1PositionErrorLabel, company1YearsWorked, company1YearsWorkedErrorLabel);
		} 
		
		if (jobExperienceLabelCount == 1) {
			
			company2Name = new TextField();
			company2Position = new TextField();
			company2YearsWorked = new TextField();
			company2NameErrorLabel = new Label();
			company2PositionErrorLabel = new Label();
			company2YearsWorkedErrorLabel = new Label();
			company2Name.setPromptText("Company2 Name");
			company2Position.setPromptText("Company2 Position");
			company2YearsWorked.setPromptText("Company2 Years Worked");
			company2NameErrorLabel.getStyleClass().add("dynamic-labels");
			company2PositionErrorLabel.getStyleClass().add("dynamic-labels");
			company2YearsWorkedErrorLabel.getStyleClass().add("dynamic-labels");
			jobExperienceVbox1.getChildren().addAll(company2Name, company2NameErrorLabel, company2Position, company2PositionErrorLabel, company2YearsWorked, company2YearsWorkedErrorLabel);
		}
		
		if (jobExperienceLabelCount == 2) {
			
			company3Name = new TextField();
			company3Position = new TextField();
			company3YearsWorked = new TextField();
			company3NameErrorLabel = new Label();
			company3PositionErrorLabel = new Label();
			company3YearsWorkedErrorLabel = new Label();
			company3Name.setPromptText("Company3 Name");
			company3Position.setPromptText("Company3 Position");
			company3YearsWorked.setPromptText("Company3 Years Worked");
			company3NameErrorLabel.getStyleClass().add("dynamic-labels");
			company3PositionErrorLabel.getStyleClass().add("dynamic-labels");
			company3YearsWorkedErrorLabel.getStyleClass().add("dynamic-labels");
			jobExperienceVbox2.getChildren().addAll(company3Name, company3NameErrorLabel, company3Position, company3PositionErrorLabel, company3YearsWorked, company3YearsWorkedErrorLabel);
		}
		
		if (jobExperienceLabelCount > 2) {company3YearsWorkedErrorLabel.setText("Mximum fields reached");}
		
		jobExperienceLabelCount++;
	}
	
	
	
	
	//Reference dynamic Text-Fields generate button action method
	public void referenceLabelGenerate (ActionEvent event) throws Exception {
		
		if (referenceLabelCount == 0) {
			
			reference1Name = new TextField();
			reference1Institution = new TextField();
			reference1Position = new TextField();
			reference1Email = new TextField();
			reference1NameErrorLabel = new Label();
			reference1InstitutionErrorLabel = new Label();
			reference1PositionErrorLabel = new Label();
			reference1EmailErrorLabel = new Label();
			reference1Name.setPromptText("Reference1 Name");
			reference1Institution.setPromptText("Reference1 Institution");
			reference1Position.setPromptText("Reference1 Position");
			reference1Email.setPromptText("Reference1 Email");
			reference1NameErrorLabel.getStyleClass().add("dynamic-labels");
			reference1InstitutionErrorLabel.getStyleClass().add("dynamic-labels");
			reference1PositionErrorLabel.getStyleClass().add("dynamic-labels");
			reference1EmailErrorLabel.getStyleClass().add("dynamic-labels");
			referenceVbox.getChildren().addAll(reference1Name, reference1NameErrorLabel, reference1Institution, 
					reference1InstitutionErrorLabel, reference1Position, reference1PositionErrorLabel, reference1Email, reference1EmailErrorLabel);
		} 
		
		if (referenceLabelCount == 1) {
			
			reference2Name = new TextField();
			reference2Institution = new TextField();
			reference2Position = new TextField();
			reference2Email = new TextField();
			reference2NameErrorLabel = new Label();
			reference2InstitutionErrorLabel = new Label();
			reference2PositionErrorLabel = new Label();
			reference2EmailErrorLabel = new Label();
			reference2Name.setPromptText("Reference2 Name");
			reference2Institution.setPromptText("Reference2 Institution");
			reference2Position.setPromptText("Reference2 Position");
			reference2Email.setPromptText("Reference2 Email");
			reference2NameErrorLabel.getStyleClass().add("dynamic-labels");
			reference2InstitutionErrorLabel.getStyleClass().add("dynamic-labels");
			reference2PositionErrorLabel.getStyleClass().add("dynamic-labels");
			reference2EmailErrorLabel.getStyleClass().add("dynamic-labels");
			referenceVbox.getChildren().addAll(reference2Name, reference2NameErrorLabel, reference2Institution, 
					reference2InstitutionErrorLabel, reference2Position, reference2PositionErrorLabel, reference2Email, reference2EmailErrorLabel);
		} 
		
		if(referenceLabelCount>1) {reference2EmailErrorLabel.setText("Mximum fields reached");}
		referenceLabelCount++;
	
	}
	
	//User input data processing methods
	
	public void generalDataProcessing (String userNameV, String userQualificationTitleV) {
		
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
	
	
	
	
	
	public void contactDataProcessing (String userAddressV, String userPhoneNumberV, String userEmailV) {
		
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
	
	
	
	
	
	public void statementDataProcessing (String userStatementV) {
		
		if(isEmpty(userStatementV) == true) {
			userStatementErrorLabel.setText("Please fill this up");
			noInputError = false;
		}else {userStatementErrorLabel.setText("");}
	}
	
	
	
	
	
	public void academicAchievementsDataProcessing (String awardName, String awardPosition, String awardYear,
			Label awardNameLabel, Label awardPositionLabel, Label awardYearLabel) {
		
			if(validText(awardName) == false) {
			awardNameLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else if(isEmpty(awardName) == true) {
				awardNameLabel.setText("Put in appropriate award name");
				noInputError = false;
			}else {awardNameLabel.setText("");}
			
			if(isEmpty(awardPosition) == true) {
				awardPositionLabel.setText("Put in position");
				noInputError = false;
			}else {awardPositionLabel.setText("");}
			
			if(validYear(awardYear) == false) {
				awardYearLabel.setText("Put in right year");
				noInputError = false;
			}else {awardYearLabel.setText("");}
			
			academicAchievementsHtmlFormat = academicAchievementsHtmlFormat 
					+ academicAchievementHtmlGenerator (awardName, awardPosition, awardYear); 
		}
	
	
	
	
	
	public void languageDataProcessing (String language1V, String language2V) {
		
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
	}
	
	
	
	
	public void underGradGeneralDataProcessing (String underGradDegreeNameV, String underGradUnivarsityNameV) {
		
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
		
	}
	
	
	
	
	public void underGradResultDataProcessing (String underGradGraduationYearV, String underGradGarePointV) {
		
		if(validYear(underGradGraduationYearV) == false) {
			underGradGraduationYearErrorLabel.setText("Put in right year");
			noInputError = false;
		}else {underGradGraduationYearErrorLabel.setText("");}
		
		if(validGrade(underGradGarePointV) == false) {
			underGradGarePointErrorLabel.setText("Put in appropriate grade");
			noInputError = false;
		}else {underGradGarePointErrorLabel.setText("");}
		
	}
	
	
	
	
	public void hscOrALevelDataProcessing (String hscOrALevelCollegeNameV, String hscOrALevelGraduationYearV, String hscOrALevelGradePointV) {
		
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
	}
	
	
	
	
	public void sscOrOLevelDataProcessing (String sscOrOLevelSchoolNameV, String sscOrOLevelGraduationYearV, String sscOrOLevelGradePointV) {
		
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
	}
	
	
	
	
	public void jobExperienceDataProcessing (String companyName, String companyPosition, String companyYearsWorked,
			Label companyNameErrorLabel, Label companyPositionErrorLabel, Label companyYearsWorkedErrorLabel) {
		
		
			if(validText(companyName) == false) {
				companyNameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else if(isEmpty(companyName) == true) {
				companyNameErrorLabel.setText("Put in appropriate company name");
				noInputError = false;
			}else {companyNameErrorLabel.setText("");}
			
			if(isEmpty(companyPosition) == true) {
				companyPositionErrorLabel.setText("Put in position");
				noInputError = false;
			}else {companyPositionErrorLabel.setText("");}
			
			if(validTwoPlaceNum(companyYearsWorked) == false) {
				companyYearsWorkedErrorLabel.setText("Put in right years worked for");
				noInputError = false;
			}else {companyYearsWorkedErrorLabel.setText("");}
			
			jobExperienceHtmlFormat = jobExperienceHtmlFormat 
					+ jobExperienceHtmlGenerator(companyName, companyPosition, companyYearsWorked);
					
		
	}
	
	
	
	
	public void skillSet1DataProcessing (String skill, Label label) {
		
	    if(validText(skill) == false) {
			label.setText("Put in appropriate skill");
			noInputError = false;
		}else if(isEmpty(skill) == true) {
			label.setText("Put in appropriate skill");
			noInputError = false;
		}else {
			label.setText("");
			skillSet1HtmlFormat = skillSet1HtmlFormat + skillHtmlGenerator(skill); 
			 
		}
		
	 }
	
	
	
	
	public void skillSet2DataProcessing (String skill, Label label) {
		
	    if(validText(skill) == false) {
			label.setText("Put in appropriate skill");
			noInputError = false;
		}else if(isEmpty(skill) == true) {
			label.setText("Put in appropriate skill");
			noInputError = false;
		}else {
			label.setText("");
			skillSet2HtmlFormat = skillSet2HtmlFormat + skillHtmlGenerator(skill);
			 
		}
		
	 }
	
	
	
	
	public void reference1DataProcessing (String reference1NameV, String reference1InstitutionV, String reference1PositionV, String reference1EmailV) {
		
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
	}
	
	
	
	
	public void reference2DataProcessing (String reference2NameV, String reference2InstitutionV, String reference2PositionV, String reference2EmailV) {
		
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
	}
	
	
	
	
	//Html Generator Methods
	
	public String skillHtmlGenerator (String skill) {
		
		return  
			    "                    <div class=\"boxestoflex\">\r\n" + 
			    "                        <div><img src=\"Images/skills.png\" alt=\"\"></div>\r\n" + 
			    "                        <div>\r\n" + 
			    "                            <h4>"+skill+"</h4>\r\n" + 
			    "                        </div>\r\n" + 
			    "                    </div>\r\n" + 
			    "";
				
     }
	
	
	
	
	public String academicAchievementHtmlGenerator (String awardName, String awardPosition, String awardYear) {
		
		return 
				"               <div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/star.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <p>Year: "+awardYear+"</p>\r\n" + 
				"                        <h3>"+awardName+"</h3>\r\n" + 
				"                        <p>Position: "+awardPosition+"</p>\r\n" + 
				"                    </div>\r\n" + 
				"               </div>\r\n";
		}
	
	
	
	
	public String jobExperienceHtmlGenerator (String companyName, String companyPosition, String companyYearsWorked) {
		
		return 
				"				<div class=\"boxestoflex\">\r\n" + 
				"                    <div><img src=\"Images/job.png\" alt=\"\"></div>\r\n" + 
				"                    <div>\r\n" + 
				"                        <h3>"+companyName+"</h3>\r\n" + 
				"                        <p>Position: "+companyPosition+"</p>\r\n" + 
				"                        <p>Years Worked: "+companyYearsWorked+"</p>\r\n" + 
				"                        \r\n" + 
				"                    </div>\r\n" + 
				"                </div>\r\n";
	}
	
	
	
	
	
	//Used to validate user name. Learned from stack overflow.
	public boolean validName (String input) {
		
		return Pattern.matches("^[\\p{L} .'-]+$", input);  
	}
	
	//Used to validate user text
	public boolean validText (String input) {
		
		return Pattern.matches("^[a-zA-Z\\s]*$", input);
	}
	
	//Used to check empty string
	public boolean isEmpty (String input) {
		
		if (input.equals("") == true) {
			return true;
		}else return false;
	}
	
	//Used to validate phone number
	public boolean validPhoneNumber (String input) {
		
		Pattern p = Pattern.compile("[0-9]{9,13}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate email
	public boolean validEmail (String input) {
		
		Pattern p = Pattern.compile("[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[A-Za-z]{2,4}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate year
	public boolean validYear (String input) {
		
		Pattern p = Pattern.compile("20[0-9]{2}|19[0-9]{2}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate user grade point
	public boolean validGrade (String input) {
		
		Pattern p = Pattern.compile("[0-5]{1}+\\.[0-9]{1,3}");
		Matcher m = p.matcher(input);
		return m.matches();
	}
	
	//Used to validate two place number
	public boolean validTwoPlaceNum (String input) {
			
		Pattern p = Pattern.compile("[0-9]{1,2}");
		Matcher m = p.matcher(input);
		return m.matches();
		}
	
	//Check for valid image file
	public boolean validImageFile (String input) {
		
		Pattern p = Pattern.compile("[A-Za-z0-9._-]+\\.JPG|[A-Za-z0-9._-]+\\.jpeg|[A-Za-z0-9._-]+\\.png");
		Matcher m = p.matcher(input);
		return m.matches();
	}
		
	
	

}
