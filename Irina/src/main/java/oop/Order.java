package oop;

import java.time.LocalDateTime;
import java.util.List;

public interface Order {

    int sum();

    int count();

    LocalDateTime generateDate();

    List<Item> filterItemsByType(Type type);
}