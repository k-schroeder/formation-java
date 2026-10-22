package ch22.ex22_9_a;

public class Main {

    static void a() {
        System.out.println("a : début");
        b();
        System.out.println("a : fin");
    }

    static void b() {
        System.out.println("b : début");
        try {
            c();
        } catch (ArithmeticException e) {
            System.out.println("b a rattrapé : " + e.getMessage());
        }
        System.out.println("b : fin");
    }

    static void c() {
        System.out.println("c : début");
        int x = 5 / 0;
        System.out.println("c : fin " + x);
    }

    public static void main(String[] args) {
        a();
        System.out.println("main : fin");
    }
}
