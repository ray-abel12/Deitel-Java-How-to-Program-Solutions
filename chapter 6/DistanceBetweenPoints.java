package exercises;

public class DistanceBetweenPoints {
	
	
public static double DistanceBetweenPoint(final double x2,final double x1,final double y2,final double y1 ) {
		
		double result = 0.0;
		double value1 = ((x2 - x1)*2.0);
		double value2 =((y2-y1)*2.0);
		result = Math.sqrt(((Math.pow(x2 - x1, value2)*2.0)+ Math.pow((y2-y1),2.0)));
		System.out.println(result);
	return result;	
		
	}
}
