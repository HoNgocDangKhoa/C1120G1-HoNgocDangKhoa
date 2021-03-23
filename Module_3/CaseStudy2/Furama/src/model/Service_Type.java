package model;

public class Service_Type {
    private  int idServiceType;
    private String nameServiceType;

    public Service_Type(int idServiceType, String nameServiceType) {
        this.idServiceType = idServiceType;
        this.nameServiceType = nameServiceType;
    }

    public Service_Type() {
    }

    public int getIdServiceType() {
        return idServiceType;
    }

    public void setIdServiceType(int idServiceType) {
        this.idServiceType = idServiceType;
    }

    public String getNameServiceType() {
        return nameServiceType;
    }

    public void setNameServiceType(String nameServiceType) {
        this.nameServiceType = nameServiceType;
    }
}
