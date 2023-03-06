package Entities;

import java.time.ZonedDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "author_books")
public class AuthorBook {

    @EmbeddedId
    private AuthorBookId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("authorId")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bookId")
    private Book book;

    @Column(name = "created_at", nullable = false)
    private ZonedDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private ZonedDateTime updatedAt;
    
    public AuthorBook(AuthorBookId id, Author author, Book book, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
		super();
		this.id = id;
		this.author = author;
		this.book = book;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public AuthorBookId getId() {
		return id;
	}

	public void setId(AuthorBookId id) {
		this.id = id;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public ZonedDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(ZonedDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public ZonedDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(ZonedDateTime date) {
		this.updatedAt = date;
	}

	public void setUpdatedAt(Date date) {
		// TODO Auto-generated method stub
		
	}

    // constructors, getters, setters, and other methods
}
