public class App {
    public static void main(String[] args) throws Exception {
        LDE l1 = new LDE();

        l1.insereFim(3);
        l1.insereFim(42);
        l1.insereFim(9);
        l1.insereFim(5);

        LDE l2 = new LDE();

        l2.insereFim(1);
        l2.insereFim(2);
        l2.insereFim(8);
        l2.insereFim(4);

        l1.concat(l2);

        System.out.println(l1.getListaInicio());
    }
}
