package Arrays;

import AuxiliarMethods.*;
import SortingAlgorithms.BubbleSortUntilNoChange;
import SortingAlgorithms.BubbleSortWhileNeeded;
import SortingAlgorithms.QuickSortGPT;
import SortingAlgorithms.SelectionSortGPT;

public class CharArray {

 public static void run() {
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

  //System.out.println("C_Quicksort: ");
  new sortArrayWithAlgorithm(small_char_array, new QuickSortGPT<>(), "QuickSort", "Small");
  new sortArrayWithAlgorithm(medium_char_array, new QuickSortGPT<>(), "QuickSort", "Medium");
  new sortArrayWithAlgorithm(big_char_array, new QuickSortGPT<>(), "QuickSort", "Big");
  new sortArrayWithAlgorithm(huge_char_array, new QuickSortGPT<>(), "QuickSort", "Huge");
  new sortArrayWithAlgorithm(mid_char_array, new QuickSortGPT<>(), "QuickSort", "Mid");

  //System.out.println("C_Optimized BBSort: ");
  new sortArrayWithAlgorithm(small_char_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Small");
  new sortArrayWithAlgorithm(medium_char_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Medium");
  new sortArrayWithAlgorithm(big_char_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Big");
  new sortArrayWithAlgorithm(huge_char_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Huge");
  new sortArrayWithAlgorithm(mid_char_array, new BubbleSortWhileNeeded<>(), "BubbleSortWhileNeeded", "Mid");

  //System.out.println("C_Normal BBSort: ");
  new sortArrayWithAlgorithm(small_char_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Small");
  new sortArrayWithAlgorithm(medium_char_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Medium");
  new sortArrayWithAlgorithm(big_char_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Big");
  new sortArrayWithAlgorithm(huge_char_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Huge");
  new sortArrayWithAlgorithm(mid_char_array, new BubbleSortUntilNoChange<>(), "BubbleSortUntilNoChange", "Mid");

  //System.out.println("C_Selection Sort: ");
  new sortArrayWithAlgorithm(small_char_array, new SelectionSortGPT<>(), "SelectionSort", "Small");
  new sortArrayWithAlgorithm(medium_char_array, new SelectionSortGPT<>(), "SelectionSort", "Medium");
  new sortArrayWithAlgorithm(big_char_array, new SelectionSortGPT<>(), "SelectionSort", "Big");
  new sortArrayWithAlgorithm(huge_char_array, new SelectionSortGPT<>(), "SelectionSort", "Huge");
  new sortArrayWithAlgorithm(mid_char_array, new SelectionSortGPT<>(), "SelectionSort", "Mid");
 }
}
