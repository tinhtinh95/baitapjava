package huongdoituong;

import java.util.ArrayList;

public class Test {
public static void main(String[] args) {
	ArrayList<Hinh> alHinh=new ArrayList<>();
	Hinh cn=new HinhChuNhat(6,5);
	Hinh hv=new HinhVuong(4);
	Hinh tron=new HinhTron(5);
//	alHinh.add(cn);
	alHinh.add(tron);
//	alHinh.add(hv);
	for (Hinh hinh : alHinh) {
//		System.out.println();
		if(hinh==cn){
			System.out.println(hinh.tinhChuVi()+" "+hinh.tinhDienTich());
		}else if(hinh==tron){
			System.out.println(hinh.tinhChuVi()+" "+hinh.tinhDienTich());
		}else{
			System.out.println("Default");
		}
	}
}
}
