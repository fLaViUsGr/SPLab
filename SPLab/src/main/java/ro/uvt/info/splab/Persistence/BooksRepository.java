package ro.uvt.info.splab.Persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.info.splab.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}
