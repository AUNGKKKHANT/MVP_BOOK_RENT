package Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Entities.BookRent;
import Service.TopRentedBookDTO;

public interface BookRentRepository extends JpaRepository<BookRent, Long> {

    // Retrieves the top 3 rented books in the country
    @Query("SELECT b.name, COUNT(br.book) AS rented_count " +
           "FROM BookRent br " +
           "JOIN br.book b " +
           "JOIN b.country c " +
           "WHERE c.code IN ('SG', 'MY', 'US') " +
           "GROUP BY b " +
           "ORDER BY rented_count DESC " +
           "LIMIT 3")
    List<Object[]> findTopRentedBooks();

    // Retrieves the top 3 people that have rented the most amount of books in the specific country
    @Query("SELECT p.name, COUNT(br.book) AS rented_count " +
           "FROM BookRent br " +
           "JOIN br.person p " +
           "JOIN p.country c " +
           "WHERE c.code = :countryCode " +
           "GROUP BY p " +
           "ORDER BY rented_count DESC " +
           "LIMIT 3")
    List<Object[]> findTopRentingPeopleByCountry(@Param("countryCode") String countryCode);

	List<TopRentedBookDTO> findTopRentedBooksByCountry(String countryCode, int limit);
}