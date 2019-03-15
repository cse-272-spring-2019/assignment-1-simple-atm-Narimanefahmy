package yarab;


public class LogicTransaction {

	
	
    int balance ;
	int newbalance;
	String amount;
	DepositeWindow deposite;
	WithdrawWindow withdraw;
	Home home;
	
	
	public LogicTransaction() {
		
	}
public void Withdraw(String amount) {
	  
	
    this.amount = amount;
  //casting amount to integer
	newbalance = balance - Integer.parseInt(amount);
	balance = newbalance;
	this.newbalance = balance;
}

public void Deposite(String amount) {
    this.amount = amount;
    //casting amount to integer
	newbalance = balance + Integer.parseInt(amount);
	balance = newbalance;
	this.newbalance = balance; 

} 
public int getBalance() {
	return balance; 
}
public int getNewBalance() {
	return newbalance;
}

public  void setNewBalance(int newbalance) {
	this.newbalance = newbalance;
}

public  void setBalance(int balance) {
	this.balance = balance;
}
 
}


