package GenelKonular;

import java.util.*;


public class Collections {
    public static void main(String[] args) {

        // lists

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("Java");  // Duplicate eleman eklenebilir
        System.out.println(arrayList);  // [Java, Python, Java]

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);  // [1, 2, 3]



        //Set benzersiz veri gereksinimlerinde öne çıkar.


        /*
        HashSet:
        Elemanlar hash tablosu kullanılarak saklanır.
        Sıralama garantisi yoktur.
        Performansı yüksektir (ekleme, silme, arama işlemleri O(1) ortalamada).
        */
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("Java");  // Duplicate eleman eklenmez
        System.out.println(hashSet);  // [Python, Java] (sıra rastgeledir)


        /*LinkedHashSet:
        HashSet'e benzer, ancak ekleme sırasını korur.
        Performansı HashSet'ten biraz düşüktür.
        */
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        System.out.println(linkedHashSet);  // [Java, Python]


        /*TreeSet:
        Elemanları doğal sıralama veya özel bir comparator ile sıralar.
        Ekleme, silme ve arama işlemleri O(log n) karmaşıklığına sahiptir.
        */
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        System.out.println(treeSet);  // [5, 10, 20]

    }
}
