package Busca;

import java.util.Random;



public class App {
    public static void main(String[] args) throws Exception {
        int n = 1000;

        Random gerador = new Random();

        Busca.Vetor vetor = new Busca.Vetor(n);

        for(int j = 0; j < n-1; j++) {
            int numeroAleatorio = gerador.nextInt(n);
            vetor.adiciona(numeroAleatorio);
        }

        vetor.adiciona(10);


        long tempoComeco = System.nanoTime();
        boolean buscaBinariaIterativa = vetor.buscaBinariaIterativa(10);
        long tempoFinal = System.nanoTime();

        long tempo = tempoFinal - tempoComeco;

        System.out.println("Busca iterativa; Encontrado: " + buscaBinariaIterativa + "; Tempo: " + tempo + "ns");

        tempoComeco = System.nanoTime();
        boolean buscaBinariaRecursiva = vetor.buscaBinariaRecursiva(10);
        tempoFinal = System.nanoTime();

        tempo = tempoFinal - tempoComeco;

        System.out.println("Busca recursiva; Encontrado: " + buscaBinariaRecursiva + "; Tempo: " + tempo + "ns");
    }
}
