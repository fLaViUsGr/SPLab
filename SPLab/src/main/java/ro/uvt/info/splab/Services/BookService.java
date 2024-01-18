package ro.uvt.info.splab.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.uvt.info.splab.AllBooksSubject;
import ro.uvt.info.splab.Book;
import ro.uvt.info.splab.Persistence.BooksRepository;

import java.io.IOException;
import java.util.List;

@Service
public class BookService {

    private final BooksRepository booksRepository;
    private final AllBooksSubject allBooksSubject;

    @Autowired
    public BookService(BooksRepository booksRepository, AllBooksSubject allBooksSubject) {
        this.booksRepository = booksRepository;
        this.allBooksSubject = allBooksSubject;
    }

    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    public Book getBookById(Long id) {
        return booksRepository.findById(id).orElse(null);
    }

    public void createBook(Book book) throws IOException {
        book = booksRepository.save(book);
        allBooksSubject.add(book); // Add this line to notify observers
        System.out.println("Book saved [" + book.getId() + "] " + book.getTitle());
    }

    public void updateBook(Long id, Book updatedBook) {
        if (booksRepository.existsById(id)) {
            updatedBook.setId(id);
            booksRepository.save(updatedBook);
        }
    }

    public void deleteBook(Long id) {
        booksRepository.deleteById(id);
    }
}
