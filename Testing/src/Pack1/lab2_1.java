package Pack1;
import java.util.*;

class person{
	String name;
	float age;
	
	person(float age){
		
		this.age=age;
	}
	person(String name){
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
		
}
 class account extends person {
	
	
	long accnumber;
	double balance;
	
	double minimun = 500;
	 

	


	public account( String name, long accnumber, double balance) {
		super(name);
		this.accnumber = accnumber;
		this.balance = balance;
	}


	public long getAccnumber() {
		return accnumber;
	}


	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


//	public person getAccholder() {
//		return accholder;
//	}
//
//
//	public void setAccholder(person accholder) {
//		this.accholder = accholder;
//	}


	public double getMinimun() {
		return minimun;
	}


	public void setMinimun(double minimun) {
		this.minimun = minimun;
	}


	public void depoist(int deposit_amount) {
		balance = balance+deposit_amount;
					
	}
	public void withdraw(int withdraw_amount) {
		if (balance>=500 & balance>withdraw_amount ) {
		balance=balance-withdraw_amount;
	}
		else {
			System.out.println("Insuficient balance");
		}
	}
	

	public void getbalance() {
		System.out.println("Current balance is " + balance);
	}
	
	
	
}

 class savings extends account{
	 public savings(String name, long accnumber, double balance) {
		super(name, accnumber, balance);
		this.name=name;
		this.accnumber=accnumber;
		this.balance=balance;
		// TODO Auto-generated constructor stub
	}

	 final double minimum = 500;
	 @Override
	 public void withdraw(int withdraw_amount) {
		if(balance>=minimum & balance>withdraw_amount) {
			balance=balance-withdraw_amount;
		}
		else {
			System.out.println("Aukaaaaat");
		}
	 }
 }

public class lab2_1 {
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("1-Deposit 2-Withdraw 3-Getbalance");
    int function = sc.nextInt();
    
    account a1= new account ("Smith",000000111,2000);
    

		 switch(function) {
			 case 1:{
				 System.out.println("enter amount to deposit");
				 int depositamount= sc.nextInt();
				 	a1.depoist(depositamount);
			System.out.println("updated balance is " + a1.getBalance());
			
			 }
			 break;
			 case 2:{
				 System.out.println("enter amount to withdraw");
				 int withdrawamount= sc.nextInt();
					a1.withdraw(withdrawamount);
					System.out.println("updated balance is " + a1.getBalance());
					
					 }
			 break; 
			 
			 case 3:{
				 a1.getbalance();
			 }
			 
		 }
		
		
		
		

		
	}

	
	

	
}


