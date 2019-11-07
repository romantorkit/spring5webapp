package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by romantorkit on 11/6/19
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
