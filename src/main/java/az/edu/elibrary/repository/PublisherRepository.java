package az.edu.elibrary.repository;

import az.edu.elibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    List<Publisher> findAllByActive(Integer active);
    Publisher findPublisherByIdAndActive(Long id, Integer active);
}
