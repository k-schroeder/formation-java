package ch20.ex20_2_c;

public abstract class Boisson {
    protected String nom;

    public Boisson(String nom) {
        this.nom = nom;
    }

    public abstract double prix();
}
