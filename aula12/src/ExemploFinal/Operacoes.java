package ExemploFinal;

public class Operacoes {
    //atributo final precisa ter um valor até o final do construtor
    //pode ser alterado
    public final double pi;
    //constante PI é static e public além de final e precisa ser inicializada na declaração
    public static final double PI = 3.1463793;

    public Operacoes(){
        pi = 3.1467893;
    }
}
