package generics.libraries;

import java.util.ArrayList;

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

        lib.addAnyMedia(book1);
        lib.addAnyMedia(video1);
        lib.addAnyMedia(newspaper1);

        libGen.addAnyMedia(book1);
        libGen.addAnyMedia(video1);
        libGen.addAnyMedia(newspaper1);
        libGen.addAnyMedia(newspaper2);

        printSearchItems(lib.findByName("NY Times"));
        printMyList(lib.findAll());
        printMyList(lib.mediaForRent());

        printMyList(libGen.findAll());
    }

    public static void printSearchItems(ArrayList<Media> myList) {
        for (Media i : myList) {
            System.out.println("The searching engine found the following media items: " + i.toString());
        }
    }

    public static void printMyList(ArrayList<Media> myList) {
        for (Media i : myList) {
            System.out.println(i.toString());
        }
    }
}