package com.ohgiraffers.practice02.level02.normal.book.model.run;

import com.ohgiraffers.practice02.level02.normal.book.model.dto.BookDTO;

public class Application {

    public static void main(String[] args) {

        BookDTO b = new BookDTO();
        b.printInformation();

        b.BookDTO("자바의 정석", "도우출판", "남궁성");
        b.printInformation();

        b.BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        b.printInformation();
    }
}
