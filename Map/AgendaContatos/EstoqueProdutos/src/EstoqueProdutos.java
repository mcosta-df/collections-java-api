import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    Map<Long, Produto> estoque;

    public EstoqueProdutos() {
        estoque = new HashMap<>();
    }



    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public Double calcularValorTotalEstoque(){
        Double valorEstoque = 0.0;
        if(!(estoque.isEmpty())){
            for( Produto p : estoque.values()){
                valorEstoque += (p.getPreco() * p.getQuantidade());    
            }
        }
        return valorEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produto = null;
        Double maiorValor = Double.MIN_VALUE;
        if(!(estoque.isEmpty())){
            for( Produto p : estoque.values()){
                if(p.getPreco() > maiorValor){
                    maiorValor = p.getPreco();
                    produto = p;
                }       
            }
        }
        return produto;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produto = null;
        Double menorvALOR = Double.MAX_VALUE;

        if(!(estoque.isEmpty())){
            for(Produto p : estoque.values()){
                if(p.getPreco() < menorvALOR){
                    menorvALOR = p.getPreco();
                    produto = p;
                }
            }
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produto = null;
        Double maiorValor = Double.MIN_VALUE;

        if(!(estoque.isEmpty())){
            for(Produto p : estoque.values()){
                if((p.getPreco() * p.getQuantidade()) > maiorValor){
                    maiorValor = (p.getPreco() * p.getQuantidade());
                    produto = p;
                }
            }
        }
        return produto;
    }

    public static void main(String[] args) {
        
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(333l, "maca", 50, 20.0);
        estoqueProdutos.adicionarProduto(555l, "abacate", 10, 5.0);
        estoqueProdutos.adicionarProduto(222l, "caju", 40, 10.0);
        estoqueProdutos.adicionarProduto(111l, "banana", 30, 2.0);
        estoqueProdutos.adicionarProduto(444l, "alho", 20, 10.0);

        estoqueProdutos.exibirProdutos();

        System.out.println(estoqueProdutos.calcularValorTotalEstoque());

        System.out.println("Produto mais caro");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("Produto mais barato");
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());

        System.out.println("Maior valor valor total");
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }
}
