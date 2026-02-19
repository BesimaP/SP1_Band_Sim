    public class Book {
    //Opgave 1: Din første klasse + Opgave 2: Flere Objekter
        String title;
        String author;
        int pages;

        Book (String title, String author, int pages){
            this.title = title;
            this.author = author;
            this.pages = pages;
        }
    }

    public class Book1{
        String title;
        String author;
        boolean available;

        Book1(String title, String author) {
            this.title = title;
            this.author = author;
            this.available = true;
        }
    }

    void borrowBook(Book1[] library, String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].title.equals(title)) {
                if (library[i].available) {
                    library[i].available = false;
                    System.out.println("Borrowed: " + title);
                } else {
                    System.out.println("Not available: " + title);
                }
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    void returnBook(Book1[] library, String title) {
        for (int i = 0; i < library.length; i++) {
            if (library[i].title.equals(title)) {
                library[i].available = true;
                System.out.println("Returned: " + title);
                return;
            }
        }
    }

    void printAvailableBooks(Book1[] library) {
        System.out.println("Available books:");
        for (int i = 0; i < library.length; i++) {
            if (library[i].available) {
                System.out.println("- " + library[i].title + " by " + library[i].author);
            }
        }
    }

    void main(String [] args){
        Book book = new Book ("1984", "George Orwell", 328);
        System.out.println("Bogens title: " + book.title);
        Book book2 = new Book ("Den grimme ælling", "H.C. Andersen", 16);
        Book book3 = new Book ("Den lille rødhætte", "Freres Grimm", 12);
        System.out.println("Bogens title: " + book2.title);
        System.out.println("Bogens title: " + book3.title);

        Book1[] library = new Book1[5];
        library[0] = new Book1("1984", "George Orwell");
        library[1] = new Book1("Harry Potter", "J.K. Rowling");
        library[2] = new Book1("The Hobbit", "J.R.R. Tolkien");
        library[3] = new Book1("Dune", "Frank Herbert");
        library[4] = new Book1("Neuromancer", "William Gibson");

        borrowBook(library, "1984");
        borrowBook(library, "Dune");

        printAvailableBooks(library);

        returnBook(library, "1984");

        printAvailableBooks(library);
    }