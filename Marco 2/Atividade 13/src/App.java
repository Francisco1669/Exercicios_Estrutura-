public class App {
    public static void main(String[] args) throws Exception {
        MapaHashVetor novo = new MapaHashVetor();
        Aluno a1 = new Aluno(3456789, "TZ");
        Aluno a2 = new Aluno(3456729, "Joao");
        Aluno a3 = new Aluno(3456719, "GHC");
        Aluno a4 = new Aluno(3456749, "Haskell");
        novo.put(3456789, a1);
        novo.put(3456789, a2);
        novo.put(3456789, a3);
        novo.put(3456789, a4);
        System.out.println(novo.toString());
    }
}
