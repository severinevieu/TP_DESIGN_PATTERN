package modele;

public abstract class Email {
    protected String texte;

    public abstract String envoyer();

    public String getTexte(){
        return texte;
    }

}
