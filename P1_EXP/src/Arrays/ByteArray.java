package Arrays;

import AuxiliarMethods.*;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class ByteArray {
    public static void run() {
        fillArray filler = new fillArray();

        Byte[] small_byte_array = new Byte[10];
        Byte[] medium_byte_array = new Byte[100];
        Byte[] big_byte_array = new Byte[1000];
        Byte[] huge_byte_array = new Byte[10000];
        Byte[] mid_byte_array = new Byte[5000];

        filler.fill(small_byte_array);
        filler.fill(medium_byte_array);
        filler.fill(big_byte_array);
        filler.fill(huge_byte_array);
        filler.fill(mid_byte_array);

        //System.out.println("B_Quicksort: ");
        new sortArrayWithAlgorithm(small_byte_array, new QuickSortGPT<>(), "QuickSort", "Small");
        new sortArrayWithAlgorithm(medium_byte_array, new QuickSortGPT<>(), "QuickSort", "Medium");
        new sortArrayWithAlgorithm(big_byte_array, new QuickSortGPT<>(), "QuickSort", "Big");
        new sortArrayWithAlgorithm(huge_byte_array, new QuickSortGPT<>(), "QuickSort", "Huge");
        new sortArrayWithAlgorithm(mid_byte_array, new QuickSortGPT<>(), "QuickSort", "Mid");

        //System.out.println("B_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_byte_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Small");
        new sortArrayWithAlgorithm(medium_byte_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Medium");
        new sortArrayWithAlgorithm(big_byte_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
        new sortArrayWithAlgorithm(huge_byte_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Huge");
        new sortArrayWithAlgorithm(mid_byte_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Mid");

        //System.out.println("B_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_byte_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Small");
        new sortArrayWithAlgorithm(medium_byte_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Medium");
        new sortArrayWithAlgorithm(big_byte_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Big");
        new sortArrayWithAlgorithm(huge_byte_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Huge");
        new sortArrayWithAlgorithm(mid_byte_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Mid");

        //System.out.println("B_Selection Sort: ");
        new sortArrayWithAlgorithm(small_byte_array, new SelectionSortGPT<>(), "SelectionSort", "Small");
        new sortArrayWithAlgorithm(medium_byte_array, new SelectionSortGPT<>(), "SelectionSort", "Medium");
        new sortArrayWithAlgorithm(big_byte_array, new SelectionSortGPT<>(), "SelectionSort", "Big");
        new sortArrayWithAlgorithm(huge_byte_array, new SelectionSortGPT<>(), "SelectionSort", "Huge");
        new sortArrayWithAlgorithm(mid_byte_array, new SelectionSortGPT<>(), "SelectionSort", "Mid");
    }
}
