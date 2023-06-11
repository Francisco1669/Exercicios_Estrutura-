public class PilhaVet implements IPilha {

    private Object[] pilha;
    private int numElem;

    public PilhaVet(int tamanhoVetor) {
        this.pilha = new Object[tamanhoVetor];
        this.numElem = 0;

    }

    @Override
    public Object pop() {
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        o = this.pilha[numElem - 1];
        this.pilha[numElem - 1] = null;
        this.numElem--;
        return o;
    }

    @Override
    public boolean isEmpty() {
        if (numElem == 0) {
            return true;
        } return false;
    }

    @Override
    public int size() {
        return numElem;
    }

    @Override
    public boolean push(Object info) {
        if (this.numElem == pilha.length) {
            System.out.println("Pilha estourou");
            return false;
        }
        this.pilha[this.numElem] = info;
        this.numElem++;
        return true;
    }

    @Override
    public Object top() {
        Object o = null;
        if (this.isEmpty()) {
            System.out.println("Pilha Vazia");
            return null;
        }
        o = this.pilha[numElem - 1];       
        return o;
    }

    public boolean palindromo(String palavra) {
        palavra = palavra.replaceAll("\\s+", "").toLowerCase();

        PilhaVet pilha = new PilhaVet(palavra.length());

        for (int i = 0; i < palavra.length(); i++) {
            pilha.push(palavra.charAt(i));
        }

        StringBuilder palavraInvertida = new StringBuilder();           //StringBuilder manipula a palavra
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }

        return palavra.equals(palavraInvertida.toString());
    }

    public void printState() {
        for (int i = numElem - 1; i >= 0; i--) {
            System.out.print(pilha[i] + " ");
        }
        System.out.println();
    }


}