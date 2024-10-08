import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    Map<String, Integer> palavras;

    public ContagemPalavras() {
        palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        
        if(!(palavras.isEmpty())){
            palavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(palavras);
    }

    public String encontrarPalavraMaisFrequente(){
        int maisFrequent = Integer.MIN_VALUE;
        String palavra = null;

        if(!(palavras.isEmpty())){

            for(Map.Entry<String, Integer> p : palavras.entrySet()){

                if(p.getValue() > maisFrequent){
                    maisFrequent = p.getValue();
                    palavra = p.getKey();
                }
            }
        }
        return palavra;
    }

    public static void main(String[] args) {
        
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("palavra1", 50);
        contagemPalavras.adicionarPalavra("palavra2", 45);
        contagemPalavras.adicionarPalavra("palavra3", 10);
        contagemPalavras.adicionarPalavra("palavra4", 5);
        contagemPalavras.adicionarPalavra("palavra5", 70);


        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("palavra4");

        contagemPalavras.exibirContagemPalavras();

        System.out.println(contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
