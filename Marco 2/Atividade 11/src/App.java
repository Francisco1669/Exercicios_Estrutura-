public class App {
    public static void main(String[] args) throws Exception {

        FilaVet nova = new FilaVet(10);
        nova.add(1);
        nova.add(2);

        System.out.println(nova.toString());

    }
}
