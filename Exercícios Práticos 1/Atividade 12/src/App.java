import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de l: ");
        int l = scanner.nextInt();

        System.out.print("Digite o valor de k: ");
        int k = scanner.nextInt();

        if(l >k) {
            System.out.println("O valor de l deve ser menor que o valor de k");
            scanner.close();
            return;
        }

        int resultado = calcula(l, k);

        System.out.println("O resultado do somatório é: " + resultado);

        scanner.close();
    }

    public static int calcula(int k, int l) {
        if (k == l) {
            return l;
        } else {
            return l + calcula(l + 1, k);
        }
    }

}