package thi2;

public class dienthoaichinhhang extends dienthoai {
    private String thoigian;
    private String phamvi;

    public dienthoaichinhhang(String thoigian, String phamvi) {
        this.thoigian = thoigian;
        this.phamvi = phamvi;
    }

    public dienthoaichinhhang(int ID, String tenDT, String gia, String soluong, String nhasanxuat, String thoigian, String phamvi) {
        super(ID, tenDT, gia, soluong, nhasanxuat);
        this.thoigian = thoigian;
        this.phamvi = phamvi;
    }

    public void setThoigian(String thoigian) {
        this.thoigian = thoigian;
    }

    public String getPhamvi() {
        return phamvi;
    }

    public void setPhamvi(String phamvi) {
        this.phamvi = phamvi;
    }

    @Override
    public String toString() {
        return "dienthoaichinhhang{" +super.toString()+
                "thoigian='" + thoigian + '\'' +
                ", phamvi='" + phamvi + '\'' +
                '}';
    }
}
