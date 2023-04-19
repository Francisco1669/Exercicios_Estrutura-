package ListaDuplamenteEncaixada;

public class LDE implements Lista{
    
    private No inicio;
    private No fim;
    private int tamanho;

    
    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    @Override
    public boolean remove(int elemento) {
        No p = consultarInfo(info);

        if (p == null) {
            return false;
        }

        if (p == inicio) {
            inicio = p.getProximo();

            if (inicio != null) {
                inicio.setAnterior(null);
            } else {
                fim = null;
            }

        } else if (p.getProximo() == null) {
            p.getAnterior().setProximo(null);
            fim = p.getAnterior();
        } else {
            p.getAnterior().setProximo(p.getProximo());
            p.getProximo().setAnterior(p.getAnterior());
        }
        return true;
    }
    

    @Override
    public void insereInicio(int elemento) {
        No novo = new No(elemento); 
        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio); //Aponta o atributo proximo do novo No para o valor do No que era inicio
            inicio.setAnterior(novo); //Aponta o atributo anterior do No que era inicio para o valor do novo No que agora é inicio
            inicio = novo; // o atributo inicio é alterado para o novo No criado, indicando ser o novo inicio da fila
        } tamanho++;
    }

    @Override
    public void insereFim(int elemento) {
        No novo = new No(elemento); 
        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else { //Manipula os membros proximo e anterior dos Nos
            novo.setAnterior(fim); //Aponta o anterior do novo No para o valor de fim que por enquanto é o último valor
            fim.setProximo(novo); //Aponta o proximo para o novo valor criado
            fim = novo; //Agora, o No criado é o novo fim da lista
        } tamanho++;
    }
    

    @Override
    public int tamanho() {return tamanho;}

    @Override
    public boolean isVazia() {
        if (inicio == null) {
            return true;
        } return false;
    }
    public No consultarInfo(int info) {
        No p = inicio;

        while (p != null && p.getInfo() != info) {
            p = p.getProximo();
        }

        return p;
    }

    @Override
    public String getListaInicio() {
        String lista = "";

        for (Noh i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }

    @Override
    public String getListaFim() {
        String lista = "";

        for (Noh i = fim; i != null; i = i.getAnterior()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
    
}
