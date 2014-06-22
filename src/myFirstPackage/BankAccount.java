package myFirstPackage;

public class BankAccount {
	public String firstName;
	public String lastName;
	public int accountNumber;
	public double balance;
	
	public BankAccount(){
		
	}
	
	public BankAccount(String firstName, String lastname, int accountNumber){
		setName(firstName, lastname);
		setAccountNumber(accountNumber);
		setBalance(0);
	}
	
	public BankAccount(String firstName, String lastname, int accountNumber,double balance){
		setName(firstName, lastname);
		setAccountNumber(accountNumber);
		setBalance(balance);
	}
	

	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void setBalance (double balance) {
		this.balance = balance; 
	}
	
	//deposit
	
	//withdraw
	
	//transfer
	
	
}

