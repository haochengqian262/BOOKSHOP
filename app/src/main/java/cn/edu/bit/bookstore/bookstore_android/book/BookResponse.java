package cn.edu.bit.bookstore.bookstore_android.book;

import java.util.ArrayList;

public class BookResponse {
    public int count;
    public int start;
    public int total;
    public ArrayList<Book> books;

    public int getCount() {
        return count;
    }

    public int getStart() {
        return start;
    }

    public int getTotal() {
        return total;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
}
