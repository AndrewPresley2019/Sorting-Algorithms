import java.util.Random;

public class insertionSort {

	public static void main(String[] args) {
		
		double start = System.currentTimeMillis();
					
		Random r = new Random();
		
		 int tmp;
		 int j; 
		 
		 int[] integers = new int[300000];
	        for (int i = 0; i < integers.length; i++) {
	            integers[i] = r.nextInt();
	        }
	        
	        for (int i = 1; i < integers.length; i ++) {
	        	tmp = integers[i];
	        	for (j = i; j > 0 && integers[j] < integers[j-1]; j--) {
	        		
	        		integers[j] = integers[j-1];
	        	}
	        	
	        	integers[j] = tmp;
	        }
	        
	        
	        double stop = System.currentTimeMillis();
			
			double end = (stop - start);
	        
			System.out.println("Algorithm run time = " + end + " " + "milliseconds");
	   }
  }



