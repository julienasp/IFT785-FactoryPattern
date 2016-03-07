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
public class ClientSolution {  
    public static void main(String[] args){

        // Création de la fabrique
        VehiculeToyotaFactory toyotaFactory = new VehiculeToyotaFactory();

        // Notre véhicule toyota		
        VehiculeToyota monToyota = null;
        
        Scanner userInput = new Scanner(System.in);

        /*LA SEULE LIGNE QUI DEVAIT ÊTRE MODIFIÉ SUR LE CLIENT DANS LE CAS D'UN AJOUT. (REFLEXIVITÉ PEUT RÉSOUDRE CE PROBLÈME!)*/
        System.out.print("Pour quel type de toyota souhaitez-vous avoir l'information? (yaris, corolla, prius ou bien priusc)");
        /***********************************************************************************************************************/
        /***********************************************************************************************************************/

        if (userInput.hasNextLine()){

                String typeToyotaOption = userInput.nextLine().toUpperCase();

                monToyota = toyotaFactory.fabriquerToyota(typeToyotaOption);
                
                if(monToyota != null){

                        presentation(monToyota);

                } else System.out.print("Mauvaise saisie");

        }

    }        

    public static void presentation(VehiculeToyota unVehicule){		
        unVehicule.informationsVehiculeToyota();
    }	
} 

