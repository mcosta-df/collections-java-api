package List.OperacoesBasicas.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinho;

    public CarrinhoDeCompras(){
        carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemRemover = new ArrayList<>();

        for( Item item : carrinho){
            if( item.getNome().equalsIgnoreCase(nome)){
                itemRemover.add(item);
            }
        }

        carrinho.removeAll(itemRemover);
    }

    public Double calcularValorTotal(){
        Double total = 0.0;
        for(Item item : carrinho){
            total = total + (item.getPreco() * item.getQuantidade());
        }

        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }


    public static void main(String[] args) {
        
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.exibirItens();

        carrinho.adicionarItem("televisor", 3000.0, 2);
        carrinho.adicionarItem("computador", 2000.0, 1);
        carrinho.adicionarItem("teclado", 500.0, 3);
        carrinho.adicionarItem("televisor", 3000.0, 2);

        carrinho.exibirItens();

        System.out.println("Valor total: " + carrinho.calcularValorTotal());

        carrinho.removerItem("televisor");

        carrinho.exibirItens();

        System.out.println("Valor total: " + carrinho.calcularValorTotal());
    }

}

