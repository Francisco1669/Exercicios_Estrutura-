public class ABB {
    private int size;
    private No raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    void add(int info, No lugar) {
    if (isEmpty()) {
        raiz = new No(info);
    } else {
        if (info < lugar.valor) {
            if (lugar.esq == null) {
                lugar.esq = new No(info);
            } else {
                add(info, lugar.esq);
            }
        } else if (info > lugar.valor) {
            if (lugar.dir == null) {
                lugar.dir = new No(info);
            } else {
                add(info, lugar.dir);
            }
        }
        // else { // Trate o caso de valor duplicado aqui }
    }
}


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    void preOrder(No lugar) {
        System.out.println("" + lugar.valor);
        if (lugar.esq != null) {
            preOrder(lugar.esq);
        }
        if (lugar.dir != null) {
            preOrder(lugar.dir);
        }
    }

    void emOrdem(No lugar) {
        if (lugar.esq != null) {
            emOrdem(lugar.esq);
        }

        System.out.println("" + lugar.valor);

        if (lugar.dir != null) {
            emOrdem(lugar.dir);
        }
    }

    void posOrdem(No lugar) {
        if (lugar.esq != null) {
            emOrdem(lugar.esq);
        }
        if (lugar.dir != null) {
            emOrdem(lugar.dir);
        }
        System.out.println("" + lugar.valor);
    }
}