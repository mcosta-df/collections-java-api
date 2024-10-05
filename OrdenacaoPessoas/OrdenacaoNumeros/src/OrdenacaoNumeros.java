import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> listaInteiros;

    public OrdenacaoNumeros(){
        listaInteiros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);

    }
    
    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenadaAscendente = new ArrayList<>(listaInteiros);

        Collections.sort(listaOrdenadaAscendente);

        return listaOrdenadaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenadadecrescendente = new ArrayList<>(listaInteiros);

        Collections.sort(listaOrdenadadecrescendente, Collections.reverseOrder());

        return listaOrdenadadecrescendente;
    }


    public static void main(String[] args) {
         
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(1);
        

        System.out.println("Ordenacao ascendente");
        System.out.println(ordenacaoNumeros.ordenarAscendente());

        System.out.println("Ordenacao decescente");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
