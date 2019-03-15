package yarab;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginForm {
	       Stage stage;
	       Scene scene;
		   ValidatePin authentication;
		   Home home;
		   LogicTransaction logic;
		   
		 
	public 	LoginForm (Stage stage)  { 
		this.stage = stage;
	}
		  
	public  void  prepareScene(){  
			
		    LogicTransaction logic = new LogicTransaction(); 
		    authentication = new ValidatePin();
		    Label nameLabel = new Label("name: ");
		    Label pinCodeLabel = new Label ("pincode: ");
		    TextField nameField = new TextField(); 
		    TextField pinCodeField = new TextField();
		    Button enter = new Button("enter");
		    Label validationLabel = new Label();
		     
		    
		    GridPane grid = new GridPane();
		    grid.add(pinCodeLabel, 0,  0);
		    grid.add(nameLabel, 0,  1);
		    grid.add(pinCodeField, 1, 0);
		    grid.add(nameField, 1,  1);
		    grid.add(enter, 1, 2);
		    grid.add(validationLabel, 1, 3);
		    
		    enter.setOnAction(new EventHandler<ActionEvent>(){
		    	@Override
		    	public void handle(ActionEvent event) {
		    		String username = nameField.getText();
		    		String pinCode = pinCodeField.getText();
		    		
		    		boolean valid = authentication.validate(username ,pinCode);
		    		if(valid) {
		     			validationLabel.setText("here we go!");
		    			home.setLogicTransaction(logic);
		    			stage.setScene(home.getScene());
		    			
		    			}	  
		    		 
		    		else {
		    			validationLabel.setText("warning!!!");
		    			validationLabel.setFont(new Font("verdana",20));
		    		}
		    	}
		    });    
		     
			 scene = new Scene(grid , 600, 400);
	}
		public   Scene getScene() {
			return this.scene;
	} 
		public void setHome (Home  home) {
			this.home = home;
			
		}
}
