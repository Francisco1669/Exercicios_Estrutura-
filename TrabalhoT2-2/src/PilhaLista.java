public class PilhaLista implements IPilha {
    private No topo;
    private int size = 0;

    public PilhaLista() {
        this.topo = null;
        this.size = 0;
    }

    @Override
    public boolean push(Object info) {
        No novo = new No(info);
        if (this.isEmpty()) {
            topo = novo;
        } else {
            novo.setProx(topo);
            topo = novo;
        }
        size++;
        return true;
    }

    @Override
    public Object pop() {
        Object info = null;
        if (!this.isEmpty()) {
            info = topo.getInfo();
            topo = topo.getProx();
        }   size--;
        return info;
    }

    @Override
    public Object top() {
        return topo;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "PilhaLista topo = " + topo + ", tamanho = " + size;
    }

}
