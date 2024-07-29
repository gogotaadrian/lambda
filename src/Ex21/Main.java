package Ex21;

import java.util.ArrayList;
import java.util.List;

public class Main {
// 21. Budget Manager
//Aplicatia le va permite utilizatorilor sa isi gestioneze bugetul.
//O cheltuiala (purchase) este caracterizata de nume, pret si categorie
//Categoriile pot fi: mancare, distractie, haine, utilitati, altele.
//Un utilizator va avea o lista de cheltuieli si un buget maxim.
//Ca si utilizator in aplicatie, vei avea acces la mai multe functionalitati:
//Vizualizarea tututor cheltuielilor
//Vizualizarea cheltuielilor dintr-o anumita categorie
//Vizualizarea cheltuielilor grupate pe categorii
//Vizualizarea categoriei in care a cheltuil cel mai mult/mai putin
//Vizualizarea tuturor cheltuielilor dintr-un interval de pret
//Sortarea tuturor cheltuielilor dupa pret
//Sortarea cheltuielilor dintr-o anumita categorie dupa pret
//Salvarea tuturor cheltuielilor intr-un fisier
//Incarcarea in aplicatie a tuturor cheltuielilor dintr-un fisier
//Setarea unui buget
//Vizualizarea bugetului disponibil
//Adaugarea unei cheltuieli
//Stergerea unei cheltuieli

    public static void main(String[] args) {

        List<Purchase> purchases = new ArrayList<>();
        purchases.add(new Purchase("lapte", 20, Category.Food));
        purchases.add(new Purchase("tricou", 30, Category.Clothes));
        purchases.add(new Purchase("bluza", 30, Category.Clothes));
        purchases.add(new Purchase("miere", 10, Category.Food));
        User user1 = new User(purchases,5000);






    }


}
