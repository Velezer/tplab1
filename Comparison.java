import java.util.ArrayList;

public class Comparison {
    public static void compare(ArrayList<Integer> arrayList) {

        // Mengkonversi ArrayList ke int[] array
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = arrayList.get(i);
        }

        // Array Traversal
        long start = System.nanoTime();
        ArrayOperations.traverse(array);
        long end = System.nanoTime();
        long tArrayTraverse = end - start;
        System.out.println("ArrayOperations.traverse waktu eksekusi=" + tArrayTraverse + " ns");

             
        // ArrayList Traversal
        start = System.nanoTime();
        ArrayListOperations.traverse(arrayList);
        end = System.nanoTime();
        long tArrayListTraverse = end - start;
        System.out.println("ArrayListOperations.traverse waktu eksekusi=" + tArrayListTraverse + " ns");


        System.out.println("---------------------------");

        // Arrray Linear Search
        start = System.nanoTime();
        int idx = ArrayOperations.linearSearch(array, 8);
        end = System.nanoTime();
        long tArrayLinearSearch = end - start;
        System.out.println("Array Pencarian 8 (Linear Search) Ditemukan di indeks " + idx);
        System.out.println("ArrayOperations.linearSearch waktu eksekusi " + tArrayLinearSearch + " ns");

        // ArrayList Linear Search
        start = System.nanoTime();
        int index = ArrayListOperations.linearSearch(arrayList, 8);
        end = System.nanoTime();
        long tArrayListLinearSearch = end - start;
        System.out.println("ArrayList Pencarian 8 dalam ArrayList Ditemukan di indeks " + index);
        System.out.println("ArrayListOperations.linearSearch waktu eksekusi " + tArrayListLinearSearch + " ns");
        

        System.out.println("---------------------------");

        // Array Sorting 
        start = System.nanoTime();
        ArrayOperations.sort(array);
        end = System.nanoTime();
        long tArraySort = end - start;
        System.out.println("ArrayOperations.sort waktu eksekusi=" + tArraySort + " ns");
        System.out.println("Traverse setelah sort");
        ArrayOperations.traverse(array);
        
        
        // ArrayList Sorting
        start = System.nanoTime();
        ArrayListOperations.sort(arrayList);
        end = System.nanoTime();
        long tArrayListSort = end - start;
        System.out.println("ArrayListOperations.sort waktu eksekusi=" + tArrayListSort + " ns");
        System.out.println("Traverse setelah sort");
        ArrayListOperations.traverse(arrayList);


        System.out.println("---------------------------");


        // Array Binary Search
        start = System.nanoTime();
        int idxBinary = ArrayOperations.binarySearch(array, 8);
        end = System.nanoTime();
        long tArrayBinarySearch = end - start;
        System.out.println("Array Pencarian 8 (Binary Search)= Ditemukan di indeks " + idxBinary);
        System.out.println("ArrayOperations.binarySearch waktu eksekusi=" + tArrayBinarySearch + " ns");

        // ArrayList Binary Search
        start = System.nanoTime();
        idxBinary = ArrayListOperations.binarySearch(arrayList, 8);
        end = System.nanoTime();
        long tArrayListBinarySearch = end - start;
        System.out.println("ArrayList Pencarian 8 (Binary Search)= Ditemukan di indeks " + idxBinary);
        System.out.println("ArrayOperations.binarySearch waktu eksekusi=" + tArrayListBinarySearch + " ns");
        

        System.out.println("---------------------------");

        // Array Insert
        start = System.nanoTime();
        int[] inserted = ArrayOperations.insert(array, 1000, 5);
        end = System.nanoTime();
        long tArrayInsert = end - start;
        System.out.println("ArrayOperations.insert waktu eksekusi=" + tArrayInsert + " ns");
        System.out.println("Traverse setelah insert");
        ArrayOperations.traverse(inserted);
        
        System.out.println("---------------------------");

        
        // ArrayList Insert
        start = System.nanoTime();
        ArrayListOperations.insert(arrayList, 1000, 5);
        end = System.nanoTime();
        long tArrayListInsert = end - start;
        System.out.println("ArrayListOperations.insert waktu eksekusi=" + tArrayListInsert + " ns");
        System.out.println("Traverser setealah insert");
        ArrayListOperations.traverse(arrayList);


        System.out.println("---------------------------");


        // Array Delete
        start = System.nanoTime();
        int[] deleted = ArrayOperations.delete(inserted, 9);
        end = System.nanoTime();
        long tArrayDelete = end - start;
        System.out.println("ArrayOperations.delete waktu eksekusi=" + tArrayDelete + " ns");
        System.out.println("Traverse setelah delete");
        ArrayOperations.traverse(deleted);

        System.out.println("---------------------------");

        
        // ArrayList Delete
        start = System.nanoTime();
        ArrayListOperations.delete(arrayList, 9);
        end = System.nanoTime();
        long tArrayListDelete = end - start;
        System.out.println("ArrayListOperations.delete waktu eksekusi=" + tArrayListDelete + " ns");
        System.out.println("Traverse setelah delete");
        ArrayListOperations.traverse(arrayList);
      

        System.out.println("---------------------------");

        System.out.println("\n========================= TABEL PERBANDINGAN =========================");
        System.out.printf("| %-25s | %-15s | %-20s |\n", "Operasi", "Struktur Data", "Waktu Eksekusi (ns)");
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Traverse", "Array", tArrayTraverse);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Traverse", "ArrayList", tArrayListTraverse);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Linear Search", "Array", tArrayLinearSearch);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Linear Search", "ArrayList", tArrayListBinarySearch);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Sort", "Array", tArraySort);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Sort", "ArrayList", tArrayListSort);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Binary Search", "Array", tArrayBinarySearch);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Binary Search", "ArrayList", tArrayListBinarySearch);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Insert", "Array", tArrayInsert);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Insert", "ArrayList", tArrayListInsert);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Delete", "Array", tArrayDelete);
        System.out.printf("| %-25s | %-15s | %-20d |\n", "Delete", "ArrayList", tArrayListDelete);
        System.out.println("======================================================================");

    }
}
