package Arrays;

import AuxiliarMethods.*;
import AuxiliarMethods.sortArrayWithAlgorithm;
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

        System.out.println("F_Quicksort: ");
        new sortArrayWithAlgorithm(small_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(medium_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(big_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(huge_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(mid_array, new QuickSortGPT<>());


        System.out.println("F_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(medium_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(big_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(huge_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(mid_array, new BubbleSortWhileNeeded<>());

        System.out.println("F_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(medium_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(big_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(huge_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(mid_array, new BubbleSortUntilNoChange<>());

        System.out.println("F_Selection Sort: ");
        new sortArrayWithAlgorithm(small_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(medium_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(big_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(huge_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(mid_array, new SelectionSortGPT<>());


    }
}
