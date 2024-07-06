package Encapsula;

public class Banco {
    public static void main(String[] args) {
        Conta c1 = new Conta("Val",100);
        System.out.println("Val conta cadastrada com id "+c1.getIdentificador());
        c1.depositar(10);
        c1.setTitular("Vall");
        c1.depositar(100);
        System.out.println(c1.getIdentificador());
        System.out.println(c1.getTitular());
    }
}
