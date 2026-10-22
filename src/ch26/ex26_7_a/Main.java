package ch26.ex26_7_a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static void ajouterBonus(List<Integer> notes) {
        notes.add(20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Piège 1 : comparer du texte
        System.out.print("Rôle : ");
        String role = scanner.nextLine();
        if (role == "admin") {
            System.out.println("Accès autorisé");
        } else {
            System.out.println("Accès refusé");
        }

        // Piège 2 : division entière
        int total = 45;
        int nb = 2;
        double moyenne = total / nb;
        System.out.println("Moyenne : " + moyenne);

        // Piège 3 : l'objet partagé
        List<Integer> notes = new ArrayList<>();
        notes.add(12);
        notes.add(15);
        ajouterBonus(notes);
        System.out.println("Notes : " + notes);

        // Piège 4 : null
        String ville = null;
        System.out.println("Ville : " + ville.toUpperCase());
    }
}
