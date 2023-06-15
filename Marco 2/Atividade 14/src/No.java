public class No {
    private Aluno info;
    private No proximo;

    public No(Aluno info) {
        this.info = info;
        this.proximo = null;
    }

    public Aluno getInfo() { 
        return this.info;
    }

    public void setInfo(Aluno info) {
        this.info = info;
    }

    public No getProximo() { 
        return this.proximo;
    }

    public void setProximo(No n) {
        this.proximo = n;
    }
}
