import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<LentBook> lentBooks = new ArrayList<>();

    // Kitap Ekle
    public boolean addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                return false; // Aynı ISBN varsa eklenmez
            }
        }
        books.add(book);
        return true;
    }

    // Kitap Sil
    public boolean removeBook(String isbn) {
        return books.removeIf(b -> b.getIsbn().equals(isbn));
    }

    // Kitapları Listele
    public ArrayList<String> listBooks() {
        ArrayList<String> bookList = new ArrayList<>();
        for (Book b : books) {
            bookList.add(b.toString());
        }
        return bookList;
    }

    // Kitap Ödünç Ver
    public boolean lendBook(String borrower, String isbn) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                if (b.getAvailableStock() > 0) {
                    b.decreaseAvailableStock();
                    lentBooks.add(new LentBook(borrower, b));
                    return true;
                }
                return false; // Stok yok
            }
        }
        return false; // Kitap bulunamadı
    }

    // Kitap İade
    public boolean returnBook(String borrower, String isbn) {
        for (LentBook lentBook : lentBooks) {
            if (lentBook.getBorrower().equals(borrower) && lentBook.getBook().getIsbn().equals(isbn)) {
                lentBook.getBook().increaseAvailableStock();
                lentBooks.remove(lentBook);
                return true;
            }
        }
        return false; // İade edilecek kitap bulunamadı
    }

    // Ödünç Verilen Kitapları Listele
    public ArrayList<String> listLentBooks() {
        ArrayList<String> lentBookList = new ArrayList<>();
        for (LentBook lb : lentBooks) {
            lentBookList.add("Kitap: " + lb.getBook().getTitle() +
                    ", ISBN: " + lb.getBook().getIsbn() +
                    ", Ödünç Alan: " + lb.getBorrower());
        }
        return lentBookList;
    }

    // Stok Güncelle
    public boolean updateStock(String isbn, int change) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                b.updateStock(change);
                return true;
            }
        }
        return false; // Kitap bulunamadı
    }

    // Genel Raporlama
    public int getTotalBooks() {
        return books.stream().mapToInt(Book::getTotalStock).sum();
    }

    public int getTotalLentBooks() {
        return lentBooks.size();
    }
}
