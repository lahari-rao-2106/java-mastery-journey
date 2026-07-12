class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance"
            );
        }

        balance = balance - amount;
        System.out.println("Remaining balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        try {
            account.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}