class Account {
    int accNo;
    double balance;

    Account(int no, double bal) {
        accNo = no;
        balance = bal;
    }

    void showBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

class Savings extends Account {
    double interestRate;

    Savings(int no, double bal, double rate) {
        super(no, bal);
        interestRate = rate;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void addInterest() {
        balance += (balance * interestRate / 100);
    }
}

class Current extends Account {
    double overdraftLimit;

    Current(int no, double bal, double limit) {
        super(no, bal);
        overdraftLimit = limit;
    }

    boolean withdraw(double amt) {
        if (balance + overdraftLimit >= amt) {
            balance -= amt;
            return true;
        } else {
            return false;
        }
    }
}

class TestAccount {
    public static void main(String[] args) {
        Savings s = new Savings(101, 5000, 5);
        s.deposit(1000);
        s.addInterest();
        s.showBalance();

        Current c = new Current(102, 2000, 3000);
        if (c.withdraw(4000))
            System.out.println("Withdrawal Successful");
        else
            System.out.println("Withdrawal Failed");

        c.showBalance();
    }
}
