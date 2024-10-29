package Tuan5_bai3GiaoDich_bai8HangHoa;

public class HangDienMay extends HangHoa {
	private int thoiGianBaoHanh;
    private double congSuat;
    
    
    
    public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}

	public double getCongSuat() {
		return congSuat;
	}

	public void setCongSuat(double congSuat) {
		this.congSuat = congSuat;
	}

	

	public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
		super(maHang, tenHang, soLuongTon, donGia, "Điện máy");
		 if (thoiGianBaoHanh < 0) {
	            throw new IllegalArgumentException("Thời gian bảo hành phải >= 0.");
	        }
	        if (congSuat <= 0) {
	            throw new IllegalArgumentException("Công suất phải > 0.");
	        }
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

	

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, String loaiHang) {
		super(maHang, tenHang, soLuongTon, donGia, "Điện máy");
	}

	@Override
    public double tinhVAT() {
        return getDonGia() * 0.10;
    }

    @Override
    public String danhGiaMucDoBanBuon() {
        if (getSoLuongTon() < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

    @Override
    public String toString() {
    	 return String.format("%-10s|%-15s|%-10d|%-10.2f|%-15d|%-10.2f|%-10s",
    	            maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat, "Điện máy");
    }


    

}
