package basic.consturct.ex;

public class Book {
    String title;
    String author;
    int page;
    // 기본 생성자
    public Book() {
        this("", "", 0);
    }

    // titl과 author만 받는 생성자
    public Book(String title, String author) {
        this(title, author, 0);
    }
    // 모든 필드를 받는 생성자
    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public void displayInfo() {
        System.out.printf("제목: %s , 저자: %s , 페이지 수: %d\n", title, author, page);
    }
}
