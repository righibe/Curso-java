package cursojava.introducao;
import java.util.Scanner;


class Personagem {
    String nome;
    int idade;
    String genero;
    String classe;
    int vida;
    int combate;
    int agilidade;
    int pontaria;
}

class Cavalheiro extends Personagem {
    public Cavalheiro(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.classe = "Cavalheiro";
        this.vida = 5;
        this.combate = 4;
        this.agilidade = 1;
        this.pontaria = 2;
    }
}

class Ladrao extends Personagem {
    public Ladrao(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.classe = "Ladrão";
        this.vida = 2;
        this.combate = 1;
        this.agilidade = 4;
        this.pontaria = 2;
    }
}

class ArqueiroReal extends Personagem {
    public ArqueiroReal(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.classe = "Arqueiro Real";
        this.vida = 1;
        this.combate = 3;
        this.agilidade = 3;
        this.pontaria = 4;
    }
}

class CacadorCharlatao extends Personagem {
    public CacadorCharlatao(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.classe = "Caçador de Recompensas Charlatão";
        this.vida = 2;
        this.combate = 2;
        this.agilidade = 3;
        this.pontaria = 1;
    }
}

class Campones extends Personagem {
    public Campones(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.classe = "Camponês";
        this.vida = 3;
        this.combate = 1;
        this.agilidade = 1;
        this.pontaria = 1;
    }
}

public class jogoDeTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, bem-vindo a um jogo de terminal em desenvolvimento.");
        System.out.print("Diga como podemos te chamar: ");
        String nome = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Gênero: ");
        String genero = scanner.next();

        System.out.println("\nEscolha sua classe digitando o número correspondente:");
        System.out.println("1 - Cavalheiro: 4 combate, 1 agilidade, 5 vida, 2 pontaria");
        System.out.println("2 - Ladrão: 1 combate, 4 agilidade, 2 vida, 2 pontaria");
        System.out.println("3 - Arqueiro Real: 3 combate, 3 agilidade, 1 vida, 4 pontaria");
        System.out.println("4 - Caçador de recompensas charlatão: 2 combate, 3 agilidade, 2 vida, 1 pontaria");
        int escolha = scanner.nextInt();

        Personagem jogador;

        switch (escolha) {
            case 1:
                jogador = new Cavalheiro(nome, idade, genero);
                break;
            case 2:
                jogador = new Ladrao(nome, idade, genero);
                break;
            case 3:
                jogador = new ArqueiroReal(nome, idade, genero);
                break;
            case 4:
                jogador = new CacadorCharlatao(nome, idade, genero);
                break;
            default:
                System.out.println("Opção invalida. Você será um Camponês!");
                jogador = new Campones(nome, idade, genero);
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
        if (jogador.classe.equals("Cavalheiro")) {
            System.out.println("""
                    Criado nos salões de pedra de um reino que já não existe,
                    o Cavalheiro jurou proteger os fracos e lutar com honra.
                    Seu escudo carrega marcas de batalhas antigas, mas seu coração
                    ainda arde pela justiça. Ele acredita que cada luta é uma chance
                    de restaurar a glória perdida de sua ordem.
                    """);
        } else if (jogador.classe.equals("Ladrão")) {
            System.out.println("""
                    Filho das sombras e das ruas estreitas, o Ladrão aprendeu desde cedo
                    a sobreviver com astúcia e velocidade. Nem sempre age por malícia:
                    muitas vezes rouba apenas para encher o estômago vazio.
                    No entanto, sua língua afiada e passos silenciosos o tornaram
                    uma lenda entre becos e tavernas.
                    """);
        } else if (jogador.classe.equals("Arqueiro Real")) {
            System.out.println("""
                    Treinado nos campos abertos e nas muralhas de castelos,
                    o Arqueiro Real é herdeiro de uma tradição de precisão letal.
                    Sua flecha é sua assinatura, e dizem que nenhum alvo escapa
                    de seus olhos atentos. Apesar da glória da corte, ele busca
                    uma causa que dê sentido ao seu arco.
                    """);
        } else if (jogador.classe.equals("Caçador de Recompensas Charlatão")) {
            System.out.println("""
                    Entre becos e cidades, o Caçador é conhecido tanto pela sua astúcia
                    quanto pela sua lábia. Muitas vezes prefere enganar e manipular
                    antes de lutar, mas quando pressionado, sabe usar suas habilidades
                    para sobreviver. Alguns o veem como um trapaceiro, outros como
                    um sobrevivente nato em um mundo cruel.
                    """);
        } else if (jogador.classe.equals("Camponês")) {
            System.out.println("""
                    Sem glórias, sem títulos, o Camponês conhece apenas o peso da enxada
                    e a dureza do solo. Mas sob sua simplicidade esconde-se uma força bruta,
                    moldada pelo trabalho diário e pela resiliência. Ao ser empurrado
                    para a aventura, traz consigo a coragem silenciosa de quem já
                    enfrentou fome e miséria.
                    """);
        }


    }
}