package GenelKonular;

import javax.swing.JOptionPane;

public class JoptionBasic {
    public static void main(String[] args) {
        String sayi = "5";
        JOptionPane.showMessageDialog(null,"sayi: "+sayi,"bildirim",JOptionPane.INFORMATION_MESSAGE);
        sayi = JOptionPane.showInputDialog(null,"sayıyı değiş cano","bildirim",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"yeni sayi: "+sayi,"bildirim",JOptionPane.INFORMATION_MESSAGE);

        int sayi2 = Integer.parseInt(sayi);

    }
}

/*
1. parametre null bırakılır
2. mesajı ya da değişkeni içerir
3. bildirim başlığı
4. bildirimin çeşidi

JOption deiğişkeniinputu string olarak alır ama cast edebilirsin.
output ederken int olmasında sorun yok
*/