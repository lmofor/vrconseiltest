/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testvrconseil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class Readfile {
    String chemin;

    public Readfile(String chemin) {
        this.chemin = chemin;
    }

    public String getChemin() {
        return chemin;
    }

    public void setChemin(String chemin) {
        this.chemin = chemin;
    }
    
     public  List<String> chargerficher() {

        
        List<String> contentFile=new ArrayList<>();
        List<String> contentFiletranforme=new ArrayList<>();
        Path chem = Paths.get(this.chemin);
        
        try {
            // Lire toutes les lignes du fichier dans une liste
            contentFile = Files.readAllLines(chem);

            // Afficher chaque ligne
            
           
            //traitement de la liste avant de l'envoyer
            if (!contentFile.isEmpty()) {
            contentFiletranforme.add(contentFile.get(0)); // Ajout de "5 5" intact
            }
           for (int i = 1; i < contentFile.size(); i += 2) {
            String position = contentFile.get(i); 
            String instructions = contentFile.get(i + 1);

            // Combiner les deux lignes en un seul élément
            contentFiletranforme.add(position + " " + instructions);
        }
           
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contentFiletranforme;
    }
    
}
