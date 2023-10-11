package Interfaces;

public interface Builder <K , T>{

    K cpf(String cpf);
    K rg(String rg);
    K idade(int idade);
    K altura(float altura);
    K peso(float peso);
    T create();

}
