package ch14.ex14_3_c;

public class Main {
    public static void main(String[] args) {
        Chaton a = new Chaton("Mina", 1);
        Chaton b = a;
        Chaton c = new Chaton("Mina", 1);

        b.age = 5;

        System.out.println(a.age);
        System.out.println(b.age);
        System.out.println(c.age);
    }
}
