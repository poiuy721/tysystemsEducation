package ch11;

public class AccountExample {
	public static void main(String[] args) {
		Account a=new Account();
		a.deposit(10000);
		System.out.println("예금액: "+a.getBalance());
		
		try {
			a.withdraw(30000);
		}catch(InsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
		}
	}
}
