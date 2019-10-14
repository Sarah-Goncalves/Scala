//Convertir 22.5 de degré Celsius à Fahrenheit (en utilisant la formule (x * 9/5) + 32)
var x: Double = 22.5
(x * 9/5) + 32

//Modifiez la formule de Centigrade à Fahrenheit pour obtenir un nombre entier au lieu d'un nombre à
//virgule flottante.
res0.round

//En utilisant la valeur d'entrée 2.7255, générez la chaîne "Vous devez 2,73 $." Est-ce faisable avec
//l'interpolation de chaînes de caractères ?
val ch: String = "Vous devez"
val ch_2: String = "$."
val num: Double = 2.7255

ch + " " + num.round + ch_2

println(f"$ch $num%1.2f$ch_2")

//Existe-t-il une façon plus simple d'écrire ce qui suit :
//val flag : Boolean = false
//val result : Boolean = (flag === false)
val flag = false
val result = !flag

//Convertir un nombre en un caractère:
val nb = 76
nb.toChar

//Fonction:
def fonct(x: String): String = if (x.length ==0) "n/a" else x
fonct("Je suis ici!")
fonct("")

//Pattern matching : filtrage de motifs
//Un chaine en entrée, écrivez un matching pattern qui retournera la même chaine de caractère si elle n'est
//pas vide, ou bien la chaîne "n/a" si elle est vide.
val chaine: String = "Je suis une unique"
chaine match {
  case "" => "n/a"
  case _ => chaine
}

def filt(ch: String): String = ch match {
  case "" => "n/a"
  case _ => ch
}
filt("To be or not to be")
filt("")

//Étant donné un double, écrivez une expression pour retourner "plus grand" s'il est supérieur à zéro,
//"même" s'il est égal à zéro, et "moins" s'il est inférieur à zéro.

val doub: Double = 0.5

doub match {
  case x if x>0 => println("plus grand")
  case x if x==0 => println("meme")
  case x if x<0 => println("moins")
}

//Ecrire une expression pour convertir une des valeurs d'entrée cyan, magenta, jaune en leurs équivalents
//hexadécimaux à six caractères sous forme de chaîne. Que pouvez-vous faire pour gérer les conditions
//d'erreur ?
val couleur: String = "cyan"

couleur match {
  case "cyan" => "off"
  case "magenta" => "ffo"
  case "yellow" => "fof"
  case _ => "error"
}

//Imprimez les chiffres de 1 à 100, chaque ligne contenant un groupe de cinq chiffres

val l_nbres = 1 to 100 by 5
println(l_nbres(2))

for (n <- 1 to 100 by 5) {
  for (i <- n to n+4){
    print(i + ", ")
}
  println("")
}

// print : print normal
// println : print + retour à la ligne

//Ecrivez une expression pour imprimer les nombres de 1 à 100, sauf pour les multiples de 3, imprimer
//"type" et pour les multiples de 5, imprimer "safe". Pour les multiples de 3 et 5, écrivez "typesafe".

for (j <- 1 to 100) {
  j match {
    case j if j%3==0 && j%5==0 => print("typesafe, ")
    case j if j%3==0 => print("type, ")
    case j if j%5==0 => print("safe, ")
    case j => print(j+", ")
  }
}

//Ecrire une fonction qui calcule la surface d'un cercle en fonction de son rayon.
def aire_cercle(pi: Double, r: Double): Double = pi*(r*r)
val pi: Double = 3.141592653
aire_cercle(pi,5)
aire_cercle(pi, 4)

import scala.math.{Pi, pow}
println(Pi)
println(pow(2,2))      //la puissance donne tjs un Double

//Fournir une autre forme de la fonction dans l'exercice 1 qui prend le rayon comme une chaîne de
//caractères. Que se passe-t-il si votre fonction est invoquée avec une chaîne vide?
def aire_c(R: String): Double = Pi*(R.toFloat * R.toFloat)

aire_c("2")
aire_c("")

//Ecrire une fonction récursive qui imprime les valeurs de 5 à 50 par cinq, sans utiliser la fonction for ou
//while dans les boucles. Pouvez-vous le rendre récursive ? Avec l’optimisateur de récursivité scala?

def test(c: Int): Unit = {
  var k: Int = c
  while (k < 49) {
    for (i <- k to k+4) print(i + " ")
    println()
    k += 5
  }
}

test(5)

//Ecrire une fonction qui prend une valeur en millisecondes et retourne une chaîne décrivant la valeur en
//jours, heures, minutes et secondes. Quel est le type optimal pour la valeur d'entrée ?

def conv(milli: Int): String = {
  val J: Int = milli / 86400000
  val j: Int = milli % 86400000

  val H: Int = j / 3600000
  val h: Int = j % 3600000

  val M: Int = h / 60000
  val m: Int = h % 60000

  val S: Int = m / 1000
  J.toString + "J " + H.toString + "H " + M.toString + "min, " + S.toString + "s."
}

conv(302404600)

//Ecrire une fonction qui calcule la première valeur augmentée à l'exposant de la seconde valeur. Essayez
//d'écrire ceci d'abord en utilisant math.pow, puis avec votre propre calcul

def expos(a: Int, b: Int): Double = {
  val c = pow(a,b)
  c
}

expos(4,2)

def exposant(d: Int, e: Int): List[Char] = {
  val f = (d.toString * e).toList
  f
  for (i in f)
}
exposant(2,4)