package exercise;


public class Circle extends Shape {
private int radius;

Circle(int xcol, int ycol, int rad){
	super(xcol,ycol);
	//it is more efficient to use the method call in case there is a  method validation in the set.
	setRadius(rad);
}
public void setRadius(int rad) {
	radius = rad; 
}
public int getRadius() {
	return radius;
}
public void draw() {
	System.out.println("drawing a circle at: x :" + getX() + ", y: " + getY() + "radius: " + getRadius());
}
}