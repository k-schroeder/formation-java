package ch19.ex19_4_a;

public class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void manger() {
        System.out.println(nom + " mange.");
    }

    public void crier() {
        System.out.println(nom + " fait du bruit.");
    }
}
