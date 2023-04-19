package armazenar_vetor.src;


import java.util.ArrayList;

public class Vetor<T> {
    private ArrayList<T> itens;

    public Vetor() {
        itens = new ArrayList<>();
    }

    public void adicionar(T item) {
        itens.add(item);
    }

    public void remover(T item) {
        itens.remove(item);
    }

    public T get(int index) {
        return itens.get(index);
    }

    public void set(int index, T item) {
        itens.set(index, item);
    }

    public int tamanho() {
        return itens.size();
    }
}
