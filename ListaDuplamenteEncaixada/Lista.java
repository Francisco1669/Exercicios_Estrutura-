package ListaDuplamenteEncaixada;

public interface Lista {
    public void remove(int elemento);
    public void insereInicio(int elemento);
    public void insereFim(int elemento);
    public int tamanho();
    public boolean isVazia();
}
