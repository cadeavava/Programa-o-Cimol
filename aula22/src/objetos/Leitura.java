package objetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class Leitura {
    public static void main(String[] args) {
        File arquivo = new File("C:/Users/User/OneDrive/Área de Trabalho/Programação/Aula22/pessoa.db");
        try {
            ObjectInputStream leitura = new ObjectInputStream(new FileInputStream(arquivo.getAbsoluteFile()));
            Pessoa p = (Pessoa) leitura.readObject(); //volta como um objeto genérico
            System.out.println(p);
        }

        catch (ClassNotFoundException e) {
            System.out.println("Objeto não encontrado");
        }
        catch (FileNotFoundException e) {
            System.out.println("O arquivo nao existe");
        }
        catch (IOException e) {
            System.out.println("Erro ao ler as info");
        }
    }
}