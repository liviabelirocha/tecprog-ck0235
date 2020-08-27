package trabalho03.questao04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;
import java.util.TreeSet;

public class StringCollection {
    public static void main(String[] args) {

        String[] vector = { "B", "A", "C", "A" };

        Set<String> hashSet = new HashSet<>();
        System.out.println("HashSet:");
        StringCollection hashSetCollection = new StringCollection(hashSet, vector);
        hashSetCollection.verificar(hashSet);
        System.out.println("\n");

        Set<String> treeSet = new TreeSet<>();
        System.out.println("TreeSet:");
        StringCollection treeSetCollection = new StringCollection(treeSet, vector);
        treeSetCollection.verificar(treeSet);
        System.out.println("\n");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        System.out.println("LinkedHashSet:");
        StringCollection linkedHashSetCollection = new StringCollection(linkedHashSet, vector);
        linkedHashSetCollection.verificar(linkedHashSet);
        System.out.println("\n");

        List<String> arrayList = new ArrayList<>();
        System.out.println("ArrayList:");
        StringCollection arrayCollection = new StringCollection(arrayList, vector);
        arrayCollection.verificar(arrayList);
    }

    StringCollection(Collection<String> collection, String[] array) {
        for (String s : array)
            collection.add(s);
    }

    void verificar(Collection<String> collection) {
        Collection<String> testCollection = collection;

        testCollection.clear();
        System.out.println(checkForDuplicates(testCollection) ? "Permite duplicatas" : "NÃO permite duplicatas");

        testCollection.clear();
        System.out.println(checkForSorting(testCollection) ? "Ordena automaticamente" : "NÃO ordena automaticamente");

        testCollection.clear();
        System.out.println(checkForEntry(testCollection) ? "Garante ordem de entrada" : "NÃO garante ordem de entrada");
    }

    Boolean checkForDuplicates(Collection<String> collection) {
        collection.add("Duplicata");
        collection.add("Duplicata");

        return (collection.size() == 1) ? false : true;
    }

    Boolean checkForSorting(Collection<String> collection) {
        collection.add("B");
        collection.add("A");
        collection.add("C");

        Iterator i = collection.iterator();
        return (i.next() == "A") ? true : false;
    }

    Boolean checkForEntry(Collection<String> collection) {
        collection.add("B");
        collection.add("A");

        Iterator i = collection.iterator();
        if (i.next() == "B" && i.next() == "A")
            return true;
        return false;
    }
}