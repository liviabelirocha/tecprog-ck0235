package trabalho03.questao04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Hash {
    public static void main(String[] args) {
        Set<String> meses1 = new HashSet<>();
        meses1.add("Janeiro");
        meses1.add("Fevereiro");
        meses1.add("Março");
        meses1.add("Abril");
        meses1.add("Maio");
        meses1.add("Fevereiro");
        Hash hash1 = new Hash();
        hash1.listar(meses1);
        hash1.listar2(meses1);

        System.out.println("\n");

        /* ITENS D & F */
        Set<String> meses2 = new TreeSet<>();
        meses2.add("Janeiro");
        meses2.add("Fevereiro");
        meses2.add("Março");
        meses2.add("Abril");
        meses2.add("Maio");
        meses2.add("Fevereiro");
        Hash hash2 = new Hash();
        hash2.listar(meses2);
        hash2.listar2(meses2);

        System.out.println("\n");

        Set<String> meses3 = new LinkedHashSet<>();
        meses3.add("Janeiro");
        meses3.add("Fevereiro");
        meses3.add("Março");
        meses3.add("Abril");
        meses3.add("Maio");
        meses3.add("Fevereiro");
        Hash hash3 = new Hash();
        hash3.listar(meses3);
        hash3.listar2(meses3);

        System.out.println('\n');

        List<String> meses4 = new ArrayList<>();
        meses4.add("Janeiro");
        meses4.add("Fevereiro");
        meses4.add("Março");
        meses4.add("Abril");
        meses4.add("Maio");
        meses4.add("Fevereiro");
        Hash hash4 = new Hash();
        hash4.listar(meses4);
        hash4.listar2(meses4);

    }

    /* ITEM B */
    void listar(Collection c) {
        System.out.println("*** Listar 1 ***");
        Iterator i = c.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }

    /* ITEM C */
    void listar2(Collection c) {
        System.out.println("*** Listar 2 ***");
        for (Object o : c)
            System.out.println(o);
    }
}