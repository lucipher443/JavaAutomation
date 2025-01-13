package VariabilaMetoda;

import org.testng.annotations.Test;

//import java.util.Scanner;

public class Student {

    // class = sablon care defineste proprietatile si comportamentul unei entitati specifice

    // intr-un fisier Java putem avea mai multe clase diferentiate pe baza numelui (nu e ok sa avem mm clase cu acelasi nume)

    // intr-o clasa putem defini proprietatile si actiunile entitatii

    // variabila = proprietatea unei clase

    // varibilele pot fi de 2 feluri: globale si locale

    // variabilele globale = sunt vizibile peste tot in proiect

    // variabilele locale sunt vizibile doar in locul undele-am creat

    // ca sa definim o variabila globala: accesscontrol tip variabila nume variabila

    public String Nume;

    public String Prenume;

    public Integer Varsta;

    public String Adresa;

    public Double Inaltime;

    public Float Greutate;

    public Character Sex;

    public Boolean AreDiploma;

    @Test
    public void prezentareStudent(){
        Nume = "Grosu";
        Prenume = "Lucian";
        Varsta = 43;
        Adresa = "Iasi";
        Inaltime = 1.72;
        Greutate = 75f;
        Sex = 'M';
        AreDiploma = true;

        calculMedie(7.5, 9.5);

//        citireNote();


        //System.out.println(Nume + " " + Prenume + "," + " " + Varsta + "," + " " + Adresa + "," + " " + Inaltime +"," + " " + Greutate + "," + " " + Sex + "," + " " + AreDiploma);

        System.out.println("Nume student: " +Nume);
        System.out.println("Prenume student: " +Prenume);
        System.out.println("Varsta student: " +Varsta);
        System.out.println("Adresa student: " +Adresa);
        System.out.println("Inaltime student: " +Inaltime);
        System.out.println("Greutate student: " +Greutate);
        System.out.println("Sex: " +Sex);
        System.out.println("Studentul are Diploma: " +AreDiploma);
        calculMedie();
        System.out.println("Salariul este: " + getSalariu());
    }

    public void calculMedie(){

        Integer nota1 = 8;
        Integer nota2 = 7;
        Integer nota3 = 9;
        int medie = (nota1+nota2+nota3)/3;
        System.out.println("Media studentului este: " +medie);
    }

    //metoda cu return
    public Integer getSalariu(){
        return 100000;
    }

    //calculam media a 2 nr

    public void calculMedie(Double nota1, Double nota2) {
        double rezultat = (nota1+nota2)/2;
        System.out.println("Media este: " + rezultat);
    }

//    public void citireNote(){
//
//        Scanner scanner = new Scanner(System.in);
//        int nota = scanner.nextInt();
//        while (nota < 0 || nota > 10){
//            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10. Te rog, introdu o valoare valida");
//            nota = scanner.nextInt();
//        }
//        System.out.println("Nota " + nota + " este valida");
//    }

}
