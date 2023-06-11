public class App {
     public static void main(String[] args) {

        LSE lista = new LSE();

        Aluno a8 = new Aluno("Francisco", 8, 8);
        Aluno a3 = new Aluno("Mauricio", 7, 7);
        Aluno a4 = new Aluno("Gabriel", 9, 4);
        Aluno a5 = new Aluno("Pedro", 5, 10);

        lista.insereInicio(a8);
        lista.insereFim(a3);
        
        lista.insereFim(a4);
        lista.insereFim(a5);

        System.out.println("Lista normal: " + lista.toStringLista());
        System.out.println("\n");
        lista.trocaLista();

        System.out.println("Lista invertida: " + lista.toStringLista());
    }
}
