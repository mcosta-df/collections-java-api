import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> contatos;

    public AgendaContatos(){
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> setContato = new HashSet<>();

        for(Contato c : contatos){
            if(c.getNome().startsWith(nome)){
                setContato.add(c);
            }
        }
        return setContato;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato c = null;

        for(Contato contato : contatos){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                c = contato;
                break;
            }
        }
        return c;
    }


    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("joao jose", 111);
        agendaContatos.adicionarContato("jose joao", 222);
        agendaContatos.adicionarContato("maria a", 333);
        agendaContatos.adicionarContato("maria a", 444);
        agendaContatos.adicionarContato("marcia b", 555);
        agendaContatos.adicionarContato("joao carlos", 666);
        agendaContatos.adicionarContato("carla cristina", 7777);


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("maria"));

        agendaContatos.atualizarNumeroContato("marcia b", 9999);

        agendaContatos.exibirContatos();;
    }
}
