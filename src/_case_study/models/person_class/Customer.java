package _case_study.models.person_class;

public class Customer extends Person {
    private String typeCustomer;
    private String idCar;

    public Customer() {
    }

    public Customer(int id, String name, String age, String address, String gender, String typeCustomer, String idCar) {
        super(id, name, age, address, gender);
        this.typeCustomer = typeCustomer;
        this.idCar = idCar;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getIdCar() {
        return idCar;
    }

    public void setIdCar(String idCar) {
        this.idCar = idCar;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                ", idCar='" + idCar + '\'' +
                super.toString() +
                '}';
    }
}
