# Exercices Java : projet IntelliJ prêt à l'emploi

Chaque exercice a son propre dossier (un *package*) avec le code de départ à compléter. Rien à créer : clonez le dépôt et cherchez l'exercice.

## 1. Récupérer le projet avec Git

Prérequis : [Git](https://git-scm.com/downloads) et IntelliJ IDEA (édition Community).

1. Dans IntelliJ, écran d'accueil : **Clone Repository** (ou **File > New > Project from Version Control**).
2. **URL** : `https://github.com/k-schroeder/formation-java.git`. **Directory** : un dossier dans vos documents. Cliquez sur **Clone**.
3. Si IntelliJ demande si le projet est fiable : **Trust Project**.
4. Si IntelliJ affiche « Project JDK is not defined », cliquez sur **Setup SDK** et choisissez votre JDK (Java 25).

En terminal, l'équivalent est `git clone https://github.com/k-schroeder/formation-java.git` puis **File > Open** sur le dossier cloné.

## 2. Créer votre branche (avant de modifier quoi que ce soit)

Votre branche est votre copie personnelle : vous faites tous vos exercices dessus. La branche `main` reste celle du formateur, on n'y travaille jamais.

Dans IntelliJ :

1. Ouvrez le menu **Git > New Branch…** (nouvelle interface : le menu **Git** est sous l'icône ☰ en haut à gauche).
2. Nom : `prenom-nom`, en minuscules, sans espace ni accent (exemple : `marie-dupont`). **Create**.
3. Le nom de la branche active s'affiche à côté du nom du projet, en haut à gauche (en bas à droite avec l'ancienne interface).
4. Vérifiez que `marie-dupont` (et non `main`) est bien la branche active (visible à côté du nom du projet, ou avec `git branch` : la branche active est précédée d'une étoile).

En terminal : `git checkout -b marie-dupont`.

## 3. Faire les exercices

1. Dans le volet de gauche, ouvrez `src > chNN > exN_N_X`, puis la classe `Main`.
2. Complétez le code, puis clic droit > **Run 'Main.main()'**.

Chaque exercice est un module séparé : une erreur de compilation dans un exercice (volontaire dans certains) n'empêche pas de lancer les autres.

## 4. Sauvegarder votre travail

De temps en temps : **Git > Commit…** (`Ctrl+K`), cochez les fichiers, écrivez un message court (« exercices du chapitre 5 »), puis **Commit**. Terminal : `git add -A` puis `git commit -m "exercices du chapitre 5"`.

## 5. Récupérer les nouveaux exercices du formateur

Quand le formateur annonce une mise à jour :

1. Faites un commit de votre travail en cours (étape 4).
2. **Git > Fetch**.
3. **Git > Merge…**, choisissez `origin/main` puis **Merge into Current**.

Terminal : `git fetch origin` puis `git merge origin/main`.

Vos réponses ne sont pas écrasées : seuls les nouveaux fichiers ou les fichiers que vous n'avez pas modifiés sont mis à jour. Si IntelliJ signale un **conflit** sur un fichier, c'est que vous et le formateur avez modifié le même exercice : choisissez **Accept Yours** (votre version) et prévenez le formateur.

## Le dossier `.idea`

La configuration IntelliJ (un fichier `.iml` par exercice) est rangée dans `.idea/modules`. **Ne la supprimez pas** : IntelliJ en a besoin pour ouvrir le projet.

## Organisation

- `src/ch07/ex7_2_a/` = chapitre 7, exercice 7.2.A (package `ch07.ex7_2_a`).
- Les exercices sans code de départ (observer, répondre, expliquer) n'ont pas de dossier.

## Liste des exercices


### Chapitre 2 · Afficher un message dans la console

- **2.1.A** Dire bonjour : `src/ch02/ex2_1_a`
- **2.3.A** Se présenter sur deux lignes : `src/ch02/ex2_3_a`
- **2.3.B** Tout sur une seule ligne : `src/ch02/ex2_3_b`
- **2.5.A** Trouver l'erreur : `src/ch02/ex2_5_a`

### Chapitre 3 · Les types de données

- **3.2.A** Une lettre : `src/ch03/ex3_2_a`
- **3.3.A** Afficher chaque type : `src/ch03/ex3_3_a`

### Chapitre 4 · Les variables

- **4.2.A** Ma fiche d'identité : `src/ch04/ex4_2_a`
- **4.4.A** Changer de valeur : `src/ch04/ex4_4_a`
- **4.4.B** Ajouter des points : `src/ch04/ex4_4_b`
- **4.4.C** Échanger deux variables : `src/ch04/ex4_4_c`

### Chapitre 5 · Les calculs et les opérateurs

- **5.1.A** Périmètre d'un rectangle : `src/ch05/ex5_1_a`
- **5.2.A** Le reste d'une division : `src/ch05/ex5_2_a`
- **5.4.A** Compter avec ++ et -- : `src/ch05/ex5_4_a`
- **5.5.A** La moyenne de deux notes : `src/ch05/ex5_5_a`
- **5.5.B** Le code d'une lettre : `src/ch05/ex5_5_b`
- **5.6.A** Afficher une facture alignée : `src/ch05/ex5_6_a`

### Chapitre 6 · Lire ce que l'utilisateur tape au clavier

- **6.3.A** Lire un entier : `src/ch06/ex6_3_a`
- **6.3.B** La somme de deux entiers : `src/ch06/ex6_3_b`
- **6.4.A** L'aire d'un rectangle : `src/ch06/ex6_4_a`
- **6.5.A** Dire bonjour : `src/ch06/ex6_5_a`
- **6.5.B** Lire une phrase : `src/ch06/ex6_5_b`
- **6.6.A** Synthèse : nom, âge, ville : `src/ch06/ex6_6_a`
- **6.9.A** Le projet complet : `src/ch06/ex6_9_a`

### Chapitre 7 · Les conditions : if / else

- **7.2.A** Pair ou impair : `src/ch07/ex7_2_a`
- **7.3.A** Majeur ou mineur ? : `src/ch07/ex7_3_a`
- **7.4.A** Positif, négatif ou nul : `src/ch07/ex7_4_a`
- **7.4.B** Le barème de notes : `src/ch07/ex7_4_b`
- **7.5.A** Le mot de passe : `src/ch07/ex7_5_a`
- **7.6.A** Initiale et longueur : `src/ch07/ex7_6_a`
- **7.6.B** Oui ou non ? : `src/ch07/ex7_6_b`
- **7.6.C** Le domaine d'une adresse e-mail : `src/ch07/ex7_6_c`

### Chapitre 8 · Opérateurs logiques, ternaire et switch

- **8.1.A** Adolescent ? : `src/ch08/ex8_1_a`
- **8.2.A** Le plus grand de trois : `src/ch08/ex8_2_a`
- **8.3.A** Ternaire : `src/ch08/ex8_3_a`
- **8.4.A** Le jour de la semaine : `src/ch08/ex8_4_a`
- **8.5.A** Le projet complet : `src/ch08/ex8_5_a`

### Chapitre 9 · Les boucles

- **9.2.A** Le compte à rebours : `src/ch09/ex9_2_a`
- **9.3.A** Compter jusqu'à 10 : `src/ch09/ex9_3_a`
- **9.3.B** Les nombres pairs : `src/ch09/ex9_3_b`
- **9.4.A** Redemander jusqu'à un bon nombre : `src/ch09/ex9_4_a`
- **9.6.A** La somme de 1 à 100 : `src/ch09/ex9_6_a`
- **9.7.A** Le projet complet : `src/ch09/ex9_7_a`
- **9.7.B** Gros exercice : la caisse de la boulangerie (menu en boucle) : `src/ch09/ex9_7_b`

### Chapitre 10 · Les tableaux

- **10.3.A** Premier et dernier : `src/ch10/ex10_3_a`
- **10.4.A** Afficher un tableau : `src/ch10/ex10_4_a`
- **10.4.B** Saisir des notes : `src/ch10/ex10_4_b`
- **10.5.A** Somme d'un tableau : `src/ch10/ex10_5_a`
- **10.5.B** Le plus petit : `src/ch10/ex10_5_b`
- **10.6.A** Le projet complet : `src/ch10/ex10_6_a`

### Chapitre 11 · Les collections

- **11.4.A** Ma liste de courses : `src/ch11/ex11_4_a`
- **11.4.B** Compter et retirer : `src/ch11/ex11_4_b`
- **11.4.C** La moyenne d'une liste de notes : `src/ch11/ex11_4_c`
- **11.5.A** Les doublons disparaissent : `src/ch11/ex11_5_a`
- **11.6.A** Mon annuaire : `src/ch11/ex11_6_a`
- **11.6.B** Panier avec quantités : `src/ch11/ex11_6_b`

### Chapitre 12 · Les méthodes

- **12.2.A** Une méthode de bienvenue : `src/ch12/ex12_2_a`
- **12.3.A** Le plus grand de deux : `src/ch12/ex12_3_a`
- **12.4.A** Le double : `src/ch12/ex12_4_a`
- **12.4.B** La moyenne d'un tableau : `src/ch12/ex12_4_b`
- **12.5.A** Majeur ? : `src/ch12/ex12_5_a`
- **12.7.A** Le mini-projet : `src/ch12/ex12_7_a`

### Chapitre 13 · String en profondeur

- **13.2.A** Le ticket de caisse : `src/ch13/ex13_2_a`
- **13.2.B** Une ligne de nombres : `src/ch13/ex13_2_b`
- **13.4.A** Le menu en bloc de texte : `src/ch13/ex13_4_a`
- **13.5.A** Palindrome ? : `src/ch13/ex13_5_a`
- **13.5.B** Gros exercice : le ticket de caisse bien aligné (StringBuilder + format) : `src/ch13/ex13_5_b`

### Chapitre 14 · Classes et objets

- **14.2.A** Une classe Chat : `src/ch14/ex14_2_a`
- **14.3.A** Deux objets indépendants : `src/ch14/ex14_3_a`
- **14.3.B** Un compteur : `src/ch14/ex14_3_b`
- **14.3.C** Une variable, deux noms : que s'affiche-t-il ? : `src/ch14/ex14_3_c`
- **14.4.A** Vieillir : `src/ch14/ex14_4_a`
- **14.5.A** Une méthode qui parle : `src/ch14/ex14_5_a`
- **14.5.B** Un rectangle : `src/ch14/ex14_5_b`
- **14.6.A** Un élève avec deux constructeurs : `src/ch14/ex14_6_a`

### Chapitre 15 · L'encapsulation

- **15.3.A** Une carte cadeau : `src/ch15/ex15_3_a`
- **15.4.A** Le thermostat : `src/ch15/ex15_4_a`
- **15.5.A** Tester le compte : `src/ch15/ex15_5_a`
- **15.5.B** Un livret d'épargne : `src/ch15/ex15_5_b`
- **15.5.C** Un mot de passe bien gardé : `src/ch15/ex15_5_c`

### Chapitre 16 · Le mot-clé static

- **16.2.A** Compter les visiteurs : `src/ch16/ex16_2_a`
- **16.3.A** Une méthode utilitaire : `src/ch16/ex16_3_a`
- **16.3.B** Utiliser Math : `src/ch16/ex16_3_b`
- **16.5.A** Les constantes d'un jeu : `src/ch16/ex16_5_a`

### Chapitre 17 · Packages et import

- **17.2.A** Ranger une bibliothèque : `src/ch17/ex17_2_a`
- **17.3.A** Deux Date : `src/ch17/ex17_3_a`
- **17.4.A** Pythagore avec import static : `src/ch17/ex17_4_a`

### Chapitre 18 · Les dates

- **18.2.A** La date de retour : `src/ch18/ex18_2_a`
- **18.3.A** Le livre est-il en retard ? : `src/ch18/ex18_3_a`
- **18.4.A** La rentrée en français : `src/ch18/ex18_4_a`

### Chapitre 19 · L'héritage

- **19.2.A** Animal et Oiseau : `src/ch19/ex19_2_a`
- **19.3.B** Compléter la méthode de la mère avec super : `src/ch19/ex19_3_b`
- **19.4.A** Trouver la faute : `src/ch19/ex19_4_a`
- **19.5.A** Des formes géométriques : `src/ch19/ex19_5_a`
- **19.5.B** Des instruments de musique : `src/ch19/ex19_5_b`
- **19.5.C** La facture polymorphe : `src/ch19/ex19_5_c`
- **19.5.D** Qui répond ? Type de la variable ou type de l'objet : `src/ch19/ex19_5_d`

### Chapitre 20 · Les classes abstraites

- **20.2.A** Un moyen de paiement : `src/ch20/ex20_2_a`
- **20.2.B** Des notifications : `src/ch20/ex20_2_b`
- **20.2.C** Pourquoi ça ne compile pas ? : `src/ch20/ex20_2_c`
- **20.2.D** Les salaires d'une entreprise : `src/ch20/ex20_2_d`

### Chapitre 21 · Interfaces et Comparable

- **21.2.A** Un Nageur de plus : `src/ch21/ex21_2_a`
- **21.2.B** Deux contrats pour un seul objet : `src/ch21/ex21_2_b`
- **21.2.C** Pourquoi ça ne compile pas ? (une interface) : `src/ch21/ex21_2_c`
- **21.3.A** Trier des prénoms : `src/ch21/ex21_3_a`
- **21.3.B** Trier des livres par nombre de pages : `src/ch21/ex21_3_b`
- **21.3.C** Trier des élèves par nom : `src/ch21/ex21_3_c`
- **21.4.A** La liste de courses avec List : `src/ch21/ex21_4_a`
- **21.4.B** Trier avec un Comparator : `src/ch21/ex21_4_b`
- **21.4.C** Une liste de tâches à exécuter ( Runnable ) : `src/ch21/ex21_4_c`
- **21.4.D** Gros exercice : le catalogue triable de la boutique : `src/ch21/ex21_4_d`

### Chapitre 22 · Les exceptions et le débogueur

- **22.1.A** Lire une trace : `src/ch22/ex22_1_a`
- **22.2.B** Analyser une trace : le produit qui n'existe pas : `src/ch22/ex22_2_b`
- **22.4.A** Une saisie qui ne plante pas : `src/ch22/ex22_4_a`
- **22.4.B** Redemander jusqu'à obtenir un nombre : `src/ch22/ex22_4_b`
- **22.4.C** Quelle exception ? : `src/ch22/ex22_4_c`
- **22.4.D** Deux erreurs possibles, deux messages : `src/ch22/ex22_4_d`
- **22.4.E** Convertir des textes en nombres : `src/ch22/ex22_4_e`
- **22.5.A** Le finally : prédire la sortie : `src/ch22/ex22_5_a`
- **22.6.A** Une carte cadeau qui refuse : `src/ch22/ex22_6_a`
- **22.8.A** Notre exception vérifiée : `src/ch22/ex22_8_a`
- **22.8.B** Le distributeur de billets : `src/ch22/ex22_8_b`
- **22.9.A** Suivre la propagation : `src/ch22/ex22_9_a`
- **22.12.A** Chasse aux bugs au débogueur : `src/ch22/ex22_12_a`
- **22.13.A** Débogueur : entrer dans une méthode : `src/ch22/ex22_13_a`

### Chapitre 23 · toString, equals, hashCode et record

- **23.1.A** Un panier lisible : `src/ch23/ex23_1_a`
- **23.3.A** Un client par carte : `src/ch23/ex23_3_a`
- **23.3.B** Les places du théâtre : `src/ch23/ex23_3_b`
- **23.5.A** Une note valide : `src/ch23/ex23_5_a`
- **23.5.B** Du code en moins : `src/ch23/ex23_5_b`
- **23.6.A** Gros exercice : les cartes de fidélité (record + equals + toString) : `src/ch23/ex23_6_a`

### Chapitre 24 · Composition et énumérations

- **24.1.A** Est-un ou a-un ? : `src/ch24/ex24_1_a`
- **24.1.B** Un chat qui a une puce : `src/ch24/ex24_1_b`
- **24.2.A** Les saisons : `src/ch24/ex24_2_a`
- **24.2.B** Les niveaux de log (enum avec données) : `src/ch24/ex24_2_b`

### Chapitre 25 · Interfaces avancées et patterns

- **25.1.A** Le paiement avec reçu (méthode default) : `src/ch25/ex25_1_a`
- **25.2.A** Une classe anonyme : `src/ch25/ex25_2_a`
- **25.3.A** Un Singleton de compteur : `src/ch25/ex25_3_a`
- **25.4.A** Un burger avec Builder : `src/ch25/ex25_4_a`
- **25.4.B** Gros exercice : la commande du restaurant (enum + composition + Builder) : `src/ch25/ex25_4_b`

### Chapitre 26 · De PHP à Java : les pièges

- **26.2.A** Une commande qui grossit toute seule : `src/ch26/ex26_2_a`
- **26.3.A** Égalité des scores : `src/ch26/ex26_3_a`
- **26.4.A** Une moyenne arrondie : `src/ch26/ex26_4_a`
- **26.4.B** Le stock de la boulangerie : `src/ch26/ex26_4_b`
- **26.5.A** int ou Integer ? Gérer une valeur absente : `src/ch26/ex26_5_a`
- **26.6.A** Trois façons de donner un prix : `src/ch26/ex26_6_a`
- **26.7.A** Gros exercice : la chasse aux pièges (spécial PHP → Java) : `src/ch26/ex26_7_a`

### Chapitre 27 · Le Java moderne

- **27.3.A** Moderniser un switch : `src/ch27/ex27_3_a`
- **27.3.B** Le prix d'une livraison : `src/ch27/ex27_3_b`
- **27.6.A** Les formes, version moderne : `src/ch27/ex27_6_a`
- **27.6.B** Gros exercice : les moyens de paiement (sealed + switch sur types + record) : `src/ch27/ex27_6_b`

### Chapitre 28 · Les collections, plus loin

- **28.4.A** Compter les mots : `src/ch28/ex28_4_a`
- **28.4.B** Un annuaire trié : `src/ch28/ex28_4_b`
- **28.4.C** L'inventaire de la boutique : `src/ch28/ex28_4_c`
- **28.6.A** Retirer sans planter : `src/ch28/ex28_6_a`
- **28.8.A** Une liste qu'on ne peut pas trafiquer : `src/ch28/ex28_8_a`
- **28.8.B** Dédoublonner et trier : `src/ch28/ex28_8_b`
- **28.8.C** Les outils de Collections : `src/ch28/ex28_8_c`
- **28.8.D** Gros exercice : le best-seller de la boulangerie (Map + tri + Collections) : `src/ch28/ex28_8_d`

### Chapitre 29 · Les fichiers, et les dates plus loin

- **29.2.A** L'âge exact : `src/ch29/ex29_2_a`
- **29.3.A** Le livre à rendre : `src/ch29/ex29_3_a`
- **29.3.B** Le planning de la semaine : `src/ch29/ex29_3_b`
- **29.3.C** La durée d'un trajet : `src/ch29/ex29_3_c`
- **29.4.A** Sauvegarder et recharger une liste : `src/ch29/ex29_4_a`
- **29.4.B** Le journal de bord : `src/ch29/ex29_4_b`
- **29.4.C** Le fichier introuvable : `src/ch29/ex29_4_c`
- **29.6.A** Le total des ventes : `src/ch29/ex29_6_a`
- **29.6.B** Les notes d'un fichier CSV : `src/ch29/ex29_6_b`
- **29.6.C** Gros exercice : le journal des ventes (dates + fichier + CSV) : `src/ch29/ex29_6_c`

### Chapitre 30 · Projet : la carte de fidélité de la boulangerie

- **30.2.A** Le modèle : `src/ch30/ex30_2_a`
- **30.3.A** Les règles : `src/ch30/ex30_3_a`
- **30.4.A** Le menu : `src/ch30/ex30_4_a`
- **30.5.A** Sauvegarder : `src/ch30/ex30_5_a`
