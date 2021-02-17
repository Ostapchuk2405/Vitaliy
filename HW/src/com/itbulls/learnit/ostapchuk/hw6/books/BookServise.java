package com.itbulls.learnit.ostapchuk.hw6.books;

import java.util.Arrays;
import java.util.Objects;

public class BookServise {

	public Book[] filterBooksByAuthor(Author author, Book[] books) {
		if (author == null || books == null) {
			return new Book[0];
		}
		int matchBooksAmount = 0;
		for (Book book : books) {
			if (book.hasAuthor(author)) {
				matchBooksAmount++;
			}
		}
		Book[] filteredBooks = new Book[matchBooksAmount];
		int index = 0;
		for(Book book : books) {
			if(book.hasAuthor(author)) {
				filteredBooks[index++] = book;
			}
		}
		return filteredBooks;
	}
	
	public Book[] filteredBooksByPublisher(Publisher publisher, Book[] books) {
		if(publisher == null || books == null) {
			return new Book[0];
		}
		int matchBooksAmount = 0;
		for(Book book : books) {
			if(book.getPublisher().equals(publisher)){
				matchBooksAmount++;
			}
		}
		Book[] filteredBooks = new Book[matchBooksAmount];
		int index = 0;
		for(Book book : books) {
			if(book.getPublisher().equals(publisher)) {
				filteredBooks[index++] = book;
			}
		}
		return filteredBooks;
	}
	
	public Book[] filteredBooksAfterSpecifieldYear(int yearFromInclusively, Book[] books) {
		if(books == null) {
			return new Book[0];
		}
		int matchBooksAmount = 0;
		for(Book book : books) {
			if(book.getPublishingYear() >= yearFromInclusively) {
				matchBooksAmount++;
			}
		}
		Book[] filteredBooks = new Book[matchBooksAmount];
		int index = 0;
		for(Book book : books) {
			if(book.getPublishingYear() >= yearFromInclusively) {
				filteredBooks[index++] = book;
			}
		}
		return filteredBooks;
	}
}
