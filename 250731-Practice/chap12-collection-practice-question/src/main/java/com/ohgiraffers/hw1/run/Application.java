package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookMenu bM = new BookMenu();
        ArrayList<BookDTO> alist = new ArrayList<>();

        bM.menu();

//        alist.add(new BookDTO(1, "홍길동전", "홍길동"));
//        alist.add(new BookDTO(2, "목민심서", "정약용"));
//        for(BookDTO book : alist) {
//            System.out.println("book : " + book);
//        }
//        System.out.println(alist.get(0));
    }
}
