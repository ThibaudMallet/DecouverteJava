// Leçon 2 : Choisissez le bon type de variable

// Déclaration d'une variable sans valeur

int nombreDeMotsDansLaPhrase;

// Types primitifs

// Numérique = int/long, float/double
// long pour les entiers avec beaucoup de chiffres
// float = 2 décmales, double si il y en a plus

float length = 1553.24:
double width = 123.589647;

int a = 5;
int b = 2;
float c = a / b;

// Pour obtenir 2.5 en résultat, je dois utiliser le cast pour changer le type de la variable a ou b pendant l'opération

float c = (float) a / b;


// Les booléens

boolean isCodingInJava = false;

// 2 façons pour inverser le résultat
isCodingInJava = true;
isCodingInJava = !isCodingInJava;

// Les Strings (sont en réalité des objets)

String city = "Xonrupt-Longemer";
String secondCity = "Ronquerolles";

// Concaténation

String cities = city + " et " + secondCity;

