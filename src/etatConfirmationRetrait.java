import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("2ab2c364-2942-4505-884b-b5dd1a7a1e2c")
public class etatConfirmationRetrait extends EtatDistrib {

    public etatConfirmationRetrait(Distrib distrib) {
        super(distrib);
    }

    public void envoyerBillets(float montant){
        //TODO
        distrib.setEtat(new etatEnvoieBillets(distrib));
        distrib.recupereBillets();
    }
}
