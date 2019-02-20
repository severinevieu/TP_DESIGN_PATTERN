package modele;

public class Texte extends Email {
    public Texte(){
        texte ="Bonjour madame, monsieur ";
    }
    @Override
    public String envoyer() {
        return (texte);
    }
}
