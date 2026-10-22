package ch22.ex22_5_a;

public class Main {

    static void diviser(int a, int b) {
        System.out.println("Début de " + a + " / " + b);
        try {
            System.out.println("Résultat : " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro");
        } finally {
            System.out.println("Fin de l'opération");
        }
        System.out.println("Après le bloc");
    }

    public static void main(String[] args) {
        diviser(10, 2);
        diviser(10, 0);
    }
}
