package dao;

import java.util.ArrayList;
import dto.Book;

public class BookRepository {
    private ArrayList<Book> listOfBook = new ArrayList<Book>();

    public BookRepository() {
        Book book1 = new Book("ISBN1234", "C# 프로그래밍", 27000);
        book1.setAuthor("우재남");
        book1.setDescription("C#을 처음 접하는 독가를 대상으로 일대일 수업처럼 자세히 설명한 책");
        book1.setPublisher("한빛아카데미");
        book1.setCategory("IT 모바일");
        book1.setUnitInStock(1000);
        book1.setRelesaseDate("2022/10/06");

        Book book2 = new Book("ISBN1235", "자바마스터", 30000);
        book2.setAuthor("송미영");
        book2.setDescription("자바를 처음 접하는 독가를 대상으로 일대일 수업처럼 자세히 설명한 책");
        book2.setPublisher("한빛아카데미");
        book2.setCategory("IT 모바일");
        book2.setUnitInStock(1000);
        book2.setRelesaseDate("2023/01/01");

        Book book3 = new Book("ISBN1236", "파이썬 프로그래밍", 27000);
        book3.setAuthor("최성철");
        book3.setDescription("파이썬을 처음 접하는 독가를 대상으로 일대일 수업처럼 자세히 설명한 책");
        book3.setPublisher("한빛아카데미");
        book3.setCategory("IT 모바일");
        book3.setUnitInStock(1000);
        book3.setRelesaseDate("2023/01/01");

        listOfBook.add(book1);
        listOfBook.add(book2);
        listOfBook.add(book3);
    }

    public ArrayList<Book> getAllBooks() {
        return listOfBook;
    }
}
