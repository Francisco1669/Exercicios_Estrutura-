import java.util.Arrays;

public class MapaHashVetor {
    private Aluno[] vetor;

    public MapaHashVetor() {
        this.vetor = new Aluno[20];
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;

            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                return;
            }
            sondagem++;
        }
        System.out.println("Não foi possível inserir o aluno com chave " + chave + ". O mapa está cheio ou ocorreu uma colisão excessiva.");

    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash] = null;
        return aluno;
    }

    @Override
    public String toString() {
        return "MapaHashVetor [vetor=" + Arrays.toString(vetor) + "]";
    }
}
