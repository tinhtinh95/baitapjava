package view;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai29 {
	private static Scanner sc;

	public static String nhap() {
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	public static void timXauMax(String strInput) {
		StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
		int i = 1;String lengthStr;
		int viTriMax = 1;
		String strMax=strToken.nextToken();
		while (strToken.hasMoreTokens()) {
			lengthStr = strToken.nextToken();
			i++;
			if (strMax.length() < lengthStr.length()) {
				strMax = lengthStr;
				viTriMax = i;
			}
		}
		System.out.println("Độ dài xâu lớn nhất là : " + strMax + " ở vị trí " + viTriMax);
	}

	public static void main(String[] args) {
		System.out.println("Nhập vào chuỗi: ");
		String s = nhap();
		timXauMax(s);
	}
}
