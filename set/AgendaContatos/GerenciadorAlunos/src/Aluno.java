import java.util.Objects;

public class Aluno implements Comparable<Aluno>{

    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nome, Long matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMatricula());
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
        
    }

    @Override
    public boolean equals(Object o) {
        if( this ==  o){
            return true;
        }

        if( !(o instanceof Aluno aluno)){
            return false;
        }

        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " - Matricula: " + matricula + " - Nota: " + nota + "\n";
    }

    

    
}
