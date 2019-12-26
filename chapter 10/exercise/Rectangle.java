package exercise;

public class Rectangle extends Shape {
private int width;
private int height;

public Rectangle(int xcor, int ycol,int w,int h) {
	
	super(xcor,ycol);
	width = w;
	height = h;
	
}

public int getWidth() {
	return width;
}

public int getHeight() {
	return height;
}

public void setWidth(int w) {
	width = w;
}

public void setHeight(int h) {
	height = h;
}


}