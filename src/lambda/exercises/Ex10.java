package lambda.exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {
    public static void main(String[] args) {
        //10. Spell checker 2
        //Avand intr-un main un String, in care se stocheaza un text si o lista de cuvinte gresite,
        // scrie o functie care accepta acesti 2 parametrii si returneaza lista cu cuvintele gresite
        // care se regasesc in text Exemplu:
        //
        //Input: String text = “acesta etse nu text”
        //      List<String> badWords = [“etse”, “nu”, “acetsa”, “extt”]
        //Output: [“etse”, “nu”], pentru ca acestea sunt cuvintele din badWords care se regasesc in text


    }

    public static List<String> findBadWords(String text, List<String> badWords){
        return badWords.stream()
                .filter(badWord -> text.contains(badWord))
                .collect(Collectors.toList());
    }
}
