package ch23.ex23_5_b;

public class Main {
    public static void main(String[] args) {
        Coordonnees lyon = new Coordonnees(45.76, 4.84);
        System.out.println(lyon.getLatitude());
        System.out.println(lyon.equals(new Coordonnees(45.76, 4.84)));
    }
}
