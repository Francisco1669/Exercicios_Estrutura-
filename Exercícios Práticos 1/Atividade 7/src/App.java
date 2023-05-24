public class App {
    public static void main(String[] args) throws Exception {
        Lista lista = new LSE();

        lista.insereFim(1);
        lista.insereFim(2);
        lista.insereFim(3);
        lista.insereInicio(4);

        lista.imprime_rec();;
    }
}
