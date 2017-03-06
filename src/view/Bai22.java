package view;

import java.util.Scanner;

public class Bai22 {

	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = true;
		int n = 0;
		do {
			try {
				n = Integer.parseInt(input.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Bạn phải nhập số!!!");
				System.out.println("Mời nhập lại: ");
			}
		} while (check);

		return n;
	}

	public static void uocSo(int n) {
		int c = 0;
		System.out.println("Các ước số của "+n+" là: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i+"  ");
				c++;
			}
		}System.out.println("Có "+c+" ước số");

	}

	public static void uocsoSNT(int n) {
		System.out.println("Các ước số của "+n+" là số nguyên tố là: ");
		for (int i = 2; i <=n; i++) {
			if(n%i==0 && kiemtraSNT(i)){
				System.out.print(i+"  ");
			}
		}
	}
	public static boolean kiemtraSNT(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n = nhap();
		uocSo(n);
		uocsoSNT(n);
	}

}
