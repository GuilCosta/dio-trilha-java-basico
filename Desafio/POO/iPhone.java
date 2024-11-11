package POO;
import POO.src.Funcoes.AparelhoTelefonico;
import POO.src.Funcoes.NavegadorInternet;
import POO.src.Funcoes.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos de ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música.");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando música." + musica);
    }

    // Implementação dos métodos de AparelhoTelefonico
    @Override
    public void ligar(String numero){
        System.out.println("Ligando via Iphone." + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via Iphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz via Iphone.");
    }

    // Implementação dos métodos de NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página" + url + "via Iphone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    @Override    
    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }

    // Método principal para teste
    public static void main(String[] args) {
        iPhone iphone = new iPhone();
        
        // Testando métodos de ReprodutorMusical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Eminem");

        // Testando métodos de AparelhoTelefonico
        iphone.ligar("123");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando métodos de NavegadorInternet
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
