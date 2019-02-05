import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d2c13a24-697a-450c-88d6-8a1bfc4e2bdc")
public class EtatCompte {

    protected Compte compte;

    public EtatCompte(Compte compte){
        this.compte = compte;
    }

    @objid ("711441f7-181d-4892-bca5-f2a9114de739")
    public String toString() {
        return null;
    }

    @objid ("f4891d9e-7a4a-4fb2-9eae-7eabc189f424")
    public void selectionne(boolean select) {
    }

}
