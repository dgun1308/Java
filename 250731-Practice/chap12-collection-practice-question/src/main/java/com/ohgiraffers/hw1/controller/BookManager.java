package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.comparator.AscCategory;
import com.ohgiraffers.hw1.model.comparator.DescCategory;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.io.*;
// 파일 입출력을 위한 모든 클래스 임포트
import java.util.ArrayList;

// BookManager가 생성될 때 파일에서 데이터를 불러오고, 특정 시점에 데이터를
// 파일에 저장하는 메소드 추가
public class BookManager {

    private ArrayList<BookDTO> alist;
    private static final String FILE_PATH = "books.dat";    // 저장될 파일 이름 상수

//    ArrayList<BookDTO> alist = new ArrayList<>();

    // BookManager 생성자
    // 프로그램 시작 시 파일에서 데이터를 불러옴.
    public BookManager() {
        loadDataFromFile();
    }

    // books.dat 파일에서 ArrayList 객체를 읽어와 alist에 초기화
    @SuppressWarnings("unchecked")  // 형변환 경고를 무시하기 위한 어노테이션
    private void loadDataFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            // 파일에서 객체를 읽어와 ArrayList<BookDTO>로 형변환
            this.alist = (ArrayList<BookDTO>) ois.readObject();
            System.out.println("도서 정보 로드 완료");
        } catch (FileNotFoundException e) {
            // 프로그램 최초 실행 시 파일이 없으므로, 새로운 리스트를 생성
            System.out.println("books.dat 파일을 생성");
            this.alist = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            // 그 외의 오류 발생 시, 안전하게 새로운 리스트로 시작
            System.out.println("데이터 로드 중 오류 발생");
            e.printStackTrace();
            this.alist = new ArrayList<>();
        }
    }

    // alist에 저장된 도서 목록을 books.dat 파일에 저장
    public void saveDataToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            // ArrayList 객체 자체를 파일에 쓴다.
            oos.writeObject(this.alist);
            System.out.println("도서 정보가 파일에 저장됨.");
        } catch (IOException e) {
            System.out.println("파일 저장 중 오류 발생");
            e.printStackTrace();
        }
    }

    public void addBook(BookDTO book) {
        alist.add(book);
    }

    public void deleteBook(int index) {
        String bookTitle = null;
        for (BookDTO book : alist) {
            if(book.getbNo() == index) {
                bookTitle = book.getTitle();
                alist.remove(searchBook(bookTitle));
                System.out.println("삭제 완료");
                break;
            } else {
                System.out.println("삭제할 도서 없음.");
            }
        }
    }

    public int searchBook(String title) {
        for (int i = 0; i < alist.size(); i++) {
            if (alist.get(i).getTitle().equals(title))
                return i;
        }
        return -1;
    }

    public void printBook(int index) {
        System.out.println(alist.get(index));
    }

    public void displayAll() {
        // 전체 출력 시 원본 리스트를 printBookList로 전달
        this.printBookList(this.alist);
    }

    public ArrayList<BookDTO> sortedBookList(int select) {
        // 원본 리스트 유지를 위해 복사본 생성 후 사용
        ArrayList<BookDTO> sortedList = new ArrayList<>(alist);

        if (select == 1) {
            sortedList.sort(new AscCategory());
        } else {
            sortedList.sort(new DescCategory());
        }

        return sortedList;
    }

    public void printBookList(ArrayList<BookDTO> br) {
        if (br.isEmpty()) {
            System.out.println("도서 목록이 비어있습니다.");
        } else {
            System.out.println("===== 도서 목록 출력 =====");
            for (BookDTO book : br) {
                System.out.println(book);
            }
        }
    }
}
