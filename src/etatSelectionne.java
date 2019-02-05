import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1b859c62-6ab4-4d31-bb0c-5a2b019d17c0")
public class etatSelectionne extends EtatCompte {

    public etatSelectionne(Compte compte) {
        super(compte);
    }

    public void selectionne(boolean select) {
        if (!select){
            EtatCompte etatCompte = new etatNonSelectionne(compte);
            compte.setEtat(etatCompte);
        }
    }

    public String toString() {
        return "Compte : " + compte.getNoCompte() + "\nsolde : " + compte.getSolde() + "\nplafond : " + compte.getPlafondRetrait();
    }
}
