package Service;

public class TopRentingPersonDTO {
    private String name;
    private Long totalBooksRented;

    public TopRentingPersonDTO(String name, Long totalBooksRented) {
        this.name = name;
        this.totalBooksRented = totalBooksRented;
    }

    public String getName() {
        return name;
    }

    public Long getTotalBooksRented() {
        return totalBooksRented;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalBooksRented(Long totalBooksRented) {
        this.totalBooksRented = totalBooksRented;
    }
}


