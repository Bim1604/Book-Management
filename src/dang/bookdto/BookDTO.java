/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dang.bookdto;

/**
 *
 * @author Admin
 */
public class BookDTO {
    private String bookID;
    private String bookName;
    private String author; 
    private String publisher;
    private int publishedYear;
    private boolean forRent;

    public BookDTO() {
    }

    public BookDTO(String bookID, String bookName, String author, String publisher, int publishedYear, boolean forRent) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = publishedYear;
        this.forRent = forRent;
    }

    /**
     * @return the bookID
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * @param bookID the bookID to set
     */
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the publishedYear
     */
    public int getPublishedYear() {
        return publishedYear;
    }

    /**
     * @param publishedYear the publishedYear to set
     */
    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    /**
     * @return the forRent
     */
    public boolean isForRent() {
        return forRent;
    }

    /**
     * @param forRent the forRent to set
     */
    public void setForRent(boolean forRent) {
        this.forRent = forRent;
    }

    @Override
    public String toString() {
        return "BookDTO{" + "bookID=" + bookID + ", bookName=" + bookName + ", author=" + author + ", publisher=" + publisher + ", publishedYear=" + publishedYear + ", forRent=" + forRent + '}';
    }
    
    
}
