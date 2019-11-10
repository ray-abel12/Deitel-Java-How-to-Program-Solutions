package exercises;

public class Order {
	
	static int[][] sales = new int[3][2];
	
	public static void main(String[] args) {
		
	for (int row = 0; row < sales.length; row++) {
		for (int col = 0; col < sales[row].length; col++) {
		sales[row][col] = 0;
		}
	}
	for (int row = 0; row < sales.length; row++) {
		for (int col = 0; col < sales[row].length; col++) {
			System.out.println(sales[row][col]);
		}
		}

	}
}
	


