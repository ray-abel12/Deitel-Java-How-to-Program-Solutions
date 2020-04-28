import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the no of element to use in the array");
        int count = scan.nextInt();
       int[] myInteger = getIntegers(count);
       for (int i =0;i<myInteger.length;i++){
           System.out.println("Element " + i+" typed values is " +myInteger[i]);
       }
        System.out.println("the average is "+getAverage(myInteger));

    }
    public static int[] getIntegers(int number){
        System.out.println("enter Values");
        int[] values = new int[number];
        for(int i = 0;i<values.length;i++){
            values[i] =scan.nextInt();
        }

        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i =0;i<array.length;i++){
            sum +=array[i];
        }
        return (double)sum/(double)array.length;
    }
}

