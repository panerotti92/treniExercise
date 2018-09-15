# Treni

This is a example of exercise calculate delay of trains.

# GOAL 
The class Test is main class for exercises. 
For check exercise one, launch Test1 method; for check exercise three, launch Test3 method.

# PROBLEM: TRENI

# Esercizio 1
Realizzare una classe JAVA Orario.java che rappresenta l'orario di un treno. Un istanza della classe
Orario e' rappresentata dal codice del treno a cui l'orario fa riferimento, dall'orario di partenza previsto,
dall'orario di partenza effettivo e dalla destinazione del treno (si assuma per semplicita' che gli orari di
partenza e di arrivo siano rappresentati da numeri interi). La classe deve avere un costruttore che prende
in ingresso i valori del codice treno, destinazione e orario di partenza previsto e imposta gli attributi della
classe (si assuma che l'orario di partenza previsto e l'orario effettivo siano inizialmente uguali). La classe
deve fornire i seguenti metodi:
-  un metodo che restituisce la descrizione dell'orario 
(es: Treno AB2300 per ROMA - paretenza ore: 13 - orario effettivo: ore
14 - ritardo 1 ora)
- un metodo che restituice le ore di ritardo del treno
- un metodo che verifica se il treno e' in ritardo o no e restituisce un valore booleano (true se il
treno è in ritardo, false altrimenti)
- un metodo che preso in ingresso un intero lo imposta come orario effettivo del treno: se l'orario
passato come parametro e' minore dell'orario previsto il metodo deve lanciare un'eccezione (vedi
esercizio 2)

# Esercizio 2
Definire una classe OrarioException.java che estenda la classe Exception, ridefinendone il costruttore
vuoto e il costruttore con un argomento di tipo stringa usando i costruttori della superclasse.

# Esercizio 3
Definire una classe JAVA Tabellone.java che rappresenta una lista di orari di treni. La classe deve avere
come unico attributo privato il riferimento ad un oggetto di tipo NodoOrario (definirlo inserendo come
campo info una variabile di tipo Orario (esercizio 1) e un riferimento ad un altro oggetto di tipo
NodoORario). La classe deve fornire le seguenti funzionalità:
- 	un costruttore che preso in ingresso un oggetto di tipo Orario lo inserisce come primo elemento
	della lista di orari memorizzati al suo interno
- 	un metodo che dato in ingresso una variabile di tipo Orario crea un nuovo nodo e lo inserisce in
	coda alla lista degli orari contenuti nel tabellone
- 	un metodo che elimina il nodo relativo al primo orario memorizzato nella lista di orari
- 	un metodo che stampa tutti gli orari contenuti nella lista memorizzata all'interno del tabellone
	tenendo conto dell'eventualita' che il tabellone possa essere vuoto
