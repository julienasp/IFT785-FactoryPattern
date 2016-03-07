/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUASP-G73-Android
 */
package vehicule;
public class VehiculeToyotaFactory {
    
    public VehiculeToyota fabriquerToyota(String typeToyota){
		
	switch (typeToyota.toUpperCase()) {
            case "YARIS":  System.out.println("Fabrique une Yaris"); return new YarisToyota();                    
            case "COROLLA":  System.out.println("Fabrique une Corolla"); return new CorollaToyota();                     
            case "PRIUS":  System.out.println("Fabrique une Prius"); return new PriusToyota();                     
            case "PRIUSC":   System.out.println("Fabrique une Prius C"); return new PriusCToyota();                     
            default: System.out.println("Retourne un null");return null;                     
        }	
        
		
    }
}
