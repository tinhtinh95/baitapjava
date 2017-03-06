package view;

import java.util.Scanner;

public class Bai9 {

	private static Scanner input;

	public static int nhap() {
		input = new Scanner(System.in);
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

	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n = nhap();
		int[] array= new int[n];
        int tich;
        do{
			tich = 1;
			System.out.println("");
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[j]);
				tich *= array[j];
			}
			int i = n - 1;
			do {
				if (array[i] == 0) {
					array[i] = 1;
					for (int j = n - 1; j > i; j--) {
						array[j] = 0;
					}
					break;
				} else
					i--;
			} while (i >= 0);
		} while (tich != 1);
	}
}
