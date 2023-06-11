public class No {
    private Object info;
    private No prox;

    public No(Object info) {
        this.info = info;
        this.prox = null;
    }
    public Object getInfo() {
        return info;
    }
    public void setInfo(Object info) {
        this.info = info;
    }
    public No getProx() {
        return prox;
    }
    public void setProx(No prox) {
        this.prox = prox;
    }
    @Override
    public String toString() {
        return "info = " + info + ", prox = "  + prox ;
    }
    
}
