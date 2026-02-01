
# Progettazione dell’Architettura Software

Il progetto **UNIPACMAN** è stato progettato seguendo un’architettura modulare, con una chiara separazione delle responsabilità tra le diverse componenti del sistema.  
L’obiettivo principale dell’architettura è rendere il codice **leggibile**, **manutenibile** e **facilmente estendibile**, evitando dipendenze inutili tra logica di gioco e interfaccia grafica.

L’architettura adottata è ispirata al pattern **MVC (Model–View–Controller)**, pur senza applicarlo in maniera rigida, adattandolo alle esigenze di un gioco 2D realizzato con Swing.

---

## Struttura dei Package

Il progetto è organizzato all’interno del package principale:

com.università.pacman

Al suo interno, il codice è suddiviso nei seguenti sotto-package: model view e App.java


---

## Package `model`

Il package **model** contiene tutta la **logica di gioco** ed è completamente indipendente dalla grafica.  
Nessuna classe del model utilizza componenti Swing o gestisce direttamente il rendering.

### Responsabilità principali
- gestione della mappa di gioco
- movimento e collisioni delle entità
- punteggio e vite del giocatore
- regole del gioco

### Classi principali

- **Mappa**  
  Rappresenta il livello di gioco tramite una matrice bidimensionale di tile.  
  Gestisce muri, cibo, spazio vuoto e gate della ghost house, oltre alle dimensioni della mappa in pixel.

- **Entità**  
  Classe astratta che rappresenta una generica entità di gioco.  
  Contiene posizione, velocità e logica comune di movimento e collisione.

- **Pacman**  
  Estende `Entità` e rappresenta il giocatore.  
  Aggiunge la gestione di punteggio, vite e input buffer con turn assist per rendere il movimento fluido.

- **Ghost**  
  Estende `Entità` e rappresenta i fantasmi.  
  Implementa un comportamento di movimento autonomo e casuale, con velocità leggermente inferiore a quella di Pacman.

---

## Package `view`

Il package **view** contiene tutta la parte grafica e di interazione con l’utente.  
Le classi di questo package si occupano esclusivamente di:
- visualizzare lo stato del gioco
- ricevere input dall’utente
- aggiornare la schermata

La view **non contiene logica di gioco**, ma si limita a interrogare il model per ottenere lo stato corrente.

### Classi principali

- **GameFrame**  
  Estende `JFrame` ed è la finestra principale dell’applicazione.  
  Utilizza un `CardLayout` per gestire più schermate, come la schermata iniziale e il pannello di gioco.

- **HomePanel**  
  Rappresenta la schermata iniziale del gioco.  
  Mostra il titolo UNIPACMAN e un pulsante START che consente di avviare una nuova partita.

- **GamePanel**  
  È il pannello principale di gioco.  
  Gestisce il game loop tramite un `Timer`, il rendering della mappa e delle entità, l’input da tastiera e l’HUD.

---

## Entry Point – `App.java`

La classe **App** rappresenta il punto di ingresso dell’applicazione.  
Contiene il metodo `main`, che inizializza l’interfaccia grafica utilizzando `SwingUtilities.invokeLater` e crea l’istanza di `GameFrame`.

Questa separazione permette di mantenere il codice di avvio dell’applicazione semplice e isolato dal resto del sistema.

---

## Comunicazione tra Model e View

La comunicazione tra model e view avviene in modo **unidirezionale**:
- la view legge lo stato del model
- la view invoca metodi del model per aggiornare lo stato

Il model non ha alcuna dipendenza dalla view, garantendo così:
- testabilità tramite JUnit
- possibilità di cambiare la grafica senza modificare la logica

---

## Vantaggi dell’Architettura

L’architettura adottata offre diversi vantaggi:
- separazione chiara delle responsabilità
- codice facilmente testabile
- maggiore leggibilità
- semplicità nell’aggiunta di nuove funzionalità

Grazie a questa struttura, il progetto UNIPACMAN può essere facilmente esteso con nuove modalità di gioco, animazioni, suoni o intelligenze artificiali più avanzate per i fantasmi.


