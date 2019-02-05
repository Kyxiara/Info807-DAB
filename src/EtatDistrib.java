import com.modeliosoft.modelio.javadesigner.annotations.objid;

import java.util.ArrayList;

@objid ("79de9dd9-e97c-4586-8281-bd7792dda0c2")
public class EtatDistrib {

    protected  Distrib distrib;

    public EtatDistrib(Distrib distrib){
        this.distrib = distrib;
    }

    public void choisirOperation(NatureOperation noOp) {
    }

    void afficheSoldes(ArrayList<Compte> comptes){
    }

    void selectionneCompte(Compte compte){
    }

    public void afficheCompte(Compte compte){
    }

    public boolean retrait(float montant, Compte compte){
        return true;
    }

    public void envoyerBillets(float montant){
    }

    public float recupereBillets(){
        return 0;
    }
}
