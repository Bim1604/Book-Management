/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dang.bookvalid;

import java.time.LocalDateTime;

/**
 *
 * @author Admin
 */
public class BookValid {
    public boolean checkBookID(String bookID){
        if (bookID.length() <= 10 && bookID.length() > 0 && bookID.matches("\\w+")){
            return true;
        }
        return false;
    }
    
    public boolean checkBookName(String bookName){
        if (bookName.length() <= 50 && bookName.length() > 0){
            return true;
        }
        return false;
    }
    
    public boolean checkAuthor(String author){
        if (author.length() <= 50 && author.length() > 0){
            return true;
        }
        return false;
    }
    
    public boolean checkPublisher(String publisher){
        if (publisher.length() <= 50 && publisher.length() > 0){
            return true;
        }
        return false;
    }
    
    public boolean checkPublishedYear(int publishedYear){
        if (publishedYear < LocalDateTime.now().getYear()){
            return true;
        }
        return false;
    }
}
