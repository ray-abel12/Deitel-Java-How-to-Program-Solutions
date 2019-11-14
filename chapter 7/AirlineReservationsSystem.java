package exercises;
import java.util.Random;
import java.util.Scanner;

public class AirlineReservationsSystem {
static Scanner scan = new Scanner(System.in);
static Random rand = new Random();

static boolean[] airline = new boolean[11];

 public static boolean check (boolean []airline) {
	 
	 for(int i = 0;i<airline.length;i++) {
		 
	 if (airline[i]== false) 
	 {
		 return true;
	 }	
}
	return false;
}
 public static void assign() {
	 System.out.println("type 1 for First Class and Please type 2 for\r\n" + 
	 		"Economy.");
	int value = scan.nextInt();
	boolean temp ;
	if (value == 1) {
		for(int i= 1; i<=5; i++ ) {
		temp = check(airline);
		if(temp = true) {
		i = 1 + rand.nextInt(5);
		airline[i] = true;
		System.out.printf("your seat no is %d %s",i,"and in first class section" );
		break;
	
		}else {
			System.out.println("first class full,try economic section");
		}
		
		}
		
	}if (value == 2) {
		for(int i= 6; i<=10; i++ ) {
		temp = check(airline);
		if(temp = true) {
		i = 6 + rand.nextInt(10);
		airline[i] = true;
		System.out.printf("your seat no is %d %s",i,"and in economy section" );
		break; 
	
	
		}else {
			System.out.println("first class full,try firstclass section or wait for next flight");
		}
	}
	}
	scan.close();
 }
}
	
	


