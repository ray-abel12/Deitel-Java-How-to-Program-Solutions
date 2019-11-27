package exercises;

public class OverloadedConstructor {
 private static int a ;
 private static int b;
 private static int c = 16;
 
 public OverloadedConstructor(int a,int b,int c) {
	 this.a = a;
	 this.b = b;
	 this.c = c;
 }
 
 public void setvalue(int a ,int b,int c) {
	 
 } 
	public static void main(String[] args) {
		OverloadedConstructor con = new OverloadedConstructor(50, b, c);
		// con.a = 12;
		//con.b = 14;
		//con.c = 15;
System.out.printf("%d%d%d",a,b,c);
	}

}
