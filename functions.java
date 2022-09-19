// Leçon 3 : Ecrivez une fonction

//Fonction main = point d'entrée du programme

public class Lesson {

    public static void main(String[] args)
    {
        System.out.println("Hello World !")
    }

}

// La suite du cours explique comment éxécuter un programme Java à l'aide d'HelloWorld

// Création d'un dossier root
// Création d'un dossier hello (Cela correspond au nom du package)
// Création du fichier à l'intérieur du dossier hello (nom du fichier = nom de la classe)

// Pour générer le fichier .class de sa classe il faut utiliser la commande javac nomdudossierouestlaclasse/nomdufichier
// Puis pour l'executer il faut lancer java nomdudossierouestlaclasse/nomdelaclasse

public class OC {

    public static void main (String[] args)
    {
        String exemple = "hello";

        // Utilisant d'une méthode la class String
        exemple = exemple.toUpperCase();

        // Une autre
        exemple = exemple.replace("HELL", "YEAH");

        System.out.println(exemple);
    }

}

// Dans main il ne doit y avoir aucune logique, juste l'appel à d'autres fonctions
// Comme ci-dessous

package cleanHello;

/** Ceci est une implémentation du message traditionnel "Hello world!"
* @author L'équipe Education d'OpenClassrooms
*/
public class CleanWorld {
    
   /** Le programme commence ici */
   public static void main(String[] args) {
      sayHelloTo("world");
   }
   
   /** affiche le message "hello" au destinataire fourni
   *
   * @param recipient
   */
   private static void sayHelloTo(String recipient) {
      System.out.println("Hello " + recipient);
   }
   
}