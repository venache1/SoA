package generics.libraries;

public class Media {
    private String name;
    private int id;
    private int RentingDays;

    public Media(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getRentingDays() {
        return RentingDays;
    }

    public void setRentingDays(int rentingDays) {
        RentingDays = rentingDays;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}