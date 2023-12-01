package org.example.bibliotheque;

import java.time.LocalDate;

public class Loan {

    private LocalDate startDate = LocalDate.now();
    private  LocalDate endDate = LocalDate.now();
    private Book book;
    private Person person;

    public Loan(LocalDate startDate, Book book, Person person) {
        this.startDate = startDate;
        this.book = book;
        this.person = person;
    }

    public Loan(LocalDate startDate, LocalDate endDate, Book book, Person person) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.book = book;
        this.person = person;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", book=" + book +
                ", person=" + person +
                '}';
    }
}
