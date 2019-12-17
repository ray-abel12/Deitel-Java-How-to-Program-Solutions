package exercises;

public class Circle extends Shape {
private int radius;

Circle(int xcol, int ycol, int rad){
	super(xcol,ycol);
	radius = rad;
}
public void setRadius(int rad) {
	radius = rad; 
}
public int getRadius() {
	return radius;
}
}
