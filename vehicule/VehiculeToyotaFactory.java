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
                     break;
            case "COROLLA":  return new CorollaToyota();
                     break;
            case "PRIUS":  return new PriusToyota();
                     break;
            case "PRIUSC":  return new YarisToyota();
                     break;
            default: return null;
                     break;
        }	
        
		
    }
}
