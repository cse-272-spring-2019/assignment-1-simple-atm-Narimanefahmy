package yarab;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Home {

	Stage stage; 
	Scene scene;
	LoginForm loginForm;
	WithdrawWindow withdrawChoice;
	DepositeWindow depositeChoice;
	LogicTransaction main ;
	int balance;
	
	public Home(Stage stage) {
		this.stage = stage; 
	}
	
	public void prepareScene() {
		
		withdrawChoice = new WithdrawWindow(stage);
		depositeChoice = new DepositeWindow(stage);
		
		
		Label welcome = new Label ("Welcome to ATM");
		Label BalanceDisplay = new Label ("");
		
		Button Withdraw = new Button ("Withdraw");
		Button Deposit  = new Button ("Deposit");
		Button Balance  = new Button ("Balance");
		Button logout  =  new Button ("logout");
		
		GridPane grid = new GridPane();
		grid.add(welcome, 0, 0);
		grid.add(Deposit, 1, 1);
		grid.add(Withdraw, 1, 2);
		grid.add(Balance, 1, 3);
		grid.add(logout, 2, 4);
		grid.add(BalanceDisplay, 1, 5);
		
		Withdraw.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
		public void handle(ActionEvent event) { 
	    		withdrawChoice.setLogicTransaction(main);
    			stage.setScene(withdrawChoice.getScene());

	    	} 
		   
	}); 
 
	Deposit.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
		public void handle(ActionEvent event) {
	    		depositeChoice.setLogicTransaction(main);
			stage.setScene(depositeChoice.getScene());
		}
	});
 
	Balance.setOnAction(new EventHandler<ActionEvent>(){
	    	@Override
		public void handle(ActionEvent event) {
	    		BalanceDisplay.setText("your current balance="+main.getBalance());
		}
	});  
		 
		 logout.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				stage.setScene(loginForm.getScene());
			}
		});
		
		scene = new Scene(grid,400,400);
		 
	}
	public Scene getScene() {
		 
		return scene;
	}
	public void setLoginForm(LoginForm loginForm) {
		this.loginForm = loginForm;
	}
	public void setWithdrawWindow(WithdrawWindow withdrawChoice) {
		this.withdrawChoice = withdrawChoice;
	}
	public void setDepositeWindow(DepositeWindow depositeChoice) {
		this.depositeChoice = depositeChoice;
	}
	public void setLogicTransaction(LogicTransaction object) {
		this.main = object;
	}
	
}
