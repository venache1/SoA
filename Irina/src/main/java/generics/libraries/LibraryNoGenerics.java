package generics.libraries;

import generics.libraries.media.Media;
import java.util.ArrayList;
import java.util.List;

public class LibraryNoGenerics {

    private List<Media> list = new ArrayList<>();

    public void addAnyMedia(Media mediaItem) {
        list.add(mediaItem);
    }

    public List<Media> getAll() {
        return list;
    }

    public List<Media> findByName(String name) {
        List<Media> mediaByName = new ArrayList<>();
        for (Media element : list) {
            if (element.getName().equals(name)) {
                mediaByName.add(element);
            }
        }
        return mediaByName;
    }

    public List<Media> mediaForRent(){
        List<Media> mediaItemsCanBeRented = new ArrayList<>();
        for(Media element : list) {
            if(element.getRentingDays()>0)
                mediaItemsCanBeRented.add(element);
        }
        System.out.println("Items that can be rented from the library: ");
        return mediaItemsCanBeRented;
    }
}