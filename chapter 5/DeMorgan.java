package exercise;

public class DeMorgan {
	
	public final int x = 3;
	public final int y = 6;
	public final int a = 6;
	public final int b = 4;
	public final int g = 6;
	
public void demorgan() {
	System.out.println(!(x < 5) && !(y >= 7));
    System.out.println(!((x < 5) || (y >= 7)));
    System.out.println(!(a == b) || !(g != 5));
}
}
