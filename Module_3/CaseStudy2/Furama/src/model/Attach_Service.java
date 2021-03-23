package model;

public class Attach_Service {
    private int idAttService;
    private String nameAttService;
    private double costAttService;
    private int unitAttService;
    private String statusAttService;

    public int getIdAttService() {
        return idAttService;
    }

    public void setIdAttService(int idAttService) {
        this.idAttService = idAttService;
    }

    public String getNameAttService() {
        return nameAttService;
    }

    public void setNameAttService(String nameAttService) {
        this.nameAttService = nameAttService;
    }

    public double getCostAttService() {
        return costAttService;
    }

    public void setCostAttService(double costAttService) {
        this.costAttService = costAttService;
    }

    public int getUnitAttService() {
        return unitAttService;
    }

    public void setUnitAttService(int unitAttService) {
        this.unitAttService = unitAttService;
    }

    public String getStatusAttService() {
        return statusAttService;
    }

    public void setStatusAttService(String statusAttService) {
        this.statusAttService = statusAttService;
    }

    public Attach_Service(int idAttService, String nameAttService, double costAttService, int unitAttService, String statusAttService) {
        this.idAttService = idAttService;
        this.nameAttService = nameAttService;
        this.costAttService = costAttService;
        this.unitAttService = unitAttService;
        this.statusAttService = statusAttService;
    }

    public Attach_Service() {
    }

}
