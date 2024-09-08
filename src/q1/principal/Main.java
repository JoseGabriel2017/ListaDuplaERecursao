package q1.principal;

import q1.basicas.Contato;
import q1.lista.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        lista.adicionar(new Contato("João", "Rua 1", "123456789"));
        lista.adicionar(new Contato("Maria", "Rua 2", "987654321"));
        lista.adicionar(new Contato("José", "Rua 3", "555555555"));

        System.out.println("Contatos na agenda:");
        lista.mostrar();

        System.out.println("\nPesquisando por 'Maria':");
        Contato contato = lista.pesquisarPorNome("Maria");
        System.out.println(contato != null ? contato : "Contato não encontrado");

        System.out.println("\nRemovendo 'João':");
        lista.remover("João");
        lista.mostrar();

        System.out.println("\nRemovendo o segundo contato:");
        lista.removerPorPosicao(1);
        lista.mostrar();
    }
}
