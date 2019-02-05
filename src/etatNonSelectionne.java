import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2042e7b7-a960-4d8b-90fe-98b1bc49c3ac")
public class etatNonSelectionne extends EtatCompte {

    public etatNonSelectionne(Compte compte) {
        super(compte);
    }

    public void selectionne(boolean select) {
        if (select){
            EtatCompte etatCompte = new etatSelectionne(compte);
            compte.setEtat(etatCompte);
        }
    }

    public String toString() {
        return "Compte : " + compte.getNoCompte() + "\nsolde : " + compte.getSolde();
    }
}
