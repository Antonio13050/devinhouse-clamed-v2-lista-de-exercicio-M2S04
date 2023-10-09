package superheroi.cli;

import superheroi.model.Heroi;
import superheroi.model.Personagem;
import superheroi.model.Vilao;

import java.util.List;
import java.util.Scanner;

public class Display {

    public void exibirMenu() {
        System.out.println("1 - Cadastrar Herói");
        System.out.println("2 - Cadastrar Vilão");
        System.out.println("3 - Listar");
        System.out.println("4 - Sair");
    }

    public int obterOpcao() {
        System.out.println("Informe a opção desejada:");
        Scanner scanner = new Scanner(System.in);
        int op = Integer.parseInt(scanner.nextLine());
        return op;
    }

    public Heroi obterDadosHeroi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe o nome na vida real: ");
        String nomeVidaReal = scanner.nextLine();
        return new Heroi(nomeVidaReal, nome, superpoder);
    }

    public Vilao obterDadosVilao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o superpoder: ");
        String superpoder = scanner.nextLine();
        System.out.println("Informe o tempo de prisão: ");
        int tempoPrisao = scanner.nextInt();
        return new Vilao(tempoPrisao, nome, superpoder);
    }

    public void listar(List<Personagem> personagens) {
        System.out.println("Listando...");
        personagens.forEach(p -> System.out.println(p));
        System.out.println();
    }

}
