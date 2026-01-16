package Pack1;

public class lab2_2 {

	public static void main(String[] args) {
		
		class account{
			String name;
			String accNo;
			int balance;
			final int min_balance=500;
			public void getName() {
				System.out.println(name);
				
			}
			public void setName(String name) {
				Scanner sc = new Scanner(System.in);
				name = sc.nextLine();
			}
			public void getAccNo() {
				System.out.println(accNo);
			}
			public void setAccNo(String accNo) {
				long time = System.currentTimeMillis();
		    	int random = new Random().nextInt(900)+100;
		    	accNo=time+""+random;
//				this.accNo = accNo;
			}
			
			public void deposit(double amount) {
//		        if (amount > 0) {
		            balance += amount;
		        }
//		    }
		   
		    public void withdraw(double amount) {
//		        System.out.println("smaskcac");
		    }
		 
			
			
		}
		 
		class Savingac extends account {
			final int min_balance =500;
			@Override
			public void withdraw(double amount) {
				if (balance - amount >= min_balance) {
					System.out.println("withdraw can be done ");
					balance -= amount;
				}
				else {
					System.out.println("not possible account balance must be mainatained ");
					
				}
				
			}
			
		}
		 
		class current extends
		 
		 
		
	
	}

}
