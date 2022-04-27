package _case_study.models.facility_class;

public class Villa extends Facility {
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String serviceName,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double areaPool, int floor) {
        super(serviceName, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardVilla='" + standardVilla + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor + super.toString() +
                '}';
    }
}
