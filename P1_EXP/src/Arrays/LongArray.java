package Arrays;

import AuxiliarMethods.fillArray;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class LongArray {
    public static void run(){
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

        System.out.println("L_Quicksort: ");
        new sortArrayWithAlgorithm(small_long_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(medium_long_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(big_long_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(huge_long_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(mid_long_array, new QuickSortGPT<>());


        System.out.println("L_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_long_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(medium_long_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(big_long_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(huge_long_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(mid_long_array, new BubbleSortWhileNeeded<>());

        System.out.println("L_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_long_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(medium_long_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(big_long_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(huge_long_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(mid_long_array, new BubbleSortUntilNoChange<>());

        System.out.println("L_Selection Sort: ");
        new sortArrayWithAlgorithm(small_long_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(medium_long_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(big_long_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(huge_long_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(mid_long_array, new SelectionSortGPT<>());


    }
}
