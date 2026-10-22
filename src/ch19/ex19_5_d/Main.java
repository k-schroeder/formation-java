package ch19.ex19_5_d;

public class Main {
    public static void main(String[] args) {
        Animal a = new Chien();
        Animal b = new Chiot();
        Chien c = new Chiot();

        a.parler();
        b.parler();
        c.parler();

        // a.garder();      // ne compile pas : pourquoi ?
    }
}
