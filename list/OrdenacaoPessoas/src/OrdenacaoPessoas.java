import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> listaPessoaOrdenadaPorIdade = new ArrayList<>(listaPessoas);

        Collections.sort(listaPessoaOrdenadaPorIdade);
        return listaPessoaOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> listaPessoaOrdenadaPorAltura = new ArrayList<>(listaPessoas);

        Collections.sort(listaPessoaOrdenadaPorAltura, new OrdenarPorAltura());

        return listaPessoaOrdenadaPorAltura;
    }


    public static void main(String []  args){
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("nome", 100, 1.78);
        ordenacaoPessoas.adicionarPessoa("nome1", 40, 1.70);
        ordenacaoPessoas.adicionarPessoa("nome2", 30, 1.60);
        ordenacaoPessoas.adicionarPessoa("nome3", 28, 1.78);
        ordenacaoPessoas.adicionarPessoa("nome4", 42, 1.77);
        ordenacaoPessoas.adicionarPessoa("nome5", 20, 1.85);
        ordenacaoPessoas.adicionarPessoa("nome6", 22, 1.55);

        System.out.println("ordenacao por idade");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println("Ordenacao por altura");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());

    }
}
