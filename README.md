# MyBooks: guida completa per l'utilizzo (da ultimare)
## Indice
1. [Informazioni generali](#informazioni-generali)
2. [Tecnologie utilizzate](#tecnologie-utilizzate)
3. [Installazione](#installazione)
4. [Releases](#releases)
4. [Domande, suggerimenti e bug fixes](#domande-suggerimenti-e-bug-fixes)

### Informazioni generali
***
**"MyBooks"** è un'applicazione *open-source* per gestire la propria libreria personale: è possibile registrare e salvare i propri libri all'interno del programma
e, successivamente, eseguire ricerche specifiche in base ai filtri abilitati.
Il progetto è rivolto a chiunque ami la lettura e desideri conservare i propri volumi con ordine.
L'applicazione presenta **quattro interfacce grafiche** differenti:

1) **Interfaccia principale**: 

Questa schermata permette all'utente di scegliere se inserire un nuovo libro oppure effettuare una ricerca tra quelli già inseriti (utilizando i due tasti principali A e B).
In basso sono collocati altri tre pulsanti (C, D, E): il pulsante "About" (C) aprirà il file di informazioni dell'applicazione (quello che stai leggendo in questo momento).
Il pulsante "GitHub" (D) rimanda l'utente al collegamento sul sito di GitHub.
Infine, il pulsante "Mail" (E) permette all'utente di proprorre dei suggerimenti oppure segnalare un bug presso la mail del progetto mybooks.fixandbugs@gmail.com



![Finestra principale](https://github.com/RichardBoy05/MyBooks/blob/main/res/window1.png)



2) **Inserimento libro**: 

Qui l'utente può eseguire tre operazioni: può aggiungere un libro (dopo aver compilato tutti i campi ed eventualmente selezionato un'immagine di copertina), può eliminarne
uno oppure svuotare direttamnete tutta libreria. La schermata è piuttosto intuitiva e non necessita di particolari spiegazioni.



![Inserimento libro](https://github.com/RichardBoy05/MyBooks/blob/main/res/window2.png)


3) **Schermata di ricerca**

In questa finestra si presenta una tabella sul lato sinistro insieme a due pulsanti, mentre sul lato destro sono collocati i vari filtri di ricerca.
In base ai filtri selezionati (che non potranno essere vuoti in tal caso), una volta premuto il tasto "Cerca!", appariranno nella tabella i libri che corrispondono alle carateristiche scelte (N.B.: se non dovessero comparire libri, significa che nessun libro inserito soddisfa la ricerca effettuata).
Sono presenti altri due pulsanti: il pulsante "Vedi tutto!", quando premuto, mostrerà tutti i libri posseduti nella tabella sovrastante (essenzialmente, si tratta di una "scorciatia" per visualizzare tutti i libri con un unico clic).
Infine, il tasto "Scopri di più" apirà na nuova finestra che mostrerù le informazioni in detaglio del libro selezionato nella tabella (**N.B.**: se nessun libro è selezionato o la riga della tabella selezionata è vuota al clic del pulsante, verrà restituito un messaggio di errore!).


![Schermata di ricerca](https://github.com/RichardBoy05/MyBooks/blob/main/res/window3.png)



4) **Ulteriori informazioni**

Questa finestra mostrerà all'utente le caratteristiche detagliate del libro selezionato nela finestra di ricerca. Sarà anche mostrata l'imagine di copertina, qualora sia stat caricata, nello spazio apposito. È anche possibile modificare l'immagine di copertina "al volo" premendoci sopra.
**Importante**: la dimensione dell'immagine di copertina verrà modificarla per adattarla all'interno della schermata. La dimensione consigliata affinché non sia malformata è un'immagine in 9/16, non più piccola di 150 x 263 (la cosa è ststa progettat per permettere all'utente di utilizzare, per comodità, un'immagine da telefono, che gnerlambet è in 9/16).


![Ulteriori informazioni](https://github.com/RichardBoy05/MyBooks/blob/main/res/window4.png)


### Tecnologie utilizzate
***
Ecco le tecnologie adoperate nello sviluppo dell'applicazione:
* [Java Development Kit](https://www.oracle.com/it/java/technologies/javase-jdk15-doc-downloads.html): Version 15.0.1 
* [Sqlite 3](https://www.sqlite.org/download.html): Version 3.34.0
* [sqlite-jdbc](https://github.com/xerial/sqlite-jdbc/releases): 3.32.3.2

### Installazione
***
La procedura di installazione è semplice:
* Scaricare l'installer nella sezione *Release* della repository.
* Eseguire il file e seguire le istruzioni per l'installazione guidata.

**N.B.:** il pacchetto d'installazione può sembrare piuttosto pesante. Ciò deriva dal fatto che il Runtime Java è già incluso nel file *.exe*.
La scelta è stata fatta per evitare di obbligarel'utente ad installare Jav manualmente, che si può rivelare scomodo per i non esperti.

### Releases
***
Lista delle varie *release* del programma.
* Prima release, *data da definirsi*, v 1.0.0

### Domande, suggerimenti e bug fixes

Per qualsiasi problema o richiesta contatattatemi presso la *mail ufficiale del programma*: mybooks.fixandbugs@gmail.com

Spero cheil software vi posa essere utile! Ciaooo =)
