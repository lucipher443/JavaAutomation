package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //structuri alternative = if - then - else; switch-case

    @Test
    public void metodaTest() {
        verificaNumar(7);
        verificaNumar(4);
        verificaNumar(5);
        numarPar(0);
        numarPar(4);
        numarPar(7);
        numarPar(-8);
        ZileSaptamana(3);
        }

    //verificam un nr mai mare decat 5
    public void verificaNumar(int numar1) {
        if (numar1 > 5) {
            System.out.println("Numarul " + numar1 + " este mai mare decat 5");
        }
        else if (numar1 < 5) {
            System.out.println("Numarul " + numar1 + " nu este mai mare decat 5");
        }
        else {
            System.out.println("Numarul " + numar1 + " este egal cu 5");
        }
    }

    //verificam daca un nr e par pozitiv sau par negativ
    public void numarPar(int numar) {

        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul " + numar + " este par pozitiv");
            } else {
                System.out.println("Numarul " + numar + " este impar pozitiv");
            }
        }
        else if (numar < 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul " + numar + " este par negativ");
            } else {
                System.out.println("Numarul " + numar + " este impar negativ");
            }
        }
        else if (numar == 0) {
            System.out.println("Numarul " + numar + " este egal cu zero");
        }
    }

    //switch case
    public void ZileSaptamana(Integer zi) {

        switch (zi) {
            case 1:
                System.out.println("Azi este Luni");
                break;
            case 2:
                System.out.println("Azi este Marti");
                break;
            case 3:
                 System.out.println("Azi este Miercuri");
                break;
            case 4:
                System.out.println("Azi este Joi");
                break;
                default:
                    System.out.println("Sfarsitul saptamanii");
        }
    }
}
