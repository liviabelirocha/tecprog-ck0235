package trabalho03.questao02;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
    private List<Sistema> contas;

    Sistema() {
        contas = new ArrayList<Sistema>();
    }

    /*
     * temos uma array de sistema, porém instanciamos outras classes, fazendo a
     * inclusão
     */

    void criarContaXPTOBasic(int id) {
        Sistema xpto = new XPTOBasic(id);
        contas.add(id - 1, xpto);
    }

    void criarContaXPTOPlus(int id) {
        Sistema xpto = new XPTOPlus(id);
        contas.add(id - 1, xpto);
    }

    void criarContaXPTOExteme(int id) {
        Sistema xpto = new XPTOExtreme(id);
        contas.add(id - 1, xpto);
    }

    /* nos métodos abaixo é aplicado coersão */
    public void debitar(int id, float qntd) {
        if (contas.get(id - 1) instanceof XPTOBasic)
            ((XPTOBasic) contas.get(id - 1)).debito(qntd);
        else if (contas.get(id - 1) instanceof XPTOPlus)
            ((XPTOPlus) contas.get(id - 1)).debito(qntd);
        else if (contas.get(id - 1) instanceof XPTOExtreme)
            ((XPTOExtreme) contas.get(id - 1)).debito(qntd);
    }

    public void creditar(int id, float qntd) {
        if (contas.get(id - 1) instanceof XPTOBasic)
            ((XPTOBasic) contas.get(id - 1)).credito(qntd);
        else if (contas.get(id - 1) instanceof XPTOPlus)
            ((XPTOPlus) contas.get(id - 1)).credito(qntd);
        else if (contas.get(id - 1) instanceof XPTOExtreme)
            ((XPTOExtreme) contas.get(id - 1)).credito(qntd);
    }

    void consultarSaldo(int id) {
        if (contas.get(id - 1) instanceof XPTOBasic)
            System.out.println(((XPTOBasic) contas.get(id - 1)).consultarSaldo());
        else if (contas.get(id - 1) instanceof XPTOPlus)
            System.out.println(((XPTOPlus) contas.get(id - 1)).consultarSaldo());
        else if (contas.get(id - 1) instanceof XPTOExtreme)
            System.out.println(((XPTOExtreme) contas.get(id - 1)).consultarSaldo());
    }
}