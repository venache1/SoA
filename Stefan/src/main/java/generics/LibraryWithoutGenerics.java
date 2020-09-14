package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryWithoutGenerics extends Media {

    private List<Media> list = new ArrayList<>();

    public LibraryWithoutGenerics() {
        super();
    }

    public  void printAllMedia() {
        for ( Media m : list ) {
            System.out.println(m.getTitle() + " available: " + m.available);
        }
    }

    public  List<Media> addToListOfMedia(Book book) {
        list.add(book);
        return list;
    }

    public  List<Media> addToListOfMedia(Video video) {
        list.add(video);
        return list;
    }

    public  List<Media> addToListOfMedia(Newspaper newspaper) {
        list.add(newspaper);
        return list;
    }

    public List<Media> findMediaByName(String name) {
        List<Media> result = new ArrayList<>();
        list.forEach(item -> {
            if (item.getTitle().equals(name)) {
                result.add(item);
            }
        });
        return result;
    }


    public static void main(String[] args) {
        LibraryWithoutGenerics lib = new LibraryWithoutGenerics();

        Book book1 = new Book("Morometii", "Marin Preda", "romanian", true);
        Book book2 = new Book("Tom Sawyer", "Mark Twain", "english", true);
        Book book3 = new Book("1q84", "Haruki Murakami", "japanese", false);
        lib.addToListOfMedia(book1);
        lib.addToListOfMedia(book2);
        lib.addToListOfMedia(book3);
        Newspaper n1 = new Newspaper("Timpul", "romanian", true);
        Newspaper n2 = new Newspaper("Time", "english", false);
        Newspaper n3 = new Newspaper("Figaro", "italian", false);
        lib.addToListOfMedia(n1);
        lib.addToListOfMedia(n2);
        lib.addToListOfMedia(n3);
        Video video1 = new Video("Fight Club", "David Fincher", "1999", false);
        Video video2 = new Video("Matrix", "the Wachowskis", "1999", true);
        Video video3 = new Video("Titanic", "David Cameron", "1997", true);
        Video video4 = new Video("Avatar", "David Cameron", "2009", true);
        Video video5 = new Video("Aliens", "David Cameron", "1986", false);
        Video video6 = new Video("Terminator 2", "David Cameron", "1991", true);
        lib.addToListOfMedia(video1);
        lib.addToListOfMedia(video2);
        lib.addToListOfMedia(video3);
        lib.addToListOfMedia(video4);
        lib.addToListOfMedia(video5);
        lib.addToListOfMedia(video6);
        lib.printAllMedia();
        System.out.println(Arrays.toString(lib.findMediaByName("Timpul").toArray()));
    }
}
