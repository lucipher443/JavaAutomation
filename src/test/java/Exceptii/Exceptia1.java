package Exceptii;

import java.lang.reflect.Array;

public class Exceptia1 {
    //exceptiile reprezinta situatii care apar in timpul executiei unui program care determina oprirea acestuia
    //ofera un mecanism eficient de idetificare si rezolvare a erorilor
    //sunt modelate sub forma de clase: clasa error, clasa exception, runtime exception, clasa personalitate
    //exceptiile sunt gestionate folosind cuvinte predefinite in java: try - catch si finally
    //sunt 2 tipuri mari de exceptii: checked si unchecked
    //erorile checked: sunt exceptii de compilare (nu se poate buildui sau rula proiectul).
    // Ex: SQL exception, IO exception, class not found exception;
    //erorile unchecked: exceptii de runtime care sunt ignorate in timpul compilarii, dar sunt aruncate in timpul executiei;
    //ex erori unchecked: null pointer exception, array index out of bound, arithmetic exception
    //throw: este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un bloc de cod;
    //throws: este un cuvant cheie care se foloseste impreuna cu metoda, care poate arunca unul sau mai multe tipuri de exceptii.

        public static void main(String[] args) throws ExceptieCustom{
//                try {
//                        System.out.println(12/0);
//                } catch (ArithmeticException e) {
//                        System.out.println("Error arithmetic exception thrown " + e.getMessage());
//                }
            try {
                int[] numbers = new int[10];
                numbers[11] = 5;
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ExceptieCustom("Eroare custom");
//                System.out.println(e.getMessage());
            } finally {
                System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa");
            }
        }
}
