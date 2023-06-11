public class App {
    public static void main(String[] args) throws Exception {
        LDE nova = new LDE();
        nova.add_ordenado(2);
        nova.add_ordenado(1);
        nova.add_ordenado(0);
        nova.add_ordenado(7);
        System.out.println(nova.getListaInicio());

        System.out.println(nova.getListaFim());
    }
}
