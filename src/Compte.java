import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("87850a0f-5d60-4722-bb3d-ca023852cd42")
public class Compte {

    //Attributes

    @objid ("191536ce-0266-408e-a557-46fb6acc98cf")
    private float Solde;

    @objid ("886794fc-3dc8-4e6e-b97a-7ddfe15dd88f")
    private String noCompte;

    @objid ("290984e3-86d4-4695-8f9f-54c3a99b0ef0")
    private float plafondRetrait;

    private EtatCompte etat = new etatNonSelectionne(this);

    //Getters and Setters

    public float getSolde() {
        return Solde;
    }

    public void setSolde(float solde) {
        Solde = solde;
    }

    public String getNoCompte() {
        return noCompte;
    }

    public void setNoCompte(String noCompte) {
        this.noCompte = noCompte;
    }

    public float getPlafondRetrait() { return plafondRetrait; }

    public void setPlafondRetrait(float plafondRetrait) {
        this.plafondRetrait = plafondRetrait;
    }

    @objid ("131d4427-69da-43fb-badc-c8bc0caaa4d4")
    public void setEtat(EtatCompte etat) {
        this.etat = etat;
    }

    //Methods

    public Compte(float Solde, String noCompte, float plafondRetrait){
        this.Solde = Solde;
        this.noCompte = noCompte;
        this.plafondRetrait = plafondRetrait;
    }

    @objid ("ed3c524f-7cad-487f-b2af-3638f09e55e7")
    public String toString() {
        return etat.toString();
    }

    @objid ("ba638c8f-9bbd-48f9-92c9-d24c723f3403")
    public void selectionne(Boolean etat) {
        this.etat.selectionne(etat);
    }

    @objid ("f60a3894-0db7-4ab0-bcb6-0ecf9f38eb11")
    public boolean retrait(float montant) {
        if (!assezDargent(montant)) return false;
        new OperationBancaire(montant, NatureOperation.Retrait); //TODO : find where stock this
        Solde -= montant;
        return true;
    }

    @objid ("eba420ac-4950-4c1b-afec-7e301817d097")
    public boolean assezDargent(float montant) {
        return Solde - montant >= 0;
    }

}
