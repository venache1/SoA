package generics;

class Book extends Media{
    String language;
    String author;


    public Book(String title,String author, String language, boolean available) {
        super.title = title;
        this.author = author;
        this.language = language;
        super.available = available;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}