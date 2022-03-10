package Ex4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        Random random = new Random();
        String nome;
        String cpf;
        String data;
        String hora;
        byte menu;
        int numVoo;
        int numVooR = random.nextInt(100, 999);


        System.out.println("============= MENU DE VOO =============");
        System.out.println("1 - Cadastrar Passageiro");
        System.out.println("2 - Check in");
        System.out.println("3 - Cancelar Voo");
        System.out.println("4 - Sair");
        System.out.println("=======================================");
        System.out.println("Por gentileza escolha um menu de [1-4]:");
        System.out.println("=======================================");
        menu = ler.nextByte();
        if(menu == 1){
            System.out.println("============= MENU CADASTRO =============");
            System.out.println("Escreva seu nome: ");
            nome = ler.next();
            System.out.println("Escreva seu cpf: ");
            cpf = ler.next();
            System.out.println("Escreva a data do voo: ");
            data = ler.next();
            System.out.println("Escreva a hora do voo: ");
            hora = ler.next();
            System.out.println("=======================================");
            System.out.println("===== O número do seu Voo: "+numVooR+" ========");
        }else if (menu == 2){
            System.out.println("============= MENU CHECK IN =============");
            System.out.println("Escreva seu cpf: ");
            cpf = ler.next();
            System.out.println("Escreva o número do seu voo: ");
            numVoo = ler.nextInt();
            System.out.println("=======================================");
            System.out.println("=== Check in realizado com SUCESSO! ===");
        }else if (menu == 3){
            System.out.println("=========== MENU CANCELAMENTO ==========");
            System.out.println("Escreva seu cpf: ");
            cpf = ler.next();
            System.out.println("Escreva o número do seu voo: ");
            numVoo = ler.nextInt();
            System.out.println("=======================================");
            System.out.println("= Cancelamento realizado com SUCESSO! =");
        }else if (menu == 4){
            System.out.println("=========== OBRIGADO POR NOS ==========");
            System.out.println("===========     ESCOLHER!    ==========");

        }else{
            System.out.println("===========      OPÇÃO      ===========");
            System.out.println("===========     INVALIDA    ===========");

        }

    }
}
