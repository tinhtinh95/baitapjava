package view;

import java.util.Scanner;

public class Bai10 {

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

	public static void result(int a[], int k) {
		int i;
		System.out.println();
		for (i = 1; i <= k; i++) {
			System.out.print("  " + a[i]);
		}
	}

	public static void try_backTrack(int a[], int n, int k, int i) {
		int j;
		for (j = a[i - 1] + 1; j <= (n - k + i); j++) {
			a[i] = j;
			if (i == k)
				result(a, k);
			else
				try_backTrack(a, n, k, i + 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n = nhap();
		int[] array = new int[n + 1];
		int k;
		System.out.println("Liet ke tat ca cac tap con k phan tu cua 1,2,..," + n + " : ");
		for (k = 1; k <= n; k++) {
			System.out.println("\nTap con " + k + " phan tu: ");
			try_backTrack(array, n, k, 1);
		}
	}

}
