import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
       LDE novo = new LDE();

       Random random = new Random(300);

       for (int i = 0 ; i< 50 ; i++) {
            novo.insereInicio(random.nextInt());
       }
       novo.nroPares();
       System.out.println("O numero de pares é" + novo.nroPares());
    }
}
