package Program;
class BankAccount {
	String accountNumber;
	String holderName;
	double balance;
	
	BankAccount(String accNo,String name,double bal){
		accountNumber=accNo;
		holderName=name;
		balance=bal;
	}
	
	void deposit(double amount) {
		balance=balance+amount;
	}
	
	void withdraw(double amount) {
		balance=balance-amount;
	}
	
	void dispalyBalance() {
		System.out.println(holderName+":"+balance);
	}

	
	public static void main(String[] args) {
	

		BankAccount acc1=new BankAccount("101","rahul",5000);
		BankAccount acc2=new BankAccount("102","rabi",9000);
		BankAccount acc3=new BankAccount("103","ravi",12000);
		
		
		acc1.deposit(2000);
		acc2.withdraw(1000);
		acc3.deposit(3000);
		
		acc1.dispalyBalance();
		acc2.dispalyBalance();
		acc3.dispalyBalance();
	}
}



	


