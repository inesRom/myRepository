package com.jeux.cartes.jeu;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{private static final Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
       ;
        // basic log4j configurator  
        BasicConfigurator.configure();  
        logger.info("Hello world");  
        logger.info("we are in logger info mode");
        
       
   
    String[] les_couleurs = {"coeur","trefle","pique","carreau"};
    String[] les_valeurs = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Rois","As"};
    String couleur= "";
    String valeur = "";
   ArrayList<Carte> paquet = new ArrayList<Carte>();
    
     
            for(int i=0;i<13;i++){
                for(int j=0;j<4;j++){
                   
					couleur = les_couleurs[j];
                    valeur = les_valeurs[i]; 
     
                    paquet.add(new Carte(couleur,valeur)); 
                }
              
            }
            for(int x = 0; x < paquet.size(); x++)
            	 logger.info(paquet.get(x).valeur + " "+paquet.get(x).couleur );
               

            
    }
    
} 
  
   
