package modele;

import decorateur.SignatureDec;
import decorateur.TexteDec;

public class Application {
    public static void main(String[]args){
        Email e;

        e= new Texte();

        e= new TexteDec(e);
        System.out.println(e.getTexte());

        System.out.println("Contrairement à une opinion répandue, le Lorem Ipsum n'est pas simplement du texte aléatoire." +
                "Il trouve ses racines dans une oeuvre de la littérature latine classique datant de 45 av. J.-C., le rendant vieux de 2000 ans.");

        Signature s;

        s= new Signature();

        e= new SignatureDec(s);
        System.out.println(e.envoyer());
    }


}
