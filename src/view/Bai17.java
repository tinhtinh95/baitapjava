package view;

import java.util.Scanner;

public class Bai17 {

	public static float nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = false;
		float n = 0;
		do {
			try {
				n = Float.parseFloat(input.nextLine());
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Bạn phải nhập số!!!");
			}
		} while (check);

		return n;
	}
	public static void sapxepTang(float a[]){
		float tmp=0;
		System.out.println("Dãy số vừa nhập theo thứ tự tăng dần là: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]){
					tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;
				}
			}
			System.out.print(a[i]+"  ");
		}
	}

	public static void main(String[] args) {
		int n, i;
		System.out.println("Nhập n: ");
		Scanner sc=new Scanner(System.in);
		n=Integer.parseInt(sc.nextLine());
		float[] array = new float[n];
		for (i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + " ");
			array[i] = nhap();
		}
		sapxepTang(array);
	}
}
