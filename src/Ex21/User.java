package Ex21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {

    private List<Purchase> purchases;
    private int maxBudget;

    public User(List<Purchase> purchases, int maxBudget) {
        this.purchases = purchases;
        this.maxBudget = maxBudget;
    }

    public List<Purchase> getPurchases() {
        return purchases;
    }

    public int getMaxBudget() {
        return maxBudget;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public void setMaxBudget(int maxBudget) {
        this.maxBudget = maxBudget;
    }

    public List<Purchase> getAllPurchasesByCategory(Category category) {
        return purchases;
    }

    public Map<Category, List<Purchase>> groupPurchasesByCategory() {
        Map<Category, List<Purchase>> purchasesByCategory = new HashMap<>();
        for (Purchase purchase : purchases) {
// Daca categoria lui purchase nu se afla in mapa ca si cheie
// punem in mapa cheia categoria lui purchase si valoarea o lista cu purchase curenta
// altfel adauga in lista ( care e valoarea la cheia categoria lui purchase) pe purchase-ul curent
            if (!purchasesByCategory.containsKey(purchase.getCategory())) {
                List<Purchase> value = new ArrayList<>();
                value.add(purchase);
                purchasesByCategory.put(purchase.getCategory(), value);
            } else {
                purchasesByCategory.get(purchase.getCategory()).add(purchase);
            }
        }
        return purchasesByCategory;
    }

    //vizualizarea categoriei in care s-a cheltuit cel mai mult
    public Category getTheCategoryWithTheHighestPurchase() {
        /*double maxSpending = 0;
        Category maxCategory = null;
        for (Purchase purchase : purchases) {
//            if (purchase.getPrice() > maxSpending) {
//                maxSpending = purchase.getPrice();
                maxCategory = purchase.getCategory();
            }
        }
        return maxCategory;*/
        Map<Category,Double> categoriesByPrice = groupCategoriesByTotalPrice();
        return getAcoloUndeMiamDatTotiBanii(categoriesByPrice);
    }

    public Category getAcoloUndeMiamDatTotiBanii (Map<Category, Double> categoriesByPrice ){
        double maxValue = 0;
        Category acoloUndeMiamDatTotiBanii = null;
        for (Category  category: categoriesByPrice.keySet()){
            //daca valoarea de la cheia curenta este mai mare decat maxValue
            if(categoriesByPrice.get(category) > maxValue){
                maxValue = categoriesByPrice.get(category);
                acoloUndeMiamDatTotiBanii = category;
            }
        }
        return acoloUndeMiamDatTotiBanii;
    }


    public Map<Category, Double> groupCategoriesByTotalPrice(){
        Map<Category, Double> categoriesByPrice = new HashMap<>();
        for (Purchase purchase: purchases){
            if(!categoriesByPrice.containsKey(purchase.getCategory()) ){
                categoriesByPrice.put(purchase.getCategory(), purchase.getPrice());
            } else{
                categoriesByPrice.put(purchase.getCategory(), categoriesByPrice.get(purchase.getCategory()) + purchase.getPrice());
            }
        }
        return categoriesByPrice;
    }
}
