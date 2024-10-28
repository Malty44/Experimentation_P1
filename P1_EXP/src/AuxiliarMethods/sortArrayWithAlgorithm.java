package AuxiliarMethods;

import SortingAlgorithms.Sorter;

public class sortArrayWithAlgorithm {

    public <T extends Comparable<T>> sortArrayWithAlgorithm(T[] array, Sorter<T> sorter) {
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
