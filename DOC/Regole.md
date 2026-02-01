
# Regole del Gioco

Il gioco **UNIPACMAN** riproduce le principali meccaniche del classico Pac-Man, in una versione semplificata ma funzionale.  
Di seguito sono descritte le regole che governano il comportamento del gioco.

---

## Obiettivo del Gioco

L’obiettivo del giocatore è controllare Pacman all’interno della mappa e:
- raccogliere tutto il cibo presente nel livello
- evitare i fantasmi
- ottenere il punteggio più alto possibile

---

## Movimento di Pacman

- Pacman si muove utilizzando i **tasti freccia** della tastiera.
- Il movimento è continuo e avviene in base alla direzione selezionata.
- Pacman non può attraversare i muri né la porta della ghost house.
- È presente un sistema di assistenza alle curve (turn assist) che rende più semplice entrare nei corridoi.

---

## Fantasmi

- I fantasmi si muovono in modo autonomo.
- All’inizio della partita partono dalla **ghost house**, situata al centro della mappa.
- I fantasmi possono attraversare la porta della ghost house, mentre Pacman no.
- La velocità dei fantasmi è leggermente inferiore a quella di Pacman.

---

## Cibo e Punteggio

- Ogni pallino di cibo raccolto da Pacman aumenta il punteggio.
- Una volta mangiato, il cibo scompare dalla mappa.
- Il punteggio totale viene mostrato a schermo durante la partita.

---

## Vite

- Pacman inizia la partita con un numero limitato di vite.
- Quando Pacman entra in collisione con un fantasma:
  - perde una vita
  - Pacman e i fantasmi vengono riportati alle posizioni iniziali
- Dopo una collisione, Pacman è temporaneamente invincibile per evitare perdite di vita consecutive immediate.

---

## Tunnel Laterale

- Nella riga centrale della mappa è presente un tunnel.
- Se Pacman attraversa il tunnel da un lato, riappare dal lato opposto della mappa.
- Anche i fantasmi possono utilizzare il tunnel.

---

## Fine della Partita (Game Over)

- La partita termina quando Pacman perde tutte le vite.
- In questo caso viene mostrata la schermata di **Game Over**.
- Il gioco può essere riavviato premendo il tasto **R**.

---

## Riavvio della Partita

- Premendo **R** dopo il Game Over:
  - il punteggio viene azzerato
  - le vite vengono ripristinate
  - la mappa viene rigenerata con tutto il cibo
  - Pacman e i fantasmi tornano alle posizioni iniziali
- L’High Score rimane salvato durante l’esecuzione dell’applicazione.

---

## Controlli

| Tasto | Azione |
|------|------|
| ↑ ↓ ← → | Movimento Pacman |
| R | Riavvia la partita (Game Over) |

