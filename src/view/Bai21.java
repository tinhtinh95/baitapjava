package view;

import java.util.Scanner;

public class Bai21 {

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
	public static int tinhTong(int n){
		if(n==0){
			return 0; 
		}else{
			return (n%10)+tinhTong(n/10);
		}
	}
	
	public static void phanTich(int n){
		int i=2;
		System.out.println("Tích các số nguyên tố của "+n+" là: ");
		while(n>1){
			if(n%i==0){
				n/=i;
				if(n==1){
					System.out.print(i);
				}else{
					System.out.print(i+" x ");
				}
			}else{
				i++;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n = nhap();
		phanTich(n);
		System.out.println("");
		System.out.println("Tổng các chữ số: "+ tinhTong(n));
	}
}
