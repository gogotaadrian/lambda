package lambda.streamsempty.helperclasses;

public class Account {
    private Integer balance;
    private String number;
    private Status status;

    public Account(Integer balance, String number, Status status) {
        this.balance = balance;
        this.number = number;
        this.status = status;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                ", status=" + status +
                '}';
    }

    // constructors
    // getters and setters
}
