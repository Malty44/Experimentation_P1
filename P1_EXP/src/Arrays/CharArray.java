package Arrays;

import AuxiliarMethods.*;
import AuxiliarMethods.sortArrayWithAlgorithm;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class CharArray {

    public static void run(){
       fillArray filler = new fillArray();


        Character[] small_char_array = new Character[10];
        Character[] medium_char_array = new Character[100];
        Character[] big_char_array = new Character[1000];
        Character[] huge_char_array = new Character[10000];
        Character[] mid_char_array = new Character[5000];


        filler.fill(small_char_array);
        filler.fill(medium_char_array);
        filler.fill(big_char_array);
        filler.fill(huge_char_array);
        filler.fill(mid_char_array);

        System.out.println("C_Quicksort: ");
        new sortArrayWithAlgorithm(small_char_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(medium_char_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(big_char_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(huge_char_array, new QuickSortGPT<>());
        new sortArrayWithAlgorithm(mid_char_array, new QuickSortGPT<>());


        System.out.println("C_Optimized BBSort: ");
        new sortArrayWithAlgorithm(small_char_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(medium_char_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(big_char_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(huge_char_array, new BubbleSortWhileNeeded<>());
        new sortArrayWithAlgorithm(mid_char_array, new BubbleSortWhileNeeded<>());

        System.out.println("C_Normal BBSort: ");
        new sortArrayWithAlgorithm(small_char_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(medium_char_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(big_char_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(huge_char_array, new BubbleSortUntilNoChange<>());
        new sortArrayWithAlgorithm(mid_char_array, new BubbleSortUntilNoChange<>());

        System.out.println("C_Selection Sort: ");
        new sortArrayWithAlgorithm(small_char_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(medium_char_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(big_char_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(huge_char_array, new SelectionSortGPT<>());
        new sortArrayWithAlgorithm(mid_char_array, new SelectionSortGPT<>());


    }

}
