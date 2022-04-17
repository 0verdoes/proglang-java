import book.*;

public class BookMain {
    public static void main(String[] args) {

        Book b = new Book("Johny Gold", "Alchemy", 10);
        System.out.println(b.getShortName());
        EBook eb = new EBook("author", "title", 100, 1024);
        System.out.println(eb.getShortName());
        System.out.println(eb.createReference("article", 1, 10));
    }
}
