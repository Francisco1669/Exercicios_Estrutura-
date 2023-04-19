package ListaDuplamenteEncaixada;

public class LDETeste {
    public static void main(String[] args) {
        Lista lista = new LDE();

        lista.insereInicio(1);
        lista.insereInicio(2);

        System.out.println(lista.getListaInicio());
        System.out.println(lista.getListaFim());

    }
}
