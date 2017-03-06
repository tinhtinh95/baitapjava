package huongdoituong;

public class HinhVuong extends Hinh{

	private int canh;
	
	
	public int getCanh() {
		return canh;
	}

	

	public HinhVuong() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setCanh(int canh) {
		this.canh = canh;
	}

	public HinhVuong(int canh) {
		super();
		this.canh = canh;
	}

	@Override
	public int tinhDienTich() {
		return canh*canh;
		
	}

	@Override
	public int tinhChuVi() {
		return 4*canh;
		
	}

}
