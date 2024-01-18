package ro.uvt.info.splab;

import com.fasterxml.jackson.annotation.JsonCreator;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(force = true)
public class Book implements Visitee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToMany
    private List<Author> authors = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "book_id")
    private final List<ConcreteTextElement> contents = new ArrayList<>();

    @JsonCreator
    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(ConcreteTextElement content) {
        contents.add(content);
    }

    @Override
    public void accept(Visitor v) {
        v.visitBook(this);
    }

    public void setId(Long id) {
        this.id = id;
    }
}
