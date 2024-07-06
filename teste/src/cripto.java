import java.io.StringWriter;
import java.util.Scanner;
public class cripto {
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        int opcao;
        do {
            System.out.print("Bem vindo à criptografia de César! Você deseja criptografar (1) ou descriptografar (2) algo? ");
            opcao = ler.nextInt();
        } while (opcao != 1 && opcao != 2);
        StringWriter output = null;
        switch(opcao) {
            case 1 -> {
                System.out.println("Insira o que tu desejas criptografar:");
                ler.nextLine();
                String texto = ler.nextLine();

                StringBuilder resultado = new StringBuilder();

                for (int i = 0; i < texto.length(); i++) {
                    char caractere = texto.charAt(i);
                    char novoChar;

                    if (Character.isUpperCase(caractere)) {
                        novoChar = (char) ((caractere - 'A' + 3) % 26 + 'A');
                    } else if (Character.isLowerCase(caractere)) {
                        novoChar = (char) ((caractere - 'a' + 3) % 26 + 'a');
                    } else {
                        novoChar = caractere;
                    }

                    resultado.append(novoChar);
                }
                System.out.println(resultado.toString());
                break;
            }
            case 2 -> {
                System.out.println("Insira o que tu desejas descriptografar:");
                ler.nextLine();
                String texto = ler.nextLine();

                StringBuilder resultado = new StringBuilder();

                for (int i = 0; i < texto.length(); i++) {
                    char caractere = texto.charAt(i);
                    char novoChar;

                    if (Character.isUpperCase(caractere)) {
                        novoChar = (char) (((caractere - 'A' - 3) + 26) % 26 + 'A');
                    } else if (Character.isLowerCase(caractere)) {
                        novoChar = (char) (((caractere - 'a' - 3) + 26) % 26 + 'A');
                    } else {
                        novoChar = caractere;
                    }

                    resultado.append(novoChar);
                }
                System.out.println(resultado.toString());
                break;
            }
            default -> throw new IllegalStateException("Valor inválido: " + opcao);
        }
    }
}
