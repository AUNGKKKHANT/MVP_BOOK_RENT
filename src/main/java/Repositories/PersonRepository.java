package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Person;

public interface PersonRepository extends JpaRepository<Person , Long> {

}
