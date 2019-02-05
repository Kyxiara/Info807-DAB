import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("08fef21c-7793-4607-8369-e334cb18c872")
public class etatAffichageCompteSeul extends EtatDistrib {

    public etatAffichageCompteSeul(Distrib distrib) {
        super(distrib);
    }

    public void afficheCompte(Compte compte){
        System.out.println(compte.toString());
        distrib.setEtat(new etatAttendreOperation(distrib));
    }
}
