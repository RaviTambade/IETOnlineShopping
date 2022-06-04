package hello;
//changes done
public class Account{
	
	public void deposit(float amount){
	
	this.balance += amount;
	
	}
	public void withdraw(float amount){
	
	this.balance -= amount;
	
	}
	
    private float balance;
    public Account(){
        this.balance=5000;
    }
    public Account(float initialBalance){
        this.balance=initialBalance;
        
    }
}
