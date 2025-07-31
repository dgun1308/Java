package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    BookDTO bD = new BookDTO();
    BookManager bM = new BookManager();
    Scanner sc = new Scanner(System.in);



    public BookMenu() {}

    public void menu() {

        while (true) {
            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서정보 정렬 후 출력");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 검색출력");
            System.out.println("5. 전체 출력");
            System.out.println("6. 끝내기");
            System.out.print("메뉴 선택 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : bM.addBook(inputBook()); break;

                case 4 :

                case 6 :
                    System.out.println("프로그램 종료"); break;
                default:
                    System.out.println("잘못된 번호 입력"); break;
            }

        }
    }

    public BookDTO inputBook() {
        System.out.print("도서번호 : ");
        bD.setbNo(sc.nextInt());
        System.out.print("도서분류코드 : ");
        bD.setCategory(sc.nextInt());
        sc.nextLine();
        System.out.print("도서 제목 : ");
        bD.setTitle(sc.nextLine());
        System.out.print("도서 저자 : ");
        bD.setAuthor(sc.nextLine());
        return bD;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서제목 입력 : ");
        String bT = sc.nextLine();
        return bT;
    }

}
