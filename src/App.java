public class App {
    public static void main(String[] args) throws Exception {
        PontoCartesiano pontos = new PontoCartesiano(4, 1);


        PontoCartesiano p1 = new PontoCartesiano(1, 9);
        PontoCartesiano p2 = new PontoCartesiano(3, 6);

        pontos.calcularDistancia(p1, p2);    
        System.out.println("A distância entre os dois pontos é de: "
       + PontoCartesiano.getdistancia());
    
    
    }
}
