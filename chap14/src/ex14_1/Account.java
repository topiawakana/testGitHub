package ex14_1;

public class Account {
	String accountNumber;
	int balance;
	//①
	public String toString() {
		return "\\" + this.balance 
				+ "(口座番号:" + this.accountNumber + ")";
	}
	//②
	public boolean equals(Object o) {
		if (this == o) {return true;}
		if (o instanceof Account ac) {
			String a1 = this.accountNumber.trim();
			String a2 = ac.accountNumber.trim();
//			if (a1.equals(a2)) {
//				return true;
//			}
			return a1.equals(a2);
//			if(this.accountNumber.trim().equals(ac.accountNumber.trim()))
		}
		return false;
	}
}
