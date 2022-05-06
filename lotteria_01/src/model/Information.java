package model;
//Thông tin
public class Information {
    private String id;
    private String showDate;
    private String nameFilm;
    private int amount;

    public Information(String id, String showDate, String nameFilm, int amount) {
        this.id = id;
        this.showDate = showDate;
        this.nameFilm = nameFilm;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public String getNameFilm() {
        return nameFilm;
    }

    public void setNameFilm(String nameFilm) {
        this.nameFilm = nameFilm;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Information{" +
                "id='" + id + '\'' +
                ", showDate='" + showDate + '\'' +
                ", nameFilm='" + nameFilm + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getLine(){
        return id + "," + showDate + "," + nameFilm + "," + amount;
    }
}
