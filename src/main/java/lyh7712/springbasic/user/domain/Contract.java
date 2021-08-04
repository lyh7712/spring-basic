package lyh7712.springbasic.user.domain;

public class Contract {

    private Long id;
    private String company;
    private double commission;
    private String commissionType;
    private String getCommissionCutting;

    public Contract() {
    }

    public Contract(Long id, String company, double commission, String commissionType, String getCommissionCutting) {
        this.id = id;
        this.company = company;
        this.commission = commission;
        this.commissionType = commissionType;
        this.getCommissionCutting = getCommissionCutting;
    }

    public Long getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public double getCommission() {
        return commission;
    }

    public String getCommissionType() {
        return commissionType;
    }

    public String getGetCommissionCutting() {
        return getCommissionCutting;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "id=" + id +
                ", company='" + company + '\'' +
                ", commission=" + commission +
                ", commissionType='" + commissionType + '\'' +
                ", getCommissionCutting='" + getCommissionCutting + '\'' +
                '}';
    }
}
