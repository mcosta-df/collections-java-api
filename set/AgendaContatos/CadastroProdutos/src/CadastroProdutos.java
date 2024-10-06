
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add( new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosOrdenadosPorNOme = new TreeSet<>(produtos);
        return produtosOrdenadosPorNOme;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosOrdenadosPorPreco = new TreeSet<>(new OrdenaPorPreco());
        produtosOrdenadosPorPreco.addAll(produtos);
        return produtosOrdenadosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(111, "laranja", 20.0, 10);
        cadastroProdutos.adicionarProduto(222, "banana", 30.0, 20);
        cadastroProdutos.adicionarProduto(333, "melancia", 35.0, 50);
        cadastroProdutos.adicionarProduto(444, "batata", 40.0, 45);
        cadastroProdutos.adicionarProduto(555, "beterraba", 45.0, 33);
        cadastroProdutos.adicionarProduto(666, "alface", 28.0, 55);
        cadastroProdutos.adicionarProduto(777, "arroz", 33.0, 5);
        cadastroProdutos.adicionarProduto(888, "feijao", 22.0, 12);
        cadastroProdutos.adicionarProduto(999, "goiaba", 33.5, 66);
        cadastroProdutos.adicionarProduto(1010, "pimenta", 16.0, 9);

        System.out.println("Produtos por nome");
        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println("Produtos por preco");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}
