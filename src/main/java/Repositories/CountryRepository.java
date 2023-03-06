package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
