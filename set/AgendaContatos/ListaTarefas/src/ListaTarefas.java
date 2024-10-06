import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> tarefas;

    public ListaTarefas() {
        tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        if( !(tarefas.isEmpty())){
            for(Tarefa t : tarefas){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                }
            }
        }
        tarefas.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefas);
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!(tarefas.isEmpty())){
            for( Tarefa t : tarefas){
                if(t.isTarefaConcluida()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!(tarefas.isEmpty())){
            for( Tarefa t : tarefas){
                if(!(t.isTarefaConcluida())){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for( Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for( Tarefa t : tarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }


    public static void main(String[] args) {
        ListaTarefas setTarefas = new ListaTarefas();

        setTarefas.adicionarTarefa("descricao1");
        setTarefas.adicionarTarefa("descricao2");
        setTarefas.adicionarTarefa("descricao3");
        setTarefas.adicionarTarefa("descricao4");
        setTarefas.adicionarTarefa("descricao5");
        setTarefas.adicionarTarefa("descricao6");
        setTarefas.adicionarTarefa("descricao7");
        setTarefas.adicionarTarefa("descricao8");
        setTarefas.adicionarTarefa("descricao9");
        setTarefas.adicionarTarefa("descricao10");

        setTarefas.exibirTarefas();

        System.out.println("Total tarefas:" + setTarefas.contarTarefas());

        setTarefas.removerTarefa("descricao7");

        setTarefas.exibirTarefas();

        System.out.println("Tarefas Pendentes");
        System.out.println(setTarefas.obterTarefasPendentes());

        setTarefas.marcarTarefaConcluida("descricao3");
        setTarefas.marcarTarefaConcluida("descricao4");
        setTarefas.marcarTarefaConcluida("descricao5");
        setTarefas.marcarTarefaConcluida("descricao9");

        System.out.println("Tarefas Concluidas");
        System.out.println(setTarefas.obterTarefasConcluidas());

        setTarefas.marcarTarefaPendente("descricao9");

        setTarefas.exibirTarefas();

        setTarefas.limparListaTarefas();
    
        setTarefas.exibirTarefas();
    }

}
