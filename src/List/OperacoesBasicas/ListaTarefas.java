package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }
    

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();

        for(Tarefa tarefa : listaTarefas){
            
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemover.add(tarefa);
            }
        }

        listaTarefas.removeAll(tarefasRemover);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(listaTarefas);

    }

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        System.out.println("Quantidade de tarefas na lista: " + tarefas.obterNumeroTotalTarefas());
        
        tarefas.adicionarTarefa("primeira tarefa");
        tarefas.adicionarTarefa("segunda tarefa");
        tarefas.adicionarTarefa("terceira tarefa");
        tarefas.adicionarTarefa("quarta tarefa");
        tarefas.adicionarTarefa("quinta tarefa");
        tarefas.adicionarTarefa("quinta tarefa");
        tarefas.adicionarTarefa("quinta tarefa");
        tarefas.adicionarTarefa("quinta tarefa");

        tarefas.obterDescricoesTarefas();

        System.out.println("Quantidade de tarefas na lista: " + tarefas.obterNumeroTotalTarefas());

        tarefas.removerTarefa("quinta tarefa");
        
        tarefas.obterDescricoesTarefas();

        System.out.println("Quantidade de tarefas na lista: " + tarefas.obterNumeroTotalTarefas());
    }

    
}
