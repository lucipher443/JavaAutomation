package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
//
//        System.out.println("Hello, World!");

    citireNote();
    printareValori();
    printareValoriFor();

    }

    public static void citireNote()
    {
        System.out.println("Introduceti nota: ");
        Scanner scanner = new Scanner(System.in);
        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10)
        {
            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog, introdu o valoare valida");
            nota = scanner.nextInt();
        }
        System.out.println("Nota " + nota + " este valida");
    }

    public static void printareValori()
    {
        int valoare = 1;
        while (valoare <= 5)
        {
            System.out.println("Valoarea este " + valoare);
            valoare++;
        }
    }

    public static void printareValoriFor()
    {
//        int valoare = 1;
        for (int valoare = 1; valoare <= 5; valoare++)
        {
            System.out.println("Valoarea este " + valoare);
        }
    }
}