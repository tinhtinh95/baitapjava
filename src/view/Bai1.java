package view;

import java.util.Scanner;

public class Bai1 {

	public static int UCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = false;
		int n = 0;
		do {
			try {
				n = Integer.parseInt(input.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Bạn phải nhập số!!!");
			}
		} while (check);

		return n;
	}

	public static void main(String[] args) {
		System.out.println("Nhập a: ");
		int a = nhap();
		System.out.println("Nhập b: ");
		int b = nhap();
		System.out.println("UCLN của " + a + " và " + b + " là: " + UCLN(a, b));
		System.out.println("BCNN của " + a + " và " + b + " là: " + (a * b) / (UCLN(a, b)));
	}
}
