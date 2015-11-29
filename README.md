Grenoble 1 UJF
UFR IMAG
UE Conception Orientée Objet
S.   Caffiau
TP Bataille Espagnole
Novembre 2015

COUTAUD Ulysse
LEFRERE Jules


 
M1 – Info 
 ­ année 2015/2016 
 
Bataille espagnole  
CC1 : conception (19 octobre) 
CC2 : implèmentation (doit être terminé pour le   30/11 13h  ) 
 
La   bataille   espagnole   est   un   jeu   de   carte   qui   se   joue   de   2   à   4   joueurs.   Les   cartes   sont   de   4  
familles   différentes   :   l’or,   l’épée,   le   bâton   et   la   coupe.   L’ordre   des   cartes   dans   une   famille  
est :   As,   3,   Roi,   Dame,   Cavalier,   10,   9,   8,   7,   6,   5,   4,   2   et   leurs   valeurs   (ie   le   nombre   de   points  
de chaque carte) sont présentées dans le tableau ci­dessous : 
 
As  3  Roi  Dame  Cavalier  10 à 2 
11  10  4  3  2  0 
 
Une   partie   est   constituée   de   plusieurs   “jeux”   qui   permettent   aux   joueurs   de   marquer   des  
points.   Le   gagnant   étant   celui   qui   a   le   plus   de   points   lorsque   la   partie   se   termine.   Une   partie  
se   joue   soit   en   un   nombre   de   jeux   fixé   par   les   joueurs,   soit   par   un   nombre   de   points   à  
atteindre (exemple : fin de la partie lorsqu’un joueur a atteint les 300 points).  
A   chaque   jeu,   une   famille   est   désignée   comme   étant   l’atout.   Cette   famille   a   pour   particularité  
d’être     plus   forte     que   les   autres,   c’est   à   dire   que   n’importe   quelle   carte   de   la   famille   atout   bat  
n’importe quelle carte d’une des trois autres familles. 
Le   choix   de   la   famille   atout   d’un   jeu   se   passe   de   la   manière   suivante   :   après   distribution   de   3  
cartes   à   chaque   joueur,   la   première   carte   du   tas   de   cartes   restantes   est   retournée,   la   famille  
à   laquelle   elle   appartient   est   désignée   comme   atout   si   l’un   des   joueurs   (interrogés   dans   le  
sens   des   aiguilles   d’une   montre)   le   souhaite.   Si   personne   ne   souhaite   la   famille   de   la   carte  
comme   atout,   les   joueurs   peuvent   en   choisir   une   autre   (là   aussi   dans   l’ordre   des   aiguilles  
d’une montre). La carte retournée est placée sous le tas pour être la dernière carte piochée.  
 
Chaque   joueur   possède   3   cartes   (qu’il   voit).   A   chaque   tour,   il   joue   une   de   ses   3   cartes   et   en  
pioche   une   autre   dans   le   tas   de   cartes   non   distribuées   (tant   qu’il   en   reste   dans   le   tas).   Une  
fois   que   tous   les   joueurs   ont   joué   leur   tour,   la   carte   la   plus   forte   remporte   la   bataille   et   donc  
le   joueur   qui   l’a   jouée   prend   les   cartes   du   pli   (sa   carte   et   celles   des   autres   joueurs)   et  
commencera   le   tour   suivant.   Toutes   les   cartes   remportées   sont   comptabilisée   à   la   fin   du   jeu  
(quand toutes les cartes auront été jouées). 
 Pour définir la carte la plus forte d’un pli : 
­ s’il   n’y   a   aucune   carte   de   la   famille   atout,   la   carte   la   plus   forte   est   celle   la   plus   haute  
dans   l’ordre   des   cartes   jouées   parmi   les   cartes   de   la   même   famille   que   la   1ère   carte  
jouée 
­ s’il   y   a   au   moins   une   carte   de   la   famille   atout,   c’est   la   carte   la   plus   haute   dans   l’ordre  
parmi les cartes de la famille atout. 
Exemple : 
cartes jouées (dans l’ordre de jeu) :  
Joueur 1 : Dame Bâton 
Joueur 2 : Roi Bâton 
Joueur 3 : As Or 
Joueur 4 : As Epée 
­ cas 1 : or est famille atout 
une seule carte or de jouer, elle remporte la bataille (le joueur 3 remporte le pli) 
­ cas 2 : bâton est famille atout 
2   cartes   bâton   ont   été   jouées,   le   roi   et   la   dame,   dans   l’ordre   des   cartes   le   roi   est   plus  
fort   que   la   dame   c’est   donc   le   roi   bâton   qui   remporte   la   bataille   (joueur   2   remporte   le  
pli) 
­ cas 3 : coupe est famille atout 
aucune   carte   de   la   famille   coupe   n’a   été   jouée,   on   considère   donc   la   famille   de   la  
première carte jouée (bâton) et on retombe sur le cas 2 
 
Indication sur les notes :  
­ minimum (10/20) :  
­ code de toutes les classes (avec associations) conforme au diagramme de 
classe  
­ un main qui crée les objets et appelle les méthodes pour une partie (tout sans 
aucune interaction) que vous avez créé vous même 
­ v2 : 12/20 : 
­ minimum 
­ commentaires + javadoc généré 
­ v3 : 15/20 : 
­ v2 
­ modification du main par enseignant pour tester les “interdits” (création d’une 
partie avec 5 joueurs....) (introduction de programmation par contrat et 
gestion d’exception) 
­ v4 : 20/20 
­ v3 
­ déroulement d’un jeu interactif en ligne de commande (l’enseignant peut voir 
les cartes et en choisir une dans la console (en appelant la bonne méthode)) 
­ bonus* : 
­ représentation graphique 
­ IA 
­ jeu en réseau.... 
* attention : tout ajout bonus doit être conforme aux exigences de documentation, gestion 
des erreurs.... pour être considéré comme complet 