package ex14_1;

public class Main {

	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "  4649";
		a.balance = 1592;
		
		System.out.println(a);
		
		Account b = new Account();
		b.accountNumber = " 4649";
		
		System.out.println(a.equals(b));
	}

}
