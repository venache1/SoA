package generics.libraries.media;

public class Book extends Media {

    private String author;

    public Book(String name, int id, String author) {
        super(name, id);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", author='" + author + '\'' +
                ", id=" + getId() +
                '}';
    }
}