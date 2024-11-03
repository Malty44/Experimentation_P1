package Arrays;

import AuxiliarMethods.fillArray;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class LongArray {
    public static void run() {
        fillArray filler = new fillArray();

        Long[] small_long_array = new Long[10];
        Long[] medium_long_array = new Long[100];
        Long[] big_long_array = new Long[1000];
        Long[] huge_long_array = new Long[10000];
        Long[] mid_long_array = new Long[5000];

        filler.fill(small_long_array);
        filler.fill(medium_long_array);
        filler.fill(big_long_array);
        filler.fill(huge_long_array);
        filler.fill(mid_long_array);

        //System.out.println("L_Quicksort: ");
        new sortArrayWithAlgorithm(small_long_array, new QuickSortGPT<>(), "QuickSort", "Small");
        new sortArrayWithAlgorithm(medium_long_array, new QuickSortGPT<>(), "QuickSort", "Medium");
        new sortArrayWithAlgorithm(big_long_array, new QuickSortGPT<>(), "QuickSort", "Big");
        new sortArrayWithAlgorithm(huge_long_array, new QuickSortGPT<>(), "QuickSort", "Huge");
        new sortArrayWithAlgorithm(mid_long_array, new QuickSortGPT<>(), "QuickSort", "Mid");

        //System.out.println("L_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_long_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Small");
        new sortArrayWithAlgorithm(medium_long_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Medium");
        new sortArrayWithAlgorithm(big_long_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
        new sortArrayWithAlgorithm(huge_long_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Huge");
        new sortArrayWithAlgorithm(mid_long_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Mid");

        //System.out.println("L_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_long_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Small");
        new sortArrayWithAlgorithm(medium_long_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Medium");
        new sortArrayWithAlgorithm(big_long_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Big");
        new sortArrayWithAlgorithm(huge_long_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Huge");
        new sortArrayWithAlgorithm(mid_long_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Mid");

        //System.out.println("L_Selection Sort: ");
        new sortArrayWithAlgorithm(small_long_array, new SelectionSortGPT<>(), "SelectionSort", "Small");
        new sortArrayWithAlgorithm(medium_long_array, new SelectionSortGPT<>(), "SelectionSort", "Medium");
        new sortArrayWithAlgorithm(big_long_array, new SelectionSortGPT<>(), "SelectionSort", "Big");
        new sortArrayWithAlgorithm(huge_long_array, new SelectionSortGPT<>(), "SelectionSort", "Huge");
        new sortArrayWithAlgorithm(mid_long_array, new SelectionSortGPT<>(), "SelectionSort", "Mid");
    }
}
