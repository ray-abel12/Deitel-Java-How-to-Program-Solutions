package exercise;

public class Enforcing_Privacy {

public int passValue(int input) {		

		 int num1 = input /10_000;
		 int num2 = input /10_00;
		 num2 = num2%10;
		 int num3 = input/10_0;
		 num3 = num3%10;
		 int num4 = input/10;
		 num4 = num4%10;
		 int num5 = input/1;
		 num5 = num5%10;
		 num1 = num1 + 7;
		 num1 %= 10 ;
		 System.out.println(num1);
	return input;
}
		

	

}
