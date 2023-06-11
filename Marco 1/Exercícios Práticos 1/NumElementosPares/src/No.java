public class No {
   
    private Object info;
    private No proximo;
    private No anterior;

    public No(Object info) {
        this.info = info;
        this.proximo = null;
        this.anterior = null;
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

    public No getAnterior() { 
        return this.anterior;
    }

    public void setAnterior(No n) {
        this.anterior = n;
    }
    
}