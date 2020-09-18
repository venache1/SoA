package generics.libraries;

import generics.libraries.media.Book;
import generics.libraries.media.Media;
import generics.libraries.media.Newspaper;
import generics.libraries.media.Video;
import java.util.ArrayList;
import java.util.List;

public class AppStart {
    public static void main(String[] args) {

        LibraryNoGenerics lib = new LibraryNoGenerics();
        LibraryWithGenerics libGen = new LibraryWithGenerics();

        Book book1 = new Book("Charming", 1235, "Allie Beurn");
        book1.setRentingDays(30);

        Video video1 = new Video("Funny frog", 82403, "A.J.Cole");
        video1.setRentingDays(14);

        Newspaper newspaper1 = new Newspaper("NY Times", 4043);
        newspaper1.setRentingDays(0);

        Newspaper newspaper2 = new Newspaper("The Time", 20554);
        newspaper2.setRentingDays(1);

        lib.addAnyMedia(book1);
        lib.addAnyMedia(video1);
        lib.addAnyMedia(newspaper1);
        printSearchItems(lib.findByName("NY Times"));
        printMyList(lib.getAll());
        printMyList(lib.mediaForRent());

        libGen.addAnyMedia(book1);
        libGen.addAnyMedia(video1);
        libGen.addAnyMedia(newspaper2);
        printSearchItems((ArrayList<Media>) libGen.findByName("The Time"));
        printMyList((ArrayList<Media>) libGen.getAll());
        printMyList((ArrayList<Media>) libGen.mediaForRent());
    }

    public static void printSearchItems(List<Media> myList) {
        for ( Media i : myList ) {
            System.out.println("The searching engine found the following media items: " + i.toString());
        }
    }

    public static void printMyList(List<Media> myList) {
        for ( Media i : myList ) {
            System.out.println(i.toString());
        }
    }
}