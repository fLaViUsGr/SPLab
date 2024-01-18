package ro.uvt.info.splab;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public class ConcreteTextElement implements TextElement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Implement methods from TextElement interface

    @Override
    public List<TextElement> add(List<TextElement> l, TextElement element) {
        // Implementation
        return null;
    }

    @Override
    public TextElement get(List<TextElement> l, int index) {
        // Implementation
        return null;
    }

    @Override
    public void remove(List<TextElement> l, TextElement element) {
        // Implementation
    }
}
