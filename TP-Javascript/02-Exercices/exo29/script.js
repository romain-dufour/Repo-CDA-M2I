const result = document.querySelector(".result");

let nbentier=0, affichage="",affichage2="", somme=1

nbentier=Number(prompt("Veuillez rentrer un nombre entier :"))

affichage=`Vous avez saisi le nombre ${nbentier} <br>Voici la liste d'entiers chainés dont la somme est égale à ${nbentier} :<br>`

let i=1, j=1
while(i<=((nbentier/2)+1)){
    j=i+1
    somme=i
        while(j<=((nbentier/2)+1)){
            affichage2+=`+ ${j}`
            somme=somme+j

        if(somme==nbentier){
            affichage +=`${nbentier} = ${i}${affichage2}<br>`    
          break
        }
        j++
        }
        affichage2=""
        i++
    }
    result.innerHTML = affichage
    

// while(i<=((nbentier/2)+1)){
// j=i+1
// somme=i
// console.log(somme);
//     while(somme<=nbentier){
//         affichage2+=`+ ${j}`
//         somme=somme+j
//         console.log(somme);
//         j++
//     }
//     if(somme==nbentier){
//         affichage +=`${nbentier} = ${i}${affichage2}<br>`

//         console.log(affichage2);
//     }

//     i++
// }
// result.innerHTML = affichage



// while(somme<=nbentier){
//     affichage2+=`+ ${j}`
//     somme=somme+j
//     j++
// }
// console.log(affichage2);




// while (n<=nbentier) {
//     somme = 0
//     affichage=`${nbentier} = `
// if()

//     while (somme<nbentier) {
//         i=n
//     somme=somme+i;
//     affichage+= `${n} +`
//     i++
    
//     }
// n++
// }

// affichage=`${nbentier} =  `
// somme=somme+i
// while (somme==nbentier) {
//     affichage+= `${i} +`
//     somme=somme+i;
//     i++
// }
// affichage+=`<br>`
// result.innerHTML=affichage



// while (n<nbentier){
//     i=n
//     somme=0
//     affichage=`${nbentier} =  `
//     somme=somme+i
// while (somme!=nbentier || somme < nbentier) {
//     affichage+= `${i} +`
//     somme=somme+i;
//     i++
// }
// affichage+=`<br>`
// n++
// }


