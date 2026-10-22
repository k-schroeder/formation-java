package ch19.ex19_5_d;

public class Chien extends Animal {
    @Override
    public void parler() {
        System.out.println("Wouf");
    }

    public void garder() {
        System.out.println("Je garde la maison.");
    }
}
