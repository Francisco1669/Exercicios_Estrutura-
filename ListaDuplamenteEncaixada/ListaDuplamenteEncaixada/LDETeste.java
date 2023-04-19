package ListaDuplamenteEncaixada;
public class LDETeste {
    public static void main(String[] args) {
        Lista lista = new LDE();

        Aluno aluno18 = new Aluno("Mauricio", 0, 18);
        Aluno aluno2 = new Aluno("Matheus", 9, 18);
        Aluno aluno3 = new Aluno("Bruna", 8, 18);
        Aluno aluno4 = new Aluno("Francisco", 2, 18);

        System.out.println(lista.isVazia());

        lista.insereInicio(aluno18);
        lista.insereFim(aluno2);
        lista.insereFim(aluno3);
        lista.insereFim(aluno4);

        System.out.println(lista.isVazia());

        System.out.println(lista.getListaInicio());
        System.out.println(lista.getListaFim());

        lista.remove(aluno2);

        System.out.println(lista.getListaInicio());
    }
}
