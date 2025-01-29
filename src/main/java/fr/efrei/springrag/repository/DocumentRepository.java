package fr.efrei.springrag.repository;

import fr.efrei.springrag.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    Document save(Document document);

    Optional<Document> findById(Long id);

    void deleteById(Long id);

    List<Document> id(Long id);
}
