package com.leo.exe01;

import java.util.List;

/**
 * Created by ktkwon on 2019. 11. 26..
 */

public class Method {

    public void extractMethod(List<Book> books) {
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) {
        for (String author : book.getAuthors()) {
            print(author);
        }
    }

    private void print(String author) {
        if("jojoldu".equals(author)) {
            System.out.println("담당자가 맞습니다.");
        }
    }

    private void checkBookClass() {
        Book book = new Book("스프링부트", 30000, "홍길동");
        System.out.println(book.getAuthors());
    }

    public static class Book{
        private String title;
        private long price;
        private String mainAuthor;
        private List<String> authors;
        private Integer number;

        public Book(String title, long price, String mainAuthor) {
            this.title = title;
            this.price = price;
            this.mainAuthor = mainAuthor;
        }

        public List<String> getAuthors() {
            return authors;
        }

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }
    }
}
