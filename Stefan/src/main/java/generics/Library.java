package generics;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Media> {
    public  List<T> list = new ArrayList<>();

    public void addMedia(T item) {
        list.add(item);
    }

    public List<T> getList() {
        return list;
    }

    public <T extends Media> List<T> findByName(String name) {
        List<T> result = new ArrayList<>();
        list.forEach(item -> {
            if (item.getTitle().equals(name)) {
                result.add((T) item);
            }
        });
        return result;
    }

    public    <T extends Media> List<T> findMediaForRent() {
        List<T> itemsForRent = new ArrayList<>();
        list.forEach(item -> {
            if (item.available) {
                itemsForRent.add((T) item);
            }
        });
        return itemsForRent;
    }


    public static void main(String[] args) {
Library<Media>  libr = new Library<>();
        Book book1 = new Book("Morometii", "Marin Preda", "romanian", true);
        Book book2 = new Book("Tom Sawyer", "Mark Twain", "english", true);
        Book book3 = new Book("1q84", "Haruki Murakami", "japanese", false);
libr.addMedia(book1);
libr.addMedia(book2);
libr.addMedia(book3);
        Video video1 = new Video("Fight Club", "David Fincher", "1999", false);
        Video video2 = new Video("Matrix", "the Wachowskis", "1999", true);
        Video video3 = new Video("Titanic", "David Cameron", "1997", true);
        Video video4 = new Video("Avatar", "David Cameron", "2009", true);
        Video video5 = new Video("Aliens", "David Cameron", "1986", false);
        Video video6 = new Video("Terminator 2", "David Cameron", "1991", true);
        libr.addMedia(video1);
        libr.addMedia(video2);
        libr.addMedia(video3);
        libr.addMedia(video4);
        libr.addMedia(video5);
        libr.addMedia(video6);
        System.out.println(libr.findMediaForRent());
    }
}