import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0d428a05-4835-4a63-9729-0f9f70f6d3f2")
public class Distrib {
    @mdl.prop
    @objid ("b071e6a9-eaa5-425d-8634-bf110f912bbf")
    private int nbBillets10;

    @mdl.propgetter
    private int getNbBillets10() {
        // Automatically generated method. Please do not modify this code.
        return this.nbBillets10;
    }

    @mdl.propsetter
    private void setNbBillets10(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbBillets10 = value;
    }

    @mdl.prop
    @objid ("d362d19a-adb4-4ab4-b782-1a367d6e1324")
    private int nbBillets20;

    @mdl.propgetter
    private int getNbBillets20() {
        // Automatically generated method. Please do not modify this code.
        return this.nbBillets20;
    }

    @mdl.propsetter
    private void setNbBillets20(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbBillets20 = value;
    }

    @mdl.prop
    @objid ("3e7bcb52-c809-4ea2-a8f6-09b0adbdf9d1")
    private int nbBillets50;

    @mdl.propgetter
    private int getNbBillets50() {
        // Automatically generated method. Please do not modify this code.
        return this.nbBillets50;
    }

    @mdl.propsetter
    private void setNbBillets50(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbBillets50 = value;
    }

    @mdl.prop
    @objid ("01ca1789-5025-4d80-a224-58280a830da0")
    private int nbBillets100;

    @mdl.propgetter
    private int getNbBillets100() {
        // Automatically generated method. Please do not modify this code.
        return this.nbBillets100;
    }

    @mdl.propsetter
    private void setNbBillets100(int value) {
        // Automatically generated method. Please do not modify this code.
        this.nbBillets100 = value;
    }

    @objid ("15965bd2-5f19-4edc-aa31-6025fedcc348")
    private List<Carte> carteInseree = new ArrayList<Carte> ();

    @objid ("33fba089-53a8-4629-82ad-ac8dda4de582")
    public Banque BanqueDeRattachement;

    @objid ("2f3ffab7-340f-4571-b19f-fe9c6fad5d32")
    public void insererCarte(String noCarte, String code, int nbEssaisRestants) {
    }

    @objid ("4c9133e8-305b-40d1-81b9-3cdf796db78f")
    public boolean saisirCode(int codeSaisi) {
    }

    @objid ("30c69ab3-7411-479b-8506-bb13bd6de7ec")
    public void choisirOperation(int noOp) {
    }

    @objid ("37826b7b-0b51-4700-9269-233a66fba8bb")
    Carte getCarteInseree() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.carteInseree;
    }

    @objid ("03b409f2-1d36-4950-9985-e7c9964188c5")
    void setCarteInseree(Carte value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.carteInseree = value;
    }

}
