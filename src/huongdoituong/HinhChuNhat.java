package huongdoituong;

public class HinhChuNhat extends Hinh{

	private int chieuDai;
	private int chieuRong;
	
	
	
	public HinhChuNhat(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int tinhDienTich() {
		return chieuDai*chieuRong;
	}

	@Override
	public int tinhChuVi() {
		return (chieuDai+chieuRong)/2;
	}

}
