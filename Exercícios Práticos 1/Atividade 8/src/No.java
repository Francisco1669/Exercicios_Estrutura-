public class No {
    private int info;
    private No proximo;
    private No anterior;

    public No(int info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
    }

    public int getInfo() { 
        return this.info;
    }

    public No getProximo() { 
        return this.proximo;
    }

    public void setProximo(No n) {
        this.proximo = n;
    }

    public No getAnterior() { 
        return this.anterior;
    }

    public void setAnterior(No n) {
        this.anterior = n;
    }
}
