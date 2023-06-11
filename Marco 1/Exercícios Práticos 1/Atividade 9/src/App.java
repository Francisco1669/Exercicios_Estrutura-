public class App {
    public static void main(String[] args) throws Exception {
        LSE lse = new LSE();

        lse.insereInicio(1);
        lse.insereFim(2);
        lse.insereFim(4);
        lse.insereFim(3);
        lse.insereFim(5);
        lse.insereInicio(6);

        lse.ordenar();

        System.out.println(lse.imprimeLista());
    }
}
