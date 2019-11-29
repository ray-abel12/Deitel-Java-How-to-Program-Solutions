package exercises;

import java.util.ArrayList;
//import java.util.Collections;

public class MyArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<Integer>();	
	list.add(123);
	list.add(234);
	list.add(234);
	int total =1;
	int value = 0;
    for(int i = 0;i<3;i++) {
	 value = list.get(i);
     total = value + total;
}
System.out.printf("the total sum is %d%n",total);
System.out.printf("arraylist size %d",list.size());

	}

}
//collections.sort(list)
// to add to the list use list.add
// to set use list.set("i",123)
// to clear use list.clear
// to check the length use list.size()
//to remove use list.remove()
//