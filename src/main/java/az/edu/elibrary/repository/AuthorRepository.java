package az.edu.elibrary.repository;

import az.edu.elibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findAllByActive(Integer active);
    Author findAuthorByIdAndActive(Long id, Integer active);
}
