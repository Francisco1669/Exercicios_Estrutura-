import java.util.Arrays;

public class FilaVet implements IFila{
private int nElemFila;
private int inicio;
private Object[] vetFila;

public FilaVet(int tamFila) {
    this.inicio = 0;
    this.nElemFila = 0;
    this.vetFila = new Object[tamFila];
}
    @Override
    public boolean add(Object info) {
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade esgotada");
            return false;
        } else {
            int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
            this.vetFila[fim] = info;
            this.nElemFila++;
            return true;
        }
    }

    @Override
    public boolean remove() {
        if (this.isEmpty()) {
            System.out.println("A fila está vazia");
            return false;
        }
        this.inicio = (this.inicio +1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (this.nElemFila == 0) {
            return true;
        } return false;
    }

    @Override
    public int size() {
        return this.nElemFila;
    }
    @Override
    public String toString() {
        return "FilaVet nElemFila = " + nElemFila + ", inicio = " + inicio + ", vetFila = " + Arrays.toString(vetFila) ;
    }

    
    
}
