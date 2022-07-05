package submissions;

public class MaxExample {

	public static void main(String[] args) {
		/*
		 * This method will return the number with the highest values.
		 * Good for comparing different numbers
		 * 
		 * Here we use it with Math.random(); to see what it will return.
		 * 
		 */
		
		double x = Math.random();
		double y = Math.random();
		double result = 0;
		
		Math.max(x,y);
		
		if(x > y){
			System.out.println("The larger value of the two: x");
		}else {
			System.out.println("The larger value of the two: y");
				
		}

		System.out.println("x = " + x);
		System.out.println("y = " + y);
	
	
	}






}
