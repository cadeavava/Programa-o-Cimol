package aula11;

import java.util.Scanner;
public class mainAluno {
    public static void main(String[] args)
    {
        Aluno aluno1 = new Aluno();
        aluno1.codigo = 123;
        aluno1.email = "val@gmail.com";
        aluno1.nome = "Mia";
        aluno1.sobrenome = "Eloisa";

        System.out.print("Insira a primeira nota: ");
        float nota1 = aluno1.nota1;
        System.out.print("Insira a segunda nota: ");
        float nota2 = aluno1.nota2;

        float media = aluno1.obterMedia();

        String aprovado = aluno1.aprovado(media);
    }
}
