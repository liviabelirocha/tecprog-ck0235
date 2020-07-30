package trabalho02.pessoa;

public class Pessoa {
    String nome_;
    int idade_;

    Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    void setNome(String nome) {
        nome_ = nome;
    }

    String getNome() {
        return nome_;
    }

    void setIdade(int idade) {
        idade_ = idade;
    }

    int getIdade() {
        return idade_;
    }

    void getAll() {
        System.out.println("NOME: " + nome_ + ", IDADE: " + idade_);
    }
}