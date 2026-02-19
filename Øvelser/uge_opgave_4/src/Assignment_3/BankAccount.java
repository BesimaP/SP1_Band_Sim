package Assignment_3;

import java.util.ArrayList;

    public class BankAccount {
        String owner;
        Double balance;
        ArrayList<Transaction>transactions = new ArrayList<>();

        public BankAccount(String owner, double startBalance){
            this.owner = owner;
            this.balance = startBalance;
            this.transactions = new ArrayList<>();
            //Tilføj start balance som transaction
            transactions.add(new Transaction("deposit", startBalance));
        }

        public void deposit(double amount) {
            if(amount > 0){
                balance = balance + amount;
                transactions.add(new Transaction("deposit", amount));
                System.out.println("Indsatte " + amount + " kr.");
            }
        }

        public void withdraw(double amount) {
            if(amount > 0 && amount <= balance){
                balance = balance - amount;
                transactions.add(new Transaction("withdrawal", amount));
                System.out.println("Hævede " + amount + " kr.");
            } else if (amount > balance) {
                System.out.println("Ikke nok penge på kontoen");
            }
        }

        public void printTransactionHistory(){
            System.out.println("\n~~~Transaktionshistorisk for " + owner + " ~~~");
            for (Transaction t : transactions){
                System.out.println(t);
            }

        }

        public double getBalance(){
            return balance;
        }
    }
