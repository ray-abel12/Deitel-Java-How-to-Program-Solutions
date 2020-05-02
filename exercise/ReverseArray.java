import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    private static Scanner scan =new Scanner(System.in);

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,6,7};
        System.out.println("the array is "+ Arrays.toString(numbers) );

        System.out.print("the reverse array is ");
        reverse(numbers);

    }

    private static void reverse(int[] array){
      int count = array.length-1;
        System.out.print("[");
        for(int i = count; i>0;i--){

            System.out.print(array[i]+",");
        }
        System.out.println("]");
    }

}
