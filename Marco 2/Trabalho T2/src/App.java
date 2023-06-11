public class App {
    public static void main(String[] args) throws Exception {
       PilhaVet pilha = new PilhaVet(40);
       String palavra = "ovo";
       pilha.palindromo(palavra);
       boolean resultado = pilha.palindromo(palavra); 
        System.out.println("A palavra '" + palavra + "' é um palíndromo? " + resultado);
        pilha.printState(); 

        
    }
}
