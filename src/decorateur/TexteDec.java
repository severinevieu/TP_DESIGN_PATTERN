package decorateur;

import modele.Email;

public class TexteDec extends DecorateurEmail{

    public TexteDec(Email email) {
        super(email);
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
