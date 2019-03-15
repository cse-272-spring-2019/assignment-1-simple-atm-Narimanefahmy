package yarab;

import javafx.application.Application;
import javafx.stage.Stage;

public class ATMapp extends Application {
  
	public static void main(String[] args) {  
		launch(args);
		
	}
	
	 
	@Override
	public void start(Stage primaryStage) throws Exception {
      
		primaryStage.setTitle("hellow there!");
		int balance = 0;
		LoginForm loginForm = new LoginForm(primaryStage);
	 	Home home = new Home(primaryStage);
		WithdrawWindow withdrawChoice = new WithdrawWindow(primaryStage);
		DepositeWindow depositeChoice = new DepositeWindow(primaryStage);
		LogoutForm logout = new LogoutForm (primaryStage);
		  
		
		loginForm.prepareScene(); 
		home.prepareScene();
		withdrawChoice.prepareScene();
		depositeChoice.prepareScene(); 
		logout.prepareScene();
		
		loginForm.setHome(home); 
		home.setLoginForm(loginForm);
		home.setWithdrawWindow(withdrawChoice);
		withdrawChoice.setHome(home);  
		home.setDepositeWindow(depositeChoice); 
		depositeChoice.setHome(home);  
		withdrawChoice.setLogoutForm(logout);
		logout.setWithdrawWindow(withdrawChoice);
		depositeChoice.setLogoutForm(logout);
		logout.setDepositeWindow(depositeChoice);
		
		primaryStage.setScene(loginForm.getScene());
		
		primaryStage.show();
	}

} 
