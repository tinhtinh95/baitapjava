package view;

import java.util.Scanner;

public class Bai15 {

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
	public static void lietKe(float a[]){
		System.out.print("Các phần tử trong dãy xuất hiện đúng hai lần: ");
		for (int i = 0; i < a.length; i++) {
			int dem=0;int dem2=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]){
					dem=dem+1;
					for (int j2 = 0; j2 < i; j2++) {
						if(a[i]==a[j2]){dem2++;}
					}
				}
			}
			if(dem==2 && dem2==0){
				
				System.out.print(a[i]+" ");
			}
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
		lietKe(array);
	}
}
