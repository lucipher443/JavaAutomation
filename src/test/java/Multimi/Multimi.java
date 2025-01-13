package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    //multimi: array, list, map

    @Test
    public void test() {
        colegiCurs();
        colegiCursLista();
        categoriiObiecte();
        tariOrase();

    }

    //array

    public void colegiCurs(){
        //la un string sau tip de data se pun [] care inseamna ca folosim o multime, un array
        String[] colegi = new String[6];
        colegi[0] = "Sorin";
        colegi[1] = "Lucian";
        colegi[2] = "Mihai";
        colegi[3] = "Ana";
        colegi[4] = "Bogdan";
        colegi[5] = "Alex";

        for(int index = 0; index < 6; index++){
            System.out.println("Numele colegului este " + colegi[index]);
        }
    }

    //lista
    public void colegiCursLista(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Sorin");
        colegi.add("Lucian");
        colegi.add("Mihai");
        colegi.add("Ana");
        colegi.add("Bogdan");
        colegi.add("Alex");

        int index = 0;
        while (index < colegi.size()){
            System.out.println("Numele colegului este " + colegi.get(index));
            index++;
        }
    }

    //map
    //map -> cheie = valoare

    public void categoriiObiecte(){

        HashMap<String, String> obiecte = new HashMap<>();
        obiecte.put("obiect", "laptop");
        obiecte.put("fruct", "mar");
        obiecte.put("floare", "trandafir");

        for (String key : obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este: " + obiecte.get(key));

        }
    }

    public void tariOrase(){
        HashMap<String, List<String>> clasificare = new HashMap<>();

        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Iasi");
        oraseRomania.add("Arad");
        oraseRomania.add("Oradea");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");
        oraseItalia.add("Roma");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Madrid");
        oraseSpania.add("Barcelona");
        oraseSpania.add("Pamplona");

        clasificare.put("Romania", oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania", oraseSpania);

        for (String key : clasificare.keySet()) {
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt: " + clasificare.get(key));
        }
    }
}
