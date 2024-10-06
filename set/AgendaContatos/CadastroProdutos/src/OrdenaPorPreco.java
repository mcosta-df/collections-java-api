
import java.util.Comparator;

public class OrdenaPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p, Produto p1) {
        return Double.compare(p.getPreco(), p1.getPreco());
    }

    

}
