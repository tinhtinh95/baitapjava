package view;

import java.util.Scanner;

public class Bai20 {

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
	public static boolean kiemtraFib(int n){
		int fib1=1,fib2=1,fib=1;
		while(fib1+fib2<=n){
			fib = fib1 + fib2; 
			fib2 = fib1; 
			fib1 = fib; 
		}if(fib==n){
			return true;
		}else{ 
			return false;
		}
	}

	public static boolean kiemtraSNT(int n) {
		int c = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		int n = nhap();
		System.out.println("Các số fibonacci nhỏ hơn " + n + " và là số nguyên tố là: ");
		for (int i = 2; i <= n; i++) {
			if(kiemtraFib(i)){
				if(kiemtraSNT(i)){
					System.out.print(i+"   ");
				}
			}
			
		}
	}
}
