
import java.util.Comparator;

public class OrdenarPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa, Pessoa pessoa1) {
        return Double.compare(pessoa.getAltura(), pessoa1.getAltura());
    }

}
