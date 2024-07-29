package lambda.exercises.ex13;

import java.util.List;

public class Account {

    private Integer balance;
    private String accountNumber;
    private List<Transaction> transactions;

    public Account(Integer balance, String accountNumber, List<Transaction> transactions) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.transactions = transactions;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
