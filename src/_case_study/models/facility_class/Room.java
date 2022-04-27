package _case_study.models.facility_class;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String serviceName, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(serviceName, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' + super.toString() +
                '}';
    }
}
