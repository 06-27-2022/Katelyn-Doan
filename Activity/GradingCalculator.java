public class GradingCalculator{
	
	public static void main(String[] args) {
		
		int[] grade = {95, 85, 62, 40, 79};
		
		for(int i = 0; i < grade.length; i++) {
			if(100 >= grade[i]&& grade[i] >= 90) {
				System.out.println("Math:" + grade[i]);
			}
			if(89 >= grade[i]&& grade[i] >= 80) {
				System.out.println("English:" + grade[i]);
			}
			if(79 >= grade[i]&& grade[i] >= 70) {
				System.out.println("Art:" + grade[i]);
			}
			if(69 >= grade[i]&& grade[i] >= 60) {
				System.out.println("Science:" + grade[i]);
			}
			if(59 >= grade[i]) {
				System.out.println("History:" + grade[i]);
			}
		}
		
		
		
		
		
		
		
}
	
	
	
