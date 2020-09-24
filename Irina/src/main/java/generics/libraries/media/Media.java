package generics.libraries.media;

public class Media {
    private String name;
    private int id;
    private int rentingDays;

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
        return rentingDays;
    }

    public void setRentingDays(int rentingDays) {
        this.rentingDays = rentingDays;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}