// Leçon 1 : Déclarez des variables

// Il faut typer chaque variable avant de la déclarer
int incomes = 500;
int savings = 1000;

public class OpenClassrooms {

    public static void main(String[] args) {

        int agePersonne = 19;

        agePersonne = 33;

        agePersonne = agePersonne + 28;

        System.out.println('Age = ' + agePersonne + ' ans')
    }
}

income += 100;

// Les types de variables

String text = "Voici une chaine de caractères";
int numberOfVOwels = 0;
double percentageOfVowels = 0.0;

// Déclaration des constantes grâce au mot clé 'final' avec le nom de la variable en MAJUSCULE

final int NUMBEROFWEEKDAYS = 7;
final String MYFAVOURITEFOOD = "Lasagnes";
int numberOfPets = 2;
String currentSeason = "Summer";

// Pratique sur le navigateur

public class LessonOne {
    
    public static void main(String[] args) {
        int thisYear = 2019;
        String birthdayMonth = "June";
        int firstDay = 3;       
        
        //TODO Etape 1 : créez une variable daysInWeek avec une valeur de 7
        int daysInWeek = 7;
    
        //TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
        firstDay += daysInWeek;

        //TODO Etape 3 : créez une constante numérique nommé STARTINGDAY avec la nouvelle valeur de la variable firstDay    
        final int STARTINGDAY = firstDay;

        // Affiche le résultat 
        System.out.println("There are " + daysInWeek + "days in a week.\nYour starting day in the month is: " + STARTINGDAY);
    }  
    
}