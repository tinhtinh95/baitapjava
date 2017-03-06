package view;

import java.util.Scanner;

public class Bai2 {

	public static void chuyenDoi(int n, int so) {
		if (n >= so)
			chuyenDoi(n / so, so);
		if (n % so > 9)
			System.out.print((char) (n % so + 55));
		else
			System.out.print((n % so));
	}

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

	public static void main(String[] args) {
		System.out.println("Nhập số cần đổi: ");
		int a = nhap();
		System.out.println("Nhập cơ số cần đổi");
		int b=0;
		boolean check=true;
		do{
		    try{
		    	b=nhap();
		    	if(b<=1||b>36){
		    		throw new Exception("Bạn phải nhập số trong khoảng {1,36]");
		    	}else{
					check = false;
				}
		    }catch(Exception e){
		    	System.err.println(e.getMessage());
		    }
		}while(check);
		
		System.out.println("Số " + a + " đổi sang " + b + " thành: ");
		chuyenDoi(a, b);
	}
}