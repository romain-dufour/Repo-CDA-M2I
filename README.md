# Repo-CDA-M2I

---------- HTML -------------
<header>
<main>
<aside>
<footer> 

doc pour balise : htmlreference.io
validation de balisage : https://validator.w3.org/

deplacer une balise : alt + fleche
dupliquer une balise : alt + shift + fleche
lorem picsum : site d'image avec choix des dimensions



----------- CSS ------------

selectionner une classe avec "."
selectionner un id avec "#"

Note : Le padding permet de créer un espace supplémentaire à l'intérieur d'un élément. La marge ( margin ) permet quant à elle de créer un espace supplémentaire à l'extérieur de l'élément.

display flex :
https://developer.mozilla.org/fr/docs/Web/CSS/CSS_flexible_box_layout/Basic_concepts_of_flexbox

display grid :


----------- BOOTSTRAP ------------

ordre des liens :
1 - bootstrap
2 - bootstrap icons
3 - css
4 - js bootstrap
5 - js


offset pour laisser de l'espace entre les cols

----------- JAVASCRIPT ------------

----------- TYPESCRIPT ------------

creer le fichier JS : tsc ./main.ts
compiler avec des arguments : tsc main.ts -- outfime .js/main.js
créer fichier JSON: tsc -- init
lancer le watch : tsc -w (stop avec ctrl + c)

config JSON : target ES6, rootdir : "./ts", outdir : "./js"



----------- REACT ------------
lancer le live : npm start
creation d'un nouveau projet : npx create-react-app +nomDuProjet


version rapide : npm create vite@latest +nomDuProjet
npm i
npm run dev pour lancer en local


bootstrap : import dans App.js
npm i bootstrap@latest
npm i bootstrap-icons@latest

import 'bootstrap/dist/css/bootstrap.css';
import "bootstrap-icons/font/bootstrap-icons.css";


Il faut installer server j-son de façon globale : npm install -g json-server

Après création d'un fichier json, on démarre le serveur web avec : json-server --watch nomDeLaBase.json --port N°dePort (en general 5000)

    GET /personnes
    POST /personnes
    PUT /personnes/:id
    DELETE /personnes/:id


Axios : npm i axios

UseState : pour récupérer le changement d'état d'une variable et la mettre a jour
UseEffect : modification de l'effet en fonction d'un changement de state
UseRef : pour créer un équivalent de getElementById et modifier le DOM
useContext : pour modifier unb composant qui n'est pas un parent direct

REACT ROUTING

Pour utiliser le routing dans REACT, il nous faut des packages supplémentaire: ---- npm install react-router-dom ----

et ne pas oublier l'import CreateBrowserRouter : const router = createBrowserRouter ([ { path: "/", element: }, { path: "/about", element: }, ... )].

----------- REDUX ------------

installation : npm install @reduxjs/toolkit react-redux

dans le main.js => rajouter un provider pour donner au composant App l'acces au store ainsi qu'a ses enfants (<Provider store ={store}><App></Provider>)
Dans les composants => utiliser le UseSelector pour aller chercher les states
                    => utiliser le UseDispatch pour récupérer les actions


----------- NODEJS ------------
Initialiser projet node.js = npm init (de manière automatique npm init -yes)
Installer package s'il le faut: npm install
Si code en JS (et non commonJs), ajouter "type":"module" dans package.json
Lancer le projet : node .<nomDuFichierDeSortie>.js


affichage dans la console : node nomDuFichier.js


----------- REACT NATIVE ------------
npx react-native@latest init nonFichier
cd vers le fichier

changer App.tsx en App.js
