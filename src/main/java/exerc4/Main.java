package exerc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isIdadeValida = false;
        Integer idade;

        while(!isIdadeValida) {
            System.out.println("Digite sua idade");

            try{
                idade = Integer.parseInt(scanner.nextLine());
                if(idade < 0 || idade > 100) {
                    throw new IdadeInvalidaException("Digite um valor valido");
                }
                System.out.println("Sua idade é " + idade);
                isIdadeValida = true;
            } catch (IdadeInvalidaException e){
                System.out.println(e.getMessage());

            }



        }




    }
}
