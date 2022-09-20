public class OC4 
{
    static String exemple = "Hello";

    public static void main(String[] args)
    {
        fonction1();
        fonction2();
    }

    public static void fonction1()
    {
        System.out.println(exemple);
    }

    public static void fonction2()
    {
        System.out.println(exemple);
    }
}

// Exercices sur la portée des variables

// Exercices sur public/private dans les Class
// Cela fonctionne comme en PHP

// Niveau de contrôle

// Public / Protected / package-protected (visible que dans le package dans lequel il se trouve - Il se met par défaut) / private
// SI une class est private, tout à l'intérieur sera au même niveau d'exposition / package private ou private