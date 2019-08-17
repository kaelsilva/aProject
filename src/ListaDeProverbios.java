import java.util.*;

public class ListaDeProverbios {
    private ArrayList<String> lista = new ArrayList<>();
    
    //Inicializando lista
    public ListaDeProverbios() {
        adicionarProverbio("A César o que é de César, a Deus o que é de Deus.");
        adicionarProverbio("Água mole, pedra dura, tanto bate até que fura.");
        adicionarProverbio("A pressa é a inimiga da perfeição.");
        adicionarProverbio("À noite todos os gatos são pardos.");
        adicionarProverbio("Antes só do que mal acompanhado.");
        adicionarProverbio("As aparências enganam.");
        adicionarProverbio("Apressado come cru e quente.");
        adicionarProverbio("A voz do povo é a voz de Deus.");
        adicionarProverbio("Cada macaco no seu galho.");
        adicionarProverbio("Caiu na rede, é peixe.");
    }
    
    public void adicionarProverbio(String p) {
    	lista.add(p);
    }
    
    public ArrayList<String> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<String> novaLista) {
        lista = novaLista;
    }
}
