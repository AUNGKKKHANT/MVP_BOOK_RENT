package Controller;
import Service.TopRentedBookDTO;
import Service.TopRentingPersonDTO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Service.BookRentService;

@RestController
@RequestMapping("/book-rent")
public class BookRentController {

    @Autowired
    private BookRentService bookRentService;

    @GetMapping("/top-rented-books/{countryCode}")
    public List<TopRentedBookDTO> getTopRentedBooksByCountry(@PathVariable String countryCode) {
        return bookRentService.getTopRentedBooksByCountry(countryCode, 0);
    }

    @GetMapping("/top-renting-people/{countryCode}")
    public List<TopRentingPersonDTO> getTopRentingPeopleByCountry(@PathVariable String countryCode) {
        return bookRentService.getTopRentingPeopleByCountry(countryCode);
    }
}
