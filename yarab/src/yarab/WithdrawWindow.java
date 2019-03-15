package yarab;

import java.util.regex.Pattern;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class WithdrawWindow {

	 Stage stage;
	 Scene scene;
	 Home home;
	 LogoutForm logout;
	 LogicTransaction withdraws;
	 int newBalance;
	 int balance;

	 
	 public WithdrawWindow(Stage stage) {
			this.stage = stage;
		}


	public void prepareScene() {
		
		Label withdrawLabel = new Label("enter the amount you want to take:");
		TextField withdrawField = new TextField();
		Button add = new Button("take");
		Button finish = new Button("finish");
		Button more = new Button("Another Transaction");
		Label BalanceDisplay = new Label("");
	    Label validationLabel = new Label("");

		
		GridPane grid = new GridPane(); 
		grid.add(withdrawLabel, 0, 0);
		grid.add(withdrawField, 1, 0);
		grid.add(add, 1, 1);
		grid.add(finish, 1, 2);
		grid.add(more, 2, 2); 
		grid.add(BalanceDisplay, 1, 3);
		grid.add(validationLabel, 0, 4);

		
		
		add.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
		public void handle(ActionEvent event) {  
	    		String Add = withdrawField.getText();
	    		
	    		
	    		try {
	    			int amount = Integer.parseInt(withdrawField.getText());
	    			if(withdraws.getBalance() > amount && amount > 0 ) {
			    		withdraws.Withdraw(Add);
	    			newBalance = withdraws.getBalance();
	    	    	BalanceDisplay.setText("your current balance="+withdraws.getBalance());}
		    		 
		    		else   
		    		{ 
		    			if(amount < 0) {
		    				validationLabel.setText("warning!!! you added a negative number");
			    			validationLabel.setFont(new Font("verdana",20));
		    			}
		    			else
			    			validationLabel.setText("warning!!! you don't have enough money :(");
			    			validationLabel.setFont(new Font("verdana",20));
			    		}
	    		}catch(NumberFormatException e) {
	    			
	      				validationLabel.setText("warning!!! you added letters");
		    			validationLabel.setFont(new Font("verdana",20));
	    			}
	    		
	    		 
	    	} 
		   
	});
		finish.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
		public void handle(ActionEvent event) { 
    			stage.setScene(logout.getScene());

	    	}
		  
	});
		more.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
		public void handle(ActionEvent event) { 
	    		home.setLogicTransaction(withdraws);
    			stage.setScene(home.getScene());

	    	}
	});
		scene = new Scene(grid,800,400);
	}
	
	public Scene getScene() {
		
		return scene;
	}
	public void setHome(Home home) {
		this.home = home;
	}
	public void setLogoutForm(LogoutForm logout) {
		this. logout =  logout;
	}


	public void setLogicTransaction(LogicTransaction object) {
		this.withdraws = object;
	}


	
	 
}
