package telas;

import jogabilidade.Arquivos;
import jogabilidade.Jogo;
import jogabilidade.LeitorDeArquivos;
import telas.TelaJogo;

import java.util.Scanner;

// A primeira tela exibida ao jogador ao iniciar o jogo;
// Permite escolher entre iniciar um novo jogo, continuar de onde parou, visualizar os créditos ou encerrar o programa.
public class TelaInicial {
    // Título estilizado
    public static void titulo() {
        System.out.println("\n" +
                "   __ _______  _____________   _____  _________ \n" +
                "  / //_/  _/ |/ / ___/ __/ /  / _ \\ \\/ / __/ _ \\\n" +
                " / ,< _/ //    / (_ /\\ \\/ /__/ __ |\\  / _// , _/\n" +
                "/_/|_/___/_/|_/\\___/___/____/_/ |_|/_/___/_/|_| \n");
    }

    public static void exibir() {
        EstilizacaoTela.limparTela();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            titulo();
            EstilizacaoTela.centralizar("1. Novo Jogo", 45);
            EstilizacaoTela.centralizar("2. Continuar", 45);
            EstilizacaoTela.centralizar("3. Créditos", 45);
            EstilizacaoTela.centralizar("4. Encerrar", 45);
            EstilizacaoTela.centralizar("\nDigite uma opção para continuar:", 45);

            String opcao = scanner.nextLine();

            switch (opcao) {
                //Inicia a criação do personagem e começa um novo jogo
                case "1":
                    EstilizacaoTela.limparTela();
                    TelaInventario.criacaoIncial();
                    return; // mudou de break para return para evitar que os dados sejam redesenhados.
                //Carrega o progresso salvo do jogador
                case "2":
                    EstilizacaoTela.limparTela();
                    Arquivos.carregarJogo();
                    EstilizacaoTela.limparTela();
                    System.out.println("Continuando o jogo a partir da cena: " + Jogo.getCenaAtual()); // exibe a tela que foi retornada pelo jogador
                    TelaJogo.iniciar(); // entra diretmente no loop principal do jogo retomando a partida.
                    return; // mudou para return também para evitar que os dados sejam redesenhados.
                //Exibe os créditos
                case "3":
                    EstilizacaoTela.limparTela();
                    titulo();
                    EstilizacaoTela.centralizar("Desenvolvido por:", 45);
                    EstilizacaoTela.centralizar("Gabriele Santos de Azevedo", 45);
                    EstilizacaoTela.centralizar("Markus Lopes", 45);
                    EstilizacaoTela.centralizar("Sabrina Kimberly Rodrigues Ford", 45);
                    System.out.println();
                    EstilizacaoTela.centralizar("Pressione ENTER para voltar ao menu", 45);
                    scanner.nextLine();
                    EstilizacaoTela.limparTela();
                    break;
                //Encerra o programa
                case "4":
                    EstilizacaoTela.limparTela();
                    System.out.println("Encerrando...");
                    System.exit(0);
                    break;
                //Opção inválida, reinicia o menU
                default:
                    EstilizacaoTela.limparTela();
                    System.out.println("Opção inválida!\n");
            }
        }
    }
}