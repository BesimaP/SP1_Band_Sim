public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }
}

    void withdraw(BankAccount account, int amount){
        if(account.balance >= amount){
            account.balance = account.balance - amount;
            System.out.println("Withdrawn");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    void main (){
        BankAccount account = new BankAccount("Besima", 1000);
        withdraw(account, 500);
        System.out.println(account.balance);
        withdraw(account, 800);
        System.out.println(account.balance);
    }

