package cursojava.desafioPaiValidadorDeCpf.domain;

public class ValidadorCpf {

    public boolean validar(String cpf) {
        if (cpf == null) return false;

        cpf = cpf.replace(".", "").replace("-", "");

        if (cpf.length() != 11) return false;

        if (cpf.matches("(\\d)\\1{10}")) return false;

        int peso = 10;
        int soma = 0;

        for (int i = 0; i < 9; i++) {
            int num = cpf.charAt(i) - '0'; //ideia do chat GPT
            soma += num * peso;
            peso--;
        }

        int resto = (soma * 10) % 11;
        int digito1 = (resto == 10) ? 0 : resto; //chat GPT

        if (digito1 != (cpf.charAt(9) - '0')) return false;

        soma = 0;
        peso = 11;

        for (int i = 0; i < 10; i++) {
            int num = cpf.charAt(i) - '0'; //ideia do chat GPT
            soma += num * peso;
            peso--;
        }

        resto = (soma * 10) % 11;
        int digito2 = (resto == 10) ? 0 : resto; //chat GPT

        return digito2 == cpf.charAt(10) - '0';
    }
}