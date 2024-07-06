package aula11;

public class Lampada {
    String marca;
    String modelo;
    String cor;
    String local;
    boolean ligada = false;

    boolean ligar()
    {
        return ligada = true;
    }

    boolean desligar()
    {
        return ligada = false;
    }

    void estaLigada()
    {
       if (!ligada)
       {
           System.out.println("A lâmpada está desligada.");
       }
       else {
           System.out.println("A lâmpada está ligada.");
       }
    }

    /*
    String estaLigada(){
    return ligada?"sim":"nao";}
    */

    void obterDados()
    {
        String frase = "Marca: " + marca + "\nModelo: " + modelo + "\nCor: " + cor + "\nLocal: " + local;
        System.out.println(frase);
    }
}
