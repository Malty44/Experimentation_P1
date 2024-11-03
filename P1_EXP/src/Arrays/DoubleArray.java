package Arrays;

import AuxiliarMethods.fillArray;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class DoubleArray {
    public static void run() {
        fillArray filler = new fillArray();

        Double[] small_double_array = new Double[10];
        Double[] medium_double_array = new Double[100];
        Double[] big_double_array = new Double[1000];
        Double[] huge_double_array = new Double[10000];
        Double[] mid_double_array = new Double[5000];

        filler.fill(small_double_array);
        filler.fill(medium_double_array);
        filler.fill(big_double_array);
        filler.fill(huge_double_array);
        filler.fill(mid_double_array);

        //System.out.println("D_Quicksort: ");
        new sortArrayWithAlgorithm(small_double_array, new QuickSortGPT<>(), "QuickSort", "Small");
        new sortArrayWithAlgorithm(medium_double_array, new QuickSortGPT<>(), "QuickSort", "Medium");
        new sortArrayWithAlgorithm(big_double_array, new QuickSortGPT<>(), "QuickSort", "Big");
        new sortArrayWithAlgorithm(huge_double_array, new QuickSortGPT<>(), "QuickSort", "Huge");
        new sortArrayWithAlgorithm(mid_double_array, new QuickSortGPT<>(), "QuickSort", "Mid");

        //System.out.println("D_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_double_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Small");
        new sortArrayWithAlgorithm(medium_double_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Medium");
        new sortArrayWithAlgorithm(big_double_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
        new sortArrayWithAlgorithm(huge_double_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Huge");
        new sortArrayWithAlgorithm(mid_double_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Mid");

        //System.out.println("D_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_double_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Small");
        new sortArrayWithAlgorithm(medium_double_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Medium");
        new sortArrayWithAlgorithm(big_double_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Big");
        new sortArrayWithAlgorithm(huge_double_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Huge");
        new sortArrayWithAlgorithm(mid_double_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Mid");

        //System.out.println("D_Selection Sort: ");
        new sortArrayWithAlgorithm(small_double_array, new SelectionSortGPT<>(), "SelectionSort", "Small");
        new sortArrayWithAlgorithm(medium_double_array, new SelectionSortGPT<>(), "SelectionSort", "Medium");
        new sortArrayWithAlgorithm(big_double_array, new SelectionSortGPT<>(), "SelectionSort", "Big");
        new sortArrayWithAlgorithm(huge_double_array, new SelectionSortGPT<>(), "SelectionSort", "Huge");
        new sortArrayWithAlgorithm(mid_double_array, new SelectionSortGPT<>(), "SelectionSort", "Mid");
    }
}
