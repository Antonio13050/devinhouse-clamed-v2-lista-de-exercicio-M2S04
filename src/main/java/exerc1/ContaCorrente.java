package exerc1;

public class ContaCorrente extends Conta implements Operavel{

    public ContaCorrente() {
    }

    @Override
    protected double obterSaldoAtual() {
        return getSaldo();
    }

    @Override
    public double depositar(double valor) {
        double saldoAtual = getSaldo();
        double novoSaldo = saldoAtual + valor;
        setSaldo(novoSaldo);
        return novoSaldo;
    }

    @Override
    public double sacar(double valor) {
        double saldoAtual = getSaldo();
        double novoSaldo = saldoAtual - valor;
        setSaldo(novoSaldo);
        return novoSaldo;
    }


}
//a) Crie a interface "Operavel", com os métodos depositar(double valor) e sacar(double valor).
//b) Crie a classe Abstrata Conta com o atributo "saldo" (double) e um método protegido (protected) "ObterSaldoAtual()".
//c) Crie uma classe "ContaCorrente" que implemente a interface Operavel e herde da classe Conta.
//Faça uma implementação dos métodos herdados.