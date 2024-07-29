package lambda.exercises.ex13;

import java.util.List;
import java.util.Optional;

public class Ex13 {
    public static void main(String[] args) {
        //13. Gestiunea tranzactiilor 2
        //O tranzactie este caracterizata de id, state si amount.
        // (HINT: atribute: id, state si amount)
        //
        //Starea tranzactiei (state) este un enum care poate avea valorile
        // FINISHED, CANCELED, PROCESSING.
        //
        //Un cont (account) este caracterizat de balance (sold) si un
        // account number (numar de cont) si de o lista de tranzactii
        // (HINT: atribute: number, balance, transactions - care este o lista)
        //
        //Avand intr-un main o lista de conturi, care au fiecare lista lor
        // de tranzactii, scrie o metoda care sa returneze suma tranzactiilor
        // cu starea CANCELED din conturile care au soldul mai mare decat 0.
    }

    public Integer getTransactionSum (List<Account> accounts){
        Optional<Integer> sumOptional =  accounts.stream()
                .filter(account -> account.getBalance()>0)
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getState().equals(State.CANCELED))
                .map(transaction -> transaction.getAmount())
                .reduce((sum, transaction)->sum+transaction);
            return sumOptional.orElse(0);
    }
}
