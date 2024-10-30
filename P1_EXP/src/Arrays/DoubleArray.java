package Arrays;

import AuxiliarMethods.fillArray;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class DoubleArray {
    public static void run(){
        fillArray filler = new fillArray();


        Byte[] small_double_array = new Byte[10];
        Byte[] medium_double_array = new Byte[100];
        Byte[] big_double_array = new Byte[1000];
        Byte[] huge_double_array = new Byte[10000];
        Byte[] mid_double_array = new Byte[5000];


        filler.fill(small_double_array);
        filler.fill(medium_double_array);
        filler.fill(big_double_array);
        filler.fill(huge_double_array);
        filler.fill(mid_double_array);

        System.out.println("D_Quicksort: ");
        new sortArrayWithAlgorithm(small_double_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(medium_double_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(big_double_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(huge_double_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(mid_double_array, new QuickSortGPT<>());


        System.out.println("D_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_double_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(medium_double_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(big_double_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(huge_double_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(mid_double_array, new BubbleSortWhileNeeded<>());

        System.out.println("D_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_double_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(medium_double_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(big_double_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(huge_double_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(mid_double_array, new BubbleSortUntilNoChange<>());

        System.out.println("D_Selection Sort: ");
        new sortArrayWithAlgorithm(small_double_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(medium_double_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(big_double_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(huge_double_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(mid_double_array, new SelectionSortGPT<>());


    }
}

