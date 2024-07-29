package lambda.exercises.ex13;

import lambda.exercises.ex11.Account;

public class Transaction {

    private Integer id;
    private State state;
    private Integer amount;

    public Transaction(Integer id, State state, Integer amount) {
        this.id = id;
        this.state = state;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
