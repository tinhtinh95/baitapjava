package view;

import java.util.Scanner;

public class Bai25 {
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

	public static boolean kiemtraSTN(int n) {
		int m = n;
		int p = 0;
		while (n > 0) {
			p = p * 10 + n % 10;
			n /= 10;
		}
		if (p == m) {
			return true;
		}
		return false;
	}

	public static boolean kiemtraChuSoTN(int n){
		int s=0;
		while(n>0){
			s+=n%10;
			n/=10;
		}
		if (kiemtraSTN(s)) {
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		for (int i = 1000000; i <= 9999999; i++) {
			if (kiemtraSNT(i) && kiemtraSTN(i) && kiemtraChuSoTN(i)) {
				System.out.println(i);
			}
		}
	}

}
