package Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double tempoGasto;
        double velociadeMedia;
        double kmLitro;
        double distancia;


        System.out.println("Escreva o tempo gasto: ");
            tempoGasto = ler.nextDouble();
        System.out.println("Escreva a velocidade media: ");
            velociadeMedia = ler.nextDouble();
        System.out.println("Escreva o consumo medio do seu carro: ");
            kmLitro = ler.nextDouble();
            distancia = velociadeMedia*tempoGasto;
        System.out.println("Consumo final = " + (distancia/kmLitro) + "l");
    }
}
