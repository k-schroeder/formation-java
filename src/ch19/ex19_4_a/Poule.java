package ch19.ex19_4_a;

public class Poule extends Animal {

    public Poule(String nom, int age) {
        super(nom, age);
    }

    @Override
    public void crie() {
        System.out.println(nom + " fait : Cot-cot !");
    }
}
