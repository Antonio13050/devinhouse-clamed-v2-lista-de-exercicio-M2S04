package superheroi;

import superheroi.cli.Display;
import superheroi.model.Heroi;
import superheroi.model.Personagem;
import superheroi.model.Vilao;
import superheroi.repository.PersonagemRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

    private PersonagemRepository personagemRepo = new PersonagemRepository();
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
                personagemRepo.inserir(heroi);
                break;
            case 2:
                Vilao vilao = display.obterDadosVilao();
                personagemRepo.inserir(vilao);
                break;
            case 3:
                List<Personagem> personagens = personagemRepo.listar();
                personagens.forEach(p -> System.out.println(p));
                break;
            case 4:
                System.out.println("Saindo");
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
}
