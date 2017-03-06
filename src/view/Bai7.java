package view;

import java.util.Scanner;

public class Bai7 {

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
	public static int fib(int n){
		if(n==1){
			return 1;
		}else if(n==2){
			return 1;
		}else{
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n=nhap();
		System.out.println(fib(n));
	}
	
}
