package codigos.classes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsuariosLogin {

    Map<String, Usuario> login = new HashMap<>();

    Scanner sc = new Scanner(System.in);

    public static class Usuario {

        String nome;
        String email;
        String senha;

        public Usuario(String nome, String email, String senha) {

            this.nome = nome;
            this.email = email;
            this.senha = senha;
        }

        @Override
        public String toString() {

            return "Nome: " + nome +
                    ", Email: " + email +
                    ", Senha: " + senha;
        }
    }

    public void adicionarUsuario(){
        limparTerminal();
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Senha: ");
        String senha = sc.nextLine();

        login.put(email,new UsuariosLogin.Usuario(nome, email, senha));

        System.out.println("Olá " + nome + "!");

    }

    public void removerUsuario() {
        limparTerminal();
        System.out.print("Email: ");
        String emailBusca = sc.nextLine();

        System.out.print("Qual a sua senha? ");
        String senha = sc.nextLine();

        if (login.containsKey(emailBusca)) {

            Usuario usuario = login.get(emailBusca);

            if (usuario.senha.equals(senha)) {

                login.remove(emailBusca);

                System.out.println("Usuário removido.");

            } else {

                System.out.println("Senha incorreta.");
            }

        } else {

            System.out.println("Email não encontrado.");
        }
    }

    public void mudarSenha() {
        limparTerminal();
        System.out.print("Email: ");
        String emailBusca = sc.nextLine();

        System.out.print("Qual a sua senha? ");
        String senha = sc.nextLine();

        if (login.containsKey(emailBusca)) {

            Usuario usuario = login.get(emailBusca);

            if (usuario.senha.equals(senha)) {

                System.out.println("Digite a sua nova senha:");
                String senhaNova = sc.nextLine();

                usuario.senha = senhaNova;

                System.out.println("Usuário removido.");

            } else {

                System.out.println("Senha incorreta.");
            }

        } else {

            System.out.println("Email não encontrado.");
        }
    }

    public void listarUsuarios(){
        limparTerminal();
        for (Map.Entry<String, Usuario> item : login.entrySet()) {

            Usuario usuario = item.getValue();

            System.out.println("Nome: " + usuario.nome);
            System.out.println("Email: " + usuario.email);

            System.out.println("----------------");
        }
    }

    public void limparTerminal() {

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}