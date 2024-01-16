package Condition;

public class bai1 {
	public static void main(String[] args) {

		int a = 9;
		int b = 7;
		int c = 5;
		int max = a;

		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}

		System.out.println(max + " là số lớn nhất");

	}

}
