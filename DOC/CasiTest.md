# Casi di Test

Questo documento descrive i casi di test implementati per verificare la correttezza della logica del progetto **UNIPACMAN**.  
I test sono stati sviluppati utilizzando **JUnit 5** ed eseguiti tramite **Maven**.

Ogni test verifica una funzionalità specifica del gioco, garantendo l’affidabilità del sistema.



## CT1 – Verifica della correttezza della Mappa  
**Classe di test:** `MappaSanityTest`

**Obiettivo:** verificare che la mappa di gioco sia correttamente inizializzata.  

**Azioni:**
- Creazione di una nuova istanza di `Mappa`.
- Verifica delle dimensioni della mappa.
- Verifica della validità dei tile.

**Risultato atteso:**  
La mappa deve essere coerente, con dimensioni corrette e senza errori strutturali.



## CT2 – Spawn di Pacman in posizione valida  
**Classe di test:** `PacmanSpawnTest`

**Obiettivo:** verificare che Pacman venga generato in una cella attraversabile.  

**Azioni:**
- Creazione della mappa.
- Generazione di Pacman tramite `placePacman()`.
- Conversione delle coordinate `(x, y)` in riga e colonna.
- Verifica che il tile di spawn non sia un muro.

**Risultato atteso:**  
Pacman deve spawnare su una cella libera della mappa.



## CT3 – Collisione di Pacman con i muri  
**Classe di test:** `PacmanWallCollisionTest`

**Obiettivo:** verificare che Pacman non possa attraversare i muri.  

**Azioni:**
- Posizionamento di Pacman vicino ad un muro.
- Impostazione del movimento verso il muro.
- Esecuzione di più tick di movimento.

**Risultato atteso:**  
Pacman deve fermarsi prima del muro senza oltrepassarlo.



## CT4 – Raccolta del cibo  
**Classe di test:** `EatFoodTest`

**Obiettivo:** verificare che il cibo venga correttamente consumato da Pacman.  

**Azioni:**
- Posizionamento di Pacman su una cella contenente cibo.
- Esecuzione del movimento.
- Controllo del valore del tile dopo il passaggio.

**Risultato atteso:**  
Il tile deve passare da `Food` a `Empty`.



## CT5 – Funzionamento del tunnel laterale  
**Classe di test:** `TunnelTest`

**Obiettivo:** verificare il corretto funzionamento del tunnel laterale.  

**Azioni:**
- Posizionamento di Pacman sulla riga del tunnel.
- Movimento verso il bordo sinistro o destro.
- Esecuzione di più tick di movimento.

**Risultato atteso:**  
Pacman deve riapparire dal lato opposto della mappa.



## CT6 – Collisione dei Ghost con i muri  
**Classe di test:** `GhostWallCollisionTest`

**Obiettivo:** verificare che i Ghost riconoscano la collisione con i muri.  

**Azioni:**
- Posizionamento di un Ghost vicino ad un muro.
- Movimento verso il muro.
- Esecuzione della logica di movimento.

**Risultato atteso:**  
Il Ghost non deve attraversare il muro e deve attivare la logica di cambio direzione.



## CT7 – Collisione Pacman–Ghost  
**Classe di test:** `GhostPacmanCollisionTest`

**Obiettivo:** verificare il rilevamento della collisione tra Pacman e un Ghost.  

**Azioni:**
- Posizionamento di Pacman e Ghost a distanza ravvicinata.
- Esecuzione del controllo di collisione.

**Risultato atteso:**  
La collisione deve essere correttamente rilevata.



## CT8 – Determinismo del movimento dei Ghost  
**Classe di test:** `GhostRandomDeterminismTest`

**Obiettivo:** verificare che il comportamento casuale dei Ghost sia deterministico in fase di test.  

**Azioni:**
- Creazione di Ghost con una sorgente di random controllata.
- Esecuzione di più step di movimento.

**Risultato atteso:**  
A parità di seed, il movimento dei Ghost deve essere riproducibile.







