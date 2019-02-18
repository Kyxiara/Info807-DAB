import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("04a70785-b11f-41ba-896b-758c2915a7fd")
public class etatRecupereBillets extends EtatDistrib {

    public etatRecupereBillets(Distrib distrib) {
        super(distrib);
        distrib.setEtat(new etatAttendreOperation(distrib));
        distrib.interractionUI();
    }
}
