package exercises;

public class Rectangle {

//constant instance variables 
private  double length = 1;
private double width = 1;

public void setLenght(double length) {
	if (length > 0.0 && length < 20.0) {
		 this.length = length;
	}else {
		throw new IllegalArgumentException("illegial argument");
	}

}
public void setwidth(double width ) {
	if (length > 0.0 && length < 20.0) {
		this.width= width;
	}else {
		throw new IllegalArgumentException("illegial argument");
	}
	
}
public double getLenght() {
	return length;
}
public double getWidth() {
	return width;
}
public Rectangle(double length,double width) {
	this.length = length;
	this.width = width;
}
public double perimeter() {
	double perimeter = 2*(getLenght() + getWidth());
	return perimeter;
}
public double area() {
	double area = getWidth() * getLenght();
	return  area;
}
}
