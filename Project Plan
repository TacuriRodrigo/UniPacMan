# Piano di Progetto & Specifiche dei Requisiti Software (SRS) - Gioco Pac-Man

## Versione Documento: 1.0

## Autore: Tacuri Rodrigo 

## Matricola:1073963

---

## 1. Piano di Progetto

### 1.1 Introduzione

**1.1.1 Contesto**
Questo documento delinea il piano completo per lo sviluppo di un gioco Pac-Man, un progetto richiesto nell'ambito del corso universitario di Ingegneria del Software. Il progetto mira a dimostrare le competenze acquisite nella gestione del ciclo di vita del software, dall'analisi dei requisiti all'implementazione e test, con particolare attenzione alla documentazione approfondita.

**1.1.2 Obiettivi**
* **Obiettivo Primario:** Sviluppare una versione pienamente funzionante del classico gioco Pac-Man utilizzando Java Swing per l'interfaccia grafica utente.
* **Obiettivi Secondari:**
    * Acquisire esperienza pratica con i principi dello sviluppo software Agile/Scrum, adattati per un singolo sviluppatore.
    * Utilizzare efficacemente gli strumenti di controllo versione (Git/GitHub).
    * Produrre documentazione tecnica di alta qualità, inclusa una Specifica dei Requisiti Software (SRS) conforme allo standard IEEE 830.
    * Integrare strumenti di analisi della qualità del codice (SonarQube) per garantire un codice robusto e manutenibile.
    * Gestire autonomamente tutte le fasi del ciclo di vita del software.

**1.1.3 Risultati (Deliverables)**
* Gioco Pac-Man funzionante (applicazione Java Swing eseguibile).
* Codice sorgente organizzato e documentato, ospitato su GitHub.
* Documentazione completa del progetto (Piano di Progetto, SRS IEEE 830, report SonarQube, diagrammi UML tramite Papyrus).

**1.1.4 Team di Progetto e Sintesi**
* **Sviluppatore Unico:** [Il tuo Nome e Cognome]
* **Sintesi:** Questo progetto si concentra sullo sviluppo di un clone del classico gioco Pac-Man utilizzando Java Swing, con una forte enfasi sulla documentazione e sull'applicazione delle migliori pratiche di ingegneria del software, adattate per un progetto accademico individuale.

### 1.2 Modello di Processo: Agile Adattato per Sviluppo Individuale

Dato il carattere individuale del progetto e il requisito di una documentazione completa, un approccio Agile con elementi centrali di Scrum offre flessibilità per lo sviluppo iterativo, pur garantendo milestone e risultati chiari.

**1.2.1 Attività e Milestone (Iterazioni Sprint)**
Il progetto sarà strutturato in Sprint (iterazioni) di durata variabile (es. 1 settimana o 10 giorni lavorativi), ciascuno con obiettivi specifici e risultati tangibili.

* **Sprint 0: Setup e Pianificazione (Durata: 2-3 giorni)**
    * **Attività:**
        * Configurazione dell'ambiente di sviluppo (Eclipse, GitHub Desktop, SonarQube).
        * Creazione del repository GitHub.com.
        * Configurazione del progetto Maven in Eclipse.
    * **Milestone:** Ambiente di sviluppo configurato, repository Git sincronizzato.

* **Sprint 1: Requisiti e Architettura Iniziale (Durata: 5-7 giorni)**
    * **Attività:**
        * Redazione completa delle Specifiche dei Requisiti Software (SRS) conforme a IEEE 830.
        * Definizione dell'architettura generale del sistema (Diagramma delle Classi iniziale usando Papyrus).
        * Creazione delle Issues iniziali su GitHub.com per le funzionalità fondamentali.
    * **Milestone:** SRS completa (approvazione simulata), Diagramma delle Classi iniziale, Issues di GitHub popolate.

* **Sprint 2: Gameplay Core - Movimento e Rendering Labirinto (Durata: 7-10 giorni)**
    * **Attività:**
        * Implementazione della finestra di gioco (JFrame).
        * Implementazione del pannello di disegno (JPanel).
        * Implementazione della classe `Pacman` (posizione, disegno).
        * Gestione dell'input da tastiera per il movimento di Pac-Man.
        * Implementazione della classe `Maze` e rendering del labirinto.
        * Test unitari e di integrazione.
        * Analisi del codice con SonarQube.
    * **Milestone:** Pac-Man si muove correttamente all'interno di un labirinto visualizzato.

* **Sprint 3: Interazione e Logica di Base (Durata: 7-10 giorni)**
    * **Attività:**
        * Implementazione dei Pellet e gestione della raccolta (punteggio).
        * Gestione delle collisioni: Pac-Man vs. Muri (utilizzando `Maze`).
        * Implementazione della classe `Ghost` di base (disegno, movimento semplice).
        * Integrazione del ciclo di gioco (`GameLoop`).
        * Test unitari e di integrazione.
        * Analisi del codice con SonarQube.
    * **Milestone:** Pac-Man può navigare, raccogliere pellet e interagire (base) con i fantasmi.

* **Sprint 4: IA Fantasmi e Stato del Gioco (Durata: 7-10 giorni)**
    * **Attività:**
        * Implementazione di un'IA più complessa per i fantasmi (es. comportamento di inseguimento base).
        * Gestione dei power-up e della modalità "spaventato" dei fantasmi.
        * Logica di fine gioco (condizioni di vittoria/sconfitta, vite).
        * Schermate di inizio/fine gioco.
        * Test di sistema completi.
        * Analisi finale del codice con SonarQube.
    * **Milestone:** Gioco completamente giocabile con condizioni di vittoria/sconfitta.

* **Sprint 5: Rifinitura e Documentazione Finale (Durata: 5-7 giorni)**
    * **Attività:**
        * Integrazione di suoni e musica.
        * Miglioramenti all'interfaccia utente (UI/UX).
        * Ottimizzazione delle prestazioni (se richiesta).
        * Revisione e completamento di tutta la documentazione di progetto (Piano di Progetto, SRS, diagrammi UML, report SonarQube).
        * Preparazione per la consegna finale.
    * **Milestone:** Gioco rifinito, documentazione completa, pronto per la consegna.

**1.2.2 Percorsi Critici**
* Redazione tempestiva e comprensione approfondita dell'SRS.
* Implementazione robusta del rilevamento delle collisioni e delle meccaniche di movimento.
* Sviluppo dell'IA dei fantasmi, che può introdurre una complessità significativa.
* Gestione efficace del tempo per la documentazione, integrandola in ogni fase di sviluppo.

### 1.3 Organizzazione del Progetto

**1.3.1 Informazioni, Servizi e Strutture**
* **Fornite dagli Utenti (Docente/Università):** Requisiti del progetto (funzionalità del gioco Pac-Man, standard di documentazione, utilizzo di software specifici).
* **Fornite agli Utenti (Docente/Esaminatori):** Applicazione eseguibile, codice sorgente su GitHub, documentazione completa del progetto, report di SonarQube.

**1.3.2 Ruoli e Responsabilità**
* **Product Owner / Scrum Master / Sviluppatore / QA / Documentatore:** [Il tuo Nome e Cognome]
    * Responsabile della prioritizzazione delle funzionalità (tramite GitHub Issues).
    * Responsabile della pianificazione degli Sprint e del monitoraggio del progresso.
    * Responsabile di tutte le attività di progettazione, implementazione e test.
    * Responsabile dell'assicurazione della qualità del codice e della completezza della documentazione.
    * Unica risorsa umana assegnata al progetto.

### 1.4 Standard e Linee Guida

* **Standard di Sviluppo:**
    * **Java Coding Conventions:** Aderenza alle linee guida standard di codifica Java.
    * **Maven Standard Directory Layout:** Mantenere la struttura di directory standard di Maven.
    * **Principi OOP:** Applicazione consistente dei principi della Programmazione Orientata agli Oggetti (incapsulamento, ereditarietà, polimorfismo, astrazione).
* **Standard di Documentazione:**
    * **SRS:** Conformità allo standard IEEE 830.
    * **Diagrammi UML:** Utilizzo di diagrammi UML standard (Diagramma delle Classi, Diagramma di Sequenza, Diagramma dei Casi d'Uso) prodotti con Papyrus.
    * **Documentazione del Codice:** Commenti Javadoc completi per tutte le classi, i metodi e i campi pubblici.
* **Controllo Versione:** Git con un flusso di lavoro di branch per funzionalità (un branch per Issue, unione nel branch `main` tramite Pull Request).
* **Qualità del Codice:** Puntare a un basso numero di "code smells" e bug critici, come misurato da SonarQube (obiettivo: rating 'A' su SonarQube per le metriche principali).
* **Consegna della Documentazione:** Tutta la documentazione sarà consegnata in formato digitale (PDF per report/piani, file `.md` per README, file `.uml` per Papyrus, ecc.) al momento dell'esame di luglio.

### 1.5 Attività di Gestione

* **Report Periodici sullo Stato e Avanzamento:**
    * **Daily Stand-up (Auto-valutazione):** Breve revisione quotidiana degli obiettivi raggiunti, dei compiti attuali e degli impedimenti identificati. Ciò favorisce la concentrazione.
    * **Sprint Review (Auto-valutazione):** Al termine di ogni Sprint, valutazione dei risultati raggiunti rispetto agli obiettivi dello Sprint.
    * **Report SonarQube:** Generazione di report periodici (alla fine di ogni Sprint di implementazione) per monitorare le metriche di qualità del codice.
* **Bilanciamento Requisiti-Costi-Tempistiche:** Essendo un progetto accademico individuale, i "costi" e il "denaro" si riferiscono principalmente al tempo dello sviluppatore. Gli sforzi di bilanciamento si concentreranno sulla gestione del tempo per garantire che i requisiti principali siano soddisfatti entro la scadenza, ridimensionando potenzialmente le funzionalità "nice-to-have" se il tempo dovesse scarseggiare.

### 1.6 Rischi

| Categoria Rischio | Descrizione Rischio | Probabilità (Bassa/Media/Alta) | Impatto (Basso/Medio/Alto) | Strategia di Mitigazione |
| :---------------- | :---------------------------------- | :----------------------------- | :-------------------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Tecnico** | Complessità dell'implementazione dell'IA dei fantasmi. | Media                         | Alto                        | Iterazioni incrementali, ricerca di algoritmi noti, prototipazione rapida.                                                                                                                                                             |
| **Tecnico** | Colli di bottiglia nelle prestazioni dell'UI Swing. | Bassa                         | Medio                       | Ottimizzazione solo se necessario, uso di profiler Java.                                                                                                                                                                             |
| **Tecnico** | Blocco su bug difficili da risolvere. | Media                         | Alto                        | Pause regolari, debug sistematico, ricerca online, refactoring precoce.                                                                                                                                                              |
| **Tempistiche** | Gestione del tempo che porta a ritardi. | Media                         | Alto                        | Pianificazione dettagliata degli Sprint, monitoraggio giornaliero dei progressi, riduzione delle funzionalità non essenziali se necessario.                                                                                             |
| **Ambiente** | Problemi con l'ambiente di sviluppo (Eclipse, Git). | Bassa                         | Medio                       | Attenta configurazione iniziale, backup regolari del repository locale, utilizzo di versioni stabili del software.                                                                                                                     |
| **Documentazione** | Documentazione insufficiente o di bassa qualità. | Media                         | Alto                        | Integrazione della documentazione in ogni Sprint, utilizzo dei template specificati (IEEE 830), implementazione di commenti Javadoc.                                                                                                   |
| **Strumenti** | Problemi con strumenti specifici (SonarQube, Papyrus). | Bassa                         | Medio                       | Seguire tutorial ufficiali, consultare la documentazione, cercare soluzioni online per problemi noti.                                                                                                                                |

### 1.7 Personale

* **Nome:** [Il tuo Nome e Cognome]
* **Data Inizio Rapporto:** [Data di Inizio del Progetto]
* **Data Fine Rapporto:** [Data dell'Esame di Luglio]
* **Competenza e Categorie:** Studente universitario con competenza nella programmazione Java, concetti OOP, fondamenti di Git, familiarità con Eclipse e principi di ingegneria del software. Assumerà tutti i ruoli, inclusi analisi, progettazione, implementazione, test, gestione e documentazione.

### 1.8 Metodi e Tecniche

* **Requisiti:**
    * **Brainstorming:** Per l'identificazione iniziale delle funzionalità.
    * **Analisi Funzionale/Non Funzionale:** Classificazione dei requisiti (dettagliata nell'SRS).
    * **Casi d'Uso:** Descrizione degli scenari di gioco principali (Il giocatore muove Pac-Man, Pac-Man mangia pellet, ecc.).
    * **Standard:** Aderenza a IEEE 830 per la redazione dell'SRS.
* **Progettazione:**
    * **Diagrammi UML:** Diagrammi delle Classi per la struttura del codice, Diagrammi di Sequenza per interazioni complesse (es. ciclo di gioco, collisioni). Utilizza **Papyrus** per la modellazione.
    * **Design Patterns:** Applicazione di design patterns appropriati (es. Singleton per GameLoop, Strategy per l'IA dei fantasmi).
* **Implementazione:**
    * **Linguaggio:** Java.
    * **Framework UI:** Java Swing.
    * **Ambiente di Sviluppo:** Eclipse IDE.
    * **Gestione delle Dipendenze:** Apache Maven.
* **Controllo di Gestione:**
    * **GitHub Issues:** Monitoraggio delle attività e del loro stato.
    * **GitHub Pull Requests:** Gestione dell'integrazione delle funzionalità nel branch `main`.
    * **Git Commit History:** Tracciamento dettagliato delle modifiche al codice.
* **Documentazione Tecnica:**
    * **Javadoc:** Per la documentazione in-code.
    * **Markdown:** Per `README.md` e altre note testuali.
    * **PDF:** Per report formali (SRS, Piano di Progetto) e report SonarQube.
* **Apparecchiature:**
    * Computer personale (Windows/macOS/Linux).
    * Connessione Internet.
* **Ordine e Procedure di Test:**
    * **Test Unitari:** Framework JUnit per testare singole classi o metodi.
    * **Test di Integrazione:** Verifica del funzionamento combinato di più componenti.
    * **Test di Sistema:** Test dell'applicazione completa per assicurare la conformità ai requisiti.
    * **Test Manuale:** Ripetizione del gioco per identificare bug non rilevati dai test automatici.

### 1.9 Garanzia Qualità

* **Revisione del Codice (Auto-revisione):** Data la configurazione con un singolo sviluppatore, saranno condotte auto-revisioni approfondite del proprio codice prima di ogni commit significativo e ogni Pull Request.
* **Test (come da Sezione 1.8.6):** Implementazione di test unitari e test di sistema.
* **Analisi Statica del Codice:** Utilizzo di **SonarQube** per identificare bug, code smells, vulnerabilità e duplicazioni di codice. Saranno generati report regolari.
* **Conformità agli Standard:** Rigorosa aderenza agli standard di codifica Java e ai principi di progettazione.
* **Accuratezza della Documentazione:** La qualità di tutta la documentazione (SRS, UML, Javadoc) è parte integrante dell'assicurazione della qualità del progetto.

### 1.10 Pacchetti di Lavoro (Work Packages)

I pacchetti di lavoro corrispondono in gran parte agli obiettivi degli Sprint, ulteriormente suddivisi in Issues di GitHub.

* **WP1: Setup & Pianificazione (Sprint 0-1)**
    * WP1.1: Configurazione Ambiente
    * WP1.2: Redazione SRS (Issue #S.1)
    * WP1.3: Progettazione Architettura Iniziale (Issue #P.1)
* **WP2: Gameplay Core I (Sprint 2)**
    * WP2.1: Implementazione Finestra/Pannello Gioco (Issue #G.1)
    * WP2.2: Implementazione Entità Pac-Man (Issue #G.2)
    * WP2.3: Gestione Input Tastiera (Issue #G.3)
    * WP2.4: Rendering Labirinto (Issue #G.4)
* **WP3: Interazione & Logica (Sprint 3)**
    * WP3.1: Implementazione Pellet/Punteggio (Issue #G.5)
    * WP3.2: Gestione Collisioni Muri (Issue #G.6)
    * WP3.3: Classe Fantasma Base (Issue #G.7)
    * WP3.4: GameLoop (Issue #G.8)
* **WP4: IA & Stato Gioco (Sprint 4)**
    * WP4.1: IA Fantasmi Avanzata (Issue #G.9)
    * WP4.2: Power-up & Modalità Spaventato (Issue #G.10)
    * WP4.3: Logica Vite/Fine Gioco (Issue #G.11)
    * WP4.4: Schermate Inizio/Fine (Issue #G.12)
* **WP5: Rifinitura & Documentazione Finale (Sprint 5)**
    * WP5.1: Integrazione Suoni/Musica (Issue #FX.1)
    * WP5.2: Ottimizzazione/Miglioramenti UI (Issue #Opt.1)
    * WP5.3: Revisione Finale Documentazione (Issue #D.1)
    * WP5.4: Preparazione Consegna (Issue #C.1)

### 1.11 Risorse

* **Hardware:** Computer personale (processore moderno, 8GB+ RAM, SSD consigliato).
* **Software (Cicli CPU & Strumenti):**
    * **Eclipse IDE:** Ambiente di sviluppo principale (codifica, debug, test). Utilizzato in tutte le fasi applicabili.
    * **Java Development Kit (JDK):** Per la compilazione e l'esecuzione del codice Java. Utilizzato in tutte le fasi applicabili.
    * **Apache Maven:** Strumento di build automation e gestione delle dipendenze. Utilizzato in tutte le fasi applicabili (configurazione, compilazione, testing).
    * **Git:** Sistema di controllo versione distribuito. Utilizzato in tutte le fasi per tracciare le modifiche.
    * **GitHub Desktop:** Interfaccia grafica per Git. Utilizzato in tutte le fasi per commit, push, pull.
    * **GitHub.com:** Piattaforma di hosting del repository e gestione di Issues/Pull Request. Utilizzato in tutte le fasi per tracciamento, revisione, hosting.
    * **SonarQube (Server & Scanner):** Per l'analisi statica della qualità e della sicurezza del codice. Utilizzato durante le fasi di implementazione e test per migliorare la qualità del codice.
    * **Papyrus (plugin Eclipse):** Per la modellazione UML e la creazione di diagrammi (Diagramma delle Classi, Diagramma di Sequenza, Diagramma dei Casi d'Uso). Utilizzato durante le fasi di analisi, progettazione e documentazione.
    * **JUnit:** Framework di test unitari Java. Utilizzato durante le fasi di implementazione e test.
* **Allocazione delle Risorse:** Tutte le risorse software saranno utilizzate esclusivamente dal singolo sviluppatore in tutte le fasi del progetto in cui sono applicabili.

### 1.12 Budget

Trattandosi di un progetto accademico individuale, non è previsto un budget monetario esplicito. Il "budget" principale è il **tempo dello sviluppatore** e le risorse hardware/software esistenti.

* **Stima:** Basandosi sulla suddivisione in Sprint (circa 7-10 giorni per Sprint di implementazione, più tempo per pianificazione e documentazione finale), l'impegno totale stimato è di circa 6-8 settimane lavorative effettive (o distribuite fino alla data dell'esame).
* **Allocazione delle Risorse:** Il tempo sarà allocato secondo la pianificazione degli Sprint, con flessibilità per riallocazioni in caso di rischi o requisiti emergenti. La priorità sarà sempre data ai requisiti principali per garantire un gioco funzionante.
* **Pianificazione delle Attività:** La pianificazione dettagliata sarà gestita tramite le Issues di GitHub e l'auto-monitoraggio quotidiano.

### 1.13 Cambiamenti

* **Procedure:** Qualsiasi cambiamento ai requisiti del progetto o al piano dovrà essere discusso e concordato con il docente. Ogni cambiamento significativo verrà registrato come una nuova Issue o un aggiornamento di un'Issue esistente su GitHub.com.
* **Agile vs. Tradizionale (Impatto):**
    * **Agile (Scrum Adattato):** Per sua natura, l'approccio Agile è flessibile ai cambiamenti. I requisiti emergenti possono essere aggiunti al backlog e pianificati per Sprint futuri. L'impatto di un cambiamento è mitigato da iterazioni brevi e feedback continuo. La documentazione, pur dovendo essere dettagliata per questo progetto, mantiene una filosofia "quanto basta, al momento giusto" durante lo sviluppo.
    * **Tradizionale (Cascata/Waterfall):** Un approccio Waterfall avrebbe richiesto una fase di requisiti e progettazione rigorosa e completa all'inizio. I cambiamenti sarebbero stati gestiti tramite procedure formali di "Richiesta di Modifica" con impatti potenzialmente elevati su costi e tempi, data la loro rigidità intrinseca.
* **Stima dell'Impatto:** Ogni richiesta di cambiamento verrà valutata in termini di impatto su scope, tempistiche e complessità, e l'eventuale piano rivisto verrà comunicato al docente se necessario.

### 1.14 Consegna

* **Procedure di Consegna:**
    * **Data di Consegna:** Per l'esame di luglio.
    * **Metodo:** Il progetto verrà consegnato in formato digitale.
    * **Componenti:**
        * **Codice Sorgente:** Il repository Git completo su GitHub.com, con una cronologia chiara dei commit e una strategia di branching. Il branch `main` dovrà contenere l'ultima versione stabile del gioco.
        * **Applicazione Eseguibile:** Un file `.jar` eseguibile del gioco Pac-Man, generato con Maven.
        * **Documentazione del Progetto:**
            * Questo Piano di Progetto (come esportazione PDF da questo Markdown).
            * Le Specifiche dei Requisiti Software (SRS) conforme a IEEE 830 (come esportazione PDF da questo Markdown).
            * Diagrammi UML (es. Diagramma delle Classi, Diagramma di Sequenza) creati con Papyrus (file `.uml` e/o esportati come PDF/immagini).
            * Report riassuntivo dell'analisi del codice di SonarQube (come PDF o un link alla dashboard se ospitato).
            * Un file `README.md` aggiornato nel repository GitHub che riassuma il progetto e fornisca istruzioni per la compilazione e l'esecuzione.
        * **Presentazione:** Preparazione di una breve presentazione per illustrare il progetto e i suoi punti salienti durante l'esame.

---

## 2. Specifiche dei Requisiti Software (SRS) - IEEE 830

### 2.1 Introduzione

#### 2.1.1 Scopo del Documento
Questo documento, la Specifica dei Requisiti Software (SRS), delinea i requisiti funzionali e non funzionali per lo sviluppo del gioco Pac-Man. È stato redatto in conformità allo standard IEEE 830 per garantire chiarezza, completezza e tracciabilità dei requisiti. Questo documento servirà come riferimento primario per tutte le fasi di sviluppo del progetto.

#### 2.1.2 Ambito del Prodotto
Il prodotto è un'implementazione del classico gioco arcade Pac-Man, sviluppato come applicazione desktop utilizzando Java Swing. L'obiettivo è ricreare l'esperienza di gioco fondamentale del Pac-Man originale, includendo il movimento del giocatore, la navigazione nel labirinto, la raccolta di pellet e power-up, la presenza e il comportamento di base dei fantasmi, e la gestione del punteggio e delle condizioni di fine partita.

#### 2.1.3 Definizioni, Acronimi e Abbreviazioni
* **SRS:** Specifica dei Requisiti Software
* **UI:** Interfaccia Utente
* **UX:** Esperienza Utente
* **JVM:** Java Virtual Machine
* **IDE:** Ambiente di Sviluppo Integrato (es. Eclipse)
* **API:** Interfaccia di Programmazione Applicativa
* **FPS:** Fotogrammi Per Secondo
* **OOP:** Programmazione Orientata agli Oggetti
* **Git:** Sistema di controllo versione distribuito
* **GitHub:** Piattaforma di hosting per repository Git
* **Maven:** Strumento di automazione della build
* **Swing:** Toolkit grafico per Java
* **UML:** Linguaggio di Modellazione Unificato
* **Papyrus:** Strumento di modellazione UML (plugin di Eclipse)
* **SonarQube:** Piattaforma per l'analisi della qualità e della sicurezza del codice
* **Pellet:** Piccoli oggetti commestibili sparsi nel labirinto.
* **Power-up:** Oggetti commestibili più grandi che temporaneamente potenziano Pac-Man.
* **Labirinto:** La mappa di gioco.

#### 2.1.4 Riferimenti
* Standard IEEE 830-1998, "Recommended Practice for Software Requirements Specifications".
* Documentazione Ufficiale Java SE (Swing API).
* Documentazione Ufficiale Apache Maven.
* Documentazione Ufficiale Git e GitHub.
* Documentazione Ufficiale SonarQube.
* Documentazione Ufficiale Papyrus.
* (Eventuali requisiti specifici del corso o materiale fornito dal docente).

#### 2.1.5 Panoramica del Documento
Il resto di questo documento è strutturato come segue: La Sezione 2 fornisce una descrizione generale del prodotto e delle sue funzioni. La Sezione 3 descrive in dettaglio i requisiti funzionali specifici. La Sezione 4 elenca i requisiti non funzionali. La Sezione 5 fornisce un'analisi preliminare del sistema e altre informazioni correlate.

### 2.2 Descrizione Generale

#### 2.2.1 Prospettiva del Prodotto
Il gioco Pac-Man sarà un'applicazione standalone, non dipendente da altri sistemi software complessi al di fuori dell'ambiente Java Runtime (JRE). Sarà eseguibile su qualsiasi sistema operativo dotato di una JVM compatibile. Si interfaccia con il sistema operativo solo per l'input da tastiera e l'output video/audio.

#### 2.2.2 Funzioni del Prodotto
* **Movimento del Giocatore:** Pac-Man può muoversi in quattro direzioni cardinali (su, giù, sinistra, destra) all'interno del labirinto.
* **Visualizzazione del Labirinto:** Il gioco deve visualizzare un layout di labirinto statico.
* **Raccolta di Oggetti:** Pac-Man può raccogliere pellet e power-up presenti nel labirinto.
* **Sistema di Punteggio:** Il punteggio del giocatore viene aggiornato in base agli oggetti raccolti.
* **Gestione dei Fantasmi:** I fantasmi si muovono all'interno del labirinto con un comportamento di base.
* **Rilevamento delle Collisioni:** Gestione delle collisioni tra Pac-Man e i muri, Pac-Man e i fantasmi, Pac-Man e gli oggetti.
* **Gestione delle Vite:** Il giocatore ha un numero limitato di vite.
* **Condizioni di Fine Gioco:** Il gioco si conclude con la vittoria (tutti i pellet raccolti) o la sconfitta (esaurimento delle vite).
* **Interfaccia Utente Semplice:** Schermate per l'inizio del gioco, la pausa e la fine del gioco.

#### 2.2.3 Caratteristiche degli Utenti
* **Giocatore:** Qualsiasi individuo che desideri giocare a Pac-Man. Non sono richieste competenze tecniche specifiche.
* **Docente/Esaminatore:** Richiede una chiara comprensione del codice e della documentazione, nonché la capacità di eseguire e valutare il gioco.

#### 2.2.4 Vincoli
* **Linguaggio di Programmazione:** Java.
* **Interfaccia Grafica:** Java Swing.
* **Strumento di Build:** Apache Maven.
* **Controllo Versione:** Git e GitHub.
* **Qualità del Codice:** Analisi tramite SonarQube.
* **Modellazione UML:** Papyrus.
* **Ambiente di Sviluppo:** Eclipse IDE.
* **Scadenza:** Periodo d'esame di luglio.
* **Sviluppatore Unico:** Tutte le attività di sviluppo saranno eseguite da un singolo individuo.

#### 2.2.5 Assunzioni e Dipendenze
* **Assunzioni:**
    * L'utente finale avrà una Java Virtual Machine (JVM) compatibile installata per eseguire il gioco.
    * Il sistema operativo supporta Java Swing.
    * Il layout del labirinto sarà predefinito e statico (non generato dinamicamente in questa versione).
* **Dipendenze:** Nessuna dipendenza esterna da API o servizi web complessi al di fuori delle librerie standard Java e Maven.

### 2.3 Requisiti Funzionali Specifici

#### 2.3.1 Funzionalità di Gioco Principali

* **FR1: Movimento di Pac-Man**
    * **FR1.1:** Il giocatore dovrà essere in grado di controllare il movimento di Pac-Man utilizzando i tasti freccia (o WASD).
    * **FR1.2:** Pac-Man dovrà muoversi fluidamente in una delle quattro direzioni cardinali (su, giù, sinistra, destra).
    * **FR1.3:** Pac-Man dovrà fermarsi in corrispondenza dei muri del labirinto e non attraversarli.
    * **FR1.4:** Pac-Man dovrà essere in grado di cambiare direzione solo quando un percorso chiaro esiste nella nuova direzione.
* **FR2: Disegno del Labirinto**
    * **FR2.1:** Il gioco dovrà visualizzare un labirinto conforme a un layout predefinito.
    * **FR2.2:** I muri del labirinto dovranno essere disegnati distintamente e impedire il movimento.
    * **FR2.3:** Le aree vuote all'interno del labirinto dovranno consentire il movimento.
* **FR3: Raccolta di Pellet**
    * **FR3.1:** Il labirinto dovrà contenere un numero predefinito di pellet distribuiti nelle aree giocabili.
    * **FR3.2:** Quando Pac-Man attraverserà la posizione di un pellet, il pellet dovrà scomparire.
    * **FR3.3:** Ogni pellet raccolto dovrà aumentare il punteggio del giocatore di un valore predefinito.
* **FR4: Raccolta di Power-up**
    * **FR4.1:** Il labirinto dovrà contenere un numero limitato di power-up (pellet più grandi).
    * **FR4.2:** Quando Pac-Man raccoglierà un power-up, questo dovrà scomparire.
    * **FR4.3:** Ogni power-up raccolto dovrà aumentare il punteggio del giocatore di un valore bonus predefinito più alto.
    * **FR4.4:** La raccolta di un power-up dovrà attivare una modalità "spaventato" per i fantasmi per una durata limitata.
* **FR5: Gestione Punteggio**
    * **FR5.1:** Il punteggio attuale del giocatore dovrà essere visualizzato sull'interfaccia di gioco.
    * **FR5.2:** Il punteggio dovrà aggiornarsi in tempo reale dopo la raccolta di pellet o power-up.
* **FR6: Movimento e Comportamento dei Fantasmi**
    * **FR6.1:** Il gioco dovrà visualizzare un numero predefinito di fantasmi (es. 4).
    * **FR6.2:** I fantasmi dovranno muoversi autonomamente all'interno del labirinto.
    * **FR6.3:** I fantasmi dovranno seguire un comportamento di pathfinding di base all'interno del labirinto (es. inseguimento base di Pac-Man, o movimento predeterminato/casuale).
    * **FR6.4:** Durante la modalità "spaventato", i fantasmi dovranno cambiare colore e il loro comportamento dovrà alterarsi (es. rallentare, fuggire da Pac-Man).
* **FR7: Gestione Collisioni**
    * **FR7.1:** Se Pac-Man collide con un fantasma (in modalità normale), Pac-Man dovrà perdere una vita.
    * **FR7.2:** Se Pac-Man collide con un fantasma (in modalità "spaventato"), il fantasma dovrà tornare alla sua base e Pac-Man dovrà guadagnare punti bonus.
* **FR8: Gestione Vite del Giocatore**
    * **FR8.1:** Il giocatore dovrà iniziare la partita con un numero predefinito di vite.
    * **FR8.2:** Le vite rimanenti dovranno essere visualizzate sull'interfaccia di gioco.
    * **FR8.3:** Se Pac-Man perde una vita, il gioco dovrà riavviare Pac-Man e i fantasmi nelle loro posizioni iniziali.
* **FR9: Condizioni di Fine Gioco**
    * **FR9.1:** Il gioco dovrà concludersi con una vittoria se tutti i pellet e i power-up sono stati raccolti.
    * **FR9.2:** Il gioco dovrà concludersi con una sconfitta se tutte le vite di Pac-Man sono esaurite.
    * **FR9.3:** Al termine del gioco, dovrà essere presentata una schermata appropriata (Vittoria/Sconfitta) che visualizzi il punteggio finale.
* **FR10: Schermate di Gioco**
    * **FR10.1:** Il gioco dovrà presentare una schermata iniziale con un pulsante "Start Game".
    * **FR10.2:** Durante il gameplay, premendo il tasto "Escape" (o 'P') si dovrà mettere in pausa/riprendere il gioco e visualizzare un overlay di pausa.

### 2.4 Requisiti Non Funzionali

#### 2.4.1 Requisiti di Performance
* **NFR1.1 (Reattività UI):** Il gioco dovrà mantenere un frame rate minimo di 30 FPS per un'esperienza di gioco fluida.
* **NFR1.2 (Latenza Input):** Il tempo di risposta ai comandi da tastiera di Pac-Man dovrà essere inferiore a 100 ms.
* **NFR1.3 (Uso Memoria):** Il consumo di RAM dell'applicazione non dovrà superare i 256 MB durante il gameplay normale.

#### 2.4.2 Requisiti di Sicurezza
* **NFR2.1:** Non applicabile per un gioco offline monoutente. Il gioco non gestisce dati sensibili né comunicazioni di rete.

#### 2.4.3 Requisiti di Affidabilità
* **NFR3.1 (Stabilità):** L'applicazione non dovrà bloccarsi o generare eccezioni non gestite durante il gameplay normale.
* **NFR3.2 (Resilienza):** In caso di input non validi o situazioni inaspettate (es. file di configurazione mancanti se implementati), il gioco dovrà gestire l'errore in modo elegante o terminare con un messaggio esplicativo.

#### 2.4.4 Requisiti di Manutenibilità
* **NFR4.1 (Modularità):** Il codice dovrà essere organizzato in classi e pacchetti logici per facilitare la comprensione e le future modifiche.
* **NFR4.2 (Leggibilità):** Il codice dovrà seguire le convenzioni di stile Java e includere commenti Javadoc appropriati.
* **NFR4.3 (Qualità del Codice):** Il codice dovrà presentare un basso numero di "code smells" e bug critici, come misurato da SonarQube (obiettivo: rating 'A' su SonarQube per le metriche principali).

#### 2.4.5 Requisiti di Usabilità
* **NFR5.1 (Apprendibilità):** I controlli di gioco dovranno essere intuitivi e facili da apprendere (tasti freccia/WASD).
* **NFR5.2 (Chiarezza UI):** Il punteggio, le vite rimanenti e lo stato del gioco (pausa, vittoria, sconfitta) dovranno essere chiaramente visibili all'utente.

#### 2.4.6 Requisiti di Portabilità
* **NFR6.1:** L'applicazione dovrà essere eseguibile su sistemi operativi Windows, macOS e Linux, purché dotati di una JVM compatibile (Java 8 o superiore).

#### 2.4.7 Requisiti di Implementazione
* **NFR7.1:** Il progetto dovrà essere costruito con Apache Maven.
* **NFR7.2:** Il codice sorgente dovrà essere gestito tramite Git e ospitato su GitHub.com.

### 2.5 Altri Requisiti

#### 2.5.1 Requisiti di Documentazione
* **REQ-DOC1:** Il Piano di Progetto dovrà essere fornito (questo documento).
* **REQ-DOC2:** La Specifica dei Requisiti Software (SRS) conforme a IEEE 830 dovrà essere fornita (questo documento).
* **REQ-DOC3:** Dovranno essere forniti diagrammi UML (Diagramma delle Classi, potenzialmente Diagrammi di Sequenza per interazioni chiave) creati con Papyrus.
* **REQ-DOC4:** Il codice sorgente dovrà includere commenti Javadoc per tutte le classi e i metodi pubblici.
* **REQ-DOC5:** Un file `README.md` completo dovrà essere presente nel repository GitHub, includendo istruzioni per la compilazione e l'esecuzione.
* **REQ-DOC6:** Dovrà essere fornito un report riassuntivo dell'analisi di SonarQube.

#### 2.5.2 Requisiti di Test
* **REQ-TEST1:** Dovranno essere presenti test unitari (JUnit) per le classi principali della logica di gioco (es. `Pacman`, `Maze`, `Ghost`).
