package Methods;

public class PessoaBuilder {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private float altura;
    private float peso;

    public PessoaBuilder(String nome) {
        this.nome = nome;
    }

    public PessoaBuilder cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public PessoaBuilder rg(String rg) {
        this.rg = rg;
        return this;
    }

    public PessoaBuilder idade(int idade) {
        this.idade = idade;
        return this;
    }

    public PessoaBuilder altura(float altura) {
        this.altura = altura;
        return this;
    }

    public PessoaBuilder peso(float peso) {
        this.peso = peso;
        return this;
    }

    public Pessoa build() {
        return new Pessoa(nome, cpf, rg, idade, altura, peso);
    }
}
