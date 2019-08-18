import java.util.*;

public class ListaDeProverbios {
    private ArrayList<String> lista = new ArrayList<>();
    
  //Preenchendo lista com frases
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
        adicionarProverbio("Casa de ferreiro, espeto de pau.");
        adicionarProverbio("Cão que ladra não morde.");
        adicionarProverbio("Cavalo dado não se olha os dentes.");
        adicionarProverbio("De grão em grão, a galinha enche o papo.");
        adicionarProverbio("De médico e de louco todo mundo tem um pouco.");
        adicionarProverbio("Devagar se vai ao longe.");
        adicionarProverbio("Deus ajuda quem cedo madruga.");
        adicionarProverbio("Deus escreve certo por linhas tortas.");
        adicionarProverbio("Diz-me com quem andas e eu te direi quem és.");
        adicionarProverbio("É dando que se recebe.");
        adicionarProverbio("Em terra de cego quem tem olho é rei.");
        adicionarProverbio("Escreveu, não leu; o pau comeu.");
        adicionarProverbio("Filho de peixe, peixinho é.");
        adicionarProverbio("Gato escaldado tem medo de água fria.");
        adicionarProverbio("Ladrão que rouba ladrão tem cem anos de perdão.");
        adicionarProverbio("Mais vale um pássaro na mão do que dois voando.");
        adicionarProverbio("Mentira tem perna curta.");
        adicionarProverbio("O barato sai caro.");
        adicionarProverbio("O hábito faz o monge.");
        adicionarProverbio("Onde há fumaça há fogo.");
        adicionarProverbio("O seguro morreu de velho.");
        adicionarProverbio("Para bom entendedor, meia palavra basta.");
        adicionarProverbio("Para baixo todo santo ajuda.");
        adicionarProverbio("Pimenta nos olhos dos outros é refresco.");
        adicionarProverbio("Por ele eu ponho minha mão no fogo.");
        adicionarProverbio("Quando os porcos bailam adivinham chuva.");
        adicionarProverbio("Quando um burro fala, o outro abaixa a orelha.");
        adicionarProverbio("Quem ama o feio, bonito lhe parece.");
        adicionarProverbio("Quem canta seus males espanta.");
        adicionarProverbio("Quem casa quer casa.");
        adicionarProverbio("Quem com ferro fere, com ferro será ferido.");
        adicionarProverbio("Quem mistura-se com porcos, farelo come.");
        adicionarProverbio("Quem não tem cão, caça com gato.");
        adicionarProverbio("Quem pode, pode; quem não pode, se sacode.");
        adicionarProverbio("Quem ri por último ri melhor.");
        adicionarProverbio("Quem semeia vento, colhe tempestade.");
        adicionarProverbio("Quem tem boca vai a Roma.");
        adicionarProverbio("Saco vazio não para em pé.");
        adicionarProverbio("Uma andorinha sozinha não faz verão.");
        adicionarProverbio("Um dia é da caça, outro do caçador.");
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
