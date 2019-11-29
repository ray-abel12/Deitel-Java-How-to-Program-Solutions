package exercises;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

	public class Solutions {



	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int N = scanner.nextInt();
	         if(N % 2 == 1){
	            System.out.print("weird");
	         }else
	         if ((N % 2 == 0) & (N > 2) & (N <= 6)){
	            System.out.print("not weird");
	         }else
	         if((N % 2 == 0) & (N > 6 ) &(N <= 20)){
	             System.out.print("weird");
	         }else
	         if((N % 2 == 0 ) & (N > 20)){
	             System.out.println("not weird");
	         }

	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	    }
	}

