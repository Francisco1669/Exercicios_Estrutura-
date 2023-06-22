import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        ABB arvore = new ABB();

        

        for (int i = 0; i < 10; i++) {
            arvore.add(rand.nextInt(50), arvore.getRaiz());
        }   arvore.add(10, arvore.getRaiz());

        arvore.buscaIter(10);
        System.out.println(arvore.buscaIter(10));

    }
}
