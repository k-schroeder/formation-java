package ch26.ex26_2_a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Doit renvoyer une COPIE de la liste, avec "café" en plus
    static List<String> avecCafe(List<String> commande) {
        List<String> copie = commande;
        copie.add("café");
        return copie;
    }

    public static void main(String[] args) {
        List<String> commande = new ArrayList<>();
        commande.add("croissant");

        List<String> grande = avecCafe(commande);
        System.out.println("Commande : " + commande);
        System.out.println("Grande commande : " + grande);
    }
}
