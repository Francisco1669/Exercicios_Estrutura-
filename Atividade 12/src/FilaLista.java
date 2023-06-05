public class FilaLista implements IFila{
    private No inicio;
    private No fim;

    public FilaLista() {
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean add(Object info) {
        No novo = new No(info);
        if (this.isEmpty()) {
            inicio = novo;
        } else {
            fim.setProx(novo);
        }fim = novo;
        return true;
    }

    @Override
    public boolean remove() {
        if (!isEmpty()) {
            if (inicio == fim) {
                inicio = null;
                fim = null;
            } else {
                inicio = inicio.getProx();

            } return true;
        } return false;
    }

    @Override
    public boolean isEmpty() {
        if (inicio == null || fim == null) {
            return true;
        } return false;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public String toString() {
        return "Inicio da fila = " + inicio + ", fim da fila = " + fim ;
    }
}
