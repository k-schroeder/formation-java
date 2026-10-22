package ch22.ex22_13_a;

public class Main {

    static double sousTotal(double[] prix) {
        double total = 0;
        for (double p : prix) {
            total += p;
        }
        return total;
    }

    static double fraisDePort(double sousTotal) {
        if (sousTotal > 50) {
            return 0;
        }
        return 4.9;
    }

    public static void main(String[] args) {
        double[] prix = {20.0, 15.5, 14.5};
        double st = sousTotal(prix);
        double port = fraisDePort(st);
        System.out.println("Sous-total : " + st + " €");
        System.out.println("Port : " + port + " €");
        System.out.println("À payer : " + (st + port) + " €");
    }
}
