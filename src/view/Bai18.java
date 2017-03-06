package view;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String str = input.nextLine();
		StringTokenizer strToken = new StringTokenizer(str, " ");
		int d=0;
		while(strToken.hasMoreTokens()){
			d++;
			strToken.nextToken();
		}
		System.out.println("Số các từ trong chuỗi là: " + d);
	}
}
