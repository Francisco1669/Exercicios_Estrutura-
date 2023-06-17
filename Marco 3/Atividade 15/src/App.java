import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        ABB arvore = new ABB();

        arvore.add(10, arvore.getRaiz());

        for (int i = 0; i < 10; i++) {
            arvore.add(rand.nextInt(50), arvore.getRaiz());
        }

        System.out.println("\n ");
        arvore.emOrdem(arvore.getRaiz());
    }
}
