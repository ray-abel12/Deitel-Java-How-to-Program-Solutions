package exercise;

public class AbstractShapeTest {
	public static void main(String... args) {
	//can not instantiate it because we used the keyword abstract but you can use it to create other classes
   //Shape shapes = new Shape(12,7);
	Circle c1 = new Circle(12,13,14);
	c1.draw();
}
}