/**
 *
 * @author JUASP-G73-Android
 */
package vehicule;

public abstract class VehiculeToyota {
    /**************************************/
    /********* PRIVATE ATTRIBUTS **********/
    /**************************************/	
    protected String nomModele;
    protected int vitesseMax;
    protected int grosseurPneus;

    /**************************************/
    /************ CONSTRUCTORS *************/
    /**************************************/    
    public VehiculeToyota() {
    }	
    
    public VehiculeToyota(String nomModele, int vitesseMax, int grosseurPneus) {
        this.nomModele = nomModele;
        this.vitesseMax = vitesseMax;
        this.grosseurPneus = grosseurPneus;
    }	
	
    /**************************************/
    /********* GETTER AND SETTER **********/
    /**************************************/
    public String getNomModele() { return nomModele; }
    public void setNomModele(String newNomModele) { this.nomModele = newNomModele; }
    public int getVitesseMax() { return vitesseMax; }
    public void setVitesseMax(int newVitesseMax) { this.vitesseMax = newVitesseMax; }
    public int getGrosseurPneus() { return grosseurPneus; }
    public void setGrosseurPneus(int newGrosseurPneus) { this.grosseurPneus = newGrosseurPneus; }
	
	
    /**************************************/
    /*************   METHODS  *************/
    /**************************************/    
    public void informationsVehiculeToyota(){

        System.out.println(getNomModele() + " à une vitesseMax de " + getVitesseMax() + "km/h et à des pneus de " + getGrosseurPneus() + " pouces" );

    }
}
