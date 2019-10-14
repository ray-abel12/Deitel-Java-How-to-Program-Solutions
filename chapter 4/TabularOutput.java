package exercise;

public class TabularOutput {
	
	 int i1 = 0;
	 int i2 = 0;
	 int i3 = 0;
	 int i4 = 0;

 public void output() { 
	 for(int i = 1; i<=5; i++) {
		   i4 = i;
	 System.out.print(i4);
		  i1 = i * 10;
		 System.out.println();
		 System.out.printf("%d\t", i1);
		 i2 = i * 100;
		 System.out.printf("%d\t" ,i2);
		 i3 = i * 1000;
		 System.out.printf("%d\t", i3);
		 
	 }

		}
}

