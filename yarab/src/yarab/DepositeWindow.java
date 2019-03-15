package yarab;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DepositeWindow {
	Stage stage;
	 Scene scene;
	 Home home;
	 LogoutForm logout;
	 LogicTransaction deposit;
	 int newBalance;
	 int balance;
	 
		public DepositeWindow(Stage stage) {
			this.stage = stage;
		}
		
		public void prepareScene() {
			Label depositeLabel = new Label("enter the amount you want to add:");
			TextField depositeField = new TextField();
			Button add = new Button("add");
			Button finish = new Button("finish");
			Button more = new Button("Another Transaction");
			Label BalanceDisplay = new Label("");
			
			GridPane grid = new GridPane();
			grid.add(depositeLabel, 0, 0);
			grid.add(depositeField, 1, 0);
			grid.add(add, 1, 1);
			grid.add(finish, 1, 2);
			grid.add(more, 2, 2); 
			grid.add(BalanceDisplay, 1, 3); 
			
			
			add.setOnAction(new EventHandler<ActionEvent>(){
		    	@Override
			public void handle(ActionEvent event) { 
	    			String Add = depositeField.getText();
	    			deposit.Deposite(Add);
	    			newBalance = deposit.getBalance();
	    	    	BalanceDisplay.setText("your current balance="+deposit.getBalance());


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
		    		home.setLogicTransaction(deposit);
	    			stage.setScene(home.getScene());

		    	} 
		});
			scene = new Scene(grid,600,600);
			
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
		this.deposit = object;
	}

	
	 
}
