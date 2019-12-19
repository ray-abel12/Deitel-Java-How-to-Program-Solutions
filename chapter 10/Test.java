package exercise;

public class Test {

	public static void main(String[] args) {
	Shape s1 = new Shape(2,5);
	Circle c1 = new Circle(10,20,5);
	Rectangle r1 = new Rectangle(10,20,24,25);
    s1.draw();
    System.out.println();
    c1.draw();
    System.out.println();
    r1.draw();
    
	}

}
