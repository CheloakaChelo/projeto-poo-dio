import aparelhotelefonico.AparelhoTelefonico;
import navegadordeinternet.NavegadorDeInternet;
import reprodutormusical.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet{

    public void ligar(String numero){
        System.out.println("Ligando para "+ numero);
    }

    public void atender(){
        System.out.println("Atendeu");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Correio de Voz");
    }

    public void tocar(){
        System.out.println("Tocando música");
    }

    public void pausar(){
        System.out.println("Música pausada");
    }

    public void escolherMusica(String musica){
        System.out.println("Música tocando agora: "+ musica);
    }

    public void exibirPagina(String url){
        System.out.println("Página: "+ url);
    }

    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada");
    }

    public void atualizarPagina(){
        System.out.println("Página atualizada");
    }

    public static void main(String[] args) throws Exception {
        iPhone meuIphone = new iPhone();

        // Testando Reprodutor Musical
        meuIphone.escolherMusica("Minha Música Favorita");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.exemplo.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
       
    }
}
