public class No {

    private Object info;
    private No proximo;

    public No(Object info) {
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() { 
        return this.info;
    }

    public No getProximo() { 
        return this.proximo;
    }

    public void setProximo(No n) {
        this.proximo = n;
    }
}