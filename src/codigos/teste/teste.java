package codigos.teste;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import codigos.classes.UsuariosLogin;

public class teste {

    public static void main(String[] args) {
        UsuariosLogin cpu = new UsuariosLogin();
        Scanner sc = new Scanner(System.in);

        boolean loop = true;

        while (loop) {

            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Mudar senha");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.print("Opcao: ");
            int opcao = sc.nextInt();

            sc.nextLine();

            switch (opcao) {

                case 1:
                    cpu.adicionarUsuario();
                    break;

                case 2:
                    cpu.listarUsuarios();
                    break;

                case 3:
                    cpu.mudarSenha();
                    break;

                case 4:
                    cpu.removerUsuario();
                    break;

                default:
                    System.out.println("Adeu, até a próxima!");
                    loop = false;
            }
        }
    }
}