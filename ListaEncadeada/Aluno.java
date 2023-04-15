package ListaEncadeada;


public class Aluno {

    private int idade;
    private float nota;
    private String nome;
    
    public Aluno(int idade, float nota, String nome) {
        this.idade = idade;
        this.nota = nota;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno idade= " + idade + ", nota= " + nota + ", nome= " + nome ;
    }

    
    
}
