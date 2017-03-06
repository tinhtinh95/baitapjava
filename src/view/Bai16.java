package view;

import java.util.Scanner;

public class Bai16 {

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
	public static void lietKe(int a[]){
		for (int i = 0; i < a.length; i++) {
			int d=0; int d1=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]){
					d++;
					for (int j2 = 0; j2 <i; j2++) {
						if(a[i]==a[j2]){
							d1++;
						}
					}
				}
			}if(d1==0){
				System.out.println("Số lần xuất hiện của "+a[i]+" là "+d);
			}
		}
	}

	public static void main(String[] args) {
		int n, i;
		System.out.println("Nhập n: ");
		n = nhap();
		int[] array = new int[n];
		for (i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + " ");
			array[i] = nhap();
		}
		lietKe(array);
	}
}
