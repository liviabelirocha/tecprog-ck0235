package trabalho03.questao02;

public class XPTOBasic extends Sistema {
    private int id_;
    private float saldo_;

    XPTOBasic(int id) {
        setId(id);
        setSaldo(0);
    }

    private void setId(int id) {
        id_ = id;
    }

    private void setSaldo(float saldo) {
        saldo_ = saldo;
    }

    /*
     * esse método existe na classe Sistema, porém agora ele retorna um float e não
     * são passados parâmetros
     */
    public float consultarSaldo() {
        return saldo_;
    }

    public void debito(float qtde) {
        setSaldo(saldo_ - qtde);
    }

    public void credito(float qtde) {
        setSaldo(saldo_ + qtde);
    }

    @Override
    public String toString() {
        return "Tipo: Conta XPTO Basic, Id: " + id_ + ", Saldo: R$" + saldo_;
    }
}