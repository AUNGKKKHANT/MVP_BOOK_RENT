package Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repositories.BookRentRepository;

@Service
public class BookRentService {

    @Autowired
    private BookRentRepository bookRentRepository;

    // Retrieves the top 3 rented books in the country
    public List<TopRentedBookDTO> getTopRentedBooks() {
        List<Object[]> topRentedBooks = bookRentRepository.findTopRentedBooks();
        List<TopRentedBookDTO> result = new ArrayList<>();
        for (Object[] row : topRentedBooks) {
            String name = (String) row[0];
            Long rentedCount = (Long) row[1];
            result.add(new TopRentedBookDTO(name, rentedCount));
        }
        return result;
    }

    // Retrieves the top 3 people that have rented the most amount of books in the specific country
    public List<TopRentingPersonDTO> getTopRentingPeopleByCountry(String countryCode) {
        List<Object[]> topRentingPeople = bookRentRepository.findTopRentingPeopleByCountry(countryCode);
        List<TopRentingPersonDTO> result = new ArrayList<>();
        for (Object[] row : topRentingPeople) {
            String name = (String) row[0];
            Long rentedCount = (Long) row[1];
            result.add(new TopRentingPersonDTO(name, rentedCount));
        }
        return result;
    }
    public List<TopRentedBookDTO> getTopRentedBooksByCountry(String countryCode, int limit) {
        return bookRentRepository.findTopRentedBooksByCountry(countryCode, limit);
    }

}

