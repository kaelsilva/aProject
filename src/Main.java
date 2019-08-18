import java.util.*;

public class Main {

    public static void main(String[] args) {
    	/*Sorteio de um número aleatório de 0 a 49 para servir de índice de acesso
         * aleatório à lista de provérbios*/
    	Random rand = new Random();
        int n = rand.nextInt(50);
        
        /*Criando controlador*/
        ControladorListaDeProverbios novoControlador = new ControladorListaDeProverbios();
        
        /*Exibindo na tela o provérbio aleatório*/
        System.out.print(novoControlador.getListaManipulada().getLista().get(n)+"\n");
        return;
    }

}