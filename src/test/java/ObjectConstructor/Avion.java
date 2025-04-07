package ObjectConstructor;

public class Avion {

    //Constructor = Are ca rol sa initializeze variabilele unei Clase
    //Recunoastem un constructor dupa numele clasei
    //Intr-o clasa putem avea n constructori care se diferentiaza dupa nr de parametri
    //Exista 2 tipuri de constructori: cu sau fara parametri
    //Intr-o clasa avem tot timpul un constructor default (fata parametri)
    //Constructorul trebuie sa fie Public
    //Obiect = instanta unei clase
    //Dintr-o clasa putem face mai multe obiecte
    //Ca sa initializam un obiect ne folosim de cuvantul "new"
    //Casnd initializam un obiect se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBagaje;

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion() {
        System.out.println("Tipul avionului: " + tip);
        System.out.println("Marca avionului: " + marca);
        System.out.println("Modelul avionului: " + model);
        System.out.println("Capacitate Pasageri: " + capacitatePasageri);
        System.out.println("Tip Combustibil: " + tipCombustibil);
        if (numarBagaje != null){
            System.out.println("Numar Bagaje: " + numarBagaje);
        } else {
            System.out.println("Avionul nu are bagaje!");
        }
    }
}
