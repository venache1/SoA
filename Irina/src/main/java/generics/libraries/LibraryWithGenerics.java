package generics.libraries;

import java.util.ArrayList;

public class LibraryWithGenerics<T> {

    private ArrayList<T> list = new ArrayList<>();

    public void addAnyMedia(T item) {
        list.add(item);
    }

    public ArrayList<T> findAll() {
        return (ArrayList) list.clone();
    }
}