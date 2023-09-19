console.log(localStorage);

const submit = document.querySelector("#submit");
const fourniture = document.querySelector("#fourniture");
const clear = document.querySelector("#clear");
const result = document.querySelector("#result")

//tableau pour mettre les taches
let tab = []



//fonction pour mettre les données de l'input dans le local storage au click sur submit

submit.onclick =(e) => {
    // console.log("coucou");
    let test = fourniture.value
    console.log(test);
     const tache = {
         test
     }
     tab.push(tache)
     localStorage.setItem("course",JSON.stringify(tab))
}

//récupérer la liste sous forme de tableau puis l'afficher dans le DOM

let tabListeCourse  = JSON.parse(localStorage.getItem("course"))
console.table(tabListeCourse)

let affichage = tabListeCourse[0]

//probleme -> l'affichage ne fonctionne pas
result.innerHMTL = `<li>blabla </li>`



//fontion pour supprimer la liste

clear.onclick=()=>{
    localStorage.clear()
}