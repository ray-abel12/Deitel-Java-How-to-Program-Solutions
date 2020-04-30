import java.util.Arrays;
import java.util.Scanner;

public class Ascending {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers;
        numbers = getInteger(5);

        numbers = getAscendingNo(numbers);
        printArray(numbers);
    }

    public static int[] getInteger(int number) {
        int[] integer = new int[number];
        System.out.println("enter values");
        for (int i = 0; i < integer.length; i++) {
            integer[i] = scan.nextInt();
        }
        return integer;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
              System.out.print(array[i]);
        }
    }

    public static int[] getAscendingNo(int[] array) {
       /* int[] soretedArray = new int[array.length];
        for (int i = 0; i < soretedArray.length; i++) {
            soretedArray[i] = array[i];*/
       int[] soretedArray= Arrays.copyOf(array,array.length);

        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < soretedArray.length - 1; i++) {
                if (soretedArray[i] < soretedArray[i + 1]) {
                    temp = soretedArray[i];
                   //
                    soretedArray[i] = soretedArray[i + 1];
                    soretedArray[i+1]=temp;
                    flag = true;
                }
            }
        }
        return soretedArray;
    }
}
