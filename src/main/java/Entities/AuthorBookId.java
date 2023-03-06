package Entities;
import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class AuthorBookId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "book_id")
    private Long bookId;

    public AuthorBookId() {
    }

    public AuthorBookId(Long authorId, Long bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

	@Override
	public int hashCode() {
		return Objects.hash(authorId, bookId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthorBookId other = (AuthorBookId) obj;
		return Objects.equals(authorId, other.authorId) && Objects.equals(bookId, other.bookId);
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    // equals and hashCode methods

    // getters and setters
}

