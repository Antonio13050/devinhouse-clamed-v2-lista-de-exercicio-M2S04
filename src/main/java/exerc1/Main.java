package exerc1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente();
        c.setSaldo(100);
        System.out.println(c.getSaldo());
        System.out.println(c.depositar(100));

    }

}
