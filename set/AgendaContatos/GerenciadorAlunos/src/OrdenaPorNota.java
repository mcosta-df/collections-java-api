
import java.util.Comparator;

public class OrdenaPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a, Aluno a1) {
        
        return Double.compare(a.getNota(), a1.getNota());
    }

    
}
