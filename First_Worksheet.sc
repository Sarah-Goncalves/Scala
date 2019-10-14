// Premiers pas avec Scala

// Scala, un calculateur:

1+3  //addition --> Int

8/2  //division entière

8%3  //modulo (reste de la division entière)

8/3  //division entière

8.0/3.0  //si on veut le résultat en float de la division --> Double

2+5*3
(2+5)*3  //priorité des parenthèses

// Les caractères et chaînes de caractères:

'a'  // --> Char

'a' toInt  //donne le code Ascii de la lettre

'a'.toInt

"Bienvenue sur Sacala"  // --> String

"Bienvenue " + "sur Scala"

"Bienvenue " concat "sur Scala"

"Bienvenue ".concat("sur Sacala")

"Hello"(0)  //indice commence à 0
"Hello"(4)

"Hello"*2

"Hello World".length

// Les booléens et les opérateurs:

true
false

!true             // ! = différent de
!false

true && true      // && = ET
false && true
false && false

true || true      // || = OU
true || false
false || false

5 == 5
5 != 5
5 >= 5
5 > 4
5 < 4

"Hello" == "Goodmorning"
"A" == 65
'A' == 65
'A'<'B'      // true car basé sur le code Ascii
// les charactères seules sont à mettre entre simple quotes ''
// les chaînes de caractères sont à mettre entre doubles quotes ""

// Conditions:

if (0<1) "Good morning" else "Good afternoon"  // if (true) ...
if (0>1) "Good morning" else "Good afternoon"

// Les variables:

//on déclare une variable comme suit:
//var <Nom>: <Classe> = <ValeurInitiale>

var pi: Double = 3.141592653

pi
2*pi

//on créé une variable:
var x: Int = 5
//mais on peut la changer par la suite:
x = 7

//on peut créer une variable constante qui, elle, ne pourra plus être changée:
val y: Int = 4
// y = 8  //Error !

//on peut utiliser les résultats de nos opérations précédentes commes des val:
res40 - res39
res40 - 1

//Fonction avec condition:
def m_somme(x: Int, y: Int): Int = x + y
m_somme(4,2)

def m_string(s: String): String= s*2
m_string("Je suis une phrase! ")

def ope(v: Int, w: Int)= if (v>w) printf("v is higher than w") else printf("v is smaller than w")
ope(3,4)
ope(19,12)

//Listes:
val l = List(1,2,3,4,5)
print(l)

val li = (1 to 20).toList
print(li)

val li_2 = (1 to 20 by 2).toList
print(li_2)

li(5)









