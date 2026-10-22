package ch26.ex26_4_a;

public class Main {
    static double moyenne(int[] notes) {
        int total = 0;
        for (int note : notes) {
            total += note;
        }
        return total / notes.length;
    }

    public static void main(String[] args) {
        int[] notes = {12, 15, 16};
        System.out.println("Moyenne : " + moyenne(notes));
    }
}
