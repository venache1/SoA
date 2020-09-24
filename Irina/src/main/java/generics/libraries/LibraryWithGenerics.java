package generics.libraries;

import generics.libraries.media.Media;
import java.util.ArrayList;
import java.util.List;

public class LibraryWithGenerics<T extends Media> {

    private List<T> list = new ArrayList<>();

    public void addAnyMedia(T item) {
        list.add(item);
    }

    public List<T> getAll() {
        return list;
    }

    public <T> List<T> findByName(String name) {
        List<T> result = new ArrayList<>();
        list.forEach(item -> {
            if (item.getName().equals(name)) {
                result.add((T) item);
            }
        });
        return result;
    }

    public <T> List<T> mediaForRent() {
        List<T> mediaItemsCanBeRented = new ArrayList<>();
        list.forEach(item -> {
            if (item.getRentingDays() > 0) {
                mediaItemsCanBeRented.add((T) item);
            }
        });
        System.out.println("Items that can be rented from the library: ");
        return mediaItemsCanBeRented;
    }
}