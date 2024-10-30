package Arrays;

import AuxiliarMethods.*;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class ByteArray {
    public static void run(){
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

        System.out.println("B_Quicksort: ");
        new sortArrayWithAlgorithm(small_byte_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(medium_byte_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(big_byte_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(huge_byte_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(mid_byte_array, new QuickSortGPT<>());


        System.out.println("B_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_byte_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(medium_byte_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(big_byte_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(huge_byte_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(mid_byte_array, new BubbleSortWhileNeeded<>());

        System.out.println("B_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_byte_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(medium_byte_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(big_byte_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(huge_byte_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(mid_byte_array, new BubbleSortUntilNoChange<>());

        System.out.println("B_Selection Sort: ");
        new sortArrayWithAlgorithm(small_byte_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(medium_byte_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(big_byte_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(huge_byte_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(mid_byte_array, new SelectionSortGPT<>());


    }
}
