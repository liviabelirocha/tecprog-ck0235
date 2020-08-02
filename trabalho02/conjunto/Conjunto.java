package trabalho02.conjunto;

public class Conjunto {
    private Object conjunto_[];
    private int n_, i_ = 0;

    Conjunto(int n) {
        conjunto_ = new Object[n];
        n_ = n;
    }

    public int getSize() {
        return n_;
    }

    public int getIndex() {
        return i_;
    }

    Object getElement(int i) {
        if (i > i_ - 1 || i < 0)
            return -1;
        return conjunto_[i];
    }

    Object getConjunto() {
        return conjunto_;
    }

    public Boolean addElem(Object x) {
        if (this.pertence(x)) {
            return true;
        }
        if (i_ == n_) {
            Object novoConjunto[] = new Object[n_ * 2];
            for (int i = 0; i < i_ + 1; i++)
                novoConjunto[i] = conjunto_[i];
            conjunto_ = novoConjunto;
            n_ *= 2;
        }
        conjunto_[i_] = x;
        i_++;
        return true;

    }

    public Boolean pertence(Object x) {
        for (int i = 0; i < n_; i++) {
            if (conjunto_[i] == x) {
                return true;
            }
        }
        return false;
    }

    public Boolean subconjunto(Conjunto B) {
        for (int i = 0; i < this.getIndex(); i++) {
            if (!B.pertence(conjunto_[i])) {
                return false;
            }
        }
        return true;

    }

    public Conjunto uniao(Conjunto B) {
        Conjunto result = new Conjunto(i_ + B.getIndex() + 1);

        if (B.subconjunto(this))
            return this;
        for (int i = 0; i < B.getIndex(); i++)
            result.addElem(B.getElement(i));
        for (int i = 0; i < i_; i++)
            result.addElem(conjunto_[i]);

        return result;
    }

    public Conjunto interseccao(Conjunto B) {
        Conjunto result = new Conjunto(i_ > B.getSize() ? B.getSize() : n_);

        for (int i = 0; i < i_; i++)
            if (B.pertence(conjunto_[i]))
                result.addElem(conjunto_[i]);

        return result;
    }

    public Conjunto diferenca(Conjunto B) {
        Conjunto result = new Conjunto(n_ > B.getSize() ? n_ : B.getSize());

        for (int i = 0; i < B.getIndex(); i++)
            if (!this.pertence(B.getElement(i)))
                result.addElem(B.getElement(i));
        for (int i = 0; i < i_; i++)
            if (!B.pertence(conjunto_[i]))
                result.addElem(conjunto_[i]);

        return result;
    }

    public void print() {
        System.out.print("{");
        for (int i = 0; i < i_; i++)
            System.out.print(" " + conjunto_[i] + " ");
        System.out.println("}");
    }
}