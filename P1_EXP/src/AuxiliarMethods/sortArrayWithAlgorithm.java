package AuxiliarMethods;

import SortingAlgorithms.Sorter;

public class sortArrayWithAlgorithm {

    public <T extends Comparable<T>> sortArrayWithAlgorithm(T[] array, Sorter<T> sorter) {
        // Call the sort method on the sorter instance
        T[] arrayCopy = array.clone();
//        for (T element : arrayCopy) {
//           System.out.print(element + " ");
//        }
        long start = System.nanoTime();
        sorter.sort(arrayCopy);
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
