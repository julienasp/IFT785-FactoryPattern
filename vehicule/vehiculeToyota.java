/**
 *
 * @author JUASP-G73-Android
 */
package vehicule;

public abstract class VehiculeToyota {
    /**************************************/
    /********* PRIVATE ATTRIBUTS **********/
    /**************************************/	
    private String nomModele;
    private int vitesseMax;
    private int grosseurPneus;
	
	
    /**************************************/
    /********* GETTER AND SETTER **********/
    /**************************************/
    public String getNomModele() { return nomModele; }
    public void setNomModele(String nomModele) { nomModele = nomModele; }
    public int getVitesseMax() { return vitesseMax; }
    public void setVitesseMax(int vitesseMax) { vitesseMax = vitesseMax; }
    public int getGrosseurPneus() { return grosseurPneus; }
    public void setGrosseurPneus(int grosseurPneus) { grosseurPneus = grosseurPneus; }
	
	
    /**************************************/
    /*************   METHODS  *************/
    /**************************************/    
    public void informationsVehiculeToyota(){

        System.out.println(getNomModele() + " à une vitesseMax de " + getVitesseMax() + "km/h et à des pneus de " + getGrosseurPneus() + " pouces" );

    }
}
