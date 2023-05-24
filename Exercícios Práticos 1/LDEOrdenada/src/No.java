public class No {
   
    private No info;
    private No proximo;
    private No anterior;

    public No(No info2) {
        this.info = info2;
        this.proximo = null;
        this.anterior = null;
    }

    public No getInfo() { 
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