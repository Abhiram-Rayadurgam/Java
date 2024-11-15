class Account {
    String customerName;
    int accNumber;
    String accountType;
    double balance;

    Account(String customerName, int accNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accNumber = accNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void display() {
        System.out.println("Current balance: " + balance);
    }
}

class SavingAcc extends Account {
    final double interestRate = 0.04;

    SavingAcc(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

class CurrentAcc extends Account {
    final double minBalance = 500.0;
    final double serviceCharge = 50.0;

    CurrentAcc(String customerName, int accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Service charge: " + serviceCharge);
        }
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            checkMinimumBalance();
            System.out.println("Amount withdrawn: " + amount);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingAcc savingsAccount = new SavingAcc("Charan", 1000, 1000);
        CurrentAcc currentAccount = new CurrentAcc("Shivani", 1001, 500);

        System.out.println("Savings Account:");
        savingsAccount.deposit(500);
        savingsAccount.computeInterest();
        savingsAccount.withdraw(200);
        savingsAccount.display();

        System.out.println("\nCurrent Account:");
        currentAccount.deposit(300);
        currentAccount.withdraw(700);
        currentAccount.display();
    }
}
