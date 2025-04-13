public class ArrayOperations {

    // Traversal (manual print)
    public static void traverse(int[] array) {
        System.out.print("Array Traversal: [");
        // Looping sampai index terakhir
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            // Mengecek apakah sudah sampai index terakhir
            if (i != array.length - 1) {
                // Item pada index terakhir tidak perlu koma untuk ditampilkan
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Linear Search
    public static int linearSearch(int[] array, int target) {
        // Looping sampai index terakhir
        for (int i = 0; i < array.length; i++) {
            // Apabila menemukan item yang dicari maka return
            if (array[i] == target) {
                return i;
            }
        }
        // -1 untuk hasil tidak ditemukan
        return -1;
    }

    // Pastikan data urut sebelum menggunakan function ini
    public static int binarySearch(int[] array, int target) {
        // Low diset 0 sebagai ujung yang paling kiri
        int low = 0;
        // High diset nilai tertinggi dari suatu index list sebagai ujung paling kanan
        int high = array.length - 1;

        // Looping dengan pengecekan bahwa kondisi masih perlu dilakukan pencarian
        while (low <= high) {
            // Membagi dengan dua untuk mencari tengah
            int mid = (low + high) / 2;
            // Mendapat nilai tengah
            if (array[mid] == target) {
                return mid;
            // Apabila nilai kurang dari target maka nilai low digeser ke kanan
            } else if (array[mid] < target) {
                low = mid + 1;
            // Sebaliknya nilai high digeser ke kiri
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int[] insert(int[] array, int value, int index) {
        int[] newArray = new int[array.length + 1];
        // Salin elemen sebelum indeks
        System.arraycopy(array, 0, newArray, 0, index);
        // Sisipkan elemen baru
        newArray[index] = value;
        // Salin elemen setelah indeks
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static int[] delete(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        // Salin elemen sebelum indeks
        System.arraycopy(array, 0, newArray, 0, index);
        // Salin elemen setelah indeks
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }

    // Manual Sort (bubble sort)
    public static void sort(int[] array) {
        // Membuat variabel penampung panjang array
        int n = array.length;
        // State untuk kondisi penukaran
        boolean swapped;
        // Looping sampai index terakhir
        for (int i = 0; i < n - 1; i++) {
            // Reset nilai penukaran menjadi false
            swapped = false;
            // Looping sampai index terakhir - 1
            for (int j = 0; j < n - 1 - i; j++) {
                // Apabila tidak urut maka lakukan penukaran item
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    // Item telah ditukar
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

}
