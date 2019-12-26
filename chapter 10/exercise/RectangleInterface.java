package exercise;

public class RectangleInterface implements ShapeInterface {
private int x;
private int y;
private int width;
private int height;

RectangleInterface (int xcor,int ycor,int w,int h){
	x = xcor;
	y = ycor;
	width = w;
	height = h;
}
	
	public int getX() {
		return x;
	}

	
	public int getY() {
		return y;
	}

	public void setX(int xcor) {
		x = xcor;
	}

	
	public void setY(int ycor) {
	   x = ycor;
		
	}

	public void draw() {
	System.out.println("draw a rectangle");
		
	}

}
