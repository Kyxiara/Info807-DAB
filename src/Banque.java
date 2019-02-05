import java.util.ArrayList;
import java.util.List;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid("cc49a434-27a0-40d0-a577-6174a3ae3a5b")
public class Banque {
    @mdl.prop
    @objid("baa6c6ac-c757-4bc4-90ea-5079ea10856f")
    private String nomBanque;

    @mdl.prop
    @objid("5653bdb6-0c4e-497d-9858-78848fe5e6c9")
    private String codeBanque;

    @objid("05e8613f-1d97-4d63-9a1d-d721e227c420")
    public List<CarteClient> carteClient = new ArrayList<CarteClient>();

    @objid("8cbb231f-0ca2-40d7-a93c-6ebb0980c4c5")
    public List<Banque> autresBanques = new ArrayList<Banque>();

    @mdl.propgetter
    private String getNomBanque() {
        // Automatically generated method. Please do not modify this code.
        return this.nomBanque;
    }

    @mdl.propsetter
    private void setNomBanque(String value) {
        // Automatically generated method. Please do not modify this code.
        this.nomBanque = value;
    }

    @mdl.propgetter
    private String getCodeBanque() {
        // Automatically generated method. Please do not modify this code.
        return this.codeBanque;
    }

    @mdl.propsetter
    private void setCodeBanque(String value) {
        // Automatically generated method. Please do not modify this code.
        this.codeBanque = value;
    }

    @objid("7e98eb37-285f-4101-9f98-3e5261f05350")
    public boolean estUnClient(String noCarte) {
        return true; //TODO
    }

    public ArrayList<Compte> recupereComptes(String noCarte){
        CarteClient carte = rechercheCarte(noCarte);
        if (carte != null){
            Client client = carte.getClient();
            return client.getComptes();
        }
        return null;
    }

    public CarteClient rechercheCarte(String noCarte){
        int i = 0;
        while (i < carteClient.size()){
            if (carteClient.get(i).possedeNoCarte(noCarte)){
                return carteClient.get(i);
            }
        }
        return null;
    }

}
