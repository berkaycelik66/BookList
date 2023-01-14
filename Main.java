import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Çalıkuşu", 541, "Reşat Nuri Güntekin", 1922));
        bookList.add(new Book("Beyaz Zambaklar Ülkesinde", 248, "Grigoriy Petrov", 1923));
        bookList.add(new Book("Aylak Adam", 192, "Yusuf Atilgan", 1959));
        bookList.add(new Book("Bu Ulke", 339, "Cemil Meric", 1975));
        bookList.add(new Book("Sol Ayağım", 89, "Christy Brown", 1985));
        bookList.add(new Book("Dönüşüm", 160, "Franz Kafka", 1940));
        bookList.add(new Book("Siyah İnci", 150, "Anna Sewell", 2014));
        bookList.add(new Book("Yılkı Atı", 95, "Peyami Safa", 1977));
        bookList.add(new Book("Ateş ve Kan", 800, "George R. R. Martin", 2020));
        bookList.add(new Book("Momo", 119, "Ende", 1980));

        System.out.println("--------------------------------------");
        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getBookName(), book.getAuthorName()));
        for (String i : bookMap.keySet()) {
            System.out.println("Book: " + i + "\nAuthor: " + bookMap.get(i));
        }
        System.out.println("--------------------------------------");

        //Filter method()
        List<Book> listBook = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b ->
                System.out.printf("Book : %-25s Page Number : %-5d Author : %-20s Date : %-4d \n",
                        b.getBookName(),
                b.getPageNumber(), b.getAuthorName(), b.getReleaseDate()));

        System.out.println("--------------------------------------");


        //Count method
        long count = bookList.stream().count();
        System.out.println("Number of books: " + count);
    }
}
