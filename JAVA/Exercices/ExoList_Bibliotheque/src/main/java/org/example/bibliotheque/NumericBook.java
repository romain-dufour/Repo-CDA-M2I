package org.example.bibliotheque;

public class NumericBook extends Book{

    private String format;
    private int size;

    public NumericBook(String title, String author, String format, int size) {
        super(title, author);
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "NumericBook{" +
                "format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
