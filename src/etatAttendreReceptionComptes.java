import com.modeliosoft.modelio.javadesigner.annotations.objid;

import java.util.ArrayList;

@objid ("7f2e89ae-e303-4423-8a30-064037eb4885")
public class etatAttendreReceptionComptes extends EtatDistrib {

    public etatAttendreReceptionComptes(Distrib distrib) {
        super(distrib);
    }

    void afficheSoldes(ArrayList<Compte> comptes){
        int i = -1;
        if(comptes != null){
            for (Compte c: comptes) {
                System.out.println(i++ + ". " + c.toString());
            }
        } else {
            System.out.println("aucun compte trouvé");
        }
    }
}
