public class Vetor {
    private Aluno[] alunos;
    private int totalAlunos;

    public Vetor (int tamanho) {
        alunos = new Aluno[tamanho];
    }
    public Vetor () {
        alunos = new Aluno[1];
    }
    public void adiciona (Aluno aluno) {
        alunos[totalAlunos] = aluno;
        totalAlunos++;
    }
    public boolean contem (Aluno aluno) {
        for(int i=0; i<totalAlunos; i++) {
            if (alunos[i].getNome().equals(aluno.getNome())) {
                return true;
            }
        }
        return false;
    }   public int tamanho () {
        return totalAlunos;
    }
}
