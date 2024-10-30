package AuxiliarMethods;

import java.util.Random;

public final class fillArray {
    public <T> void fill(T[] array) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            if (array instanceof Integer[]) {
                array[i] = (T) (Integer) random.nextInt(100000);
            } else if (array instanceof Double[]) {
                array[i] = (T) (Double) (random.nextDouble() * 100000);
            } else if (array instanceof Byte[]){
                byte[] byteArray = new byte[array.length];
                random.nextBytes(byteArray);
                for (int j = 0; j < byteArray.length; j++) {
                    array[j] = (T) (Byte) byteArray[j];
                }
                break;
            } else if (array instanceof Float[]) {
                array[i] = (T) (Float) (random.nextFloat() * 100000);
            }else if (array instanceof Character[]) {
                if (random.nextBoolean()) {
                    array[i] = (T) (Character) (char) ('A' + random.nextInt(26)); // Uppercase letter
                } else {
                    array[i] = (T) (Character) (char) ('a' + random.nextInt(26)); // Lowercase letter
                }
                //System.out.println(array[i]);
            }else if (array instanceof Long[]){
                array[i] = (T) (Long) (random.nextLong() * 100000);
            }
        }
    }

    public <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
