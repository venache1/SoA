package com.endava.claudia.task.four;
import java.time.LocalDateTime;

public interface Order {

    double sum();

    int count();

    LocalDateTime date();

    String toString();

    boolean containsType(Type type);

    long getId();
}