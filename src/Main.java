import telas.TelaInicial;

public class Main {
    public static void main(String[] args) {
        TelaInicial.exibir();
    }
}

// No trabalho a unica coisa que faltava era continuar o jogo a partir de uma cena já existente. O jogo era salvo,
// carregava a cena, mas não continuava o jogo a partir dessa cena;

// Agora é possível retornar à cena desejada e continuar o jogo a partir da mesma;
// "COMO?" adicionando a função de TelaJogo.iniciar(); no case 2 (continuar), faz entrar diretamente no loop principal do jogo.
// E trocando o break pelo return nas cases 1 e 2 que sai do menu e não volta após retomar o jogo.
// Na classe "TelaInicial" também deixei comentando ao lado para localizar as mudanças. =)