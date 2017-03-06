package view;

import java.util.Scanner;

public class Bai11 {

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
		System.out.print("Nhập n: ");
		int n = nhap();
		int[] array = new int[n + 2];
		int i, j, k = n - 1, temp, check = 1;
		for (i = 0; i < n; i++) {
			array[i] = i + 1;
		}
		System.out.println("Cac hoan vi ke la: ");
		try {
			i = n - 2;
			while (check > 0) {
				// In ra hoan vi
				System.out.println("   ");
				for (j = 0; j < n; j++) {
					System.out.print(" " + array[j]);
				}
				for (i = n - 2; i >= 0; i--) {
					check = 1;
					if (array[i] < array[i + 1]) {
						if (i == n - 2) {
							temp = array[i];
							array[i] = array[n - 1];
							array[n - 1] = temp;
							break;
						} else {
							// Tim so a[k] nho nhat ma >a[i] trong cac so ben
							// phai a[i]
							k = i + 1;
							for (j = i + 1; j < n; j++) {
								if (array[i + 1] > array[j] && array[j] > array[i])
									k = j;

							}
							// Doi cho a[k] va a[i]
							temp = array[i];
							array[i] = array[k];
							array[k] = temp;
							// Sap xep lai tu a[i+1] toi a[n]
							for (j = i + 1; j < n; j++) {
								for (int m = i + 1; m < n; m++) {
									if (array[j] < array[m]) {
										temp = array[j];
										array[j] = array[m];
										array[m] = temp;
									}
								}
							}
							break;
						}
					} else {
						check = 0;
						// break;
					}
				}
				// if(i==0)check=0;
			}
		} catch (Exception e) {
		}
	}

}
