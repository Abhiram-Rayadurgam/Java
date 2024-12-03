//name:Abhiram Rayadurgam, USN:1BM23CS011
import java.util.Scanner;

class Books {
    String name;
    String author;
    int price;
    int numPages;

    Books(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;

    }

    public String toString() {
        String name, author, price, numPages;
        name = "Book name: " + this.name + "\n";
        author = "Author name: " + this.author + "\n";
        price = "Price: " + this.price + "\n";
        numPages = "Number of pages: " + this.numPages + "\n";
        return name + author + price + numPages;
    }

}

class Bookc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, price, numPages;
        String author, name;
        n = s.nextInt();
        Books[] b = new Books[n];
        for (int i = 0; i < n; i++) {
            name = s.next();
            author = s.next();
            price = s.nextInt();
            numPages = s.nextInt();
            b[i] = new Books(name, author, price, numPages);
            System.out.println(b[i].toString());
        }
        s.close();

    }
}
