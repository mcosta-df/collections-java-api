import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> listaLivros;

    public CatalogoLivros(){
        listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getAutor().equalsIgnoreCase(autor)){
                    livrosAutor.add(livro);
                }
            }
        }
        
        return livrosAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosAno = new ArrayList<>();

        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() >= anoFinal){
                    livrosAno.add(livro);
                }
            }
        }

        return livrosAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroTitulo = null;

        if(!listaLivros.isEmpty()){
            for(Livro livro : listaLivros){
                if(livro.getTituo().equalsIgnoreCase(titulo)){
                    livroTitulo = livro;
                    break;
                }
            }
        }

        return livroTitulo;
    }

    public static void main(String[] args) {
        
        CatalogoLivros listaLivros = new CatalogoLivros();

        listaLivros.adicionarLivro("titulo1", "autor1", 1996);
        listaLivros.adicionarLivro("titulo2", "autor2", 1996);
        listaLivros.adicionarLivro("titulo3", "autor2", 2001);
        listaLivros.adicionarLivro("titulo3", "autor3", 2005);
        listaLivros.adicionarLivro("titulo4", "autor3", 2010);
        listaLivros.adicionarLivro("titulo4", "autor4", 2011);
        listaLivros.adicionarLivro("titulo4", "autor5", 2015);
        listaLivros.adicionarLivro("titulo5", "autor6", 2020);
    
        System.out.println(listaLivros.pesquisarPorAutor("autor2"));

        System.out.println(listaLivros.pesquisarPorIntervaloAnos(2001, 2010));

        System.out.println(listaLivros.pesquisarPorTitulo("titulo4"));
    }

}
