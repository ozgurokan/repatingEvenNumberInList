import java.util.Arrays;

public class Main {
    // dublicate arrayine tekrar tekrar yazdırmamak için yazılan boolen method
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // liste oluşturulur
        int[] list = {3, 2, 1, 2, 33, 12, 32, 32, 2, 43,22, 22,321, 3, 21, 321};
        //tekrar edenleri tutmak için yeni bir liste oluşturulur
        int duplicate[] = new int[list.length];
        // yeni listenin index numarasını başlatmak için değişken
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                // liste'nin her elemanı yine listenin her elemanı gezilerek karşılaştırılır.
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {

                    if (!isFind(duplicate, list[i])) {

                        duplicate[startIndex++] = list[i];
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}