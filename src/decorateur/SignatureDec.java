package decorateur;

import modele.Signature;

public class SignatureDec extends DecorateurEmail {

    public SignatureDec (Signature signature){
        super(signature);
    }

    @Override
    public String getTexte() {
        return email.getTexte();
    }

    @Override
    public String envoyer() {
        return email.envoyer();
    }

}
