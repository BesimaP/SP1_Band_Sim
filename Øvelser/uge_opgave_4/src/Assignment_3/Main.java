package Assignment_3;

public class Main {

    public static void main (String [] args){
        BankAccount account = new BankAccount("Louise", 1000);

        account.deposit(5500);
        account.withdraw(1000);
        account.withdraw(100);
        account.withdraw(1200);

        account.printTransactionHistory();
        System.out.println("\nNuværende saldo: " + account.getBalance() + " kr.");
    }
}
