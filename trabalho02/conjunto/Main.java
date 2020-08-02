package trabalho02.conjunto;

public class Main {
    public static void main(String[] args) {
        Conjunto naturais = new Conjunto(10);
        Conjunto pares = new Conjunto(5);
        Conjunto impares = new Conjunto(5);
        Conjunto primos = new Conjunto(10);

        int natural[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int par[] = { 2, 4, 6, 8, 10 };
        int impar[] = { 1, 3, 5, 7, 9 };
        int primo[] = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23 };

        for (int i = 0; i < 10; i++) {
            naturais.addElem(natural[i]);
            primos.addElem(primo[i]);
        }

        for (int i = 0; i < 5; i++) {
            pares.addElem(par[i]);
            impares.addElem(impar[i]);
        }

        System.out.println("CONJUNTO 1");
        naturais.print();
        System.out.println("\nCONJUNTO 2");
        pares.print();
        System.out.println("\nCONJUNTO 3");
        impares.print();
        System.out.println("\nCONJUNTO 4");
        primos.print();

        System.out.println("\nA. Se o conjunto 4 é subconjunto de si mesmo.");
        if (primos.subconjunto(primos))
            System.out.println("O conjunto 4 é subconjunto de si mesmo.");
        else
            System.out.println("O conjunto 4 NÃO é subconjunto de si mesmo.");

        System.out.println("\nB. A pertinência dos conjuntos 2, 3 e 4 no conjunto 1.");
        if (pares.subconjunto(naturais))
            System.out.println("O conjunto 2 pertence ao conjunto 1.");
        else
            System.out.println("O conjunto 2 NÃO pertence ao conjunto 1");
        if (impares.subconjunto(naturais))
            System.out.println("O conjunto 3 pertence ao conjunto 1.");
        else
            System.out.println("O conjunto 3 NÃO pertence ao conjunto 1");
        if (primos.subconjunto(naturais))
            System.out.println("O conjunto 4 pertence ao conjunto 1.");
        else
            System.out.println("O conjunto 4 NÃO pertence ao conjunto 1");

        System.out.println("\nC. Se a união de 2 e 3 é igual ao conjunto 1.");
        Conjunto uniaoPI = pares.uniao(impares);
        if (uniaoPI.subconjunto(naturais) && naturais.subconjunto(uniaoPI))
            System.out.println("A união de 2 e 3 é igual ao conjunto 1.");
        else
            System.out.println("A união de 2 e 3 NÃO é igual ao conjunto 1.");

        System.out.println("\nD. Se a intersecção dos conjuntos 1 e 2 é vazia.");
        Conjunto interseccao = naturais.interseccao(pares);
        if (interseccao.getConjunto() == null)
            System.out.println("A intersecção de 1 e 2 é vazia.");
        else
            System.out.println("A intersecção de 1 e 2 NÃO é vazia.");

        System.out.println("\nE. Qual diferença entre os conjuntos 1 e 2;");
        Conjunto diferenca = naturais.diferenca(pares);
        diferenca.print();
    }
}