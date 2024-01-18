package ro.uvt.info.splab;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class AllBooksSubject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void add(Book book) throws IOException {
        // Add book to the repository (your existing logic)
        // Notify all observers
        for (Observer observer : observers) {
            observer.update(book);
        }
    }
}
