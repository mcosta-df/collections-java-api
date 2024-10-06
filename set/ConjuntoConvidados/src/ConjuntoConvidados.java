import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    Set<Convidado> convidados;

    public ConjuntoConvidados(){
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidado = null;

        if(!convidados.isEmpty()){
            for( Convidado c : convidados){
                if(c.getCodigoConvite() == codigoConvite){
                    convidado = c;
                }    
            }
            convidados.remove(convidado);
        }
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.err.println(convidados);
    }

    public static void main(String[] args) {
        
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("nome1", 122);
        conjuntoConvidados.adicionarConvidado("nome2", 133);
        conjuntoConvidados.adicionarConvidado("nome3", 144);
        conjuntoConvidados.adicionarConvidado("nome4", 155);
        conjuntoConvidados.adicionarConvidado("nome5", 166);
        conjuntoConvidados.adicionarConvidado("nome6", 177);
        conjuntoConvidados.adicionarConvidado("nome7", 177);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigoConvite(144);

        conjuntoConvidados.exibirConvidados();

        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
