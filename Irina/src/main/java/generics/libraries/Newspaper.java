package generics.libraries;

import java.time.LocalDateTime;

public class Newspaper extends Media {

    private LocalDateTime date = LocalDateTime.now();

    public Newspaper(String name, int id) {
        super(name, id);
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + getName() + '\'' +
                ", date=" + date +
                ", id=" + getId() +
                '}';
    }
}