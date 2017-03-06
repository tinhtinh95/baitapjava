package view;

import java.util.Arrays;
import java.util.Scanner;

public class Bai27 {

	public static int nhap() {
		Scanner input = new Scanner(System.in);
		boolean check = true;
		int n = 0;
		do {
			try {
				n = Integer.parseInt(input.nextLine());
				if(n<=0||n>=100){
					throw new Exception("Nhập số lớn hơn 0 và nhỏ hơn 100");
				}
				check = false;
			} catch (NumberFormatException e) {
				System.err.println("Bạn phải nhập số!!!");
				System.out.println("Mời nhập lại: ");
			}catch(Exception e){
				System.err.println(e.getMessage());
			}
		} while (check);

		return n;
	}

	public static void timMax(int a[]){
		if(a.length<=1){
			System.out.println("Phần tử lớn thứ nhất là "+a[0]+"\nkhông có phần tử lớn thứ 2");
		}else{
			int max1=0,max2=0;
			int index1=0,index2=0;
			for (int i = 0; i < a.length; i++) {
//				if (max2 < =a[i]){ max2 = a[i];}
				if(a[i]>max1){
					max1=a[i];
					index1=i;
				}
			}
			for (int i = 0; i < a.length; i++) {
				if(max2<=a[i] && i!=index1){
					max2=a[i];
					index2=i;
				}
			}
			if(max2<max1){
				System.out.println("Max 1: "+max1+" là phần tử a["+index1+"]");
				System.out.println("Max 2: "+max2+" là phần tử a["+index2+"]");
			}else{
				System.out.println("Max 1: "+max1+" là phần tử a["+index1+"]"+"\nKhông có phần tử lớn thứ 2");
			}
		}
	}
	public static void sapXep(int []a,int bd,int kt){
		Arrays.sort(a);
		System.out.print("Mảng sau khi được sắp xếp: ");
		for (int i =kt-1;i>=bd;i--) {
			System.out.print(a[i]+" ");
		}
	}
	public static void themPT(int []a,int n, int x){
		a[0]=x;
		Arrays.sort(a);
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập n phần tử: ");
		int n = nhap();
		int[] a = new int[n+1];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử a["+i+"]: ");
			a[i]=nhap();
		}
		timMax(a); 
		sapXep(a,1,n+1);
		System.out.print("\nThêm phần tử cần chèn: ");
		int x = nhap();
		themPT(a, n+1, x);
		sapXep(a,0,n+1);
	}

}
