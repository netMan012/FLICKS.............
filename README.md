# FLICKS.............
# Flix
Flix est une application qui permet aux utilisateurs de parcourir des films à partir de [l'API de base de données de films] (http://docs.themoviedb.apiary.io/#).

NOTE `NOTE - PASTEZ LA PARTIE 2 SNIPPET ICI:` Collez le modèle README pour la partie 2 de cette affectation ici en haut. Cela affichera un historique de votre processus de développement, les histoires d'utilisateurs que vous avez complétées et le look et le fonctionnement de votre application à chaque étape.

---

## Flix Part 1

### Histoires d'utilisateurs
`TODO: //` Dans la section ** User Story ci-dessous **, ajoutez un `x` dans le` - [] `comme ceci` - [x] `pour toute user story que vous complétez. (Supprimer ce paragraphe après avoir coché les user stories complétées)

#### REQUIS (10pts)
- [] (10pts) L'utilisateur peut voir une liste des films (titre, image de l'affiche et aperçu) en cours de lecture dans les cinémas à partir de l'API Movie Database.

#### PRIME
- [] (2pts) Les vues doivent être réactives pour le mode paysage / portrait.
   - [] (1pt) En mode portrait, l'image affiche, le titre et la présentation du film sont affichés.
   - [] (1pt) En mode paysage, la disposition modifiée en rotation doit utiliser l'image de fond et afficher le titre et la présentation du film à droite de celle-ci.

- [] (2pts) Affiche un joli [espace réservé graphique] par défaut (https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) pour chaque image au cours du chargement.
- [] (2pts) Amélioration de l'interface utilisateur en expérimentant le style et la coloration.
- [] (2pts) Pour les films populaires (c’est-à-dire un film dont le nombre d’élèves est supérieur à 5 étoiles), l’image de fond complète est affichée. Sinon, une image d'affiche, le titre du film et une vue d'ensemble sont répertoriés. Utilisez Heterogenous RecyclerViews et utilisez différents fichiers de mise en page ViewHolder pour les films populaires et les moins populaires.

### App Walklever GIF
`TODO: //` Ajoutez l'URL à votre application animée walkTH `gif` dans la balise d'image ci-dessous,` YOUR_GIF_URL_HERE`. Assurez-vous que le gif est bien rendu et animé lors de l'affichage de ce fichier README (Supprimer ce paragraphe après avoir ajouté gif)

<img src = "YOUR_GIF_URL_HERE" width = 250> <br>

### Remarques
Décrivez les difficultés rencontrées lors de la création de l'application.

### Bibliothèques Open-Source utilisées

- [Android Async HTTP] (https://github.com/loopj/android-async-http) - Requêtes HTTP asynchrones simples avec analyse JSON
- [Glide] (https://github.com/bumptech/glide) - Bibliothèque de chargement et de mise en mémoire d'images pour Androids
