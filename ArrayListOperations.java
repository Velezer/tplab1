import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    // Traversal
    public static void traverse(ArrayList<Integer> list) {
        System.out.print("ArrayList Traversal: [");
        // Looping
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            // Item terakhir tidak perlu koma di belakang
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Insert pada index tertentu
    public static void insert(ArrayList<Integer> list, int value, int index) {
        list.add(index, value);
    }

    // Delete pada index tertentu
    public static void delete(ArrayList<Integer> list, int index) {
        list.remove(index);
    }

    // Linear Search
    public static int linearSearch(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            // Apabila menemukan item yang dicari maka return
            if (list.get(i) == target) {
                return i;
            }
        }
        // -1 untuk hasil tidak ditemukan
        return -1;
    }

    // List harus sudah urut
    public static int binarySearch(ArrayList<Integer> list, int target) {
        // Low diset 0 sebagai ujung yang paling kiri
        int low = 0;
        // High diset nilai tertinggi dari suatu index list sebagai ujung paling kanan
        int high = list.size() - 1;

        // Looping dengan pengecekan bahwa kondisi masih perlu dilakukan pencarian
        while (low <= high) {
            // Membagi dengan dua untuk mencari tengah
            int mid = (low + high) / 2;

            // Mendapat nilai tengah
            int midValue = list.get(mid);

            // Apabila sama maka item ditemukan
            if (midValue == target) {
                return mid;
            // Apabila nilai kurang dari target maka nilai low digeser ke kanan
            } else if (midValue < target) {
                low = mid + 1;
            // Sebaliknya nilai high digeser ke kiri
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }
}
