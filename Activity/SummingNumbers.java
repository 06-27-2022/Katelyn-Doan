public class SummingNumbers {

	static int addTogether(int[] arr) {
		int total = 0;
		for(int i : arr) {
			total += i;
		}
		return total;
	}

	public static void main(String[] args) {
		//This method here will be the caller
		int[] test = {2, 3, 60, 100};
		int sum = addTogether(test);
		System.out.println(sum);
	}

}

