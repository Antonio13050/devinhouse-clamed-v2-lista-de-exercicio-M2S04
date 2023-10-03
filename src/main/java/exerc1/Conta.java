package exerc1;

public abstract class Conta {
    private double saldo;
    protected abstract double obterSaldoAtual();

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
