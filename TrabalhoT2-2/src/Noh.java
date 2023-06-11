public class Noh {
    
    private Object info;
    private Noh proximo;

    public Noh(Object object) {
        this.info = object;
        this.proximo = null;
    }

    public Object getInfo() { 
        return this.info;
    }

    public Noh getProximo() { 
        return this.proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }
}
