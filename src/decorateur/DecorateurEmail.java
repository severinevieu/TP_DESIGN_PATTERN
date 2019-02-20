package decorateur;

import modele.Email;

public abstract class DecorateurEmail extends Email{

    protected Email email;

    public DecorateurEmail(Email email){
        super();
        this.email = email;
    }

    public abstract String getTexte();
}
