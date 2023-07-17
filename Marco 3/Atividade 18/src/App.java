public class App {
    public static void main(String[] args) throws Exception {
        int[] arrayDesordenado = { 0,9,4,2,1,5,1,5,1,6,7,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6 };

        Ordens ordens = new Ordens();

        System.out.println("Heap Sort");
        ordens.heapSort(arrayDesordenado);

        System.out.println("\nQuick Sort");
        ordens.quickSort(arrayDesordenado);
    }
}
