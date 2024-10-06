
import java.util.Objects;


public class Contato {

    private String nome;
    private int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }


    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "nome: " + nome + " - Numero: " + numero + "\n";
    }

    @Override
    public boolean equals(Object o){
        if( this == o){
            return true;
        }

        if(!(o instanceof Contato contato)){
            return false;
        }

        return getNome().equalsIgnoreCase(contato.getNome());
    }

    @Override
    public int hashCode(){
        return Objects.hash(getNome());
    }

}
