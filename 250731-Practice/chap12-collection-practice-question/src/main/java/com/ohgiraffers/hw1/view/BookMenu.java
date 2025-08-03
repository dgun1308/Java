package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    // BookManager 를 멤버 변수로 생성
    // BookMenu 객체가 생성될 때 BookManager 도 단 한번 생성
    BookManager bM = new BookManager();
    Scanner sc = new Scanner(System.in);


// BookManager가
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
            sc.nextLine();  // 버퍼 제거

            switch (no) {
                case 1 : bM.addBook(inputBook()); break;

                case 2 :
                    System.out.print("정렬 방식을 선택해주세요 (1. 오름차순, 2.내림차순)");
                    int select = sc.nextInt();

                    if (select == 1 || select == 2) {
                        ArrayList<BookDTO> sortedList = bM.sortedBookList(select);
                        bM.printBookList(sortedList);
                    } else {
                        System.out.println("잘못된 번호 입력");
                    }
                    break;

                case 3 :
                    System.out.print("삭제할 도서 번호 : ");
                    int deleteBno = sc.nextInt();
                    bM.deleteBook(deleteBno);
                    break;

                case 4 :
                    String searchTitle = inputBookTitle();
                    int searchIndex = bM.searchBook(searchTitle);

                    if (searchIndex == -1) {
                        System.out.println("조회한 도서 없음.");
                    } else {
                        System.out.println("===== 검색 결과 =====");
                        bM.printBook(searchIndex);
                    } break;

                case 5 : bM.displayAll(); break;

                // 프로그램 종료 선택 시 BookManager에 만든 saveDataToFile() 메소드 호출
                // 현재까지의 모든 변경사항을 파일에 저장
                case 6 :
                    bM.saveDataToFile();
                    System.out.println("프로그램 종료"); return;
                default:
                    System.out.println("잘못된 번호 입력"); break;
            }

        }
    }

    public BookDTO inputBook() {
        BookDTO book = new BookDTO();

        System.out.print("도서번호 : ");
        book.setbNo(sc.nextInt());
        System.out.print("도서분류코드 : ");
        book.setCategory(sc.nextInt());
        sc.nextLine();  // 버퍼 제거
        System.out.print("도서 제목 : ");
        book.setTitle(sc.nextLine());
        System.out.print("도서 저자 : ");
        book.setAuthor(sc.nextLine());
        return book;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서제목 입력 : ");
        return sc.nextLine();
    }

}
