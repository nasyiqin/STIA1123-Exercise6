import java.util.Scanner;

class Book {
    private String title;      //book’s title
    private double price;      //book’s price

    public Book(String t, double p) {
        title = t;
        price = p;
    }
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}

public class TestBook {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        double price, highestPrice=0;
        String title, highTitle = " ";

        System.out.print("Enter number of book: ");
        n = input.nextInt();

        Book[] myLibrary = new Book[n];

        for(int i=0; i<n; i++) {
            input.nextLine();
            System.out.print("Title book: ");
            title = input.nextLine();
            System.out.print("Price book: ");
            price = input.nextDouble();
            myLibrary[i] = new Book(title, price);

            if(myLibrary[i].getPrice()>highestPrice)
            {
                highestPrice = myLibrary[i].getPrice();
                highTitle = myLibrary[i].getTitle();
            }
        }

        System.out.println("\n" + highTitle + " is the priciest book with RM " + highestPrice + "\n");

        System.out.println("Book that contain 'Java': ");
        for(int t=0; t<n; t++){
            if (myLibrary[t].getTitle().contains("Java"))
            {
                System.out.println(myLibrary[t].getTitle());
            }
        }

    }
}
