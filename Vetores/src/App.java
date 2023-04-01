
public class App {
    public static void main(String[] args) throws Exception {

        Aluno a1 = new Aluno("Francisco", 19, 10.0);
        Aluno a2 = new Aluno("Vinicius", 19, 0.0);

        Vetor vetorAluno = new Vetor();
    
        vetorAluno.adiciona(a1);
        System.out.println(vetorAluno.contem(a2));
        System.out.println(vetorAluno.tamanho());
 

        
    }
}
