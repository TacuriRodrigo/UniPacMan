# Casi di Test

Questo documento descrive i principali casi di test utilizzati per verificare la correttezza della logica del progetto **UNIPACMAN**.  
I test sono stati implementati con **JUnit** ed eseguiti tramite `mvn test`.

Ogni caso di test verifica una funzionalità specifica del gioco, in modo da individuare rapidamente eventuali errori nella logica.


## CT1 – Spawn di Pacman in una cella valida

**Obiettivo:** verificare che Pacman venga generato in una posizione attraversabile (non un muro).  
**Precondizioni:** mappa inizializzata.  
**Azioni:**
1. Creare una nuova `Mappa`.
2. Generare Pacman con `placePacman()`.
3. Convertire la posizione `(x, y)` in coordinate griglia `(riga, colonna)`.
4. Verificare che la cella corrispondente non sia un muro.

**Risultato atteso:** Pacman deve spawnare su una cella libera (tile != muro).


## CT2 – Collisione Pacman contro muro

**Obiettivo:** verificare che Pacman non attraversi i muri.  
**Precondizioni:** Pacman posizionato vicino ad un muro.  
**Azioni:**
1. Impostare la direzione verso il muro (es. destra).
2. Eseguire più tick di movimento (`move(mappa)`).
3. Confrontare la posizione prima e dopo.

**Risultato atteso:** la posizione non deve oltrepassare il muro (Pacman si ferma).


## CT3 – Raccolta del cibo (Food)

**Obiettivo:** verificare che quando Pacman passa su una cella con cibo, questo venga rimosso.  
**Precondizioni:** Pacman sopra una cella con tile `Food`.  
**Azioni:**
1. Portare Pacman su una cella con `F`.
2. Chiamare `move(mappa)` o direttamente `eatFood(r, c)` in base alla logica.
3. Controllare che il tile cambi da `F` a `E`.

**Risultato atteso:** il cibo viene mangiato e scompare dalla mappa.


## CT4 – Incremento del punteggio

**Obiettivo:** verificare che il punteggio aumenti quando Pacman mangia il cibo.  
**Precondizioni:** punteggio iniziale noto.  
**Azioni:**
1. Leggere `score` iniziale.
2. Far mangiare almeno un pallino a Pacman.
3. Leggere `score` finale.

**Risultato atteso:** `score` aumenta del valore previsto (es. +10 per pallino).


## CT5 – Tunnel laterale (wrap)

**Obiettivo:** verificare che attraversando il tunnel Pacman rientri dal lato opposto della mappa.  
**Precondizioni:** Pacman posizionato sulla riga del tunnel.  
**Azioni:**
1. Posizionare Pacman vicino al bordo sinistro sulla riga del tunnel.
2. Impostare direzione sinistra.
3. Eseguire tick di movimento fino a superare il bordo.

**Risultato atteso:** Pacman deve comparire dal lato destro della mappa (wrap completato).


## CT6 – Gate della ghost house

**Obiettivo:** verificare che Pacman non possa attraversare il gate mentre i Ghost sì.  
**Precondizioni:** esistenza del tile `Gate` (valore dedicato).  
**Azioni:**
1. Verificare che `isClearForPacman(r, c)` sul gate ritorni `false`.
2. Verificare che `isClearForGhost(r, c)` sul gate ritorni `true`.

**Risultato atteso:** gate bloccante per Pacman, attraversabile per Ghost.


## CT7 – Collisione Ghost contro muro (block)

**Obiettivo:** verificare che i Ghost riconoscano l’impatto con un muro e reagiscano cambiando direzione.  
**Precondizioni:** Ghost vicino ad un muro.  
**Azioni:**
1. Impostare un movimento verso un muro.
2. Eseguire `move(mappa)` del ghost.
3. Verificare che la collisione venga rilevata (es. `block == true` o cambio direzione successivo).

**Risultato atteso:** Ghost non attraversa il muro e viene attivata la logica di cambio direzione.


## CT8 – Collisione Pacman–Ghost

**Obiettivo:** verificare che la collisione tra Pacman e Ghost venga rilevata.  
**Precondizioni:** Pacman e Ghost molto vicini.  
**Azioni:**
1. Posizionare Ghost e Pacman a distanza minore del raggio di collisione.
2. Eseguire controllo collisione (`isCollidingWith`).

**Risultato atteso:** collisione rilevata (ritorno `true`).


## CT9 – Perdita vita e reset round

**Obiettivo:** verificare che dopo collisione Pacman perda una vita e le entità tornino allo spawn.  
**Precondizioni:** vite iniziali note.  
**Azioni:**
1. Forzare una collisione.
2. Controllare decremento vite.
3. Controllare che Pacman e Ghost siano tornati alle coordinate di spawn.

**Risultato atteso:** vite decrementate, posizioni resettate correttamente.


## CT10 – Game Over e riavvio

**Obiettivo:** verificare il comportamento a vite esaurite e la possibilità di riavviare.  
**Precondizioni:** vite = 1.  
**Azioni:**
1. Forzare collisione per portare vite a 0.
2. Verificare `gameOver == true`.
3. Simulare restart (tasto R / chiamata metodo).
4. Verificare reset completo (vite ripristinate, score azzerato, mappa ripristinata).

**Risultato atteso:** game over attivo, e dopo restart nuova partita correttamente inizializzata.


## CT11 – High Score

**Obiettivo:** verificare che l’high score venga aggiornato correttamente e non venga azzerato al restart.  
**Azioni:**
1. Ottenere un punteggio e verificare aggiornamento dell’high score.
2. Eseguire restart della partita.
3. Verificare che l’high score rimanga invariato.

**Risultato atteso:** high score persistente durante l’esecuzione.




