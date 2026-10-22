package ch26.ex26_3_a;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(250);
        scores.add(180);
        scores.add(250);

        Integer premier = scores.get(0);
        Integer dernier = scores.get(2);
        if (premier == dernier) {
            System.out.println("Égalité !");
        } else {
            System.out.println("Scores différents");
        }
    }
}
