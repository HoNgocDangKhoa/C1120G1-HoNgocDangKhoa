package model;

public class Education_Degree {
    private int idEducation;
    private String nameEducation;

    public Education_Degree(int idEducation, String nameEducation) {
        this.idEducation = idEducation;
        this.nameEducation = nameEducation;
    }

    public Education_Degree() {
    }

    public int getIdEducation() {
        return idEducation;
    }

    public void setIdEducation(int idEducation) {
        this.idEducation = idEducation;
    }

    public String getNameEducation() {
        return nameEducation;
    }

    public void setNameEducation(String nameEducation) {
        this.nameEducation = nameEducation;
    }
}
