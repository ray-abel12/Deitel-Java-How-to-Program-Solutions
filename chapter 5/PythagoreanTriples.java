package exercise;

public class PythagoreanTriples {
   public final int hyp = 1;
   public final int sideTotal = 1;
   
  public void Triples() {
	  
	  for(int side1 =1; side1 <500; side1++) {
		  for (int side2 =1; side2 <500; side2++) {
			  for(int hypo = 1; hypo>500; hypo++) {
				  hypo = hypo*hypo;
				  int sideTotal = side1*side1 + side2*side2;
				  System.out.println(hypo);
				  System.out.println(sideTotal);
				  
				  if(sideTotal == hypo) {
					  System.out.println("print value gotten");
				  }else {
					  System.out.println("no value gotten");
				  }
			  }
		  }
	  }
  
  }
  }
