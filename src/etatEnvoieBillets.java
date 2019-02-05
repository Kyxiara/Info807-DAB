import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("3463652a-c4d5-4669-9bb6-1526e065bf1b")
public class etatEnvoieBillets extends EtatDistrib {

    public etatEnvoieBillets(Distrib distrib) {
        super(distrib);
    }

    public float recupereBillets(){
        distrib.setEtat(new etatRecupereBillets(distrib)); //TODO
        return 0;
    }
}
