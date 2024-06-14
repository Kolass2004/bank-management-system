import java.util.HashMap;
import java.util.Map;

public class BankManagementSystem {
    private Map<String, BankAccount> accounts;

    public BankManagementSystem() {
        accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName, double initialBalance) {
        if (!accounts.containsKey(accountNumber)) {
            BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
            accounts.put(accountNumber, account);
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account with this number already exists.");
        }
    }

    public void deposit(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(String accountNumber) {
        BankAccount account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}
