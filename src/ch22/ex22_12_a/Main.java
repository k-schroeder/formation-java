package ch22.ex22_12_a;

public class Main {

    static int nombreArticles(int[] quantites) {
        int nombre = 0;
        for (int i = 1; i < quantites.length; i++) {
            nombre += quantites[i];
        }
        return nombre;
    }

    static double total(double[] prix, int[] quantites) {
        double total = 0;
        for (int i = 0; i < prix.length; i++) {
            total = prix[i] * quantites[i];
        }
        return total;
    }

    public static void main(String[] args) {
        double[] prix = {2.5, 1.5, 4.0};
        int[] quantites = {2, 3, 1};

        System.out.println("Articles : " + nombreArticles(quantites));
        System.out.println("Total : " + total(prix, quantites) + " €");
    }
}
