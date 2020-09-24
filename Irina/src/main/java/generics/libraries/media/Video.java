package generics.libraries.media;

public class Video extends Media {

    private String director;

    public Video(String name, int id, String director) {
        super(name, id);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + getName() + '\'' +
                ", director='" + director + '\'' +
                ", id=" + getId() +
                '}';
    }
}