package thi2;

public abstract class dienthoai {
    private int ID;
    private String tenDT;
    private String gia;
    private String soluong;
    private String nhasanxuat;

    public dienthoai() {
    }

    public dienthoai(int ID, String tenDT, String gia, String soluong, String nhasanxuat) {
        this.ID = ID;
        this.tenDT = tenDT;
        this.gia = gia;
        this.soluong = soluong;
        this.nhasanxuat = nhasanxuat;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    @Override
    public String toString() {
        return "dienthoai{" +
                "ID=" + ID +
                ", tenDT='" + tenDT + '\'' +
                ", gia='" + gia + '\'' +
                ", soluong='" + soluong + '\'' +
                ", nhasanxuat='" + nhasanxuat + '\'' +
                '}';
    }
}

