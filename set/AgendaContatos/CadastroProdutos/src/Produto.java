
import java.util.Objects;

public class Produto implements Comparable<Produto>{

    private long cod;
    private String nome; 
    private double preco;
    private int quantidade;

    public Produto(long cod, String nome, double preco, int quantidade) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Long getCod(){
        return cod;
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(getCod());
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj){
            return true;
        }

        if( !(obj instanceof Produto produto)){
            return false;
        }

        return getCod() == produto.getCod();
    }

    @Override
    public String toString() {
       return "Codigo: " + cod + " - Nome: " + nome + " - Preco: " + preco + " - Quantidade: " + quantidade + "\n";
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

}
