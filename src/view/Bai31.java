package view;

import java.util.Scanner;

public class Bai31 {

	private static Scanner sc=new Scanner(System.in);;

	public static String nhap() {
		String s = sc.nextLine();
		return s;
	}
	
	public static void giao(String []A, String []B){
		String giao="";
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i].equals(B[j])){
					giao+=A[i]+" ";
				}
			}
		}
		System.out.println("Giao: "+giao);
	}
	public static void hop(String []A, String []B){
		String []C=new String[A.length+B.length];
		int k=0;
		for (int i = 0; i < A.length; i++) {
			C[k]=A[i];
			k++;
		}
		for (int i = 0; i < B.length; i++) {
			C[k]=B[i];
			k++;
		}
		System.out.print("Hợp :"+C[0]+" ");
		for (int i = 1; i < C.length; i++) {
			for (int j = 0; j < i; j++) {
				if(C[j].equals(C[i])){
					break;
				}
				if(j+1==i){
					System.out.print(C[i]+" ");
				}
			}
		}
	}
	public static void hieu(String []A, String []B){
		String hieu="";
		boolean check=true;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i].equals(B[j])){
					check=false;
					break;
				}else{
					check=true;
				}
			}if(check){
				hieu+=A[i]+" ";
			}
		}
		System.out.println("\nHiệu: "+hieu);
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập số phần tử của tập A: ");
		int n=Integer.parseInt(sc.nextLine());
		String []A=new String[n];
		for (int i = 0; i < A.length; i++) {
			System.out.println("Nhập phần tử thứ A["+i+"]");
			A[i]=nhap();
		}
		System.out.println("Nhập số phần tử của tập B: ");
		int m=Integer.parseInt(sc.nextLine());
		String []B=new String[m];
		for (int i = 0; i < B.length; i++) {
			System.out.println("Nhập phần tử thứ B["+i+"]");
			B[i]=nhap();
		}
		giao(A, B);
		hop(A,B);
		hieu(A, B);
	}
}
