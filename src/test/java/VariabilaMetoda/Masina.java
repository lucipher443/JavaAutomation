package VariabilaMetoda;
import org.testng.annotations.Test;
//import java.util.Scanner;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest() {
        dateMasina("Volvo", "V60", 2017);
        dateMasina("Volvo", "V60 CC", 2022);

    }

    public void dateMasina(String param1, String param2, int param3) {
        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul Fabricatiei este: " + anFabricatie);
    }
}
