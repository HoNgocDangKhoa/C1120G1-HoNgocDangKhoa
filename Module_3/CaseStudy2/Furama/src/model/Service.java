package model;

public class Service {
    private String idService;
    private String nameService;
    private int areService;
    private double costService;
    private int maxPeople;
    private Rent_Type rentType;
    private Service_Type serviceType;
    private String standardRoom;
    private String description;
    private double areaPool;
    private  int numberFloors;

    public Service(String idService, String nameService, int areService, double costService, int maxPeople,
                   Rent_Type rentType, Service_Type serviceType, String standardRoom, String description, double areaPool, int numberFloors) {
        this.idService = idService;
        this.nameService = nameService;
        this.areService = areService;
        this.costService = costService;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.serviceType = serviceType;
        this.standardRoom = standardRoom;
        this.description = description;
        this.areaPool = areaPool;
        this.numberFloors = numberFloors;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getAreService() {
        return areService;
    }

    public void setAreService(int areService) {
        this.areService = areService;
    }

    public double getCostService() {
        return costService;
    }

    public void setCostService(double costService) {
        this.costService = costService;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public Rent_Type getRentType() {
        return rentType;
    }

    public void setRentType(Rent_Type rentType) {
        this.rentType = rentType;
    }

    public Service_Type getServiceType() {
        return serviceType;
    }

    public void setServiceType(Service_Type serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }
}
