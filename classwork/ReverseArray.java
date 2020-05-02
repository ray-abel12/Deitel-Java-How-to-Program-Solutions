import java.util.Scanner;

public class ReverseArray {
    private static Scanner scan =new Scanner(System.in);

    public static void main(String[] args){
        int[] numbers = {1,2,3,4,6,7};
        System.out.println("the array is " );
        for (int i = 0;i<numbers.length;i++){

            System.out.println(numbers[i]);
        }
        System.out.println("the reverse array is ");
        reverse(numbers);

    }

    public static void reverse(int[] array){

        for(int i = array.length-1; 0<array.length-1;i--){
            System.out.println(array[i]);
        }
    }

}
