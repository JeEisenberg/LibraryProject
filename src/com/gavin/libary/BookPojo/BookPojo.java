package com.gavin.libary.BookPojo;

import java.io.Serializable;

public class BookPojo implements Serializable {
    private int BookId;
    private String BookName;
    private String BookPublish;
    private double BookPrice;
    private String BookKind;

    public BookPojo(int bookId, String bookName, String bookPublish, double bookPrice, String bookKind) {
        BookId = bookId;
        BookName = bookName;
        BookPublish = bookPublish;
        BookPrice = bookPrice;
        BookKind = bookKind;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getBookPublish() {
        return BookPublish;
    }

    public void setBookPublish(String bookPublish) {
        BookPublish = bookPublish;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(double bookPrice) {
        BookPrice = bookPrice;
    }

    public String getBookKind() {
        return BookKind;
    }

    public void setBookKind(String bookKind) {
        BookKind = bookKind;
    }
}
