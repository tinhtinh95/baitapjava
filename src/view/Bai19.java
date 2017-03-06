package view;

import java.util.Scanner;

public class Bai19 {

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
	public static boolean kiemtraSNT(int n){
		int c=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0){
				c++;
			}
		}
		if(c==2){
			return true;
		}else{
			return false;
		}
	}
	public static int tinhTong(int n){
		if(n==0){
			return 0;
		}else{
			return (n%10)+tinhTong(n/10);
		}
	}
	public static void main(String[] args) {
		System.out.println("Nhập tổng cho trước: s=");
		int s=nhap();
		System.out.println("Các số nguyên tố có 5 chữ số và có tổng các chữ số bằng "+s+" là:");
		for(int i=10000;i<=99999;i++){
			if(kiemtraSNT(i)){
				if(tinhTong(i)==s){
					System.out.print(i+"  ");
				}
			}
		}
	}
}
