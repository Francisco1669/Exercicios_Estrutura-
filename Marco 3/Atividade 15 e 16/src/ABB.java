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
        }
    }

    public void remove(int valor) {
        No aux = this.raiz;

        while (aux != null) {
            if (aux.valor == valor) {
                if (aux.dir != null && aux.esq != null) {                       //Caso de ter dois filhos diferentes de null
                    aux.valor = aux.esq.valor;
                    remove(valor);
                } else if (aux.dir.equals(null) || aux.esq.equals(null)) { //Caso de ter apenas um filho como null
                    if (aux.dir.equals(null)) {
                        aux.esq = aux.pai;
                    } else if (aux.esq.equals(null)) {
                        aux.dir = aux.pai;
                    } if (this.raiz.equals(aux)) {
                        aux = null;
                    }
                } else if (aux.dir.equals(null) && aux.esq.equals(null)) {
                    aux.valor = aux.pai.valor;
                    aux.dir = null;
                    aux.esq = null;
                    
                }

            }

            if (valor < aux.valor) {
                aux = aux.esq;
            }

            else if (valor > aux.valor) {
                aux = aux.dir;
            }
        }
    }

    public boolean buscaIter(int valor) {
        No aux = this.raiz;
        while (aux != null) {
            if (aux.valor == valor) {
                return true;
            }

            if (valor < aux.valor) {
                aux = aux.esq;
            }

            else if (valor > aux.valor) {
                aux = aux.dir;
            }

        }
        return false;
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