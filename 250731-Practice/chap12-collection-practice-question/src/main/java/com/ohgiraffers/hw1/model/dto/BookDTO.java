package com.ohgiraffers.hw1.model.dto;

import java.io.Serializable;

// 직렬화 구현을 위해 Serializable 추가
// BookDTO 객체가 파일에 쓰여질 수 있는 대상임을 자바에게 알려주는 표시
public class BookDTO implements Serializable {

    // 클래스의 버전 관리를 위한 ID (intelliJ Tool 자동 생성 방식 사용)
    // 자동으로 클래스의 구조를 분석하여 고유한 serialVersionUID를 생성
    // 해당 UID 생성 이후 클래스 수정 시 BookDTO의 serialVersionUID 계산 후 이전 UID와 일치하지 않을 시
    // 클래스 이름에 노란색 밑줄과 함께 경고 표시(수정된 내용이 이전 버전과 불일치)
    // 개발자가 호환성 유지 혹은 버전 변경 선택
    private static final long serialVersionUID = 2407751099511589692L;

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public int getbNo() {
        return bNo;
    }

    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
