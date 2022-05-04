package _case_study.models.facility_class;

public class House extends Facility {
   private String standardHouse;
   private int floorHouse;

    public House() {
    }

    public House(String id, String serviceName, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHouse, int floorHouse) {
        super(id,serviceName, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardHouse;
        this.floorHouse = floorHouse;
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloorHouse() {
        return floorHouse;
    }

    public void setFloorHouse(int floorHouse) {
        this.floorHouse = floorHouse;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "id=" + this.getId() +
                ", serviceName='" + this.getServiceName() + '\'' +
                ", areaUse=" + this.getAreaUse() +
                ", rentalPrice=" + this.getRentalPrice() +
                ", rentalPeopleMax=" + this.getRentalPeopleMax() +
                ", styleRental=" + this.getStyleRental() + '\'' +
                ", standard=" + standardHouse +
                ", floorHouse=" + floorHouse +
                '}';
    }
}
