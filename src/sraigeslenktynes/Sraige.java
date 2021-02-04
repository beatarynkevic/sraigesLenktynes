package sraigeslenktynes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Sraige extends Thread {
    static ArrayList rezultatuSarasas1 = new ArrayList();   //sherinimas bus per visus objektus
    
    public ArrayList rezultatuSarasas;
    public String vardas;
    public final int finish = 10; //konstanta, tas pats kas const is JS
    public int nueitasKelias;

    public Sraige(String vardas, ArrayList<String> rezultatas) {
        this.vardas = vardas;
        this.rezultatuSarasas = rezultatas;
    }

    public void run() {
        Date d = new Date();
        System.out.println(this.vardas + " " + d.getTime());
        
        do {
            int ejimas = new Random().nextInt(5) + 1; //1-5
            this.nueitasKelias += ejimas;
            if (this.nueitasKelias < this.finish) {
                System.out.println(this.vardas + " nusliauze " + this.nueitasKelias);
            } else {
                System.out.println("Finish " + this.finish + " " + this.vardas);
                long skirtumas = new Date().getTime() - d.getTime();
                
                
                synchronized(rezultatuSarasas1) {
                this.rezultatuSarasas1.add(this.vardas + " " + skirtumas);
            }   
            }
            
            try {
                Thread.sleep(new Random().nextInt(5) + 1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sraige.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (this.nueitasKelias < this.finish);

    }
}
