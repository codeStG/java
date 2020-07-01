import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        int count = scanner.nextInt();
        scanner.nextLine();


        int[] specifiedArray = getIntegers(count);
        printArray(specifiedArray);
        System.out.println("The sorted array is: " + Arrays.toString(sortIntegers(specifiedArray)));

    }

    private static int[] getIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number: " );
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static void printArray(int[] array) {
        System.out.println("The array is currently: " + Arrays.toString(array));
    }

    private static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;

            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}

