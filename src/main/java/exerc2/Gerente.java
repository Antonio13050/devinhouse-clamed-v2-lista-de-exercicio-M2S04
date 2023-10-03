package exerc2;

public final class Gerente extends Funcionario{

    @Override
    public String obterCargo(){
        return "Sou Gerente";
    }

}
//a) Crie uma classe 'Funcionario' com o método público "obterCargo" que retorne uma String com o texto "Sou Funcionário".
//b) Crie uma classe Gerente que herde de Funcionário, sobrescrevendo o método de obter cargo com o texto "Sou Gerente".
//c) Transforme a classe Gerente numa classe que não pode mais ser extendida (ou seja, que não pode ter subclasses).