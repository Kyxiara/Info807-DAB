import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("263ef610-909f-4716-90e3-61b0c941afed")
public class etatAttendreChoixCompteEtMontant extends EtatDistrib {

    public etatAttendreChoixCompteEtMontant(Distrib distrib) {
        super(distrib);
    }

    public boolean retrait(float montant, Compte compte){
        distrib.setEtat(new etatConfirmationRetrait(distrib));
        if (!distrib.assezDargent(montant)){
            distrib.setEtat(new etatAttendreOperation(distrib));
            return false;
        }
        if (!compte.retrait(montant)){
            distrib.setEtat(new etatAttendreOperation(distrib));
            return false;
        }
        distrib.envoyerBillets(montant);
        return true;
    }
}
