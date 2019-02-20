package modele;

public class Signature extends Email {

    public Signature(){
        texte = "Signature ";

    }

    @Override
    public String envoyer() {

        return (texte);
    }

}
