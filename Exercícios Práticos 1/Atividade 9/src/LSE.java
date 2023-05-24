public class LSE implements Lista{
    private No inicio;

    public LSE() {
        this.inicio = null;
    }

    @Override
    public void insereInicio(Object info) {

        No novo = new No(info);

        if(this.inicio == null) {
            this.inicio = novo;
        } else {
            novo.setProximo(this.inicio);
            this.inicio = novo;
        }

    }

    @Override
    public void insereFim(Object info) {

        No novo = new No(info);

        if(inicio == null) {
            inicio = novo;
        } else {
            No ultimo = null;
            for(No i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(novo);
        }

    }

    @Override
    public boolean isVazia() {
        return inicio == null;
    }

    @Override
    public boolean remove(Object info) {

        No anterior = null;
        No atual = inicio;

        while(atual != null && !atual.getInfo().equals(info)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if(atual == null) {
            return false;
        }

        if(anterior == null) {
            inicio = atual.getProximo();
        } else {
            anterior.setProximo(atual.getProximo());
        }

        return true;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;

        for(No i = inicio; i != null; i = i.getProximo()) {
            tamanho++;
        }

        return tamanho;
    }

    @Override
    public String imprimeLista() {

        String lista = "";

        for(No i = inicio; i != null; i = i.getProximo()) {
            lista += i.getInfo() + " ";
        }

        return lista;
    }

    @Override
    public void ordenar() {

        for(No i = inicio; i != null; i = i.getProximo()) {
            for(No j = inicio; j != null; j = j.getProximo()) {
                if((int) i.getInfo() < (int) j.getInfo()) {
                    Object aux = i.getInfo();
                    i.setInfo(j.getInfo());
                    j.setInfo(aux);
                }
            }
        }
        

    }
}
