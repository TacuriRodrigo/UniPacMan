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

Questa sezione descrive i requisiti del sistema.

### 3.1 Requisiti Funzionali


### 3.2 Requisiti Non Funzionali


---

## 4. Design

In questa sezione viene descritta la progettazione del sistema.

### 4.1 Architettura del Sistema


### 4.2 Struttura dei Package


### 4.3 Scelte Progettuali Principali


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


