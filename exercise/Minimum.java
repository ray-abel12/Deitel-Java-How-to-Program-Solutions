import java.util.Scanner;

public class Minimum{
 private static Scanner scan = new Scanner(System.in);

 public static void main(String[] args){
     System.out.println("enter the number of element to count");
     int userCount = scan.nextInt();
     int[] numbers =readInteger(userCount);
     int minimum=findMin(numbers);
     System.out.println("the minimum value is ");
     System.out.print(minimum);
 }

    private static int[] readInteger(int count){
        int[] array =new int[count];
        System.out.println("enter elements");
        int arrayInput;
        for(int i = 0;i<array.length;i++){
            array[i]= scan.nextInt();
        }
        return array;
    }
private static int findMin(int array[]){
       /* int temp;
        boolean flag = true;
        while (flag){
            flag =false;
        for(int i =0;i<array.length-1;i++) {
            if (array[i] < array[i + 1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i + 1] = temp;
                flag=true;*/

          //  }
        }
            //Math.min(array[i],array[i+1]);
        }
   // return array[array.length-1];
}
}
