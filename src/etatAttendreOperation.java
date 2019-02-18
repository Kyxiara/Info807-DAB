import com.modeliosoft.modelio.javadesigner.annotations.objid;

import java.util.ArrayList;
import java.util.Scanner;

import static javafx.application.Platform.exit;

@objid ("30e79d2d-f67a-4e85-86db-e0e2d10c19e6")
public class etatAttendreOperation extends EtatDistrib {

    public etatAttendreOperation(Distrib distrib) {
        super(distrib);
    }

    @Override
    public void afficheUI() {
        System.out.println("\nBienvenue au crédit agricole");
    }

    @Override
    public void interractionUI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("selectionner une opération :");
        System.out.println("1 - Consultation");
        System.out.println("2 - Retrait");
        System.out.println("3 - Quitter");
        int choix = sc.nextInt();
        if(choix == 2){
            distrib.choisirOperation(NatureOperation.Retrait);
        } else if (choix == 1){
            distrib.choisirOperation(NatureOperation.Consultation);
        } else {
            exit();
        }
    }

    public void choisirOperation(NatureOperation noOp) {
        distrib.setEtat(new etatAttendreReceptionComptes(distrib));
        ArrayList<Compte> comptes = distrib.getBanqueDeRattachement().recupereComptes(distrib.getNoCarte());  // TODO faire dans un autre état ?
        switch (noOp){
            case Consultation:
                distrib.afficheSoldes(comptes);
                distrib.setEtat(new etatAttendreChoixCompte(distrib));
                distrib.selectionneCompte(distrib.getChoice(comptes));
                break;
            case Retrait:
                distrib.afficheSoldes(comptes);
                distrib.setEtat(new etatAttendreChoixCompteEtMontant(distrib));
                Compte compteChoisi = distrib.getChoice(comptes);
                Scanner sc = new Scanner(System.in);
                System.out.println("Veuillez saisir le montant a retiré : ");
                float montant = sc.nextFloat();
                distrib.retrait(montant, compteChoisi);
                break;
        }
    }
}
