import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    Set<String> conjutoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjutoPalavrasUnicas = new HashSet<>();

    }

    public void adicionarPalavra(String palavra){
        conjutoPalavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){
        conjutoPalavrasUnicas.remove(palavra);
    }

    public boolean verificarPalavra(String palavra){
        return conjutoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjutoPalavrasUnicas);
    }

    public static void main(String[] args) {
        
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("joao");
        conjuntoPalavrasUnicas.adicionarPalavra("maria");
        conjuntoPalavrasUnicas.adicionarPalavra("pedro");
        conjuntoPalavrasUnicas.adicionarPalavra("jose");
        conjuntoPalavrasUnicas.adicionarPalavra("lucia");
        conjuntoPalavrasUnicas.adicionarPalavra("paulo");
        conjuntoPalavrasUnicas.adicionarPalavra("paulo");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("lucia");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        if(conjuntoPalavrasUnicas.verificarPalavra("marcia")){
            System.out.println("existe");
        }else{
            System.out.println("nao existe");
        }
    }

}
