package lambda.exercises.ex11;

public class Transaction {

    private Integer id;
    private Integer amount;
    private Account account;

    public Transaction(Integer id, Integer amount, Account account) {
        this.id = id;
        this.amount = amount;
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", account=" + account +
                '}';
    }
}
