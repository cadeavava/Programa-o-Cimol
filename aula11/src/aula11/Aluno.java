package aula11;

public class Aluno
{
    String nome, sobrenome, email;
    int codigo;
    float nota1, nota2;

    float obterMedia()
    {
        float media = (nota1 + nota2) / 2;
        return media;
    }

    String aprovado(float media)
    {
        if (media >= 8)
        {
            return "sim";
        }
        else if(media >= 6)
        {
            return "recuperação";
        }
        else {
            return "reprovado";
        }
    }
}
