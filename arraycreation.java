import java.util.Random;

public class arraycreation {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		 int[] integers = new int[100000];
	        for (int i = 0; i < integers.length; i++) {
	            integers[i] = r.nextInt();
	        }
	        	        
	        arrayCreation(integers);       
	}

	private static void arrayCreation(int[] integers) {
		
		long start = System.currentTimeMillis();
		
		int n = integers.length;
		int temp = 0;
		
		for(int i=0; i < n; i++){
			
			for(int j=1; j < (n-i); j++){
				
				if(integers[j-1] > integers[j]){
					
					temp = integers[j-1];
					integers[j-1] = integers[j];
					integers[j] = temp;
				}
			}
		}
		
		long stop = System.currentTimeMillis();
		
		long end = (stop - start);
		
		System.out.println("Algorithm run time = " + end/1000 + " " + "seconds");
	}

}
