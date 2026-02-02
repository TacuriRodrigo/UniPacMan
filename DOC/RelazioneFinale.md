# Relazione Finale – Progetto UNIPACMAN

Questo documento rappresenta la relazione finale del progetto **UNIPACMAN**, un videogioco 2D ispirato a Pac-Man e sviluppato in Java.  
La relazione descrive le fasi di pianificazione, progettazione, sviluppo, test e manutenzione del sistema.

---

## 1. Project Plan

### 1.1 Introduzione

Il progetto **UNIPACMAN** consiste nello sviluppo di un videogioco 2D ispirato al classico Pac-Man, realizzato in linguaggio Java utilizzando la libreria Swing per l’interfaccia grafica.  
L’obiettivo principale del progetto è applicare i concetti fondamentali dell’ingegneria del software, come la progettazione modulare, la separazione delle responsabilità, il testing e la documentazione, all’interno di un contesto pratico e concreto.


### 1.2 Modello di Processo

Per lo sviluppo del progetto è stato adottato un **modello di processo ibrido**, ispirato principalmente a **Extreme Programming (XP)** e al concetto di **SWAT team**.

Lo sviluppo non ha seguito un piano rigido e sequenziale, ma è stato caratterizzato da un approccio **flessibile e incrementale**, in cui le funzionalità venivano sviluppate, testate e migliorate progressivamente.  
Nei momenti più critici o complessi del progetto è stato richiesto il supporto di un membro esterno all’università, che ha svolto un ruolo di consulenza tecnica, tipico dei team SWAT.

Questo approccio ha permesso di:
- adattarsi rapidamente ai problemi emersi durante lo sviluppo
- migliorare progressivamente la qualità del codice
- evitare una progettazione eccessivamente rigida nelle fasi iniziali

#### Prioritizzazione dei Requisiti – Metodo MoSCoW

| Categoria | Descrizione |
|--------|------------|
| **Must Have** | Movimento di Pacman, mappa funzionante, collisioni, fantasmi, punteggio, vite |
| **Should Have** | High Score, schermata iniziale, Game Over e restart |
| **Could Have** | Animazioni avanzate, AI più complessa per i fantasmi |
| **Won’t Have** | Modalità multiplayer, suoni avanzati |


### 1.4 Standard, Linee Guida e Procedure

Durante lo sviluppo del progetto sono stati utilizzati i seguenti strumenti e tecnologie:
- **Linguaggio di programmazione:** Java
- **Libreria grafica:** Swing
- **IDE:** Eclipse
- **Versionamento:** Git
- **Repository remoto:** GitHub
- **Gestione locale Git:** GitHub Desktop

Sono state seguite buone pratiche di programmazione orientata agli oggetti, mantenendo il codice leggibile, modulare e documentato.


### 1.5 Attività di Gestione del Progetto

Il progetto è stato sviluppato principalmente **individualmente**.  
Nei momenti di maggiore complessità tecnica o progettuale, è stato richiesto il supporto di un collaboratore esterno all’università, con il ruolo di supporto tecnico.

Le attività principali hanno incluso:
- definizione dei requisiti
- progettazione dell’architettura
- sviluppo incrementale
- verifica tramite test
- documentazione finale


### 1.6 Analisi dei Rischi

Durante lo sviluppo del progetto sono stati individuati alcuni potenziali rischi, in particolare:
- **hardcoding eccessivo**
- **tight coupling** tra le componenti

Per mitigare tali rischi, è stata adottata una progettazione modulare con separazione tra model e view, riducendo le dipendenze dirette e facilitando la manutenzione del codice.


### 1.7 Membri del Progetto

Il progetto è stato realizzato da:
- **1 studente** (autore principale del progetto)
- **1 collaboratore esterno all’università**, con ruolo di supporto e consulenza tecnica


### 1.8 Metodi e Tecniche Utilizzate

È stata adottata una metodologia ispirata a **Extreme Programming (XP)**, caratterizzata da sviluppo iterativo, test frequenti e miglioramento continuo del codice.

Durante il progetto sono stati utilizzati diversi strumenti di progettazione UML, tra cui:
- diagrammi delle classi
- diagrammi dei casi d’uso
- diagrammi di stato
- diagrammi di sequenza
- diagrammi delle attività

Sono stati inoltre applicati principi di design pattern e tecniche di testing automatico.


### 1.9 Garanzie di Qualità

Il progetto mira a garantire:
- **Funzionalità:** corretta implementazione delle meccaniche di gioco
- **Affidabilità:** comportamento stabile e privo di crash
- **Usabilità:** controlli semplici e movimento fluido
- **Manutenibilità:** codice modulare e facilmente estendibile


### 1.10 Fasi di Sviluppo

Le principali fasi del progetto sono state:
1. Raccolta e prioritizzazione dei requisiti (MoSCoW)
2. Progettazione tramite diagrammi UML
3. Configurazione dell’ambiente di sviluppo (Eclipse e GitHub)
4. Sviluppo della logica di gioco (model)
5. Sviluppo dell’interfaccia grafica (view)
6. Integrazione e testing
7. Redazione della documentazione finale


### 1.11 Risorse Utilizzate

Le risorse principali utilizzate sono state:
- GitHub
- Eclipse
- Papyrus (per UML)
- Un computer personale


### 1.12 Budget e Pianificazione

Il progetto non ha previsto alcun budget economico, in quanto è stato realizzato utilizzando esclusivamente strumenti gratuiti e risorse personali.


### 1.13 Consegna

La consegna del progetto è prevista per l’appello di **gennaio** dell’esame di **Ingegneria del Software**.



---

## 2. Gestione del Progetto

### 2.1 Processo Seguito

Durante lo sviluppo del progetto **UNIPACMAN** è stato seguito un processo di sviluppo flessibile, ispirato ai principi di **Extreme Programming (XP)** e supportato dalla prioritizzazione dei requisiti tramite il metodo **MoSCoW**.

Il codice è stato sviluppato interamente dall’autore del progetto, mentre un collaboratore esterno all’università ha fornito supporto e revisione del codice nei momenti più complessi.  
Questo collaboratore ha svolto un ruolo simile a quello di un **membro SWAT**, fornendo feedback mirati sulla logica di gioco, sulle scelte progettuali e sulla qualità del codice.

L’approccio adottato ha previsto:
- sviluppo incrementale delle funzionalità
- frequenti revisioni del codice
- correzioni e miglioramenti continui sulla base del feedback ricevuto

---

### 2.2 Organizzazione del Progetto

Il progetto non ha seguito un piano di lavoro rigido e predefinito.  
Dopo una prima definizione dei requisiti principali, lo sviluppo è avvenuto in modo progressivo, compatibilmente con il tempo a disposizione dell’autore, tenendo conto degli impegni lavorativi.

Il collaboratore esterno ha effettuato revisioni del codice quando possibile, fornendo suggerimenti e indicazioni utili per migliorare la struttura e la logica del programma.

Questo approccio ha consentito di adattare lo sviluppo alle reali disponibilità temporali, mantenendo comunque una buona qualità complessiva del progetto.

---

### 2.3 Differenze rispetto al Project Plan Iniziale

Rispetto al Project Plan iniziale, lo sviluppo del progetto ha subito alcune variazioni.  
In particolare, non è stato possibile seguire rigidamente la pianificazione prefissata a causa di:
- impegni lavorativi
- difficoltà tecniche emerse durante lo sviluppo
- necessità di rivedere alcune scelte progettuali

In questi momenti, il supporto del collaboratore esterno è risultato fondamentale per superare le criticità e individuare soluzioni adeguate, consentendo comunque il completamento del progetto entro i tempi previsti.

---

### 2.4 Configuration Management

La gestione della configurazione del progetto è stata effettuata utilizzando:
- **Eclipse** come ambiente di sviluppo
- **Maven** per la gestione delle dipendenze e del ciclo di build
- **Git** per il versionamento del codice
- **GitHub** come repository remoto
- **GitHub Desktop** per la sincronizzazione locale

Il repository GitHub ha permesso di tenere traccia delle modifiche al codice, facilitando il controllo delle versioni e la gestione delle evoluzioni del progetto.  
Maven ha garantito una configurazione stabile e riproducibile dell’ambiente di sviluppo.

---

### 2.5 People Management and Team Organization

Il progetto è stato sviluppato principalmente in modalità **individuale**.  
L’autore ha curato tutte le fasi di sviluppo, partendo dalla progettazione della logica di gioco fino alla realizzazione dell’interfaccia grafica.

Il collaboratore esterno ha svolto un ruolo di supporto tecnico, fornendo feedback sul codice e suggerimenti sulle soluzioni adottate, in linea con una modalità di lavoro simile al **pair programming asincrono**, tipico di Extreme Programming.

Questa collaborazione ha contribuito a migliorare la qualità del codice e a ridurre errori logici durante lo sviluppo.



---

## 3. Requisiti

### 3.1 Requirements Engineering

La fase di requirements engineering è stata affrontata in modo incrementale e flessibile.  
In una prima fase sono stati individuati i requisiti fondamentali del sistema, successivamente raffinati e prioritizzati durante lo sviluppo.

Per la prioritizzazione dei requisiti è stato adottato il metodo **MoSCoW**, che ha permesso di distinguere le funzionalità essenziali da quelle opzionali, concentrando lo sviluppo sugli aspetti più critici del gioco.

| Categoria | Requisiti | Stato di Implementazione |
|---------|-----------|--------------------------|
| **Must Have** | Movimento di Pacman, mappa funzionante, muri, cibo, collisioni, fantasmi, punteggio, vite | Implementati |
| **Should Have** | High Score, schermata iniziale, Game Over, restart della partita | Implementati |
| **Could Have** | Animazioni avanzate, AI più complessa per i fantasmi | Parzialmente / Non implementati |
| **Won’t Have** | Multiplayer, suoni avanzati | Non implementati |

Questa classificazione ha guidato le decisioni durante lo sviluppo, consentendo di completare prima le funzionalità indispensabili.

---

### 3.2 Requisiti Funzionali e Non Funzionali

I requisiti del sistema sono stati suddivisi in **requisiti funzionali** e **requisiti non funzionali**.

I requisiti funzionali descrivono cosa il sistema deve fare, tra cui:
- controllo del movimento di Pacman
- gestione della mappa e delle collisioni
- movimento autonomo dei fantasmi
- gestione del punteggio, delle vite e dell’High Score
- gestione del Game Over e del riavvio della partita

I requisiti non funzionali definiscono invece i vincoli qualitativi del sistema, tra cui:
- utilizzo del linguaggio Java e della libreria Swing
- architettura modulare e separazione tra logica e grafica
- fluidità del gioco e stabilità dell’esecuzione
- manutenibilità ed estendibilità del codice

Il dettaglio completo dei requisiti funzionali e non funzionali è descritto nel documento **SpecificaRequisiti.md**.

---

### 3.3 Operational Quality

La qualità operativa del sistema è stata valutata facendo riferimento al **modello di qualità di McCall**, che individua diversi fattori rilevanti per il software.

In particolare, il progetto UNIPACMAN garantisce:

- **Correttezza e Affidabilità**  
  Il sistema implementa correttamente le regole di gioco e mantiene un comportamento stabile durante l’esecuzione, evitando crash o stati inconsistenti.

- **Usabilità**  
  L’interfaccia è semplice e intuitiva. I controlli sono immediati e il movimento di Pacman è reso più fluido grazie al sistema di assistenza alle curve, riducendo la frustrazione dell’utente.

- **Efficienza**  
  Il gioco utilizza un game loop basato su `Timer` con aggiornamenti regolari, garantendo un frame rate stabile e un utilizzo contenuto delle risorse.

- **Manutenibilità**  
  La separazione tra model e view e l’organizzazione modulare del codice facilitano la comprensione e la modifica del sistema.

- **Testabilità**  
  La logica di gioco è indipendente dalla grafica, permettendo l’uso di test automatici tramite JUnit per verificare le funzionalità principali.

Nel complesso, il progetto soddisfa i principali criteri di qualità operativa richiesti per un software di questo tipo.



---

## 4. Design

## **Modelling**

### 4.1 Use Case Diagramm


<img width="1345" height="420" alt="UseCaseClass" src="https://github.com/user-attachments/assets/d706ca9c-c84a-42e0-a2af-262af23f21ef" />

### 4.2 Class Diagramm

<img width="1916" height="808" alt="ClassDiagram" src="https://github.com/user-attachments/assets/14e22b92-fa09-4c4a-b1ba-08f584c3a70c" />

### 4.3 Diagramma delle attività

<img width="207" height="872" alt="DiagrammaAttività" src="https://github.com/user-attachments/assets/c870496b-5105-4404-860f-5b903e0e1ff9" />

### 4.4 Sequence Diagramm

<img width="635" height="866" alt="DiagrammaSequenza" src="https://github.com/user-attachments/assets/cb30ec30-20ba-4fbd-a917-f00137394b64" />


### 4.3 Macchina a stati

<img width="526" height="865" alt="MacchinaStati" src="https://github.com/user-attachments/assets/4232428e-126b-4ec5-8ef8-03f8c1a391ed" />

### 4.4 Architectural Views

L’architettura del progetto UNIPACMAN è stata descritta adottando un approccio ispirato al **modello 4+1 di Kruchten**, che permette di analizzare il sistema da più punti di vista complementari.

In particolare, il sistema è stato progettato come un’applicazione **monolitica a livelli**, con una chiara separazione tra:
- **logica di dominio (model)**
- **interfaccia grafica (view)**

Questa separazione consente di isolare le responsabilità principali del sistema, migliorando manutenibilità, testabilità ed estendibilità.

Le viste architetturali adottate sono:
- Logical View
- Development View
- Process View
- Physical View

Le sezioni seguenti descrivono ciascuna vista in relazione al progetto.

---

### 4.5 Logical View

La **Logical View** descrive la struttura funzionale del sistema e le relazioni tra i principali componenti software.

Nel progetto UNIPACMAN la Logical View è organizzata secondo un’architettura **Model–View**, in cui:

- Il **Model** contiene la logica del gioco ed è indipendente dalla grafica.
- La **View** si occupa della rappresentazione grafica e dell’interazione con l’utente.

#### Model
Il package `model` include le classi:
- `Entità`: superclasse che incapsula movimento e collisioni
- `Pacman` e `Ghost`: specializzazioni di Entità
- `Mappa`: rappresentazione tile-based del livello

Il model implementa tutte le regole del gioco ed è completamente testabile tramite JUnit, senza dipendenze dalla UI.

#### View
Il package `view` include:
- `GamePanel`: rendering, input, game loop e gestione degli stati
- `GameFrame`: finestra principale
- `HomePanel`: schermata iniziale

#### Design Pattern Utilizzati
- **Template Method**: `Entità.move()` definisce la struttura del movimento, specializzata da Pacman e Ghost.
- **Strategy (semplificata)**: comportamento di movimento differenziato tra Pacman e Ghost.
- **Separation of Concerns**: netta separazione tra logica e presentazione.

Questa organizzazione rende il sistema modulare e facilmente estendibile.

---

### 4.6 Development View

La **Development View** descrive l’organizzazione del codice e dell’ambiente di sviluppo.

Il progetto è strutturato come progetto **Maven**, con la seguente suddivisione:

<img width="355" height="240" alt="image" src="https://github.com/user-attachments/assets/e5b7bf78-5f04-4bd3-b302-95011f897cab" />


Questa struttura consente:
- separazione tra codice di produzione e test
- caricamento automatico delle risorse
- build riproducibili tramite Maven

Lo sviluppo è stato effettuato con **Eclipse**, mentre **Git/GitHub** sono stati utilizzati per il versionamento e la gestione delle modifiche.

---

### 4.7 Process View

La **Process View** descrive il comportamento dinamico del sistema durante l’esecuzione.

UNIPACMAN è un’applicazione **single-threaded** dal punto di vista logico, basata sull’**Event Dispatch Thread (EDT)** di Swing.

Il ciclo di esecuzione principale è gestito da:
- un **javax.swing.Timer** che funge da game loop (~60 FPS)

Ad ogni tick del Timer:
1. viene aggiornata la logica (Pacman e Ghost)
2. vengono gestite le collisioni
3. viene aggiornato lo stato del gioco (vite, punteggio, game over)
4. viene richiesto il ridisegno della scena (`repaint()`)

L’assenza di thread aggiuntivi semplifica il design e riduce il rischio di race condition, mantenendo il comportamento deterministico.

---

### 4.8 Physical View

La **Physical View** descrive la distribuzione fisica del sistema.

Il progetto UNIPACMAN è distribuito come:
- applicazione Java desktop
- eseguibile su qualsiasi sistema dotato di **Java Virtual Machine**

Non sono richieste dipendenze esterne né componenti server-side.  
Le risorse grafiche sono incluse nel classpath dell’applicazione.

Questa configurazione rende il sistema:
- facilmente distribuibile
- indipendente dalla piattaforma
- semplice da eseguire in ambiente universitario





---

## 5. Testing

In questa sezione viene descritta la strategia di testing adottata.

### 5.1 Strategia di Test


### 5.2 Casi di Test Implementati


### 5.3 Risultati dei Test


---

## 6. Maintenance

In questa sezione vengono descritti gli aspetti legati alla manutenzione del software.

### 6.1 Manutenibilità del Codice


### 6.2 Estendibilità del Sistema


### 6.3 Limitazioni Attuali


---

## Conclusioni


