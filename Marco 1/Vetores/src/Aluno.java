import java.util.ArrayList;

public class Aluno {
    private int idade;
    private String nome;
    private Double nota;
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Aluno (String nome, int idade, Double nota) {
        this.idade = idade;
        this.nome = nome;
        this.nota = nota;
    }


    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Double return the nota
     */
    public Double getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(Double nota) {
        this.nota = nota;
    }

}
