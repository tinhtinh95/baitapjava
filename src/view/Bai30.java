package view;

import java.util.Scanner;

public class Bai30 {

	private static Scanner sc;

	public static String nhap() {
		sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}

	public static String doiViTri(String strInput){
		String ho="",dem="",ten="";
		String[]s=strInput.split(" ");
		ho=s[0]+" ";
		ten=s[s.length-1]+" ";
		for (int i = 1; i < s.length-1; i++) {
			dem+=s[i]+" ";
		}
		String strOutput=ten+ho+dem;
		  return(strOutput);
		 }

	public static void main(String[] args) {
		System.out.println("Nhập vào chuỗi: ");
		String s = nhap();
		System.out.println(doiViTri(s));
	}
}
