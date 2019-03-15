package yarab;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LogoutForm {
	 Stage stage;
	 Scene scene;
	 WithdrawWindow withdrawChoice;
	 DepositeWindow depositeChoice;
	 
	 public LogoutForm(Stage stage) {
			this.stage = stage;
		}
		
		public void prepareScene() {
			Label logoutMsg1 = new Label("          GOOD BYE         ");
			Label logoutMsg2 = new Label("THANK YOU FOR USING OUR ATM");
			Label logoutMsg3= new Label("          come back soon!     ");

			GridPane grid = new GridPane();
			grid.add(logoutMsg1, 2, 0);
			grid.add(logoutMsg2, 2, 1);
			grid.add(logoutMsg3, 2, 2);
			scene = new Scene(grid,500,500);
			logoutMsg1.setFont(new Font("verdana",25));
			logoutMsg2.setFont(new Font("verdana",23));
			logoutMsg3.setFont(new Font("verdana",20));
		}
	public Scene getScene() {
		return scene;
	} 
	
	public void setWithdrawWindow(WithdrawWindow withdrawChoice) {
		this.withdrawChoice = withdrawChoice;
	}
	public void setDepositeWindow(DepositeWindow depositeChoice) {
		this.depositeChoice = depositeChoice;
	}
	
}
