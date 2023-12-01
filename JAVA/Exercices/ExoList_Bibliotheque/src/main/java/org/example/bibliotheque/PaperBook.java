package org.example.bibliotheque;

public class PaperBook extends Book{

    private int numberOfPages;
    private String publishingHouse;

    public PaperBook(String title, String author, int numberOfPages, String publishingHouse) {
        super(title, author);
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {

        return
                super.toString() +
                "PaperBook{" +
                "numberOfPages=" + numberOfPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }
}
