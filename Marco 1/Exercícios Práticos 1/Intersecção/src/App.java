import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 50;
        int k = 50;
        boolean isEquals = false;
        Random ale = new Random(k);
        int vetor[] = new int[n];
        int vetor2[] = new int[k];
        
        int vetorInter[] = new int[50];
        

        for(int i=0 ; i<n ; i++) {
            vetor[i] = ale.nextInt(150);
        }
        for(int i=0 ; i<k ; i++) {
            vetor2[i] = ale.nextInt(150);
        }

        System.out.println(Arrays.toString(vetor));
        System.out.println("DIVISAAAAO");
        System.out.println(Arrays.toString(vetor2));

            for(int i = 0 ; i < vetor.length ; i++) {

                for (int j = 0; j < vetor2.length; j++) {
                    if (vetor[i] == vetor2[j]) {
                        isEquals = true;
                        vetorInter[i] = vetor[i];
                    }
                }
            }
        
            System.out.println("Os vetores possuem intersecção " + isEquals);
            System.out.println("Aqui está a intersecção: " + Arrays.toString(vetorInter));
        
    }
}
