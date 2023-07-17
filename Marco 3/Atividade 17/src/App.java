public class App {
    public static void main(String[] args) throws Exception {
        AVL arvoreAVL = new AVL();

        arvoreAVL.add(11, arvoreAVL.getRaiz());
        arvoreAVL.add(17, arvoreAVL.getRaiz());
        arvoreAVL.add(35, arvoreAVL.getRaiz());
        arvoreAVL.add(00, arvoreAVL.getRaiz());
        arvoreAVL.add(135, arvoreAVL.getRaiz());
        arvoreAVL.add(462, arvoreAVL.getRaiz());
        arvoreAVL.add(63, arvoreAVL.getRaiz());

        arvoreAVL.ehArvoreBalanceada(arvoreAVL.getRaiz());
       
        if (arvoreAVL.ehArvoreBalanceada(arvoreAVL.getRaiz())) {
            System.out.println("Balanceada");
        }
    }
}
