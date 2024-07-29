package lambda.exercises.ex11;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex11 {

    public static void main(String[] args) {
        //11. Gestiunea tranzactiilor
        //O tranzactie este caracterizata de id, amount si de contul din care s-a facut
        // tranzactia
        //
        //(HINT: atribute: id, sum, account - care este de tip Account)
        //
        //Un cont este caracterizat de balance (sold) si un account number (numar de cont) (HINT - aceasta va fi clasa Account).
        //
        //Avand o lista de tranzactii intr-un main, scrie o metoda care primeste aceasta lista de tranzactii si genereaza o mapa in care cheia sa fie numarul de cont, iar valoarea sa fie suma amount-urilor tututor tranzactiilor care au avut loc din acel cont.
    }

    public static Map<String, Integer> groupAccountsByTotalTransactions (List<Transaction> transactions){
        return transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.getAccount().getAccountNumber(), Collectors.summingInt(transaction -> transaction.getAmount())));
    }

    public static Integer getTotalTransactionsByAccount (List<Transaction> transactions, String accountNumber){
        return null;
    }
}
