package org.example.entity;

public class Book {
    private Long id;
    private String title;
    private String author;

    private boolean isAvailable;

    public Book() {
    }

    public Book(Long id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public Book(String title, String author, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    private Book(Builder builder) {
        this.setId(builder.id);
        this.setAuthor(builder.author);
        this.setTitle(builder.title);
        this.setAvailable(builder.isAvailable);
    }

    public static class Builder {
        private Long id;
        private String title;
        private String author;
        private boolean isAvailable;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }
        public Builder isAvailable(boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
