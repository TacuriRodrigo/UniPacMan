# Specifica dei Requisiti

Questo documento descrive i **requisiti funzionali** e **non funzionali** del progetto **UNIPACMAN**.  
I requisiti definiscono in modo chiaro cosa il sistema deve fare e quali vincoli deve rispettare.

---

## Requisiti Funzionali

### RF1 – Avvio del Gioco
Il sistema deve permettere all’utente di avviare il gioco tramite una schermata iniziale contenente un pulsante START.

---

### RF2 – Visualizzazione della Mappa
Il sistema deve visualizzare una mappa di gioco composta da muri, cibo, spazi vuoti e una ghost house centrale.

---

### RF3 – Movimento di Pacman
Il sistema deve permettere il controllo di Pacman tramite i tasti direzionali della tastiera.  
Pacman non deve poter attraversare i muri né la porta della ghost house.

---

### RF4 – Movimento dei Fantasmi
Il sistema deve gestire il movimento autonomo dei fantasmi.  
I fantasmi devono poter uscire dalla ghost house attraverso una porta dedicata.

---

### RF5 – Collisioni
Il sistema deve rilevare le collisioni:
- tra Pacman e i muri
- tra Pacman e i fantasmi
- tra i fantasmi e i muri

---

### RF6 – Gestione del Cibo
Il sistema deve consentire a Pacman di raccogliere il cibo presente sulla mappa.  
Ogni elemento di cibo raccolto deve contribuire al punteggio.

---

### RF7 – Gestione del Punteggio
Il sistema deve mantenere e visualizzare il punteggio corrente del giocatore durante la partita.

---

### RF8 – Gestione delle Vite
Il sistema deve gestire un numero limitato di vite per Pacman.  
In caso di collisione con un fantasma, Pacman deve perdere una vita.

---

### RF9 – Game Over
Il sistema deve terminare la partita quando tutte le vite di Pacman sono esaurite e mostrare una schermata di Game Over.

---

### RF10 – Riavvio della Partita
Il sistema deve permettere il riavvio della partita dopo il Game Over tramite un comando da tastiera.

---

### RF11 – Tunnel Laterale
Il sistema deve implementare un tunnel che consenta alle entità di uscire da un lato della mappa e rientrare dal lato opposto.

---

### RF12 – High Score
Il sistema deve mantenere e visualizzare il punteggio massimo ottenuto durante l’esecuzione del gioco.

---

## Requisiti Non Funzionali

### RNF1 – Linguaggio di Programmazione
Il sistema deve essere sviluppato utilizzando il linguaggio **Java**.

---

### RNF2 – Interfaccia Grafica
Il sistema deve utilizzare la libreria **Swing** per la realizzazione dell’interfaccia grafica.

---

### RNF3 – Architettura Software
Il sistema deve essere organizzato in modo modulare, separando la logica di gioco dall’interfaccia grafica.

---

### RNF4 – Prestazioni
Il sistema deve garantire un aggiornamento fluido del gioco, con un frame rate stabile (circa 60 FPS).

---

### RNF5 – Usabilità
Il sistema deve essere semplice da utilizzare e garantire un controllo fluido del personaggio, riducendo la frustrazione del giocatore.

---

### RNF6 – Manutenibilità
Il codice deve essere leggibile, ben strutturato e facilmente estendibile con nuove funzionalità.

---

### RNF7 – Testabilità
La logica di gioco deve essere testabile tramite test automatici, senza dipendenze dirette dalla grafica.

---

### RNF8 – Portabilità
Il sistema deve poter essere eseguito su qualsiasi sistema dotato di Java Virtual Machine.

---

### RNF9 – Affidabilità
Il sistema deve gestire correttamente situazioni di errore, evitando crash durante l’esecuzione del gioco.

---

### RNF10 – Gestione delle Risorse
Il sistema deve caricare correttamente le risorse grafiche ed evitare sprechi di memoria durante l’esecuzione.

