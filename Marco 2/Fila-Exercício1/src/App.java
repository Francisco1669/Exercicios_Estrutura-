public class App {
    public static void main(String[] args) throws Exception {
        FilaVet novo = new FilaVet(10);
        novo.add(1);
        novo.add(10);
        novo.add(10);
        novo.add(10);
        novo.add(10);
        novo.add(10);

        novo.imprimirFila();

        novo.remove();

        novo.imprimirFila();

    }
}
