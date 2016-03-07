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
            case "YARIS":  return new YarisToyota();                    
            case "COROLLA":  return new CorollaToyota();                     
            case "PRIUS":  return new PriusToyota();                     
            case "PRIUSC":  return new YarisToyota();                     
            default: return null;                     
        }	
        
		
    }
}
