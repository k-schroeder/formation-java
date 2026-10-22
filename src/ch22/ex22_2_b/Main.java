package ch22.ex22_2_b;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static int prixDuProduit(Map<String, Integer> catalogue, String produit) {
        return catalogue.get(produit);
    }

    public static void main(String[] args) {
        Map<String, Integer> catalogue = new HashMap<>();
        catalogue.put("Baguette", 1);
        catalogue.put("Croissant", 2);

        System.out.println(prixDuProduit(catalogue, "Baguette"));
        System.out.println(prixDuProduit(catalogue, "Éclair"));
    }
}
