// File: LibraryManagementSystemGUI.java

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LibraryManagementSystemGUI {
    private ArrayList<Librarian> librarians = new ArrayList<>();
    private Library library = new Library();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LibraryManagementSystemGUI().createMainFrame());
    }

    private void createMainFrame() {
        JFrame frame = new JFrame("Kütüphane Yönetim Sistemi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 1));
        frame.setLocationRelativeTo(null);


        JButton addLibrarianButton = new JButton("Görevli Ekle");
        JButton listLibrariansButton = new JButton("Görevlileri Listele");
        JButton librarianLoginButton = new JButton("Görevli Girişi");
        JButton removeLibrarianButton = new JButton("Görevli Sil");
        JButton exitButton = new JButton("Çıkış");

        addLibrarianButton.addActionListener(e -> showAddLibrarianDialog());
        listLibrariansButton.addActionListener(e -> showListLibrariansDialog());
        librarianLoginButton.addActionListener(e -> showLibrarianLoginDialog());
        removeLibrarianButton.addActionListener(e -> showRemoveLibrarianDialog());
        exitButton.addActionListener(e -> System.exit(0));

        frame.add(addLibrarianButton);
        frame.add(listLibrariansButton);
        frame.add(librarianLoginButton);
        frame.add(removeLibrarianButton);
        frame.add(exitButton);

        frame.setVisible(true);
    }

    private void showAddLibrarianDialog() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Kullanıcı Adı:", usernameField,
                "Şifre:", passwordField
        }, "Görevli Ekle", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            if (librarians.stream().anyMatch(l -> l.getUsername().equals(username))) {
                JOptionPane.showMessageDialog(null, "Bu kullanıcı adı zaten kullanılıyor!", "Hata", JOptionPane.ERROR_MESSAGE);
            } else {
                librarians.add(new Librarian(username, password));
                JOptionPane.showMessageDialog(null, "Görevli başarıyla eklendi.");
            }
        }
    }

    private void showListLibrariansDialog() {
        if (librarians.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Henüz görevli eklenmemiş.");
        } else {
            StringBuilder list = new StringBuilder("Görevliler:\n");
            for (Librarian librarian : librarians) {
                list.append("- ").append(librarian.getUsername()).append("\n");
            }
            JOptionPane.showMessageDialog(null, list.toString());
        }
    }

    private void showLibrarianLoginDialog() {
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Kullanıcı Adı:", usernameField,
                "Şifre:", passwordField
        }, "Görevli Girişi", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            boolean validLogin = librarians.stream().anyMatch(l -> l.getUsername().equals(username) && l.verifyPassword(password));
            if (validLogin) {
                JOptionPane.showMessageDialog(null, "Giriş başarılı.");
                showLibraryMenu();
            } else {
                JOptionPane.showMessageDialog(null, "Geçersiz kullanıcı adı veya şifre.", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showRemoveLibrarianDialog() {
        JTextField usernameField = new JTextField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Silinecek Görevlinin Kullanıcı Adı:", usernameField
        }, "Görevli Sil", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String username = usernameField.getText();
            if (librarians.removeIf(l -> l.getUsername().equals(username))) {
                JOptionPane.showMessageDialog(null, "Görevli başarıyla silindi.");
            } else {
                JOptionPane.showMessageDialog(null, "Bu kullanıcı adıyla bir görevli bulunamadı.");
            }
        }
    }

    private void showLibraryMenu() {
        JFrame libraryFrame = new JFrame("Kütüphane Yönetim Menüsü");
        libraryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        libraryFrame.setSize(400, 500);
        libraryFrame.setLayout(new GridLayout(9, 1));
        libraryFrame.setLocationRelativeTo(null);


        JButton listBooksButton = new JButton("Kitapları Listele");
        JButton addBookButton = new JButton("Kitap Ekle");
        JButton removeBookButton = new JButton("Kitap Sil");
        JButton lendBookButton = new JButton("Kitap Ödünç Ver");
        JButton returnBookButton = new JButton("Kitap İade Al");
        JButton listLentBooksButton = new JButton("Ödünç Verilen Kitapları Listele");
        JButton updateStockButton = new JButton("Stok Güncelle");
        JButton showReportButton = new JButton("Raporlama");
        JButton exitButton = new JButton("Çıkış");

        listBooksButton.addActionListener(e -> showListBooksDialog());
        addBookButton.addActionListener(e -> showAddBookDialog());
        removeBookButton.addActionListener(e -> showRemoveBookDialog());
        lendBookButton.addActionListener(e -> showLendBookDialog());
        returnBookButton.addActionListener(e -> showReturnBookDialog());
        listLentBooksButton.addActionListener(e -> showListLentBooksDialog());
        updateStockButton.addActionListener(e -> showUpdateStockDialog());
        showReportButton.addActionListener(e -> showReportDialog());
        exitButton.addActionListener(e -> libraryFrame.dispose());

        libraryFrame.add(listBooksButton);
        libraryFrame.add(addBookButton);
        libraryFrame.add(removeBookButton);
        libraryFrame.add(lendBookButton);
        libraryFrame.add(returnBookButton);
        libraryFrame.add(listLentBooksButton);
        libraryFrame.add(updateStockButton);
        libraryFrame.add(showReportButton);
        libraryFrame.add(exitButton);

        libraryFrame.setVisible(true);
    }

    private void showListBooksDialog() {
        JTextArea textArea = new JTextArea(20, 40);
        ArrayList<String> books = library.listBooks();
        if (books.isEmpty()) {
            textArea.setText("Kütüphanede kayıtlı kitap yok.");
        } else {
            for (String book : books) {
                textArea.append(book + "\n");
            }
        }
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Kitaplar", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showAddBookDialog() {
        JTextField titleField = new JTextField();
        JTextField authorField = new JTextField();
        JTextField isbnField = new JTextField();
        JTextField stockField = new JTextField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Kitap Adı:", titleField,
                "Yazar:", authorField,
                "ISBN:", isbnField,
                "Stok:", stockField
        }, "Kitap Ekle", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String title = titleField.getText();
            String author = authorField.getText();
            String isbn = isbnField.getText();
            try {
                int stock = Integer.parseInt(stockField.getText());
                library.addBook(new Book(title, author, isbn, stock));
                JOptionPane.showMessageDialog(null, "Kitap başarıyla eklendi.");
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Geçersiz stok miktarı!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showRemoveBookDialog() {
        JTextField isbnField = new JTextField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Silinecek Kitabın ISBN'i:", isbnField
        }, "Kitap Sil", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String isbn = isbnField.getText();
            if (library.removeBook(isbn)) {
                JOptionPane.showMessageDialog(null, "Kitap başarıyla silindi.");
            } else {
                JOptionPane.showMessageDialog(null, "Kitap bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showLendBookDialog() {
        JTextField borrowerField = new JTextField();
        JTextField isbnField = new JTextField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Ödünç Alan:", borrowerField,
                "Kitap ISBN:", isbnField
        }, "Kitap Ödünç Ver", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String borrower = borrowerField.getText();
            String isbn = isbnField.getText();
            if (library.lendBook(borrower, isbn)) {
                JOptionPane.showMessageDialog(null, "Kitap ödünç verildi.");
            } else {
                JOptionPane.showMessageDialog(null, "Kitap bulunamadı veya stokta yok!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showReturnBookDialog() {
        JTextField borrowerField = new JTextField();
        JTextField isbnField = new JTextField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "İade Eden:", borrowerField,
                "Kitap ISBN:", isbnField
        }, "Kitap İade Al", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String borrower = borrowerField.getText();
            String isbn = isbnField.getText();
            if (library.returnBook(borrower, isbn)) {
                JOptionPane.showMessageDialog(null, "Kitap başarıyla iade alındı.");
            } else {
                JOptionPane.showMessageDialog(null, "İade işlemi başarısız!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showListLentBooksDialog() {
        JTextArea textArea = new JTextArea(20, 40);
        ArrayList<String> lentBooks = library.listLentBooks();
        if (lentBooks.isEmpty()) {
            textArea.setText("Ödünç verilmiş kitap yok.");
        } else {
            for (String book : lentBooks) {
                textArea.append(book + "\n");
            }
        }
        JOptionPane.showMessageDialog(null, new JScrollPane(textArea), "Ödünç Verilen Kitaplar", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showUpdateStockDialog() {
        JTextField isbnField = new JTextField();
        JTextField stockChangeField = new JTextField();

        int result = JOptionPane.showConfirmDialog(null, new Object[]{
                "Kitap ISBN:", isbnField,
                "Stok Değişimi (negatif veya pozitif):", stockChangeField
        }, "Stok Güncelle", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String isbn = isbnField.getText();
            try {
                int stockChange = Integer.parseInt(stockChangeField.getText());
                if (library.updateStock(isbn, stockChange)) {
                    JOptionPane.showMessageDialog(null, "Stok başarıyla güncellendi.");
                } else {
                    JOptionPane.showMessageDialog(null, "Kitap bulunamadı!", "Hata", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Geçersiz stok değeri!", "Hata", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void showReportDialog() {
        int totalBooks = library.getTotalBooks();
        int lentBooks = library.getTotalLentBooks();

        JOptionPane.showMessageDialog(null, "Toplam Kitap Stok: " + totalBooks +
                "\nÖdünç Verilen Kitaplar: " + lentBooks, "Raporlama", JOptionPane.INFORMATION_MESSAGE);
    }
}
