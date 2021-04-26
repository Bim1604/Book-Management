/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dang.bookview;

import dang.bookdao.BookDAO;
import dang.bookdto.BookDTO;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Admin
 */
public class BookTempModel extends AbstractTableModel{
    private ArrayList<BookDTO> bookList;

    public BookTempModel() {
        super();
    }

    public BookTempModel(ArrayList<BookDTO> bookList) {
        this.bookList = bookList;
    }

    public ArrayList<BookDTO> getBookList() {
        return bookList;
    }

    @Override
    public int getRowCount() {
        return bookList.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int column) {
        String columnName = "";
        switch (column) {
            case 0:
                columnName = "Book ID";
                break;
            case 1:
                columnName = "Book Name";
                break;
            case 2:
                columnName = "Author";
                break;
            case 3:
                columnName = "Publisher";
                break;
            case 4:
                columnName = "Published year";
                break;
            case 5:
                columnName = "For rent";
                break;
        }
        return columnName;
    }

    @Override
    public Object getValueAt(int row, int column) {
        BookDTO book = bookList.get(row);
        Object obj = null;
        switch (column) {
            case 0:
                obj = book.getBookID();
                break;
            case 1:
                obj = book.getBookName();
                break;
            case 2:
                obj = book.getAuthor();
                break;
            case 3:
                obj = book.getPublisher();
                break;
            case 4:
                obj = book.getPublishedYear();
                break;
            case 5:
                obj = book.isForRent();
                break;
        }
        return obj;
    }
}
