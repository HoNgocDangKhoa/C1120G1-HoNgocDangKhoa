package model;

public class Rent_Type {
    private int idRentType;
    private String nameRentType;
    private double costRentType;

    public Rent_Type(int idRentType, String nameRentType, Double costRentType) {
        this.idRentType = idRentType;
        this.nameRentType = nameRentType;
        this.costRentType = costRentType;
    }

    public Rent_Type() {

    }

    public int getIdRentType() {
        return idRentType;
    }

    public void setIdRentType(int idRentType) {
        this.idRentType = idRentType;
    }

    public String getNameRentType() {
        return nameRentType;
    }

    public void setNameRentType(String nameRentType) {
        this.nameRentType = nameRentType;
    }

    public Double getCostRentType() {
        return costRentType;
    }

    public void setCostRentType(Double costRentType) {
        this.costRentType = costRentType;
    }
}
