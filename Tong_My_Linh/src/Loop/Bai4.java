package Loop;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số tiền gửi: ");
		double soTienGui = scanner.nextDouble();

		System.out.print("Nhập lãi suất hàng tháng (ví dụ: 0.5 cho 0.5%): ");
		double laiSuatHangThang = scanner.nextDouble();

		System.out.print("Nhập số tháng gửi: ");
		int soThangGui = scanner.nextInt();

		// Tính lãi kép
		double laiKep = tinhLaiKep(soTienGui, laiSuatHangThang, soThangGui);

		System.out.println("Lãi kép sau " + soThangGui + " tháng là: " + laiKep);

		scanner.close();
	}

	// Phương thức tính lãi kép
	public static double tinhLaiKep(double soTienGui, double laiSuatHangThang, int soThangGui) {
		double laiKep = soTienGui * Math.pow(1 + laiSuatHangThang / 100, soThangGui) - soTienGui;
		return laiKep;
	}

}
