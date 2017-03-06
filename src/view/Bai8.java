package view;

public class Bai8 {

	public static boolean kiemtraSo(int n) {
		int p=0;int m=n;
		while(n!=0){
			p=p*10+n%10;
			n/=10;
		}
        if(m==p) return true;
        else return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Nhập n: ");
		for (int i = 100000; i <=999999; i++) {
			if(kiemtraSo(i)){
				System.out.println(i+" ");
			}
		}
	}
	
}
