package exercises;

public class One_dimensional_array {

	public static void main(String[] args) {
		int[]count = new int[10];
		int[]bonus = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,11};
		
		for (int i = 0;i < count.length;i++) {
			count[i] = 0;
		}
		for (int i = 0; i < bonus.length;i++) {
			bonus[i] += 1;
			System.out.println(bonus[i]);
		}
		

	}

}
