import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("========================= PERBANDINGAN 10 DATA =========================");
        // Generate 10 data
        ArrayList<Integer> shuffled10 = Generator.generateShuffled(10);
        // Membandingkan kinerja Array dan ArrayList
        Comparison.compare(shuffled10);

        System.out.println("---------------------------");


        System.out.println("========================= PERBANDINGAN 1000 DATA =========================");
        // Generate 1000 data
        ArrayList<Integer> shuffled1000 = Generator.generateShuffled(1000);
        // Membandingkan kinerja Array dan ArrayList
        Comparison.compare(shuffled1000);
    }
}
