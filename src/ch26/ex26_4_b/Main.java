package ch26.ex26_4_b;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();
        stock.put("baguette", 30);
        stock.put("croissant", 12);

        String[] produits = {"baguette", "brioche", "croissant"};
        for (String produit : produits) {
            int quantite = stock.get(produit);
            System.out.println(produit + " : " + quantite);
        }
    }
}
