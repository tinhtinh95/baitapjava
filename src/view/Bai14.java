package view;

import java.util.Scanner;

public class Bai14 {

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
		System.out.print("Các phần tử trong dãy xuất hiện đúng một lần: ");
		for (int i = 0; i < a.length; i++) {
			int d=1;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j] &&(i!=j)){
					d++;
//					break;
				}
				
			}if(d==1){
				System.out.print(a[i]+" ");
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
