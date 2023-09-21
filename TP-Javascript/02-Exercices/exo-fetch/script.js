const pokeimage = document.querySelector(".img-container")
const name = document.querySelector(".name-container")
const weight = document.querySelector(".weight-container")
const height = document.querySelector(".height-container")
const btnminus = document.querySelector(".btnminus")
const btnplus = document.querySelector(".btnplus")
const surprise = document.querySelector(".surprise")


let urlNbr = 1

let apiUrl = "https://pokeapi.co/api/v2/pokemon/" + urlNbr
window.onload = affichage()

function affichage (){
    fetch(apiUrl)
        .then(response => {
            // si reponse ok , renvoyer l'image sprites / front default + name + weight + height
            //parser la reponse en JSON dans une variable
            const pokeData = response.json()
            console.log(pokeData);
            return pokeData
        })
        .then(data => {
    
            pokeimage.setAttribute("src",data.sprites.front_default)
            console.log(pokeimage);
            console.log(data.sprites.front_default);
            name.innerHTML = data.name
            weight.innerHTML = data.weight
            height.innerHTML = data.height
            
        })
}


//incrementation de urlnbr au click
btnplus.onclick = ()=>{
    urlNbr = urlNbr + 1
    console.log(urlNbr);
    apiUrl = "https://pokeapi.co/api/v2/pokemon/" + urlNbr
    console.log(apiUrl);
    affichage()

}


//decrementation de urlnbr au click
btnminus.onclick = ()=>{
    urlNbr = urlNbr - 1
    if(urlNbr<1){
        urlNbr=1
    }
    apiUrl = "https://pokeapi.co/api/v2/pokemon/" + urlNbr
    affichage()
}


// afficher un pokemon de maniere aléatoire
surprise.onclick = ()=>{
    let min = 1
    let max = 25
    let random = Math.floor(Math.random() * (max - min)) + min;
    urlNbr = random
    apiUrl = "https://pokeapi.co/api/v2/pokemon/" + urlNbr
    affichage()
}


