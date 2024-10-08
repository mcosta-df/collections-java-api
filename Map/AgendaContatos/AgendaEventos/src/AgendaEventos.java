
import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        if(!(eventos.isEmpty())){
            Map<LocalDate, Evento> eventosTreemap = new TreeMap<>(eventos);
            System.out.println(eventosTreemap);
        }
    }

    public void obterProximoEvento(){
        if(!(eventos.isEmpty())){
            Map<LocalDate, Evento> eventosTreemap = new TreeMap<>(eventos);
            LocalDate dataAtual = LocalDate.now();

            for(Map.Entry<LocalDate, Evento> e : eventosTreemap.entrySet()){
                if(e.getKey().isEqual(dataAtual) || e.getKey().isAfter(dataAtual)){
                    System.out.println("O evento " + e.getValue() + " serta na data" + e.getKey());
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 20), "evento1", "atracao1");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 11), "evento2", "atracao2");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 10), "evento3", "atracao3");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 8), "evento4", "atracao4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 9), "evento5", "atracao5");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 6), "evento6", "atracao6");
        

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();

    }   

    
}
