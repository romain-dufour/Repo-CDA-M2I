const result = document.querySelector(".result");

let age=0

age = Number(prompt("Quel age à votre enfant ?"));

if (age<3) {
    result.innerHTML = `Votre enfant est trop jeune pour pratiquer`
} else if (age>18) {
    result.innerHTML = `Votre enfant n'est plus un enfant`
} else if (age<7) {
    result.innerHTML = `Votre enfant est dans la catégorie "Baby"`
} else if (age<9) {
    result.innerHTML = `Votre enfant est dans la catégorie "Poussin"`
} else if (age<11) {
    result.innerHTML = `Votre enfant est dans la catégorie "Pupille"`
} else if (age<13) {
    result.innerHTML = `Votre enfant est dans la catégorie "Minime"`
} else {
    result.innerHTML = `Votre enfant est dans la catégorie "Cadet"`
}