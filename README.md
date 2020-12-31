## Indice
1. [Informazioni generali](#informazioni-generali)
2. [Tecnologie utilizzate](#tecnologie-utilizzate)
3. [Installazione](#installazione)
4. [FAQs](#faqs)

### Informazioni generali
***
"MyBooks" è un'applicazione per gestire la tua libreria personale ed eseguire ricerche specifiche in base ai dati inseriti e ai filtri abilitati.
Il progetto è rivolto a chiunque ami la lettura e che desideri conservare i propri volumi con ordine.
L'applicazione presenta quattro interfacce grafiche differenti:

1) **Interfaccia principale**: 

Questa schermata permette all'utente di scegliere se inserire un nuovo libro oppure effettuare una ricerca tra quelli già inseriti.
In basso sono collocati altri tre pulsanti: il pulsante "About" (col simbolo "i") aprirà il file di informazioni dell'applicazione (quello che stai leggendo adesso =)).
Il secondo da sinistra (col simbolo del gatto) rimanda l'utente al collegamento su GitHub.
Infine, il pulsante "Mail" permette all'utente di proprorre dei suggerimenti oppure segnalare un bug presso la mail del progetto mybooks.fixandbugs@gmail.com



![Finestra principale](https://github.com/RichardBoy05/MyBooks/blob/main/res/frame1.png)



2) **Inserimento libro**: 

Qui l'utente può eseguire tre operazioni: può aggiungere un libro (dopo aver compilato tutti i campi ed eventualmente selezionato un'immagine di copertina), può eliminarne
uno oppure svuotare direttamnete tutta libreria. La schermata è piuttosto intuitiva e non necessita di particolari spiegazioni.



![Inserimento libro](https://github.com/RichardBoy05/MyBooks/blob/main/res/frame2.png)


3) **Schermata di ricerca**

In questa finestra si presenta una tabella sul lato sinistro insieme a due pulsanti, mentre sul lato destro sono collocati i vari filtri di ricerca.
In base ai filtri selezionati (che non potranno essere vuoti in tal caso), una volta premuto il tasto "Cerca!", appariranno nella tabella i libri che corrispondono alle carateristiche scelte (N.B.: se non dovessero comparire libri, significa che nessun libro inserito soddisfa la ricerca effettuata).
Sono presenti altri due pulsanti: il pulsante "Vedi tutto!", quando premuto, mostrerà tutti i libri posseduti nella tabella sovrastante (essenzialmente, si tratta di una "scorciatia" per visualizzare tutti i libri con un unico clic).
Infine, il tasto "Scopri di più" apirà na nuova finestra che mostrerù le informazioni in detaglio del libro selezionato nella tabella (**N.B.**: se nessun libro è selezionato o la riga della tabella selezionata è vuota al clic del pulsante, verrà restituito un messaggio di errore!).


![Schermata di ricerca](https://github.com/RichardBoy05/MyBooks/blob/main/res/frame3.png)



4) **Ulteriori informazioni**

Questa finestra mostrerà all'utente le caratteristiche detagliate del libro selezionato nela finestra di ricerca. Sarà anche mostrata l'imagine di copertina, qualora sia stat caricata, nello spazio apposito. È anche possibile modificare l'immagine di copertina "al volo" premendoci sopra.
**Importante**: la dimensione dell'immagine di copertina verrà modificarla per adattarla all'interno della schermata. La dimensione consigliata affinché non sia malformata è un'immagine in 9/16, non più piccola di 150 x 263 (la cosa è ststa progettat per permettere all'utente di utilizzare, per comodità, un'immagine da telefono, che gnerlambet è in 9/16).


![Ulteriori informazioni](https://github.com/RichardBoy05/MyBooks/blob/main/res/frame4.png)


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

### FAQs
***
A list of frequently asked questions
1. **This is a question in bold**
Answer of the first question with _italic words_. 
2. __Second question in bold__ 
To answer this question we use an unordered list:
* First point
* Second Point
* Third point
3. **Third question in bold**
Answer of the third question with *italic words*.
4. **Fourth question in bold**
| Headline 1 in the tablehead | Headline 2 in the tablehead | Headline 3 in the tablehead |
|:--------------|:-------------:|--------------:|
| text-align left | text-align center | text-align right |
