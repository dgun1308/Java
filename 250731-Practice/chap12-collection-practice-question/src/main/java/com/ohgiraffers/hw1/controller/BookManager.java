package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;

public class BookManager {

    ArrayList<BookDTO> alist = new ArrayList<>();

    public BookManager() {}

    public void addBook(BookDTO book) {
        alist.add(book);
    }

    public void deleteBook(int index) {
        alist.remove(index);
    }

    public int searchBook(String title) {
        return 0;
    }

    public void printBook(int index) {}

    public void displayAll() {}

//    public ArrayList<BookDTO> sortedBookList(int select) {
//        return ;
//    }

    public void printBookList(ArrayList<BookDTO> br) {}
}
