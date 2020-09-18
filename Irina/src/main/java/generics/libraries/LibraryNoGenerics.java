package generics.libraries;

import java.util.ArrayList;

public class LibraryNoGenerics {

    private ArrayList<Media> list = new ArrayList<>();

    public ArrayList<Media> mediaForRent() {
        ArrayList<Media> mediaItemsCanBeRented = new ArrayList<>();
        for (Media element : list) {
            if (element.getRentingDays() > 0)
                mediaItemsCanBeRented.add(element);
        }
        System.out.println("Items that can be rented from the library: ");
        return mediaItemsCanBeRented;
    }

    public void addAnyMedia(Media mediaItem) {
        list.add(mediaItem);
    }

    public ArrayList<Media> findByName(String name) {
        ArrayList<Media> mediaByName = new ArrayList<>();
        for (Media element : list) {
            if (element.getName().equals(name)) {
                mediaByName.add(element);
            }
        }
        return mediaByName;
    }

    public ArrayList<Media> findAll() {
        return (ArrayList) list.clone();
    }
}