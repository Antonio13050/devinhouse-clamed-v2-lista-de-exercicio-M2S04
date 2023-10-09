package superheroi;

import superheroi.cli.Display;
import superheroi.model.Heroi;
import superheroi.model.Personagem;
import superheroi.model.Vilao;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacao {

    ArrayList<Personagem> personagens = new ArrayList<>();
    Display display = new Display();
    public void executar(){

        Scanner scanner = new Scanner(System.in);

        Integer op = -1;
        do {
            display.exibirMenu();
            op = display.obterOpcao();
            processar(op);

        }
        while (op != 4);


    }
    private void processar(Integer op){
        switch(op) {
            case 1:
                Heroi heroi = display.obterDadosHeroi();
                personagens.add(heroi);
                break;
            case 2:
                Vilao vilao = display.obterDadosVilao();
                personagens.add(vilao);
                break;
            case 3:
                display.listar(personagens);
                break;
            case 4:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
