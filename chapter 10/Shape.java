package exercise;

public class Shape {
private int x;
private int y;

public Shape(int xcor,int ycor) {
	x = xcor;
	y = ycor;
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
	y = ycor;
}
public void set(int xcor, int ycor) {
	setX(xcor);
	setY(ycor);
}
public void move(int x1,int y1) {
	set(getX() + x1,getY() + y1);
}

}