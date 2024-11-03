package Arrays;

import AuxiliarMethods.*;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class FloatArray {
    public static void run(){
        fillArray filler = new fillArray();

        Float[] small_array = new Float[10];
        Float[] medium_array = new Float[100];
        Float[] big_array = new Float[1000];
        Float[] huge_array = new Float[10000];
        Float[] mid_array = new Float[5000];

        filler.fill(small_array);
        filler.fill(medium_array);
        filler.fill(big_array);
        filler.fill(huge_array);
        filler.fill(mid_array);

        //System.out.println("F_Quicksort: ");
        new sortArrayWithAlgorithm(small_array, new QuickSortGPT<>(), "QuickSort", "Small");
        new sortArrayWithAlgorithm(medium_array, new QuickSortGPT<>(), "QuickSort", "Medium");
        new sortArrayWithAlgorithm(big_array, new QuickSortGPT<>(), "QuickSort", "Big");
        new sortArrayWithAlgorithm(huge_array, new QuickSortGPT<>(), "QuickSort", "Huge");
        new sortArrayWithAlgorithm(mid_array, new QuickSortGPT<>(), "QuickSort", "Mid");

        //System.out.println("F_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Small");
        new sortArrayWithAlgorithm(medium_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Medium");
        new sortArrayWithAlgorithm(big_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
        new sortArrayWithAlgorithm(huge_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Huge");
        new sortArrayWithAlgorithm(mid_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Mid");

        //System.out.println("F_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Small");
        new sortArrayWithAlgorithm(medium_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Medium");
        new sortArrayWithAlgorithm(big_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Big");
        new sortArrayWithAlgorithm(huge_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Huge");
        new sortArrayWithAlgorithm(mid_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Mid");

        //System.out.println("F_Selection Sort: ");
        new sortArrayWithAlgorithm(small_array, new SelectionSortGPT<>(), "SelectionSort", "Small");
        new sortArrayWithAlgorithm(medium_array, new SelectionSortGPT<>(), "SelectionSort", "Medium");
        new sortArrayWithAlgorithm(big_array, new SelectionSortGPT<>(), "SelectionSort", "Big");
        new sortArrayWithAlgorithm(huge_array, new SelectionSortGPT<>(), "SelectionSort", "Huge");
        new sortArrayWithAlgorithm(mid_array, new SelectionSortGPT<>(), "SelectionSort", "Mid");
    }
}
