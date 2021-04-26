/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dang.bookdao;

import dang.bookdto.BookDTO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class BookDAO extends ArrayList<BookDTO> {

    public ArrayList<BookDTO> getTempList() {
        return this.tempList;
    }

    private ArrayList<BookDTO> tempList;

    public void loadDB() {
        BookDTO dto = new BookDTO("123", "Romeo and juliet", "shakespeare", "Simon & Schuster", 1997, true);
        this.add(dto);
    }

    public boolean createBook(BookDTO dto) {
        for (BookDTO book : this) {
            if (book.getBookID().equals(dto.getBookID())) {
                return false;
            }
        }
        this.add(dto);
        return true;
    }

    public boolean updateBook(BookDTO dto) {
        for (BookDTO book : this) {
            if (book.getBookID().equals(dto.getBookID())) {
                book.setBookName(dto.getBookName());
                book.setAuthor(dto.getAuthor());
                book.setPublisher(dto.getPublisher());
                book.setPublishedYear(dto.getPublishedYear());
                book.setForRent(dto.isForRent());
            }
        }
        return true;
    }

    public boolean removeBook(BookDTO dto) {
        BookDTO removeObj = null;
        for (BookDTO book : this) {
            if (book.getBookID().equals(dto.getBookID())) {
                removeObj = book;
            }
        }
        this.remove(removeObj);
        return true;
    }

    public BookDTO findByID(String bookID) {
        BookDTO bookDTO = null;
        this.tempList = new ArrayList<>();
        for (BookDTO book : this) {
            if (book.getBookID().equals(bookID)) {
                bookDTO = book;
            }
        }
        return bookDTO;
    }

    public boolean findByName(String bookName){
        this.tempList = new ArrayList<>();
        for (BookDTO book : this) {
            if (book.getBookName().contains(bookName)){                
                this.tempList.add(book);
            }
        }
        if (this.tempList.isEmpty()){
            return false;
        }
        return true;
    }
    
    public void sortAscendingByBookName() {
        Collections.sort(this, new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO t, BookDTO t1) {
                return t.getBookName().compareTo(t1.getBookName());
            }
        });
    }

    public void sortDescendingByBookName() {
        Collections.sort(this, new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO t, BookDTO t1) {
                return t1.getBookName().compareTo(t.getBookName());
            }
        });
    }

}
