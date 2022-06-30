public class GradingCalculator {
	
	static char letterGrade;

	public static void main(String[] args) {

		int[] grade = { 95, 85, 62, 40, 79 };
		String[] subject = {"Math", "English", "Science", "History", "Art"};
		

		for (int i = 0; i < grade.length; i++) {
			if (100 >= grade[i] && grade[i] >= 90) {
				letterGrade = 'A';
			}else if (89 >= grade[i] && grade[i] >= 80) {
				letterGrade = 'B';
			}else if (79 >= grade[i] && grade[i] >= 70) {
				letterGrade = 'C';
			}else if (69 >= grade[i] && grade[i] >= 60) {
				letterGrade = 'D';
			}else if (59 >= grade[i]) {
				letterGrade = 'F';
			}
			System.out.println(subject[i] + ": " + letterGrade);
		}
		

	}

}
	
	
	
