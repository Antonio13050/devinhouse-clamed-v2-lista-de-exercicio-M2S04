package exerc3;

public class Produto implements Tributavel{

    private double valor;
    private double valorImposto;

    @Override
    public double calcularValorComImposto() {
        double valorTotal = this.valor + this.valorImposto;
        return valorTotal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorImposto() {
        return valorImposto;
    }

    public void setValorImposto(double valorImposto) {
        this.valorImposto = valorImposto;
    }
}
//a) Crie uma Interface chamada "Tributavel", que tenha o método "calcularValorComImposto".
//b) Crie uma classe chamada "Produto" que implemente esta interface criada anteriormente.
//Nesta classe crie os atributos "valor" e "valor imposto", ambos double.
//No método herdado, retorne a soma dos atributos de valores.