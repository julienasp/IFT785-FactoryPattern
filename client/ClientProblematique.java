/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUASP-G73-Android
 */
package client;
import java.util.Scanner;
import vehicule.*;
public class ClientProblematique {  
	public static void main(String[] args){
		
            VehiculeToyota unVehicule = null;
		
            //Création static et non dynamique
		
            VehiculeToyota uneYaris = new YarisToyota();

            presentation(uneYaris);

            System.out.print("\n");
		
            //Interaction avec l'utilisateur
            Scanner userInput = new Scanner(System.in);

            String typeToyotaOption = "";

            /*DEVRA ÊTRE MODIFIÉ SUR LE CLIENT DANS LE CAS D'UN AJOUT. (LA REFLEXIVITÉ NE PEUT RÉSOUDRE CE PROBLÈME!)*/
            System.out.print("Pour quel type de toyota souhaitez-vous avoir l'information? (yaris, corolla, prius ou bien priusc)");
            /***********************************************************************************************************************/
            /***********************************************************************************************************************/
            
            if (userInput.hasNextLine()){
			
			typeToyotaOption = userInput.nextLine();
			
            }
            
            /************************************************************************************************/
            /*LE CODE CI-DESSOUS DEVRA ETRE MIS A JOUR SI UN NOUVEAU MODÈLE DE TOYOTA EST AJOUTÉ AU SYSTÈME*/
            /************************************************************************************************/
            switch (typeToyotaOption.toUpperCase()) {
                case "YARIS":  unVehicule = new YarisToyota(); break;                   
                case "COROLLA":  unVehicule = new CorollaToyota(); break;                     
                case "PRIUS":  unVehicule = new PriusToyota(); break;                      
                case "PRIUSC":  unVehicule = new PriusCToyota();  break;                   
                default: unVehicule = null;   break;                   
            }
            /************************************************************************************************/
            /************************************************************************************************/
            if(unVehicule != null){
                presentation(unVehicule);
            } else System.out.print("Mauvaise saisie");
	}
	
	// Executes methods of the super class
	
	public static void presentation(VehiculeToyota unVehicule){
		
		unVehicule.informationsVehiculeToyota();
	}
}
