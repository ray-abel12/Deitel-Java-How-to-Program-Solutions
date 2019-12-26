package exercise;
import java.util.ArrayList;
public class polyTest {

	public static void main(String[] args) {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	Circle c1 = new Circle(10,20,5);
	Rectangle r1 = new Rectangle(10,20,24,25);
	shapes.add(c1);
	shapes.add(r1);
	for(int i = 0; i < shapes.size();i++) {
		shapes.get(i).draw();
	}
	}

}
