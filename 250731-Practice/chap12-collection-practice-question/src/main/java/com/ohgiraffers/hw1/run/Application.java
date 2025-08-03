package com.ohgiraffers.hw1.run;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // BookMenu 객체 생성
        // BookMenu 의 생성자가 호출되면서 그 안의 BookManager도 함게 생성,
        // BookManager의 생성자가 호출되면서 파일 로딩이 단 1회 발생

        BookMenu bM = new BookMenu();
//        BookManager bMa = new BookManager();
        bM.menu();
    }
}
