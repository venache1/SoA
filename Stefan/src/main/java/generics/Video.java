package generics;

public class Video extends Media{
    String director;
    String year;

    public Video(String title, String director, String year, boolean available) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.available = available;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
