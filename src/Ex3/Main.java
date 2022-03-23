package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        int i = 0;
        System.out.println("Escreva sua frase: ");
        frase = ler.next();
        String fraseFormat = frase.toUpperCase();
        if (fraseFormat.indexOf("A")!=-1) i = i + 1;
        if (fraseFormat.indexOf("E")!=-1) i = i + 1;
        if (fraseFormat.indexOf("I")!=-1) i = i + 1;
        if (fraseFormat.indexOf("O")!=-1) i = i + 1;
        if (fraseFormat.indexOf("U")!=-1) i = i + 1;
        System.out.println(i);
    }
}
