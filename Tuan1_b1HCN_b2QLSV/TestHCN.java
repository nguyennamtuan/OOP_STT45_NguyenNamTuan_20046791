package Tuan1_b1HCN_b2QLSV;

public class TestHCN {
	public static HinhChuNhat nhapCung() {
		HinhChuNhat hcn1 = new HinhChuNhat();
		hcn1.setChieuDai(5);
		hcn1.setChieuRong(3);
		HinhChuNhat hcn2 = new HinhChuNhat();
		hcn2.setChieuDai(5);
		hcn2.setChieuRong(4);
		return hcn1;

	}
	public static void main(String[] args) {
		nhapCung();
		
		System.out.println("Dien tich hinh chu nhat la: " + nhapCung());
	}
}
