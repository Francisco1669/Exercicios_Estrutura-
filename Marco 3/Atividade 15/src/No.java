public class No {
    int valor;
    No esq;
    No dir;
    No pai;

    No(int info) {
        this.valor = info;
        this.dir = null;
        this.esq = null;
    }
}
