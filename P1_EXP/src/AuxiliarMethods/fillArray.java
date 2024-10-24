package AuxiliarMethods;

import java.util.Random;

public final class fillArray {
    public <T> void fill(T[] array) {
        Random random = new Random();

        // Check the type of array elements and fill accordingly
        for (int i = 0; i < array.length; i++) {
            if (array instanceof Integer[]) {
                array[i] = (T) (Integer) random.nextInt(100000); // Cast to Integer for Integer array
            } else if (array instanceof Double[]) {
                array[i] = (T) (Double) (random.nextDouble() * 100000); // Cast to Double for Double array
            }
        }
    }

    public <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
