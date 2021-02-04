package sraigeslenktynes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
        Sraige sliauzia 100 cm
        sliauzimas: pamiega random nuo 1 iki 5 mili sek
        pasliauzia random nuo 1 iki 5 cm
        po 10 20 30...cm spausdina  "sraige 1 nusliauze 11cm(tiek kiek tuo metu bus)"
        sukam cikla
        sraige turi sliauzti 100 cm (is viso)


        main'as turi 8 sraiges
        turi paliesti visas sraiges sliauzti
        sulaukti kol baigs visos sraiges
        atspauzdinti turnirine lentele
 */
public class SraigesLenktynes {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<String> rezultatuSarasas = new ArrayList(); //taspats listas perduodamas i visus objektus

        Sraige s1 = new Sraige("Tom", rezultatuSarasas);
        Sraige s2 = new Sraige("Sim", rezultatuSarasas);
        Sraige s3 = new Sraige("Kim", rezultatuSarasas);
        Sraige s4 = new Sraige("Fin", rezultatuSarasas);
        Sraige s5 = new Sraige("Fifth", rezultatuSarasas);
        Sraige s6 = new Sraige("Sixth", rezultatuSarasas);
        Sraige s7 = new Sraige("Swen", rezultatuSarasas);
        Sraige s8 = new Sraige("Astuntas", rezultatuSarasas);

        s1.start();
        s2.start(); //nes klase extends Thread ir iesko run metodo
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();
        
        s1.join();
        s2.join();
        s3.join();
        s4.join();
        s5.join();
        s6.join();
        s7.join();
        s8.join();

        int a = 0;
        System.out.println("---------- REZULTATU LENTELE ----------");
        /*
        for (String i : rezultatuListas) {
        System.out.println(i);
        
        */
        
        
        for( int i = 0; i < Sraige.rezultatuSarasas1.size(); i ++) {
            a++;
            System.out.println(Sraige.rezultatuSarasas1.get(i) + " uzeme " + a + " vieta");
        }
        
    }

}
