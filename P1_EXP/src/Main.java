import SortingAlgorithms.*;
import AuxiliarMethods.*;

public class Main {
    public static void main(String[] args) {
        fillArray filler = new fillArray();
        Integer[] int_array_small = new Integer[10];
        Integer[] int_array_medium = new Integer[100];
        Integer[] int_array_big = new Integer[1000];
        Integer[] int_array_huge = new Integer[10000];
        Integer[] int_array_mid = new Integer[5000];
        filler.fill(int_array_small);
        filler.fill(int_array_medium);
        filler.fill(int_array_big);
        filler.fill(int_array_huge);
        filler.fill(int_array_mid);
        sortArrayWithAlgorithm(int_array_small, new QuickSortGPT<>());
        sortArrayWithAlgorithm(int_array_medium, new QuickSortGPT<>());
        sortArrayWithAlgorithm(int_array_big, new QuickSortGPT<>());
        sortArrayWithAlgorithm(int_array_huge, new QuickSortGPT<>());
        sortArrayWithAlgorithm(int_array_mid, new QuickSortGPT<>());



        /*
        filler.printArray(int_array_small);
        filler.printArray(int_array_medium);
        filler.printArray(int_array_big);
        filler.printArray(int_array_huge);
        filler.printArray(int_array_mid);
        */
    }




    public static <T extends Comparable<T>> void sortArrayWithAlgorithm(T[] array, Sorter<T> sorter) {
        // Call the sort method on the sorter instance
        long start = System.nanoTime();
        sorter.sort(array);
        long finish = System.nanoTime() - start;
        System.out.println(finish);

        // Print the sorted array
//        System.out.print("Sorted array: ");
//        for (T element : array) {
//            System.out.print(element + " ");
//        }
//        System.out.println();  // For new line
    }
}