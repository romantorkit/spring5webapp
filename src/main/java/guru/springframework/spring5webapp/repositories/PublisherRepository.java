package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by romantorkit on 11/6/19
 */
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
