package Service;

public class TopRentedBookDTO {
    private String title;
    private Long totalRented;

    public TopRentedBookDTO(String title, Long totalRented) {
        this.title = title;
        this.totalRented = totalRented;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTotalRented() {
        return totalRented;
    }

    public void setTotalRented(Long totalRented) {
        this.totalRented = totalRented;
    }
}

