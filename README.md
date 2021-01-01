# MyBooks: guida completa per l'utilizzo
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
In basso sono collocati altri tre pulsanti (C, D, E): il pulsante "*About*" (C) aprirà il file di informazioni dell'applicazione (quello che stai leggendo in questo momento).
Il pulsante "*GitHub*" (D) rimanda l'utente al collegamento sul sito di GitHub.
Infine, il pulsante "*Mail*" (E) permette all'utente di proprorre dei suggerimenti oppure segnalare un bug presso la mail del progetto mybooks.fixandbugs@gmail.com



![Finestra principale](https://github.com/RichardBoy05/MyBooks/blob/main/res/window1.png)



2) **Inserimento libro**: 

Qui l'utente può eseguire tre operazioni: può scegliere di aggiungere un libro (dopo aver compilato tutti i campi ed eventualmente selezionato un'immagine di copertina),
può eliminarne uno, oppure può svuotare direttamente tutta libreria. La schermata è piuttosto intuitiva e non necessita di particolari spiegazioni.



![Inserimento libro](https://github.com/RichardBoy05/MyBooks/blob/main/res/window2.png)


3) **Schermata di ricerca**

In questa finestra si trova una tabella sul lato sinistro insieme a due pulsanti, mentre sul lato destro sono collocati vari filtri di ricerca.
In base ai filtri selezionati (che non potranno essere vuoti in tal caso), una volta premuto il tasto "*Cerca!*", appariranno nella tabella i libri che corrispondono alle caratteristiche scelte (**N.B.**: se non dovessero comparire libri, significa che nessun volume inserito soddisfa la ricerca effettuata).
Sono presenti altri due pulsanti: il pulsante "*Vedi tutto!*", quando premuto, mostrerà tutti i libri posseduti nella tabella sovrastante (essenzialmente, si tratta di una "scorciatia" per visualizzare tutti i libri con un unico clic).
Infine, il tasto "*Scopri di più*" apirà una nuova finestra che mostrerà le informazioni dettagliate del libro selezionato nella tabella (**N.B.**: se nessun libro è selezionato o la riga della tabella selezionata è vuota al clic del pulsante, verrà restituito un messaggio di errore!).


![Schermata di ricerca](https://github.com/RichardBoy05/MyBooks/blob/main/res/window3.png)



4) **Ulteriori informazioni**

Questa finestra mostrerà all'utente le caratteristiche dettagliate del libro selezionato nela finestra di ricerca.
Sarà anche mostrata l'immagine di copertina, qualora sia stata caricata, nello spazio apposito. È anche possibile modificare l'immagine"al volo" premendoci sopra, qualora quella inserita precedentemente non ci soddisfi appieno.
**Importante**: la dimensione dell'immagine di copertina verrà modificarla per adattarsi all'interno della schermata. La dimensione consigliata affinché non vengano variate le proporzioni inziali è di **9/16**, non più piccola di **150 x 263** (la cosa è stata progettata per permettere all'utente di utilizzare, per comodità, un'immagine da telefono, che generlamente corrisponde alle condizioni citate).


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
La scelta è stata fatta per evitare di obbligare l'utente ad installare *Java* manualmente, che si può rivelare scomodo per i non esperti.

### Releases
***
Lista delle varie *release* del programma.
* Prima release, *coming soon*, v 1.0.0

### Domande, suggerimenti e bug fixes

Per qualsiasi problema o richiesta contatattatemi presso la *mail ufficiale del programma*: mybooks.fixandbugs@gmail.com

Spero che vi divertiate con il programma =)

Bye
