package view;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bai28 {
	private static Scanner sc;

	public static String nhap() {
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	public static String chuyenInHoa(String str) {
		String s, strOutput;
		s = str.substring(0, 1);
		strOutput = str.replaceFirst(s, s.toUpperCase());
		return (strOutput);
	}

	public static String chuanHoa(String strInput) {
		String strOutput = "";
		StringTokenizer strToken = new StringTokenizer(strInput, " ");
		strOutput += "" + chuyenInHoa(strToken.nextToken());
		while (strToken.hasMoreTokens()) {
			strOutput += " " + chuyenInHoa(strToken.nextToken());
		}
		return (strOutput);
	}

	public static void main(String[] args) {
		System.out.println("Nhập vào chuỗi: ");
		String s = nhap();
		System.out.println(chuanHoa(s));
	}
}
