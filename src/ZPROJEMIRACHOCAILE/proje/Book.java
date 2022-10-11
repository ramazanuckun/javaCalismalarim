package ZPROJEMIRACHOCAILE.proje;

public class Book {



    public  String name;
    public  int pageNumber;
    public String author;
    public String publisher;
    public  double price;

    public static void main(String[] args) {
        Book book1= new Book();
        book1.name="Seker Portakali";
        book1.author="Jose Mauro de Vascolenes";
        book1.pageNumber=180;
        book1.price=25;
book1=new Book();
    }

    public Book() {
    }

    public Book(String name, int pageNumber, String author, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
/*

Abstraction ==musterinin ihtiyaci oldugu seyi progrsmin vermesidir/atm ni para vermesi
inheritancw yazilan kodun tekrar kullanilmasina imkan veriri
 */