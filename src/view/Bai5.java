package view;

import java.util.Scanner;

public class Bai5 {

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
	public static void lietkeSNT(int n){
		System.out.println("Các số nguyên tố nhỏ hơn "+n+" là: ");
		for(int i=2;i<=n;i++){
			if(kiemtraSNT(i)){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n=nhap();
		lietkeSNT(n);
	}
	
}
