package algortimica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReversedPairs {


    public static void main(String[] args) {
        //[diaper, abc, test, cba, repaid]
        //[[diaper, repaid], [abc, cba]]
    }

    public List<List<String>> getReversedPairs (List<String> words){
        List<List<String>> reversedPairs = new ArrayList<>();
        //construiesc un set cu toate cuvintele din words
        Set<String> wordsSet = new HashSet<>(words);
        //pentru fiecare cuvant din lista de cuvinte
        for(String word: words) {
            //aflu inversul cuvantului curent
            String reversedWord = new StringBuilder(word).reverse().toString();
            //daca setul contine inversul
            if (wordsSet.contains(reversedWord)) {
                //bag in output o noua pereche cu cuvantul curent si inersul lui
                List<String> pair = new ArrayList<>();
                pair.add(word);
                pair.add(reversedWord);
                reversedPairs.add(pair);
                //sterg din set cuvantul curent
                wordsSet.remove(word);
                //sterg din set inersul lui
                wordsSet.remove(reversedWord);
            }
        }
        return reversedPairs;
        //returnez outputu
    }
}
