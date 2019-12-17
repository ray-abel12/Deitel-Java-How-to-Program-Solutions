package exercises;

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
}
