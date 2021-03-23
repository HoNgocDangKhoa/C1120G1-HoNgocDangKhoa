package model;

import java.sql.Date;

public class Employee {
    private int idEmp;
    private String nameEmp;
    private Date birthDayEmp;
    private String idCardEmp;
    private double salaryEmp;
    private String phoneEmp;
    private String emailEmp;
    private String addressEmp;
   private Position position;
   private Education_Degree education;
   private Division division;
   private User user;

    public Employee(int idEmp, String nameEmp, Date birthDayEmp, String idCardEmp, double salaryEmp, String phoneEmp, String emailEmp, String addressEmp, Position position, Education_Degree education, Division division, User user) {
        this.idEmp = idEmp;
        this.nameEmp = nameEmp;
        this.birthDayEmp = birthDayEmp;
        this.idCardEmp = idCardEmp;
        this.salaryEmp = salaryEmp;
        this.phoneEmp = phoneEmp;
        this.emailEmp = emailEmp;
        this.addressEmp = addressEmp;
        this.position = position;
        this.education = education;
        this.division = division;
        this.user = user;
    }

    public Employee() {
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
    }

    public Date getBirthDayEmp() {
        return birthDayEmp;
    }

    public void setBirthDayEmp(Date birthDayEmp) {
        this.birthDayEmp = birthDayEmp;
    }

    public String getIdCardEmp() {
        return idCardEmp;
    }

    public void setIdCardEmp(String idCardEmp) {
        this.idCardEmp = idCardEmp;
    }

    public double getSalaryEmp() {
        return salaryEmp;
    }

    public void setSalaryEmp(double salaryEmp) {
        this.salaryEmp = salaryEmp;
    }

    public String getPhoneEmp() {
        return phoneEmp;
    }

    public void setPhoneEmp(String phoneEmp) {
        this.phoneEmp = phoneEmp;
    }

    public String getEmailEmp() {
        return emailEmp;
    }

    public void setEmailEmp(String emailEmp) {
        this.emailEmp = emailEmp;
    }

    public String getAddressEmp() {
        return addressEmp;
    }

    public void setAddressEmp(String addressEmp) {
        this.addressEmp = addressEmp;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education_Degree getEducation() {
        return education;
    }

    public void setEducation(Education_Degree education) {
        this.education = education;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
