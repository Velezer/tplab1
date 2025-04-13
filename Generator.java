import java.util.ArrayList;
import java.util.Collections;

public class Generator {
    public static ArrayList<Integer> generateShuffled(int max){
        
        // Inisialisasi ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Looping sampai max
        for (int i = 0; i < max; i++) {
            // Menambahkan item
            arrayList.add(i);
        }

        // Mengacak ArrayList
        Collections.shuffle(arrayList);
        return arrayList;
    }
    
}
