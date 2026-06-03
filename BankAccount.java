package mukunda;

public class BankAccount {
int balance;
void deposit()
{
	int depositAmount=2000;
	int updatedBalance=depositAmount+balance;
	System.out.println("Current Balance: "+balance);
	System.out.println("Deposit Amount: "+depositAmount);
	System.out.println("Updated Balance: "+updatedBalance);
}
	public static void main(String[] args) {
		
BankAccount b1 =new BankAccount();
b1.balance=10000;
b1.deposit();
	}

}
