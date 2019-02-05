import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("8cdbb1e0-47af-4c83-8652-8ba8b0b6c367")
public class etatAttendreChoixCompte extends EtatDistrib {

    public etatAttendreChoixCompte(Distrib distrib) {
        super(distrib);
    }

    void selectionneCompte(Compte compte){
        compte.selectionne(true);
        distrib.setEtat(new etatAffichageCompteSeul(distrib));
        distrib.afficheCompte(compte);
    }
}
