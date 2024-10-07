import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    Map<String, Integer> contatos;

    public AgendaContatos(){
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!(contatos.isEmpty())){
            contatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer telefone = null;
        if(!(contatos.isEmpty())){
            telefone = contatos.get(nome);
        }
        return telefone;
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Antonio", 2323);
        agendaContatos.adicionarContato("Joaquim", 4443);
        agendaContatos.adicionarContato("Lucas", 5550);
        agendaContatos.adicionarContato("Pedro", 6663);
        agendaContatos.adicionarContato("Carlos", 3336);
        agendaContatos.adicionarContato("Ana", 1414);
        agendaContatos.adicionarContato("Joao", 3332);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Lucas");

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Pedro"));
    }

}
