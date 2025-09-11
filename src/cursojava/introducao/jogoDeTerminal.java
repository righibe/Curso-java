package cursojava.introducao;
import java.util.Scanner;

class Personagem {
    String nome;
    int idade;
    String genero;
    String classe;
    int combate;
    int agilidade;
    int vida;
    int pontaria;
}

public class jogoDeTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem jogador = new Personagem();

        System.out.println("Olá, bem-vindo a um jogo de terminal em desenvolvimento.");
        System.out.print("Diga como podemos te chamar: ");
        jogador.nome = scanner.next();

        System.out.println(jogador.nome + ", agora configure seu personagem.");

        System.out.print("Idade: ");
        jogador.idade = scanner.nextInt();

        System.out.print("Gênero: ");
        jogador.genero = scanner.next();

        System.out.println("\nEscolha sua classe digitando o número correspondente:");
        System.out.println("1 - Cavalheiro: 4 combate, 1 agilidade, 5 vida, 2 pontaria");
        System.out.println("2 - Ladrão: 1 combate, 4 agilidade, 2 vida, 2 pontaria");
        System.out.println("3 - Arqueiro Real: 3 combate, 3 agilidade, 1 vida, 4 pontaria");
        System.out.println("4 - Caçador de recompensas charlatão: 2 combate, 3 agilidade, 2 vida, 1 pontaria");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                jogador.classe = "Cavalheiro";
                jogador.combate = 4;
                jogador.agilidade = 1;
                jogador.vida = 5;
                jogador.pontaria = 2;
                break;
            case 2:
                jogador.classe = "Ladrão";
                jogador.combate = 1;
                jogador.agilidade = 4;
                jogador.vida = 2;
                jogador.pontaria = 2;
                break;
            case 3:
                jogador.classe = "Arqueiro Real";
                jogador.combate = 3;
                jogador.agilidade = 3;
                jogador.vida = 1;
                jogador.pontaria = 4;
                break;
            case 4:
                jogador.classe = "Caçador de recompensas charlatão";
                jogador.combate = 2;
                jogador.agilidade = 3;
                jogador.vida = 2;
                jogador.pontaria = 1;
                break;
            default:
                System.out.println("Opção inválida. Você será um Camponês!");
                jogador.classe = "Camponês";
                jogador.combate = 1;
                jogador.agilidade = 1;
                jogador.vida = 3;
                jogador.pontaria = 1;
        }

        System.out.println("\nEis suas características:");
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Idade: " + jogador.idade);
        System.out.println("Gênero: " + jogador.genero);
        System.out.println("Classe: " + jogador.classe);
        System.out.println("Combate: " + jogador.combate);
        System.out.println("Agilidade: " + jogador.agilidade);
        System.out.println("Vida: " + jogador.vida);
        System.out.println("Pontaria: " + jogador.pontaria);

        System.out.println("\nVamos continuar sua jornada...");
    }
}