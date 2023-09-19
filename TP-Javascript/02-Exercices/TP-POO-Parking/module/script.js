import { CarList } from "./classe/carList.js";


const carlist = new CarList()
const display = document.querySelector(".display")

const btnIn = document.querySelector("#entrer");
const btnOut = document.querySelector("#getOut");
const addImmat = document.querySelector("#ajoutImmat")
let inTime=0,outTime=0, timeDuration=0, price =0


btnIn.addEventListener('click', () => {
    inTime = new Date();
    // console.log(inTime);

    carlist.addImmat(addImmat.value);
    // console.log(carlist.carList);

    //afficher "Veuillez prendre votre ticket"
    let affichage = `<p>Veuillez prendre votre ticket pour le véhicule ${addImmat.value}</p>`;
    console.log(affichage);
    setTimeout(()=>{
        let affichage = `<p>Veuillez prendre votre ticket pour le véhicule ${addImmat.value}</p>`;
        display.innerHTML = affichage;
    },3000

    )
    
})



btnOut.addEventListener('click', () => {

    outTime = new Date();
    timeDuration = Math.round(((outTime-inTime)/1000/60))
    
    console.log(timeDuration);

    if (timeDuration<=15) {
        price = 0.8
    } else if (timeDuration<=30) {
        price = 1.3
    }else if (timeDuration<=45) {
        price = 1.3
    } else {
        price = 6
    }
    alert(price)

})



// setTimeout(() => {
    
// }, timeout);