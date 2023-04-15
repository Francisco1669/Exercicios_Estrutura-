package ListaEncadeada;

public class ListaEncadeada<Object>  {

    private No<Object> inicio;
    private No<Object> ultimo;
    private int tamanho;


    public void adiciona(Object elemento) {
        No<Object> celula = new No<Object>(elemento);

        if (this.tamanho ==  0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }       
            this.ultimo = celula;
            tamanho++;

    }
    
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        return " inicio= " + inicio + "";
    }

    
}