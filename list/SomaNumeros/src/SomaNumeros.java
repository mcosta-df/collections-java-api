
import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    List<Integer> listaNumeros;

    public SomaNumeros(){
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        if(!listaNumeros.isEmpty()){
            for( int numero : listaNumeros){
                soma += numero;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        
        int maiorValor = Integer.MIN_VALUE;

        if(!listaNumeros.isEmpty()){
            for( int numero : listaNumeros){
                if( maiorValor < numero){
                    maiorValor = numero;
                }
            }
        }
        
        return maiorValor;
    }

    public int encontrarMenorNumero(){
        int menorValor = Integer.MAX_VALUE;

        if(!listaNumeros.isEmpty()){
            for(int numero : listaNumeros){
                if(menorValor > numero){
                    menorValor = numero;
                }
            }
        }

        return menorValor;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros.toString());
    }


    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(14);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(11);
        somaNumeros.adicionarNumero(12);

        System.out.println("Soma: " + somaNumeros.calcularSoma());

        System.out.println("Maior numero: " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor numero: " + somaNumeros.encontrarMenorNumero());

        somaNumeros.exibirNumeros();
    }

}
