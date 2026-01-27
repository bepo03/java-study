package month_01.day_01_21;

import java.text.DecimalFormat;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int price;
    private boolean isBorrowed;

    public Book(String isbn, String title, String author, int price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        setPrice(price);
        this.isBorrowed = false;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPrice() {
        return this.price;
    }

    public boolean isBorrowed() {
        return this.isBorrowed;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("가격은 0 이상이어야 합니다.");
            return;
        }

        this.price = price;
    }

    public boolean borrow() {
        if (isBorrowed) {
            System.out.println("이미 대출 중인 도서입니다.");
            return false;
        }

        isBorrowed = true;
        System.out.printf("📖 %s 대출 완료\n", getTitle());
        return true;
    }

    public void returnBook() {
        if (!isBorrowed) {
            System.out.println("대출 중이 아닌 도서입니다.");
            return;
        }

        isBorrowed = false;
        System.out.printf("📚 %s 반납 완료\n", getTitle());
    }

    public void showInfo() {
        DecimalFormat df = new DecimalFormat("#,##0");
        String formattedPrice = df.format(getPrice());

        System.out.println("=== 도서 정보 ===");
        System.out.printf("ISBN: %s\n", getIsbn());
        System.out.printf("제목: %s\n", getTitle());
        System.out.printf("저자: %s\n", getAuthor());
        System.out.printf("가격: %s원\n", formattedPrice);
        System.out.printf("상태: %s\n", (isBorrowed() ? "📕 대출중" : "📗 대출가능"));
    }
}
