package _case_study.models.facility_class;

public abstract class Facility {
    private String id;
    private String serviceName;
    private double areaUse;
    private int rentalPrice;
    private int rentalPeopleMax;
    private String styleRental;
//    private String standardVilla;
//    private double areaPool;
//    private int floor;

    public Facility() {
    }

    public Facility(String id , String serviceName, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.rentalPrice = rentalPrice;
        this.rentalPeopleMax = rentalPeopleMax;
        this.styleRental = styleRental;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentalPeopleMax() {
        return rentalPeopleMax;
    }

    public void setRentalPeopleMax(int rentalPeopleMax) {
        this.rentalPeopleMax = rentalPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + id +
                ", serviceName='" + serviceName + '\'' +
                ", areaUse=" + areaUse +
                ", rentalPrice=" + rentalPrice +
                ", rentalPeopleMax=" + rentalPeopleMax +
                ", styleRental='" + styleRental + '\'' +
                '}';
    }
}
