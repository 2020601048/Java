package Loop;

public class Bai1 {
	public static void main(String[] args) {
		int number = 3;
		int accumulateNumbers = 1;

		for (int i = 1; i <= number; i++) {
			accumulateNumbers *= i;

		}

		System.out.println("Giai thua cua " + number + ": " + accumulateNumbers);
	}
}
