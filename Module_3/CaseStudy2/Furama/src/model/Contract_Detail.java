package model;

public class Contract_Detail {
    private int idDetail;
    private Contract contract;
    private Attach_Service attachService;
    private int quantity;

    public Contract_Detail(int idDetail, Contract contract, Attach_Service attachService, int quantity) {
        this.idDetail = idDetail;
        this.contract = contract;
        this.attachService = attachService;
        this.quantity = quantity;
    }

    public Contract_Detail() {
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Attach_Service getAttachService() {
        return attachService;
    }

    public void setAttachService(Attach_Service attachService) {
        this.attachService = attachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
