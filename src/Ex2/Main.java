package Ex2;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String placa;
        String placaUpCase;
        short ano;

        System.out.println("Escreva a placa do carro: ");
            placa = ler.next();
            placaUpCase = placa.toUpperCase(Locale.ROOT);
        System.out.println("Escreva o ano do carro: ");
            ano = ler.nextShort();
            if (ano<=2010){
                System.out.println("Carro Velho");
            }else if(ano<=2021){
                System.out.println("Carro Semi novo");
            }else if(ano==2022){
                System.out.println("Carro Novo");
            }else{
                System.out.println("Dado Invalido");
            }
            String placaFormat =    placaUpCase.replace('A','*');
            placaFormat =           placaFormat.replace('E','*');
            placaFormat =           placaFormat.replace('I','*');
            placaFormat =           placaFormat.replace('O','*');
            placaFormat =           placaFormat.replace('U','*');

        System.out.println(placaFormat);
    }
}
