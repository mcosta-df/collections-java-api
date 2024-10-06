import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunos;

    public GerenciadorAlunos(){
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota){
        alunos.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Aluno aluno = null;

        if(!(alunos.isEmpty())){            for(Aluno a : alunos){
                if(a.getMatricula() == matricula){
                    aluno = a;
                    break;
                }
            }
        }
        alunos.remove(aluno);
    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosOrdenados = new TreeSet<>(alunos);
        return alunosOrdenados;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosOrdenados = new TreeSet<>(new OrdenaPorNota());

        alunosOrdenados.addAll(alunos);

        return alunosOrdenados;

    }

    public void exibirAlunos(){
        System.out.println(alunos);
    }

    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Joaquim", 9999l, 10.0);
        gerenciadorAlunos.adicionarAluno("Amelia",  2222l, 8.0);
        gerenciadorAlunos.adicionarAluno("Jose",    6666l, 6.0);
        gerenciadorAlunos.adicionarAluno("Pedro",   1111l, 5.0);
        gerenciadorAlunos.adicionarAluno("wilson",  7777l, 1.0);
        gerenciadorAlunos.adicionarAluno("Antonio", 3333l, 4.4);
        gerenciadorAlunos.adicionarAluno("Carlos",  4444l, 5.5);


        gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(7777l);

        gerenciadorAlunos.exibirAlunos();

        System.out.println("Alunos ordenados por nome");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("Alunos ordenados por nota");
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }

}
