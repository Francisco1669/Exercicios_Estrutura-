public class App {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 10; // O valor de 'n' que você deseja calcular
        int resultado = fibonacci.recursao(n);
        System.out.println("O " + n + "-ésimo número da sequência de Fibonacci é: " + resultado);
    }
}
