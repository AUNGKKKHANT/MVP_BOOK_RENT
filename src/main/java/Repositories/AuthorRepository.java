package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
