package algortimica;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        //yo, act, flop, tac, foo, cat, oy, olfp
        //[[yo, oy], [act, cat, tac], [flop,olfp], [foo]]
    }


    public List<List<String>> groupAnagrams(List<String> words) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        //pentru fiecare word din words
        for (String word : words) {
            //aflu cuvantul curent sortat alfabetic
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            //daca (mapa contine ca si cheie cuvantul sortat)
            if (anagramsMap.containsKey(sortedString)) {
                //adaug la valoare cheii cuvantul sortat (care o lista) cuvantul curent
                anagramsMap.get(sortedString).add(word);
            } else {
                //bag in mapa ca si cheie cuvantul sortat si ca si valoare o lista cu cuvantu curent
                List<String> value = new ArrayList<>();
                value.add(word);
                anagramsMap.put(sortedString, value);
            }
        }
        //pentru fiecare cheie din setul de chei al mapei
             //iau valoarea de la cheie si o adaug in lista result
        //returnez result
        return null;
    }
}

