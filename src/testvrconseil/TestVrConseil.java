/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testvrconseil;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class TestVrConseil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List <String>contenu=new ArrayList<>();
         List <Tondeuse>tondeuse=new ArrayList<>();
         
      Readfile reader = new Readfile("fichier.txt");
        contenu=reader.chargerficher();
        List <String>ligne=new ArrayList<>(contenu);
        int maxX=0;
        int maxY=0; 
        for (String elem : ligne) {
            String tab[]=elem.split(" ");
            if (tab.length==2) {
              maxX=Integer.parseInt(tab[0]);
              maxY=Integer.parseInt(tab[1]);
            }
            else if (tab.length==4) {
               Tondeuse td= new Tondeuse(Integer.parseInt(tab[0]), Integer.parseInt(tab[1]),tab[2].charAt(0));
               td.simuler(tab[3], maxX, maxY);
               tondeuse.add(td);
            }
        }
        
       tondeuse.stream().forEach(e -> System.out.print(e + " "));
    }
    
}
