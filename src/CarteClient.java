import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("320bd049-59c7-49a3-875a-6badb88241ce")
public class CarteClient {

    //Attribute

    @objid ("e3f73978-e91a-47f7-9e14-c2c201927d48")
    private String noCarte;

    private Client proprietaire;


    public CarteClient(String noCarte, Client proprietaire) {
        this.noCarte = noCarte;
        this.proprietaire = proprietaire;
    }

    //Methods

    @objid ("179fd4e9-b701-4f64-82e3-973ce409ee09")
    public boolean possedeNoCarte(String noCarte) {
        return true; //TODO
    }

    @objid ("a0723244-55fd-470b-8d99-7393676e9c12")
    public Client getClient() {
        return proprietaire;
    }

}
