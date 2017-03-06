package huongdoituong;

public class HinhTron extends Hinh{

	private int banKinh;
	
	
	
	public HinhTron(int banKinh) {
		super();
		this.banKinh = banKinh;
	}

	public HinhTron() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int tinhDienTich() {
		return (int) (banKinh*banKinh*3.14);
	}

	@Override
	public int tinhChuVi() {
	     return (int) (2*banKinh*3.14);
	}

}
