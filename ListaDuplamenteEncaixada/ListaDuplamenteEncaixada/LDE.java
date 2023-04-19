package ListaDuplamenteEncaixada;

public class LDE implements Lista{
    
    private No inicio;
    private No fim;

    public LDE() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Object info) {
        No novo = new No(info);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(Object info) {
        No novo = new No(info);

        if (fim == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
    }

    @Override
    public boolean isVazia() {
        return inicio == null || fim == null;
    }

    @Override
    public boolean remove(Object info) {
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

    public No consultarInfo(Object info) {
        No p = inicio;

        while (p != null && !p.getInfo().equals(info)) {
            p = p.getProximo();
        }

        return p;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;

        for (No i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }

    @Override
    public String getListaInicio() {
        String lista = "";

        for (No i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }

    @Override
    public String getListaFim() {
        String lista = "";

        for (No i = fim; i != null; i = i.getAnterior()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }
    

   
}
