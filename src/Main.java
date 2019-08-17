import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Random rand = new Random();
        
        /*Sorteio de um número aleatório de 0 a 9*/
    
        int n = rand.nextInt(10);
        
        ControladorListaDeProverbios novoControlador = new ControladorListaDeProverbios();
        System.out.print(novoControlador.getListaManipulada().getLista().get(n));
        return;
    }

}