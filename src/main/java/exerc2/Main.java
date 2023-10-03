package exerc2;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Funcionario funcionario = new Funcionario();

        System.out.println(gerente.obterCargo());
        System.out.println(funcionario.obterCargo());

    }
}
