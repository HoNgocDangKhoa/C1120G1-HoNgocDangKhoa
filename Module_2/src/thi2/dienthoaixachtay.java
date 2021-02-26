package thi2;

public class dienthoaixachtay extends dienthoai {
    private String quocgia;
    private String trangthai;

    public dienthoaixachtay(String quocgia, String trangthai) {
        this.quocgia = quocgia;
        this.trangthai = trangthai;
    }

    public dienthoaixachtay(int ID, String tenDT, String gia, String soluong, String nhasanxuat, String quocgia, String trangthai) {
        super(ID, tenDT, gia, soluong, nhasanxuat);
        this.quocgia = quocgia;
        this.trangthai = trangthai;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "dienthoaixachtay{" +super.toString()+
                "quocgia='" + quocgia + '\'' +
                ", trangthai='" + trangthai + '\'' +
                '}';
    }
}
