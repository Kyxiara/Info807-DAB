import java.util.ArrayList;
import java.util.Scanner;

import com.modeliosoft.modelio.javadesigner.annotations.mdl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0d428a05-4835-4a63-9729-0f9f70f6d3f2")
public class Distrib {

    //Attributes

    @mdl.prop
    @objid ("b071e6a9-eaa5-425d-8634-bf110f912bbf")
    private int nbBillets10;

    @mdl.prop
    @objid ("d362d19a-adb4-4ab4-b782-1a367d6e1324")
    private int nbBillets20;

    @mdl.prop
    @objid ("3e7bcb52-c809-4ea2-a8f6-09b0adbdf9d1")
    private int nbBillets50;

    @mdl.prop
    @objid ("01ca1789-5025-4d80-a224-58280a830da0")
    private int nbBillets100;

    @objid ("15965bd2-5f19-4edc-aa31-6025fedcc348")
    private Carte carteInseree;

    @objid ("33fba089-53a8-4629-82ad-ac8dda4de582")
    public Banque BanqueDeRattachement;

    private EtatDistrib etat = new etatAttendreOperation(this);

    public Distrib(Banque banqueDeRattachement){
        setBanqueDeRattachement(banqueDeRattachement);
    }

    //Getters and Setters

    public Banque getBanqueDeRattachement() {
        return BanqueDeRattachement;
    }

    public void setBanqueDeRattachement(Banque banqueDeRattachement) {
        BanqueDeRattachement = banqueDeRattachement;
    }


    public EtatDistrib getEtat() {
        return etat;
    }

    public void setEtat(EtatDistrib etat) {
        this.etat = etat;
    }

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

    public String getNoCarte() {
        return carteInseree.getNoCarte();
    }

    //Methods

    @objid ("2f3ffab7-340f-4571-b19f-fe9c6fad5d32")
    public void insererCarte(String noCarte, String code, int nbEssaisRestants) {
        //TODO
    }

    @objid ("4c9133e8-305b-40d1-81b9-3cdf796db78f")
    public boolean saisirCode(int codeSaisi) {
        return true; //TODO
    }

    @objid ("30c69ab3-7411-479b-8506-bb13bd6de7ec")
    public void choisirOperation(NatureOperation noOp) {
        etat.choisirOperation(noOp);
    }

    void afficheSoldes(ArrayList<Compte> comptes){
        etat.afficheSoldes(comptes);
    }

    void selectionneCompte(Compte compte){
        etat.selectionneCompte(compte);
    }

    Compte getChoice(ArrayList<Compte> comptes){
        System.out.println("Veuillez saisir un compte : ");
        Scanner sc = new Scanner(System.in);
        return comptes.get(sc.nextInt());
    }

    public void afficheCompte(Compte compte){
        etat.afficheCompte(compte);
    }

    public boolean assezDargent(float montant) {
        return true; //TODO
    }

    public boolean retrait(float montant, Compte compte){
        return etat.retrait(montant, compte);
    }

    public void envoyerBillets(float montant){
        etat.envoyerBillets(montant);
    }

    public float recupereBillets(){
        return etat.recupereBillets();
    }

    public void afficheUI(){
        etat.afficheUI();
    }

    public void interractionUI(){
        etat.interractionUI();
    }

    public static void main(String[] args) {
        String noCarte = "123";
        Carte carteInseree = new Carte(noCarte);
        Compte compteCheque = new Compte(500, "0123456789", 200);
        Compte compteEpargne = new Compte(2569, "9876543210", 100);
        ArrayList<Compte> comptes = new ArrayList<Compte>();
        comptes.add(compteCheque);
        comptes.add(compteEpargne);
        Client marcel = new Client(comptes);
        CarteClient cc = new CarteClient(noCarte, marcel);
        ArrayList<CarteClient> cartesDeLaBanque = new ArrayList<>();
        cartesDeLaBanque.add(cc);
        Banque creditAgricole = new Banque("CA", cartesDeLaBanque);
        Distrib distribBourget = new Distrib(creditAgricole);
        distribBourget.setBanqueDeRattachement(creditAgricole);
        distribBourget.carteInseree = carteInseree;  // l'utilisateur est déjà authentifié

        //while(true){
            distribBourget.afficheUI();
            distribBourget.interractionUI();
            //break;
        //}
    }
}
