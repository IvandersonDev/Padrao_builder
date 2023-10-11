package Main;

import Methods.Pessoa;
import Methods.PessoaBuilder;

public class Main {
    public static void main(String[] args) {


        Pessoa pessoa = new PessoaBuilder("John")
                .cpf("123456789")
                .rg("987654321")
                .idade(30)
                .altura(1.80f)
                .peso(70.5f)
                .build();

        Pessoa pessoa1 = new PessoaBuilder("Alice")
                .cpf("111222333")
                .rg("333222111")
                .idade(28)
                .altura(1.65f)
                .peso(55.5f)
                .build();

        Pessoa pessoa2 = new PessoaBuilder("Bob")
                .cpf("444555666")
                .rg("666555444")
                .idade(35)
                .altura(1.75f)
                .peso(80.0f)
                .build();

        Pessoa pessoa3 = new PessoaBuilder("Eva")
                .cpf("777888999")
                .rg("999888777")
                .idade(42)
                .altura(1.70f)
                .peso(68.2f)
                .build();
        
        System.out.println(pessoa);
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
    }
}
