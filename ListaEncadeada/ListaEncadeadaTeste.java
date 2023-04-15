package ListaEncadeada;

import ListaEncadeada.ListaEncadeada;


public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        Object texto = "Teste";
        ListaEncadeada<Object> lista = new ListaEncadeada<>();
        lista.adiciona(new Aluno(3, 10, "Antonio"));
        

        System.out.println(lista);
    }
}


