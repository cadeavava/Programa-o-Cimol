package aula11;

public class Testes {
    public static void main (String[] args) {
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        Lampada lampada3 = new Lampada();
        Lampada lampada4 = new Lampada();
        Lampada lampada5 = new Lampada();

        lampada1.cor = "Verde";
        lampada1.ligada = true;
        lampada1.local = "Jardim";
        lampada1.marca = "ferrari";
        lampada1.modelo = "fashion";
        lampada1.estaLigada();
        lampada1.obterDados();

        lampada2.cor = "Azul";
        lampada2.ligada = false;
        lampada2.local = "Sala";
        lampada2.marca = "lg";
        lampada2.modelo = "led";
        lampada2.estaLigada();
        lampada2.obterDados();
    }
}
