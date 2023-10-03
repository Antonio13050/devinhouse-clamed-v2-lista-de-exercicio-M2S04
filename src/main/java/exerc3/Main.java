package exerc3;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setValor(10);
        produto.setValorImposto(2);
        System.out.println(produto.calcularValorComImposto());
    }
}
