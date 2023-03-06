package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.AuthorBook;
import Entities.AuthorBookId;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, AuthorBookId> {

}
