package algortimica;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "ab";
        String stones = "aabcdba";
        System.out.println(countJewels(jewels, stones));
    }

    private static Set<Character> convertStringToSet(String jewels) {
        Set<Character> characterSet = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            characterSet.add(c);
        }
        return characterSet;
    }

    public static int countJewels(String jewels, String stones) {
        //trasnfrom de la string-ul jewels la un set cu toate caracterele din jewels
        //TODO
        //count initial este 0
        //pentru fiecare caracter din stones
        //daca setul contine caracterul curent
        //count++
        int count = 0;
        Set<Character> characterSet = convertStringToSet(jewels);
        for (int i = 0; i < stones.length(); i++) {
            if (characterSet.contains(stones.charAt(i))) {
                count++;
            }
        }
        //returnez count;
        return count;
    }
}

